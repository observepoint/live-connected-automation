package models;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JourneyRequest {
    private String name = null;
    private String journeyType = null;
    private Integer folderId = null;
    private String osOfDevice = null;
    private String versionOfOs = null;
    private List<String> emails = new ArrayList<>();



    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public JourneyRequest setName(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(name = "journeyType")
    public String getJourneyType() {
        return journeyType;
    }

    public JourneyRequest setJourneyType(String journeyType) {
        this.journeyType = journeyType;
        return this;
    }


    @ApiModelProperty(name = "folderId", required = true)
    public Integer getFolderId() {
        return folderId;
    }

    public JourneyRequest setFolderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }


    @ApiModelProperty(name = "osOfDevice", required = true)
    public String getOsOfDevice() {
        return osOfDevice;
    }

    public JourneyRequest setOsOfDevice(String osOfDevice) {
        this.osOfDevice = osOfDevice;
        return this;
    }


    @ApiModelProperty(name = "versionOfOs", required = true)
    public String getVersionOfOs() {
        return versionOfOs;
    }

    public JourneyRequest setVersionOfOs(String versionOfOs) {
        this.versionOfOs = versionOfOs;
        return this;
    }


    @ApiModelProperty(name = "emails", required = true)
    public List<String> getEmails() {
        return emails;
    }

    public JourneyRequest setEmails(List<String> emails) {
        this.emails = emails;
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
        JourneyRequest journeyRequest = (JourneyRequest) o;
        return Objects.equals(this.name, journeyRequest.name) &&
                Objects.equals(this.journeyType, journeyRequest.journeyType) &&
                Objects.equals(this.folderId, journeyRequest.folderId) &&
                Objects.equals(this.osOfDevice, journeyRequest.osOfDevice) &&
                Objects.equals(this.versionOfOs, journeyRequest.versionOfOs) &&
                Objects.equals(this.emails, journeyRequest.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, journeyType, folderId, osOfDevice, versionOfOs, emails);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JourneyRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    osOfDevice: ").append(toIndentedString(osOfDevice)).append("\n");
        sb.append("    versionOfOs: ").append(toIndentedString(versionOfOs)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
