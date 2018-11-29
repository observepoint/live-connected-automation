package models;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
public class Authorization {

    private String login = null;
    private String password = null;



    @ApiModelProperty(name = "login", required = true)
    public String getLogin() {
        return login;
    }

    public Authorization setLogin(String login) {
        this.login = login;
        return this;
    }


    @ApiModelProperty(name = "password", required = true)
    public String getPassword() {
        return password;
    }

    public Authorization setPassword(String password) {
        this.password = password;
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
        Authorization authorization = (Authorization) o;
        return Objects.equals(this.login, authorization.login) &&
                Objects.equals(this.password, authorization.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorization {\n");

        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

