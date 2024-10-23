package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * MeasurementCollectionJobAttributeValueChangeEvent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobAttributeValueChangeEvent extends Event{

  private MeasurementCollectionJobAttributeValueChangeEventPayload event;

  public MeasurementCollectionJobAttributeValueChangeEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobAttributeValueChangeEvent(String type) {
    this.type = type;
  }

  public MeasurementCollectionJobAttributeValueChangeEvent event(MeasurementCollectionJobAttributeValueChangeEventPayload event) {
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
  public MeasurementCollectionJobAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(MeasurementCollectionJobAttributeValueChangeEventPayload event) {
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
    MeasurementCollectionJobAttributeValueChangeEvent measurementCollectionJobAttributeValueChangeEvent = (MeasurementCollectionJobAttributeValueChangeEvent) o;
    return Objects.equals(this.type, measurementCollectionJobAttributeValueChangeEvent.type) &&
        Objects.equals(this.baseType, measurementCollectionJobAttributeValueChangeEvent.baseType) &&
        Objects.equals(this.schemaLocation, measurementCollectionJobAttributeValueChangeEvent.schemaLocation) &&
        Objects.equals(this.href, measurementCollectionJobAttributeValueChangeEvent.href) &&
        Objects.equals(this.id, measurementCollectionJobAttributeValueChangeEvent.id) &&
        Objects.equals(this.correlationId, measurementCollectionJobAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, measurementCollectionJobAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, measurementCollectionJobAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, measurementCollectionJobAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, measurementCollectionJobAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOccurred, measurementCollectionJobAttributeValueChangeEvent.timeOccurred) &&
        Objects.equals(this.source, measurementCollectionJobAttributeValueChangeEvent.source) &&
        Objects.equals(this.reportingSystem, measurementCollectionJobAttributeValueChangeEvent.reportingSystem) &&
        Objects.equals(this.relatedParty, measurementCollectionJobAttributeValueChangeEvent.relatedParty) &&
        Objects.equals(this.analyticCharacteristic, measurementCollectionJobAttributeValueChangeEvent.analyticCharacteristic) &&
        Objects.equals(this.eventId, measurementCollectionJobAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, measurementCollectionJobAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, measurementCollectionJobAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.event, measurementCollectionJobAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, id, correlationId, domain, title, description, priority, timeOccurred, source, reportingSystem, relatedParty, analyticCharacteristic, eventId, eventTime, eventType, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobAttributeValueChangeEvent {\n");
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

