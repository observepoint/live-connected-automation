package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
/**
 * ProxyInfo
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProxyInfo {
    @JsonProperty("interface")
    private String _interface = null;

    @JsonProperty("port")
    private Integer port = null;

    @JsonProperty("authorization")
    private Authorization authorization = null;

    public ProxyInfo _interface(String _interface) {
        this._interface = _interface;
        return this;
    }

    /**
     * Get _interface
     * @return _interface
     **/
    @ApiModelProperty(required = true, value = "")
    public String getInterface() {
        return _interface;
    }

    public ProxyInfo setInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    public ProxyInfo port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get port
     * @return port
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getPort() {
        return port;
    }

    public ProxyInfo setPort(Integer port) {
        this.port = port;
        return this;
    }

    public ProxyInfo authorization(Authorization authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get authorization
     * @return authorization
     **/
    @ApiModelProperty(value = "")
    public Authorization getAuthorization() {
        return authorization;
    }

    public ProxyInfo setAuthorization(Authorization authorization) {
        this.authorization = authorization;
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
        ProxyInfo proxyInfo = (ProxyInfo) o;
        return Objects.equals(this._interface, proxyInfo._interface) &&
                Objects.equals(this.port, proxyInfo.port) &&
                Objects.equals(this.authorization, proxyInfo.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_interface, port, authorization);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyInfo {\n");

        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
