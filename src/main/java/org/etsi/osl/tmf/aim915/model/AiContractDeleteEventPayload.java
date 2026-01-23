package org.etsi.osl.tmf.aim915.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.etsi.osl.tmf.aim915.model.AiContract;
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

@Schema(name = "AiContractDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiContractDeleteEventPayload {

  private @Nullable AiContract aiContract;

  public AiContractDeleteEventPayload aiContract(@Nullable AiContract aiContract) {
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
    AiContractDeleteEventPayload aiContractDeleteEventPayload = (AiContractDeleteEventPayload) o;
    return Objects.equals(this.aiContract, aiContractDeleteEventPayload.aiContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiContractDeleteEventPayload {\n");
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

