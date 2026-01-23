package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */

@Schema(name = "TimePeriod", description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class TimePeriod {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDateTime;

  public TimePeriod endDateTime(@Nullable OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period, using IETC-RFC-3339 format
   * @return endDateTime
   */
  @Valid 
  @Schema(name = "endDateTime", example = "1985-04-12T23:20:50.520Z", description = "End of the time period, using IETC-RFC-3339 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateTime")
  public @Nullable OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(@Nullable OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public TimePeriod startDateTime(@Nullable OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format
   * @return startDateTime
   */
  @Valid 
  @Schema(name = "startDateTime", example = "1985-04-12T23:20:50.520Z", description = "Start of the time period, using IETC-RFC-3339 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateTime")
  public @Nullable OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(@Nullable OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

