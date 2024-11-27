package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A value of a performance indicator.
 */

@Schema(name = "PerformanceIndicatorGroupValue", description = "A value of a performance indicator.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorGroupValue {

  private PerformanceIndicatorGroupSpecificationRefOrValue performanceIndicatorGroupSpecification;

  @Valid
  private List<@Valid PerformanceIndicatorValue> observedGroupValue = new ArrayList<>();

  private Object tag;

  public PerformanceIndicatorGroupValue performanceIndicatorGroupSpecification(PerformanceIndicatorGroupSpecificationRefOrValue performanceIndicatorGroupSpecification) {
    this.performanceIndicatorGroupSpecification = performanceIndicatorGroupSpecification;
    return this;
  }

  /**
   * Get performanceIndicatorGroupSpecification
   * @return performanceIndicatorGroupSpecification
  */
  @Valid 
  @Schema(name = "performanceIndicatorGroupSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorGroupSpecification")
  public PerformanceIndicatorGroupSpecificationRefOrValue getPerformanceIndicatorGroupSpecification() {
    return performanceIndicatorGroupSpecification;
  }

  public void setPerformanceIndicatorGroupSpecification(PerformanceIndicatorGroupSpecificationRefOrValue performanceIndicatorGroupSpecification) {
    this.performanceIndicatorGroupSpecification = performanceIndicatorGroupSpecification;
  }

  public PerformanceIndicatorGroupValue observedGroupValue(List<@Valid PerformanceIndicatorValue> observedGroupValue) {
    this.observedGroupValue = observedGroupValue;
    return this;
  }

  public PerformanceIndicatorGroupValue addObservedGroupValueItem(PerformanceIndicatorValue observedGroupValueItem) {
    if (this.observedGroupValue == null) {
      this.observedGroupValue = new ArrayList<>();
    }
    this.observedGroupValue.add(observedGroupValueItem);
    return this;
  }

  /**
   * The measurement group (array) values
   * @return observedGroupValue
  */
  @Valid @Size(min = 1) 
  @Schema(name = "observedGroupValue", description = "The measurement group (array) values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedGroupValue")
  public List<@Valid PerformanceIndicatorValue> getObservedGroupValue() {
    return observedGroupValue;
  }

  public void setObservedGroupValue(List<@Valid PerformanceIndicatorValue> observedGroupValue) {
    this.observedGroupValue = observedGroupValue;
  }

  public PerformanceIndicatorGroupValue tag(Object tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The optional tag object attached to this observed group value
   * @return tag
  */
  
  @Schema(name = "tag", description = "The optional tag object attached to this observed group value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PerformanceIndicatorGroupValue performanceIndicatorGroupValue = (PerformanceIndicatorGroupValue) o;
    return Objects.equals(this.performanceIndicatorGroupSpecification, performanceIndicatorGroupValue.performanceIndicatorGroupSpecification) &&
        Objects.equals(this.observedGroupValue, performanceIndicatorGroupValue.observedGroupValue) &&
        Objects.equals(this.tag, performanceIndicatorGroupValue.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceIndicatorGroupSpecification, observedGroupValue, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorGroupValue {\n");
    sb.append("    performanceIndicatorGroupSpecification: ").append(toIndentedString(performanceIndicatorGroupSpecification)).append("\n");
    sb.append("    observedGroupValue: ").append(toIndentedString(observedGroupValue)).append("\n");
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

