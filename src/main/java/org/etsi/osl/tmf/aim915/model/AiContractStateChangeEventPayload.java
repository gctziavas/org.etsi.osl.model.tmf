package org.etsi.osl.tmf.aim915.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AiContract;
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

@Schema(name = "AiContractStateChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiContractStateChangeEventPayload {

  private @Nullable AiContract aiContract;

  public AiContractStateChangeEventPayload aiContract(@Nullable AiContract aiContract) {
    this.aiContract = aiContract;
    return this;
  }

  /**
   * Get aiContract
   * @return aiContract
   */
  @Valid 
  @Schema(name = "aiContract", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiContract")
  public @Nullable AiContract getAiContract() {
    return aiContract;
  }

  public void setAiContract(@Nullable AiContract aiContract) {
    this.aiContract = aiContract;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiContractStateChangeEventPayload aiContractStateChangeEventPayload = (AiContractStateChangeEventPayload) o;
    return Objects.equals(this.aiContract, aiContractStateChangeEventPayload.aiContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiContractStateChangeEventPayload {\n");
    sb.append("    aiContract: ").append(toIndentedString(aiContract)).append("\n");
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

