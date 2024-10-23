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
 * PerformanceMeasurementAtomic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceMeasurementAtomic extends PerformanceMeasurement {

  @Valid
  private List<@Valid PerformanceIndicatorValue> performanceIndicatorValue = new ArrayList<>();

  public PerformanceMeasurementAtomic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceMeasurementAtomic(String atType) {
    super(atType);
  }

  public PerformanceMeasurementAtomic performanceIndicatorValue(List<@Valid PerformanceIndicatorValue> performanceIndicatorValue) {
    this.performanceIndicatorValue = performanceIndicatorValue;
    return this;
  }

  public PerformanceMeasurementAtomic addPerformanceIndicatorValueItem(PerformanceIndicatorValue performanceIndicatorValueItem) {
    if (this.performanceIndicatorValue == null) {
      this.performanceIndicatorValue = new ArrayList<>();
    }
    this.performanceIndicatorValue.add(performanceIndicatorValueItem);
    return this;
  }

  /**
   * Get performanceIndicatorValue
   * @return performanceIndicatorValue
  */
  @Valid @Size(min = 1) 
  @Schema(name = "performanceIndicatorValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorValue")
  public List<@Valid PerformanceIndicatorValue> getPerformanceIndicatorValue() {
    return performanceIndicatorValue;
  }

  public void setPerformanceIndicatorValue(List<@Valid PerformanceIndicatorValue> performanceIndicatorValue) {
    this.performanceIndicatorValue = performanceIndicatorValue;
  }


  public PerformanceMeasurementAtomic atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PerformanceMeasurementAtomic atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PerformanceMeasurementAtomic atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PerformanceMeasurementAtomic href(String href) {
    super.href(href);
    return this;
  }

  public PerformanceMeasurementAtomic id(String id) {
    super.id(id);
    return this;
  }

  public PerformanceMeasurementAtomic description(String description) {
    super.description(description);
    return this;
  }

  public PerformanceMeasurementAtomic measurementCollectionJob(MeasurementCollectionJobRef measurementCollectionJob) {
    super.measurementCollectionJob(measurementCollectionJob);
    return this;
  }

  public PerformanceMeasurementAtomic validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PerformanceMeasurementAtomic relatedMeasurement(List<PerformanceMeasurementRelationship> relatedMeasurement) {
    super.relatedMeasurement(relatedMeasurement);
    return this;
  }

  public PerformanceMeasurementAtomic addRelatedMeasurementItem(PerformanceMeasurementRelationship relatedMeasurementItem) {
    super.addRelatedMeasurementItem(relatedMeasurementItem);
    return this;
  }

  public PerformanceMeasurementAtomic tag(Object tag) {
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
    PerformanceMeasurementAtomic performanceMeasurementAtomic = (PerformanceMeasurementAtomic) o;
    return Objects.equals(this.performanceIndicatorValue, performanceMeasurementAtomic.performanceIndicatorValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceIndicatorValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceMeasurementAtomic {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    performanceIndicatorValue: ").append(toIndentedString(performanceIndicatorValue)).append("\n");
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

