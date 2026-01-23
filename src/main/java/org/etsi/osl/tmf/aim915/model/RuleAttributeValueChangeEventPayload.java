package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.etsi.osl.tmf.aim915.model.Rule;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * The event data structure
 */

@Schema(name = "RuleAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class RuleAttributeValueChangeEventPayload {

  private @Nullable Rule rule;

  public RuleAttributeValueChangeEventPayload rule(@Nullable Rule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
   */
  @Valid 
  @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rule")
  public @Nullable Rule getRule() {
    return rule;
  }

  public void setRule(@Nullable Rule rule) {
    this.rule = rule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleAttributeValueChangeEventPayload ruleAttributeValueChangeEventPayload = (RuleAttributeValueChangeEventPayload) o;
    return Objects.equals(this.rule, ruleAttributeValueChangeEventPayload.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleAttributeValueChangeEventPayload {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

