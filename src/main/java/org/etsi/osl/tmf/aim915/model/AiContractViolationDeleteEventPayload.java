package org.etsi.osl.tmf.aim915.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AiContractViolation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "AiContractViolationDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiContractViolationDeleteEventPayload {

  private @Nullable AiContractViolation aiContractViolation;

  public AiContractViolationDeleteEventPayload aiContractViolation(@Nullable AiContractViolation aiContractViolation) {
    this.aiContractViolation = aiContractViolation;
    return this;
  }

  /**
   * Get aiContractViolation
   * @return aiContractViolation
   */
  @Valid 
  @Schema(name = "aiContractViolation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiContractViolation")
  public @Nullable AiContractViolation getAiContractViolation() {
    return aiContractViolation;
  }

  public void setAiContractViolation(@Nullable AiContractViolation aiContractViolation) {
    this.aiContractViolation = aiContractViolation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiContractViolationDeleteEventPayload aiContractViolationDeleteEventPayload = (AiContractViolationDeleteEventPayload) o;
    return Objects.equals(this.aiContractViolation, aiContractViolationDeleteEventPayload.aiContractViolation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiContractViolation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiContractViolationDeleteEventPayload {\n");
    sb.append("    aiContractViolation: ").append(toIndentedString(aiContractViolation)).append("\n");
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

