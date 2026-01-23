package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.etsi.osl.tmf.aim915.model.AiModelSpecification;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * The event data structure
 */

@Schema(name = "AiModelSpecificationAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiModelSpecificationAttributeValueChangeEventPayload {

  private @Nullable AiModelSpecification aiModelSpecification;

  public AiModelSpecificationAttributeValueChangeEventPayload aiModelSpecification(@Nullable AiModelSpecification aiModelSpecification) {
    this.aiModelSpecification = aiModelSpecification;
    return this;
  }

  /**
   * Get aiModelSpecification
   * @return aiModelSpecification
   */
  @Valid 
  @Schema(name = "aiModelSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiModelSpecification")
  public @Nullable AiModelSpecification getAiModelSpecification() {
    return aiModelSpecification;
  }

  public void setAiModelSpecification(@Nullable AiModelSpecification aiModelSpecification) {
    this.aiModelSpecification = aiModelSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModelSpecificationAttributeValueChangeEventPayload aiModelSpecificationAttributeValueChangeEventPayload = (AiModelSpecificationAttributeValueChangeEventPayload) o;
    return Objects.equals(this.aiModelSpecification, aiModelSpecificationAttributeValueChangeEventPayload.aiModelSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiModelSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelSpecificationAttributeValueChangeEventPayload {\n");
    sb.append("    aiModelSpecification: ").append(toIndentedString(aiModelSpecification)).append("\n");
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

