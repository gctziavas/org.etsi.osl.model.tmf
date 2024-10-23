package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * MeasurementCollectionJobCreateEvent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobCreateEvent extends Event{

  @JsonProperty("event")
  private MeasurementCollectionJobCreateEventPayload event;

  public MeasurementCollectionJobCreateEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobCreateEvent(String type) {
    this.type = type;
  }

  public MeasurementCollectionJobCreateEvent event(MeasurementCollectionJobCreateEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public MeasurementCollectionJobCreateEventPayload getEvent() {
    return event;
  }

  public void setEvent(MeasurementCollectionJobCreateEventPayload event) {
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
    MeasurementCollectionJobCreateEvent measurementCollectionJobCreateEvent = (MeasurementCollectionJobCreateEvent) o;
    return Objects.equals(this.type, measurementCollectionJobCreateEvent.type) &&
        Objects.equals(this.baseType, measurementCollectionJobCreateEvent.baseType) &&
        Objects.equals(this.schemaLocation, measurementCollectionJobCreateEvent.schemaLocation) &&
        Objects.equals(this.href, measurementCollectionJobCreateEvent.href) &&
        Objects.equals(this.id, measurementCollectionJobCreateEvent.id) &&
        Objects.equals(this.correlationId, measurementCollectionJobCreateEvent.correlationId) &&
        Objects.equals(this.domain, measurementCollectionJobCreateEvent.domain) &&
        Objects.equals(this.title, measurementCollectionJobCreateEvent.title) &&
        Objects.equals(this.description, measurementCollectionJobCreateEvent.description) &&
        Objects.equals(this.priority, measurementCollectionJobCreateEvent.priority) &&
        Objects.equals(this.timeOccurred, measurementCollectionJobCreateEvent.timeOccurred) &&
        Objects.equals(this.source, measurementCollectionJobCreateEvent.source) &&
        Objects.equals(this.reportingSystem, measurementCollectionJobCreateEvent.reportingSystem) &&
        Objects.equals(this.relatedParty, measurementCollectionJobCreateEvent.relatedParty) &&
        Objects.equals(this.analyticCharacteristic, measurementCollectionJobCreateEvent.analyticCharacteristic) &&
        Objects.equals(this.eventId, measurementCollectionJobCreateEvent.eventId) &&
        Objects.equals(this.eventTime, measurementCollectionJobCreateEvent.eventTime) &&
        Objects.equals(this.eventType, measurementCollectionJobCreateEvent.eventType) &&
        Objects.equals(this.event, measurementCollectionJobCreateEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, id, correlationId, domain, title, description, priority, timeOccurred, source, reportingSystem, relatedParty, analyticCharacteristic, eventId, eventTime, eventType, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobCreateEvent {\n");
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

