package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * GeographicSiteCreateEvent
 */


@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSiteCreateEvent extends BaseEvent {
  @JsonProperty("event")
  private GeographicSiteEventPayload event;

  public GeographicSiteCreateEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteCreateEvent(String href, String id, String atType) {
    super(href, id, atType);
  }

  public GeographicSiteCreateEvent event(GeographicSiteEventPayload event) {
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


  public GeographicSiteCreateEvent eventId(String eventId) {
    super.eventId(eventId);
    return this;
  }

  public GeographicSiteCreateEvent eventTime(OffsetDateTime eventTime) {
    super.eventTime(eventTime);
    return this;
  }

  public GeographicSiteCreateEvent eventType(String eventType) {
    super.eventType(eventType);
    return this;
  }

  public GeographicSiteCreateEvent correlationId(String correlationId) {
    super.correlationId(correlationId);
    return this;
  }

  public GeographicSiteCreateEvent domain(String domain) {
    super.domain(domain);
    return this;
  }

  public GeographicSiteCreateEvent title(String title) {
    super.title(title);
    return this;
  }

  public GeographicSiteCreateEvent description(String description) {
    super.description(description);
    return this;
  }

  public GeographicSiteCreateEvent priority(String priority) {
    super.priority(priority);
    return this;
  }

  public GeographicSiteCreateEvent timeOcurred(OffsetDateTime timeOcurred) {
    super.timeOcurred(timeOcurred);
    return this;
  }

  public GeographicSiteCreateEvent href(String href) {
    super.href(href);
    return this;
  }

  public GeographicSiteCreateEvent id(String id) {
    super.id(id);
    return this;
  }

  public GeographicSiteCreateEvent atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteCreateEvent atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteCreateEvent atSchemaLocation(String atSchemaLocation) {
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
    GeographicSiteCreateEvent geographicSiteCreateEvent = (GeographicSiteCreateEvent) o;
    return Objects.equals(this.event, geographicSiteCreateEvent.event) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteCreateEvent {\n");
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

