package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.ri639.model.EntityRef;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MeasurementCollectionJobFilesReadyEvent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobFilesReadyEvent {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  private String correlationId;

  private String domain;

  private String title;

  private String description;

  private String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timeOccurred;

  private EntityRef source;

  private EntityRef reportingSystem;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<Characteristic> analyticCharacteristic = new ArrayList<>();

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String eventType;

  private MeasurementCollectionJobFilesReadyEventPayload event;

  public MeasurementCollectionJobFilesReadyEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobFilesReadyEvent(String atType) {
    this.atType = atType;
  }

  public MeasurementCollectionJobFilesReadyEvent atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public MeasurementCollectionJobFilesReadyEvent atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public MeasurementCollectionJobFilesReadyEvent atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public MeasurementCollectionJobFilesReadyEvent href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public MeasurementCollectionJobFilesReadyEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MeasurementCollectionJobFilesReadyEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
  */
  
  @Schema(name = "correlationId", description = "The correlation id for this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public MeasurementCollectionJobFilesReadyEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
  */
  
  @Schema(name = "domain", description = "The domain of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public MeasurementCollectionJobFilesReadyEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MeasurementCollectionJobFilesReadyEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanation of the event.
   * @return description
  */
  
  @Schema(name = "description", description = "An explanation of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MeasurementCollectionJobFilesReadyEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
  */
  
  @Schema(name = "priority", description = "A priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public MeasurementCollectionJobFilesReadyEvent timeOccurred(OffsetDateTime timeOccurred) {
    this.timeOccurred = timeOccurred;
    return this;
  }

  /**
   * The time the event occurred.
   * @return timeOccurred
  */
  @Valid 
  @Schema(name = "timeOccurred", description = "The time the event occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOccurred")
  public OffsetDateTime getTimeOccurred() {
    return timeOccurred;
  }

  public void setTimeOccurred(OffsetDateTime timeOccurred) {
    this.timeOccurred = timeOccurred;
  }

  public MeasurementCollectionJobFilesReadyEvent source(EntityRef source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public EntityRef getSource() {
    return source;
  }

  public void setSource(EntityRef source) {
    this.source = source;
  }

  public MeasurementCollectionJobFilesReadyEvent reportingSystem(EntityRef reportingSystem) {
    this.reportingSystem = reportingSystem;
    return this;
  }

  /**
   * Get reportingSystem
   * @return reportingSystem
  */
  @Valid 
  @Schema(name = "reportingSystem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportingSystem")
  public EntityRef getReportingSystem() {
    return reportingSystem;
  }

  public void setReportingSystem(EntityRef reportingSystem) {
    this.reportingSystem = reportingSystem;
  }

  public MeasurementCollectionJobFilesReadyEvent relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public MeasurementCollectionJobFilesReadyEvent addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Collection of related parties
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", description = "Collection of related parties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public MeasurementCollectionJobFilesReadyEvent analyticCharacteristic(List<Characteristic> analyticCharacteristic) {
    this.analyticCharacteristic = analyticCharacteristic;
    return this;
  }

  public MeasurementCollectionJobFilesReadyEvent addAnalyticCharacteristicItem(Characteristic analyticCharacteristicItem) {
    if (this.analyticCharacteristic == null) {
      this.analyticCharacteristic = new ArrayList<>();
    }
    this.analyticCharacteristic.add(analyticCharacteristicItem);
    return this;
  }

  /**
   * Collection of analytic characteristics
   * @return analyticCharacteristic
  */
  @Valid 
  @Schema(name = "analyticCharacteristic", description = "Collection of analytic characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticCharacteristic")
  public List<Characteristic> getAnalyticCharacteristic() {
    return analyticCharacteristic;
  }

  public void setAnalyticCharacteristic(List<Characteristic> analyticCharacteristic) {
    this.analyticCharacteristic = analyticCharacteristic;
  }

  public MeasurementCollectionJobFilesReadyEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
  */
  
  @Schema(name = "eventId", description = "The identifier of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public MeasurementCollectionJobFilesReadyEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
  */
  @Valid 
  @Schema(name = "eventTime", description = "Time of the event occurrence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public MeasurementCollectionJobFilesReadyEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
  */
  
  @Schema(name = "eventType", description = "The type of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public MeasurementCollectionJobFilesReadyEvent event(MeasurementCollectionJobFilesReadyEventPayload event) {
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
  public MeasurementCollectionJobFilesReadyEventPayload getEvent() {
    return event;
  }

  public void setEvent(MeasurementCollectionJobFilesReadyEventPayload event) {
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
    MeasurementCollectionJobFilesReadyEvent measurementCollectionJobFilesReadyEvent = (MeasurementCollectionJobFilesReadyEvent) o;
    return Objects.equals(this.atType, measurementCollectionJobFilesReadyEvent.atType) &&
        Objects.equals(this.atBaseType, measurementCollectionJobFilesReadyEvent.atBaseType) &&
        Objects.equals(this.atSchemaLocation, measurementCollectionJobFilesReadyEvent.atSchemaLocation) &&
        Objects.equals(this.href, measurementCollectionJobFilesReadyEvent.href) &&
        Objects.equals(this.id, measurementCollectionJobFilesReadyEvent.id) &&
        Objects.equals(this.correlationId, measurementCollectionJobFilesReadyEvent.correlationId) &&
        Objects.equals(this.domain, measurementCollectionJobFilesReadyEvent.domain) &&
        Objects.equals(this.title, measurementCollectionJobFilesReadyEvent.title) &&
        Objects.equals(this.description, measurementCollectionJobFilesReadyEvent.description) &&
        Objects.equals(this.priority, measurementCollectionJobFilesReadyEvent.priority) &&
        Objects.equals(this.timeOccurred, measurementCollectionJobFilesReadyEvent.timeOccurred) &&
        Objects.equals(this.source, measurementCollectionJobFilesReadyEvent.source) &&
        Objects.equals(this.reportingSystem, measurementCollectionJobFilesReadyEvent.reportingSystem) &&
        Objects.equals(this.relatedParty, measurementCollectionJobFilesReadyEvent.relatedParty) &&
        Objects.equals(this.analyticCharacteristic, measurementCollectionJobFilesReadyEvent.analyticCharacteristic) &&
        Objects.equals(this.eventId, measurementCollectionJobFilesReadyEvent.eventId) &&
        Objects.equals(this.eventTime, measurementCollectionJobFilesReadyEvent.eventTime) &&
        Objects.equals(this.eventType, measurementCollectionJobFilesReadyEvent.eventType) &&
        Objects.equals(this.event, measurementCollectionJobFilesReadyEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, correlationId, domain, title, description, priority, timeOccurred, source, reportingSystem, relatedParty, analyticCharacteristic, eventId, eventTime, eventType, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobFilesReadyEvent {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

