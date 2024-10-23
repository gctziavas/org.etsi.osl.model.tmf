package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * A value of a performance indicator.
 */

@Schema(name = "PerformanceIndicatorValue", description = "A value of a performance indicator.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorValue {

  private PerformanceIndicatorSpecificationRefOrValue performanceIndicatorSpecification;

  private String observedValue;

  private Object tag;

  public PerformanceIndicatorValue performanceIndicatorSpecification(PerformanceIndicatorSpecificationRefOrValue performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
    return this;
  }

  /**
   * Get performanceIndicatorSpecification
   * @return performanceIndicatorSpecification
  */
  @Valid 
  @Schema(name = "performanceIndicatorSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorSpecification")
  public PerformanceIndicatorSpecificationRefOrValue getPerformanceIndicatorSpecification() {
    return performanceIndicatorSpecification;
  }

  public void setPerformanceIndicatorSpecification(PerformanceIndicatorSpecificationRefOrValue performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
  }

  public PerformanceIndicatorValue observedValue(String observedValue) {
    this.observedValue = observedValue;
    return this;
  }

  /**
   * The measurement value
   * @return observedValue
  */
  
  @Schema(name = "observedValue", description = "The measurement value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedValue")
  public String getObservedValue() {
    return observedValue;
  }

  public void setObservedValue(String observedValue) {
    this.observedValue = observedValue;
  }

  public PerformanceIndicatorValue tag(Object tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The optional tag object attached to this observed value
   * @return tag
  */
  
  @Schema(name = "tag", description = "The optional tag object attached to this observed value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public Object getTag() {
    return tag;
  }

  public void setTag(Object tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorValue performanceIndicatorValue = (PerformanceIndicatorValue) o;
    return Objects.equals(this.performanceIndicatorSpecification, performanceIndicatorValue.performanceIndicatorSpecification) &&
        Objects.equals(this.observedValue, performanceIndicatorValue.observedValue) &&
        Objects.equals(this.tag, performanceIndicatorValue.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceIndicatorSpecification, observedValue, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorValue {\n");
    sb.append("    performanceIndicatorSpecification: ").append(toIndentedString(performanceIndicatorSpecification)).append("\n");
    sb.append("    observedValue: ").append(toIndentedString(observedValue)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

