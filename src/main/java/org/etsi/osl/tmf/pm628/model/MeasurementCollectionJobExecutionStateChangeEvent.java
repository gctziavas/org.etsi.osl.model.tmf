package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * MeasurementCollectionJobExecutionStateChangeEvent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobExecutionStateChangeEvent extends Event{

  private MeasurementCollectionJobExecutionStateChangeEventPayload event;

  public MeasurementCollectionJobExecutionStateChangeEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobExecutionStateChangeEvent(String type) {
    this.type = type;
  }

  /**
   * Get event
   * @return event
  */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public MeasurementCollectionJobExecutionStateChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(MeasurementCollectionJobExecutionStateChangeEventPayload event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementCollectionJobExecutionStateChangeEvent measurementCollectionJobExecutionStateChangeEvent = (MeasurementCollectionJobExecutionStateChangeEvent) o;
    return Objects.equals(this.type, measurementCollectionJobExecutionStateChangeEvent.type) &&
        Objects.equals(this.baseType, measurementCollectionJobExecutionStateChangeEvent.baseType) &&
        Objects.equals(this.schemaLocation, measurementCollectionJobExecutionStateChangeEvent.schemaLocation) &&
        Objects.equals(this.href, measurementCollectionJobExecutionStateChangeEvent.href) &&
        Objects.equals(this.id, measurementCollectionJobExecutionStateChangeEvent.id) &&
        Objects.equals(this.correlationId, measurementCollectionJobExecutionStateChangeEvent.correlationId) &&
        Objects.equals(this.domain, measurementCollectionJobExecutionStateChangeEvent.domain) &&
        Objects.equals(this.title, measurementCollectionJobExecutionStateChangeEvent.title) &&
        Objects.equals(this.description, measurementCollectionJobExecutionStateChangeEvent.description) &&
        Objects.equals(this.priority, measurementCollectionJobExecutionStateChangeEvent.priority) &&
        Objects.equals(this.timeOccurred, measurementCollectionJobExecutionStateChangeEvent.timeOccurred) &&
        Objects.equals(this.source, measurementCollectionJobExecutionStateChangeEvent.source) &&
        Objects.equals(this.reportingSystem, measurementCollectionJobExecutionStateChangeEvent.reportingSystem) &&
        Objects.equals(this.relatedParty, measurementCollectionJobExecutionStateChangeEvent.relatedParty) &&
        Objects.equals(this.analyticCharacteristic, measurementCollectionJobExecutionStateChangeEvent.analyticCharacteristic) &&
        Objects.equals(this.eventId, measurementCollectionJobExecutionStateChangeEvent.eventId) &&
        Objects.equals(this.eventTime, measurementCollectionJobExecutionStateChangeEvent.eventTime) &&
        Objects.equals(this.eventType, measurementCollectionJobExecutionStateChangeEvent.eventType) &&
        Objects.equals(this.event, measurementCollectionJobExecutionStateChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, id, correlationId, domain, title, description, priority, timeOccurred, source, reportingSystem, relatedParty, analyticCharacteristic, eventId, eventTime, eventType, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobExecutionStateChangeEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOccurred: ").append(toIndentedString(timeOccurred)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reportingSystem: ").append(toIndentedString(reportingSystem)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    analyticCharacteristic: ").append(toIndentedString(analyticCharacteristic)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

