package models;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Journey {

    private Integer id = null;
    private String name = null;
    private String journeyType = null;
    private Integer userId = null;
    private Integer folderId = null;
    private String osOfDevice = null;
    private String versionOfOs = null;
    private String createdAt = null;
    private String updatedAt = null;
    private List<String> emails = new ArrayList<>();
    private List<Label> labels = null;


    @ApiModelProperty(name = "id", required = true)
    public Integer getId() {
        return id;
    }

    public Journey setId(Integer id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public Journey setName(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(name = "journeyType")
    public String getJourneyType() {
        return journeyType;
    }

    public Journey setJourneyType(String journeyType) {
        this.journeyType = journeyType;
        return this;
    }


    @ApiModelProperty(name = "userId", required = true)
    public Integer getUserId() {
        return userId;
    }

    public Journey setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }


    @ApiModelProperty(name = "folderId", required = true)
    public Integer getFolderId() {
        return folderId;
    }

    public Journey setFolderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }


    @ApiModelProperty(name = "osOfDevice", required = true)
    public String getOsOfDevice() {
        return osOfDevice;
    }

    public Journey setOsOfDevice(String osOfDevice) {
        this.osOfDevice = osOfDevice;
        return this;
    }


    @ApiModelProperty(name = "versionOfOs", required = true)
    public String getVersionOfOs() {
        return versionOfOs;
    }

    public Journey setVersionOfOs(String versionOfOs) {
        this.versionOfOs = versionOfOs;
        return this;
    }


    @ApiModelProperty(name = "createdAt", required = true)
    public String getCreatedAt() {
        return createdAt;
    }

    public Journey setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }


    @ApiModelProperty(name = "updatedAt", required = true)
    public String getUpdatedAt() {
        return updatedAt;
    }

    public Journey setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }


    @ApiModelProperty(name = "emails", required = true)
    public List<String> getEmails() {
        return emails;
    }

    public Journey setEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }


    @ApiModelProperty(name = "labels")
    public List<Label> getLabels() {
        return labels;
    }

    public Journey setLabels(List<Label> labels) {
        this.labels = labels;
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
        Journey journey = (Journey) o;
        return Objects.equals(this.id, journey.id) &&
                Objects.equals(this.name, journey.name) &&
                Objects.equals(this.journeyType, journey.journeyType) &&
                Objects.equals(this.userId, journey.userId) &&
                Objects.equals(this.folderId, journey.folderId) &&
                Objects.equals(this.osOfDevice, journey.osOfDevice) &&
                Objects.equals(this.versionOfOs, journey.versionOfOs) &&
                Objects.equals(this.createdAt, journey.createdAt) &&
                Objects.equals(this.updatedAt, journey.updatedAt) &&
                Objects.equals(this.emails, journey.emails) &&
                Objects.equals(this.labels, journey.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, journeyType, userId, folderId, osOfDevice, versionOfOs, createdAt, updatedAt, emails, labels);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Journey {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    osOfDevice: ").append(toIndentedString(osOfDevice)).append("\n");
        sb.append("    versionOfOs: ").append(toIndentedString(versionOfOs)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
