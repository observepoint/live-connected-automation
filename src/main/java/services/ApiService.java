package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ApiService {

    private final String LIVE_CONNECT_AUTOMATION_FOLDER_NAME = "LiveConnectAutomation";
    private final String baseUrl = "https://api.observepoint.com/v2/";

    private ObjectMapper objectMapper = new ObjectMapper();
    private HttpClient httpclient = HttpClients.createDefault();
    private Gson gson = new GsonBuilder().create();
    private List<Header> apiHeaders;

    public ApiService(String apiKey) {
        this.apiHeaders = asList(
                new Header("Authorization", "api_key " + apiKey),
                new Header("Content-Type", "application/json")
        );
    }

    public Journey createDevice(JourneyRequest journey) throws IOException {
        journey.setFolderId(getFolderId());

        HttpResponse response = sendPost(baseUrl + "manual-journeys/", journey.createBody());
        return objectMapper.readValue(response.getEntity().getContent(), Journey.class);
    }

    public InitializedJourney createJourney(Journey createdDevice) throws IOException {
        HttpResponse response = sendPost(baseUrl + "manual-journeys/" + createdDevice.getId(), "{}");

        return objectMapper.readValue(response.getEntity().getContent(), InitializedJourney.class);
    }

    public Action manageRecording(InitializedJourney initializedJourney, String status) throws IOException {
        HttpResponse response = sendPost(baseUrl + "manual-journeys/" + initializedJourney.getJourneyId() + "/runs/" + initializedJourney.getRunId() + "/control", "{\"request\":\"" + status + "\"}");

        return objectMapper.readValue(response.getEntity().getContent(), Action.class);
    }

    public Action createStep(InitializedJourney initializedJourney) throws IOException {
        HttpResponse response = sendPost(baseUrl + "manual-journeys/" + initializedJourney.getJourneyId() + "/runs/" + initializedJourney.getRunId() + "/actions", "{}");

        return objectMapper.readValue(response.getEntity().getContent(), Action.class);
    }

    public void attacheRulesToJourney(InitializedJourney initializedJourney, List<String> ruleNames) throws IOException {
        HttpResponse getRulesResponse = sendGet(baseUrl + "rules");
        List<Rule> existedRulesList = objectMapper.readValue(getRulesResponse.getEntity().getContent(), new TypeReference<List<Rule>>() {});

        List<Integer> ruleIds = existedRulesList
                .stream()
                .filter(r -> ruleNames.contains(r.getName()))
                .map(Rule::getId).collect(Collectors.toList());

        sendPut(baseUrl + "manual-journeys/" + initializedJourney.getJourneyId() + "/rules", gson.toJson(ruleIds));
    }

    public Action updateStep(InitializedJourney initializedJourney, Action action, String newName) throws IOException {
        String url = baseUrl + "manual-journeys/" + initializedJourney.getJourneyId() + "/runs/" + initializedJourney.getRunId() + "/actions/" + action.getId();
        String body = "{\"name\":\"" + newName + "\"}";

        HttpResponse response = sendPatch(url, body);
        return objectMapper.readValue(response.getEntity().getContent(), Action.class);
    }

    private int getFolderId() throws IOException {
        HttpResponse response = sendGet(baseUrl + "folders");

        List<Folder> existedFoldersList = objectMapper.readValue(response.getEntity().getContent(), new TypeReference<List<Folder>>() {});
        List<Folder> folders = existedFoldersList.stream().filter(folder -> folder.getName().equals(LIVE_CONNECT_AUTOMATION_FOLDER_NAME)).collect(Collectors.toList());

        if (folders.size() == 0) {
            return createDefaultFolder().getId();
        } else return folders.get(0).getId();
    }

    private Folder createDefaultFolder() throws IOException {
        System.out.println("Creating default folder");
        HttpResponse response = sendPost(baseUrl + "folders/", new Folder().setName(LIVE_CONNECT_AUTOMATION_FOLDER_NAME).createBody());
        return objectMapper.readValue(response.getEntity().getContent(), Folder.class);
    }

    private HttpResponse sendGet(String url) throws IOException {

        HttpRequestBase request = new HttpGet(url);
        addHeaders(apiHeaders, request);


        System.out.println("Sending GET: " + request);
        return sendRequest(request);

    }

    private HttpResponse sendPost(String url, String body) throws IOException {

        HttpEntityEnclosingRequestBase request = new HttpPost(url);
        addHeaders(apiHeaders, request);
        addBody(body, request);

        System.out.println("Sending POST:" + url + " with body: \n" + body);
        return sendRequest(request);

    }

    private HttpResponse sendPut(String url, String body) throws IOException {

        HttpEntityEnclosingRequestBase request = new HttpPut(url);
        addHeaders(apiHeaders, request);
        addBody(body, request);

        System.out.println("Sending PUT:" + url + " with body: \n" + body);
        return sendRequest(request);

    }

    private HttpResponse sendPatch(String url, String body) throws IOException {

        HttpEntityEnclosingRequestBase request = new HttpPatch(url);
        addHeaders(apiHeaders, request);
        addBody(body, request);

        System.out.println("Sending PATCH:"  + url + " with body: \n" + body);
        return sendRequest(request);

    }

    private HttpResponse sendRequest(HttpRequestBase request) throws IOException {
        HttpResponse hr = httpclient.execute(request);
        hr.setEntity(new BufferedHttpEntity(hr.getEntity()));
        System.out.println("Response: " + EntityUtils.toString(hr.getEntity()));
        return hr;
    }

    private void addHeaders(List<Header> headers, HttpRequestBase request) {
        for (Header header : headers) {
            request.addHeader(header.getName(), header.getValue());
        }
    }

    private void addBody(String body, HttpEntityEnclosingRequestBase request) {
        request.setEntity(new StringEntity(body, ContentType.APPLICATION_JSON));
    }
}