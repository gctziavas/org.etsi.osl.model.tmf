package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PerformanceMeasurementGroup
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceMeasurementGroup extends PerformanceMeasurement {

  @Valid
  private List<@Valid PerformanceIndicatorGroupValue> performanceIndicatorGroupValue = new ArrayList<>();

  public PerformanceMeasurementGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceMeasurementGroup(String atType) {
    super(atType);
  }

  public PerformanceMeasurementGroup performanceIndicatorGroupValue(List<@Valid PerformanceIndicatorGroupValue> performanceIndicatorGroupValue) {
    this.performanceIndicatorGroupValue = performanceIndicatorGroupValue;
    return this;
  }

  public PerformanceMeasurementGroup addPerformanceIndicatorGroupValueItem(PerformanceIndicatorGroupValue performanceIndicatorGroupValueItem) {
    if (this.performanceIndicatorGroupValue == null) {
      this.performanceIndicatorGroupValue = new ArrayList<>();
    }
    this.performanceIndicatorGroupValue.add(performanceIndicatorGroupValueItem);
    return this;
  }

  /**
   * Get performanceIndicatorGroupValue
   * @return performanceIndicatorGroupValue
  */
  @Valid @Size(min = 1) 
  @Schema(name = "performanceIndicatorGroupValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorGroupValue")
  public List<@Valid PerformanceIndicatorGroupValue> getPerformanceIndicatorGroupValue() {
    return performanceIndicatorGroupValue;
  }

  public void setPerformanceIndicatorGroupValue(List<@Valid PerformanceIndicatorGroupValue> performanceIndicatorGroupValue) {
    this.performanceIndicatorGroupValue = performanceIndicatorGroupValue;
  }


  public PerformanceMeasurementGroup atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PerformanceMeasurementGroup atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PerformanceMeasurementGroup atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PerformanceMeasurementGroup href(String href) {
    super.href(href);
    return this;
  }

  public PerformanceMeasurementGroup id(String id) {
    super.id(id);
    return this;
  }

  public PerformanceMeasurementGroup description(String description) {
    super.description(description);
    return this;
  }

  public PerformanceMeasurementGroup measurementCollectionJob(MeasurementCollectionJobRef measurementCollectionJob) {
    super.measurementCollectionJob(measurementCollectionJob);
    return this;
  }

  public PerformanceMeasurementGroup validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PerformanceMeasurementGroup relatedMeasurement(List<PerformanceMeasurementRelationship> relatedMeasurement) {
    super.relatedMeasurement(relatedMeasurement);
    return this;
  }

  public PerformanceMeasurementGroup addRelatedMeasurementItem(PerformanceMeasurementRelationship relatedMeasurementItem) {
    super.addRelatedMeasurementItem(relatedMeasurementItem);
    return this;
  }

  public PerformanceMeasurementGroup tag(Object tag) {
    super.tag(tag);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceMeasurementGroup performanceMeasurementGroup = (PerformanceMeasurementGroup) o;
    return Objects.equals(this.performanceIndicatorGroupValue, performanceMeasurementGroup.performanceIndicatorGroupValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceIndicatorGroupValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceMeasurementGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    performanceIndicatorGroupValue: ").append(toIndentedString(performanceIndicatorGroupValue)).append("\n");
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

