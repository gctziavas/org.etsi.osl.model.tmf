package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * GeographicSiteAttributeValueChangeEvent
 */


@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSiteAttributeValueChangeEvent extends BaseEvent {
  @JsonProperty("event")
  private GeographicSiteEventPayload event;

  public GeographicSiteAttributeValueChangeEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteAttributeValueChangeEvent(String href, String id, String atType) {
    super(href, id, atType);
  }

  public GeographicSiteAttributeValueChangeEvent event(GeographicSiteEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @Valid
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public GeographicSiteEventPayload getEvent() {
    return event;
  }

  public void setEvent(GeographicSiteEventPayload event) {
    this.event = event;
  }


  public GeographicSiteAttributeValueChangeEvent eventId(String eventId) {
    super.eventId(eventId);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent eventTime(OffsetDateTime eventTime) {
    super.eventTime(eventTime);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent eventType(String eventType) {
    super.eventType(eventType);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent correlationId(String correlationId) {
    super.correlationId(correlationId);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent domain(String domain) {
    super.domain(domain);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent title(String title) {
    super.title(title);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent description(String description) {
    super.description(description);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent priority(String priority) {
    super.priority(priority);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent timeOcurred(OffsetDateTime timeOcurred) {
    super.timeOcurred(timeOcurred);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent href(String href) {
    super.href(href);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent id(String id) {
    super.id(id);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteAttributeValueChangeEvent atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
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
    GeographicSiteAttributeValueChangeEvent geographicSiteAttributeValueChangeEvent = (GeographicSiteAttributeValueChangeEvent) o;
    return Objects.equals(this.event, geographicSiteAttributeValueChangeEvent.event) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteAttributeValueChangeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

