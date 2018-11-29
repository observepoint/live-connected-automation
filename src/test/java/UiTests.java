import models.Action;
import models.InitializedJourney;
import models.Journey;
import models.JourneyRequest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import services.ApiService;
import services.WebDriverService;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UiTests {

    //Information from your account
    //API key. Can be found at https://app.observepoint.com/account/user
    private final String apiKey = "api key from your account https://app.observepoint.com/account/user";
    //Name of rule from your account which will be attached to journey
    private final List<String> rules = Arrays.asList("RuleName1", "RuleName2");

    //Default live connect configuration
    //Name of the device which will be created
    private final String deviceName = "apiDevice " + new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date()); //any string
    //Type of a device you want to use
    private final String deviceType = "mobile"; //should be one of [mobile, pc, tv]
    //Name of the operating system
    private final String os = "Android"; // any string
    //Version of the operating system
    private final String osVersion = "testVersion"; // any string


    ApiService apiService = new ApiService(apiKey);
    Journey createdDevice;
    InitializedJourney initializedJourney;
    WebDriver driver;
    String host;
    int port;

    Action createdAction;

    @BeforeSuite
    public void beforeSuite() throws IOException, InterruptedException {
        JourneyRequest journey = new JourneyRequest()
                .setName(deviceName)
                .setJourneyType(deviceType)
                .setOsOfDevice(os)
                .setVersionOfOs(osVersion);

        createdDevice = apiService.createDevice(journey);
        initializedJourney = apiService.createJourney(createdDevice);

        apiService.attacheRulesToJourney(initializedJourney, rules);

        host = initializedJourney.getProxyInfo().getInterface();
        port = initializedJourney.getProxyInfo().getPort();

        apiService.manageRecording(initializedJourney, "start");
    }

    @AfterSuite
    public void afterSuite() throws IOException, InterruptedException {
        //Stop recording
        apiService.manageRecording(initializedJourney, "stop");
        apiService.manageRecording(initializedJourney, "finalize");
    }

    @BeforeMethod
    public void beforeTest() throws IOException {
        createdAction = apiService.createStep(initializedJourney);
        driver = WebDriverService.getDriver(host, port);
    }

    @AfterMethod
    public void afterTest(ITestResult result) throws IOException{
        // change step name to test's name
        apiService.updateStep(initializedJourney, createdAction, result.getMethod().getMethodName());
        WebDriverService.remove();
    }

    @Test
    public void testRdcWithBrowser() {
        // Driver is already connected to Live Connect proxy and should be capturing requests.
        // Open test page in Chrome browser.

        driver.get("http://qa.jpstyle.us/tag-database/appnexus");
    }
}
