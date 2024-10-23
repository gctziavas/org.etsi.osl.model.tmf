package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * MeasurementCollectionJobDeleteEventPayload generic structure
 */

@Schema(name = "MeasurementCollectionJobDeleteEventPayload", description = "MeasurementCollectionJobDeleteEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobDeleteEventPayload {

  private MeasurementCollectionJob measurementCollectionJob;

  public MeasurementCollectionJobDeleteEventPayload measurementCollectionJob(MeasurementCollectionJob measurementCollectionJob) {
    this.measurementCollectionJob = measurementCollectionJob;
    return this;
  }

  /**
   * Get measurementCollectionJob
   * @return measurementCollectionJob
  */
  @Valid 
  @Schema(name = "measurementCollectionJob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("measurementCollectionJob")
  public MeasurementCollectionJob getMeasurementCollectionJob() {
    return measurementCollectionJob;
  }

  public void setMeasurementCollectionJob(MeasurementCollectionJob measurementCollectionJob) {
    this.measurementCollectionJob = measurementCollectionJob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementCollectionJobDeleteEventPayload measurementCollectionJobDeleteEventPayload = (MeasurementCollectionJobDeleteEventPayload) o;
    return Objects.equals(this.measurementCollectionJob, measurementCollectionJobDeleteEventPayload.measurementCollectionJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementCollectionJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobDeleteEventPayload {\n");
    sb.append("    measurementCollectionJob: ").append(toIndentedString(measurementCollectionJob)).append("\n");
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

