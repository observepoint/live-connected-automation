package models;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * InitializedJourney
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitializedJourney {
    @JsonProperty("journeyId")
    private Integer journeyId = null;

    @JsonProperty("runId")
    private Integer runId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("proxyInfo")
    private ProxyInfo proxyInfo = null;

    @JsonProperty("certificate")
    private Certificate certificate = null;

    public InitializedJourney journeyId(Integer journeyId) {
        this.journeyId = journeyId;
        return this;
    }

    /**
     * Get journeyId
     * @return journeyId
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getJourneyId() {
        return journeyId;
    }

    public InitializedJourney setJourneyId(Integer journeyId) {
        this.journeyId = journeyId;
        return this;
    }

    public InitializedJourney runId(Integer runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get runId
     * @return runId
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getRunId() {
        return runId;
    }

    public InitializedJourney setRunId(Integer runId) {
        this.runId = runId;
        return this;
    }

    public InitializedJourney name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public InitializedJourney setName(String name) {
        this.name = name;
        return this;
    }

    public InitializedJourney proxyInfo(ProxyInfo proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }

    /**
     * Get proxyInfo
     * @return proxyInfo
     **/
    @ApiModelProperty(required = true, value = "")
    public ProxyInfo getProxyInfo() {
        return proxyInfo;
    }

    public InitializedJourney setProxyInfo(ProxyInfo proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }

    public InitializedJourney certificate(Certificate certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get certificate
     * @return certificate
     **/
    @ApiModelProperty(value = "")
    public Certificate getCertificate() {
        return certificate;
    }

    public InitializedJourney setCertificate(Certificate certificate) {
        this.certificate = certificate;
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
        InitializedJourney initializedJourney = (InitializedJourney) o;
        return Objects.equals(this.journeyId, initializedJourney.journeyId) &&
                Objects.equals(this.runId, initializedJourney.runId) &&
                Objects.equals(this.name, initializedJourney.name) &&
                Objects.equals(this.proxyInfo, initializedJourney.proxyInfo) &&
                Objects.equals(this.certificate, initializedJourney.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(journeyId, runId, name, proxyInfo, certificate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InitializedJourney {\n");

        sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    proxyInfo: ").append(toIndentedString(proxyInfo)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("}");
        return sb.toString();
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
