package models;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

public class Folder {

    private Integer id = null;
    private String name = null;
    private Integer accountId = null;
    private Integer domainsCount = null;
    private Integer appsCount = null;
    private Integer auditsRunning = null;
    private Integer simulationsRunning = null;
    private Integer simulationErrors = null;
    private Integer appsInQueue = null;
    private Integer appsRunning = null;
    private Integer appRuleFailures = null;
    private Integer appFailures = null;
    private String createdAt = null;
    private Integer createdByUserId = null;
    private String createdByUserName = null;



    @ApiModelProperty(name = "id", required = true)
    public Integer getId() {
        return id;
    }

    public Folder setId(Integer id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public Folder setName(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(name = "accountId", required = true)
    public Integer getAccountId() {
        return accountId;
    }

    public Folder setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }


    @ApiModelProperty(name = "domainsCount", required = true)
    public Integer getDomainsCount() {
        return domainsCount;
    }

    public Folder setDomainsCount(Integer domainsCount) {
        this.domainsCount = domainsCount;
        return this;
    }


    @ApiModelProperty(name = "appsCount", required = true)
    public Integer getAppsCount() {
        return appsCount;
    }

    public Folder setAppsCount(Integer appsCount) {
        this.appsCount = appsCount;
        return this;
    }


    @ApiModelProperty(name = "auditsRunning", required = true)
    public Integer getAuditsRunning() {
        return auditsRunning;
    }

    public Folder setAuditsRunning(Integer auditsRunning) {
        this.auditsRunning = auditsRunning;
        return this;
    }


    @ApiModelProperty(name = "simulationsRunning", required = true)
    public Integer getSimulationsRunning() {
        return simulationsRunning;
    }

    public Folder setSimulationsRunning(Integer simulationsRunning) {
        this.simulationsRunning = simulationsRunning;
        return this;
    }


    @ApiModelProperty(name = "simulationErrors", required = true)
    public Integer getSimulationErrors() {
        return simulationErrors;
    }

    public Folder setSimulationErrors(Integer simulationErrors) {
        this.simulationErrors = simulationErrors;
        return this;
    }


    @ApiModelProperty(name = "appsInQueue", required = true)
    public Integer getAppsInQueue() {
        return appsInQueue;
    }

    public Folder setAppsInQueue(Integer appsInQueue) {
        this.appsInQueue = appsInQueue;
        return this;
    }


    @ApiModelProperty(name = "appsRunning", required = true)
    public Integer getAppsRunning() {
        return appsRunning;
    }

    public Folder setAppsRunning(Integer appsRunning) {
        this.appsRunning = appsRunning;
        return this;
    }


    @ApiModelProperty(name = "appRuleFailures", required = true)
    public Integer getAppRuleFailures() {
        return appRuleFailures;
    }

    public Folder setAppRuleFailures(Integer appRuleFailures) {
        this.appRuleFailures = appRuleFailures;
        return this;
    }


    @ApiModelProperty(name = "appFailures", required = true)
    public Integer getAppFailures() {
        return appFailures;
    }

    public Folder setAppFailures(Integer appFailures) {
        this.appFailures = appFailures;
        return this;
    }


    @ApiModelProperty(name = "createdAt", required = true)
    public String getCreatedAt() {
        return createdAt;
    }

    public Folder setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }


    @ApiModelProperty(name = "createdByUserId", required = true)
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    public Folder setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }


    @ApiModelProperty(name = "createdByUserName", required = true)
    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public Folder setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
        return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Folder folder = (Folder) o;
        return Objects.equals(this.id, folder.id) &&
                Objects.equals(this.name, folder.name) &&
                Objects.equals(this.accountId, folder.accountId) &&
                Objects.equals(this.domainsCount, folder.domainsCount) &&
                Objects.equals(this.appsCount, folder.appsCount) &&
                Objects.equals(this.auditsRunning, folder.auditsRunning) &&
                Objects.equals(this.simulationsRunning, folder.simulationsRunning) &&
                Objects.equals(this.simulationErrors, folder.simulationErrors) &&
                Objects.equals(this.appsInQueue, folder.appsInQueue) &&
                Objects.equals(this.appsRunning, folder.appsRunning) &&
                Objects.equals(this.appRuleFailures, folder.appRuleFailures) &&
                Objects.equals(this.appFailures, folder.appFailures) &&
                Objects.equals(this.createdAt, folder.createdAt) &&
                Objects.equals(this.createdByUserId, folder.createdByUserId) &&
                Objects.equals(this.createdByUserName, folder.createdByUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, accountId, domainsCount, appsCount, auditsRunning, simulationsRunning, simulationErrors, appsInQueue, appsRunning, appRuleFailures, appFailures, createdAt, createdByUserId, createdByUserName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Folder {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    domainsCount: ").append(toIndentedString(domainsCount)).append("\n");
        sb.append("    appsCount: ").append(toIndentedString(appsCount)).append("\n");
        sb.append("    auditsRunning: ").append(toIndentedString(auditsRunning)).append("\n");
        sb.append("    simulationsRunning: ").append(toIndentedString(simulationsRunning)).append("\n");
        sb.append("    simulationErrors: ").append(toIndentedString(simulationErrors)).append("\n");
        sb.append("    appsInQueue: ").append(toIndentedString(appsInQueue)).append("\n");
        sb.append("    appsRunning: ").append(toIndentedString(appsRunning)).append("\n");
        sb.append("    appRuleFailures: ").append(toIndentedString(appRuleFailures)).append("\n");
        sb.append("    appFailures: ").append(toIndentedString(appFailures)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
        sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String createBody() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

