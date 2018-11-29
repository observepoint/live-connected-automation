package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@JsonIgnoreProperties(value = { "fromTemplate", "labels", "tags", "pageFilters", "matchAllFilters", "checkTimes", "recipients", "updatedAt", "createdAt", "createdBy", "accountId"})
public class Rule {

    private Integer id = null;
    private String name = null;

    @ApiModelProperty(name = "id", required = true)
    public Integer getId() {
        return id;
    }

    public Rule setId(Integer id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public Rule setName(String name) {
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
        Rule rule = (Rule) o;
        return Objects.equals(this.id, rule.id) &&
                Objects.equals(this.name, rule.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);//, accountId, createdBy, createdAt, updatedAt, recipients, checkTimes, matchAllFilters, pageFilters, tags, labels, fromTemplate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");

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

