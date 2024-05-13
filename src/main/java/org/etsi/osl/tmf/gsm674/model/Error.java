package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.BaseRootEntity;


/**
 * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
 */

@Schema(name = "Error", description = "Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)")

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class Error extends BaseRootEntity {
  @JsonProperty("code")
  private String code;
  @JsonProperty("reason")
  private String reason;
  @JsonProperty("message")
  private String message;
  @JsonProperty("status")
  private String status;
  @JsonProperty("referenceError")
  private String referenceError;

  public Error() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error(String atType, String code, String reason) {
    this.type = atType;
    this.code = code;
    this.reason = reason;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Application relevant detail, defined in the API or a common list.
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Application relevant detail, defined in the API or a common list.", requiredMode = Schema.RequiredMode.REQUIRED)

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Explanation of the reason for the error which can be shown to a client user.
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", description = "Explanation of the reason for the error which can be shown to a client user.", requiredMode = Schema.RequiredMode.REQUIRED)

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * More details and corrective actions related to the error which can be shown to a client user.
   * @return message
  */
  
  @Schema(name = "message", description = "More details and corrective actions related to the error which can be shown to a client user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error status(String status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP Error code extension
   * @return status
  */
  
  @Schema(name = "status", description = "HTTP Error code extension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Error referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * URI of documentation describing the error.
   * @return referenceError
  */
  
  @Schema(name = "referenceError", description = "URI of documentation describing the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.baseType, error.baseType) &&
        Objects.equals(this.schemaLocation, error.schemaLocation) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.reason, error.reason) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.referenceError, error.referenceError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, code, reason, message, status, referenceError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    @type: ").append(toIndentedString(type)).append("\n");
    sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
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

