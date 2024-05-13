package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;


/**
 * A JSONPatch document as defined by RFC 6902
 */

@Schema(name = "JsonPatch", description = "A JSONPatch document as defined by RFC 6902")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class JsonPatch {

  /**
   * The operation to be performed
   */
  public enum OpEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @JsonProperty("op")
  private OpEnum op;
  @JsonProperty("path")
  private String path;
  @JsonProperty("value")
  private Object value;
  @JsonProperty("from")
  private String from;

  public JsonPatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonPatch(OpEnum op, String path) {
    this.op = op;
    this.path = path;
  }

  public JsonPatch op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * The operation to be performed
   * @return op
  */
  @NotNull
  @Schema(name = "op", description = "The operation to be performed", requiredMode = Schema.RequiredMode.REQUIRED)
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public JsonPatch path(String path) {
    this.path = path;
    return this;
  }

  /**
   * A JSON-Pointer
   * @return path
  */
  @NotNull 
  @Schema(name = "path", description = "A JSON-Pointer", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JsonPatch value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value to be used within the operations.
   * @return value
  */
  
  @Schema(name = "value", description = "The value to be used within the operations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public JsonPatch from(String from) {
    this.from = from;
    return this;
  }

  /**
   * A string containing a JSON Pointer value.
   * @return from
  */
  
  @Schema(name = "from", description = "A string containing a JSON Pointer value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPatch jsonPatch = (JsonPatch) o;
    return Objects.equals(this.op, jsonPatch.op) &&
        Objects.equals(this.path, jsonPatch.path) &&
        Objects.equals(this.value, jsonPatch.value) &&
        Objects.equals(this.from, jsonPatch.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPatch {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

