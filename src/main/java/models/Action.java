package models;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Action {

    private Integer id = null;
    private Integer runId = null;
    private Integer sequence = null;
    private Integer actionType = null;
    private String name = null;
    private String note = null;


    @ApiModelProperty(name = "id", required = true)
    public Integer getId() {
        return id;
    }

    public Action setId(Integer id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(name = "runId", required = true)
    public Integer getRunId() {
        return runId;
    }

    public Action setRunId(Integer runId) {
        this.runId = runId;
        return this;
    }


    @ApiModelProperty(name = "sequence", required = true)
    public Integer getSequence() {
        return sequence;
    }

    public Action setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }


    @ApiModelProperty(name = "actionType", required = true)
    public Integer getActionType() {
        return actionType;
    }

    public Action setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }


    @ApiModelProperty(name = "name", required = true)
    public String getName() {
        return name;
    }

    public Action setName(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(name = "note")
    public String getNote() {
        return note;
    }

    public Action setNote(String note) {
        this.note = note;
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
        Action action = (Action) o;
        return Objects.equals(this.id, action.id) &&
                Objects.equals(this.runId, action.runId) &&
                Objects.equals(this.sequence, action.sequence) &&
                Objects.equals(this.actionType, action.actionType) &&
                Objects.equals(this.name, action.name) &&
                Objects.equals(this.note, action.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, runId, sequence, actionType, name, note);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Action {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

