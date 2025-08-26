package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.etsi.osl.tmf.aim915.model.Alarm;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * The event data structure
 */

@Schema(name = "AlarmAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AlarmAttributeValueChangeEventPayload {

  private @Nullable Alarm alarm;

  public AlarmAttributeValueChangeEventPayload alarm(@Nullable Alarm alarm) {
    this.alarm = alarm;
    return this;
  }

  /**
   * Get alarm
   * @return alarm
   */
  @Valid 
  @Schema(name = "alarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarm")
  public @Nullable Alarm getAlarm() {
    return alarm;
  }

  public void setAlarm(@Nullable Alarm alarm) {
    this.alarm = alarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmAttributeValueChangeEventPayload alarmAttributeValueChangeEventPayload = (AlarmAttributeValueChangeEventPayload) o;
    return Objects.equals(this.alarm, alarmAttributeValueChangeEventPayload.alarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmAttributeValueChangeEventPayload {\n");
    sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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

