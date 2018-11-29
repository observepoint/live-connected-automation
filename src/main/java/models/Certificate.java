package models;
import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
public class Certificate {

    private String id = null;
    private String name = null;



    @ApiModelProperty(name = "id", required = true)
    public String getId() {
        return id;
    }

    public Certificate setId(String id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public Certificate setName(String name) {
        this.name = name;
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
        Certificate certificate = (Certificate) o;
        return Objects.equals(this.id, certificate.id) &&
                Objects.equals(this.name, certificate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Certificate {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

