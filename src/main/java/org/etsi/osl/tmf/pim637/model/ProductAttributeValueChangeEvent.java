package org.etsi.osl.tmf.pim637.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")


public class ProductAttributeValueChangeEvent   {
  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("eventTime")
  private Date eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("timeOcurred")
  private Date timeOcurred = null;

  @JsonProperty("fieldPath")
  private String fieldPath = null;

  @JsonProperty("event")
  private ProductAttributeValueChangeEventPayload event = null;

  public ProductAttributeValueChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   **/
  @Schema(description = "The identifier of the notification.")
      @NotNull

    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ProductAttributeValueChangeEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   **/
  @Schema(description = "Time of the event occurrence.")
      @NotNull

    @Valid
    public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public ProductAttributeValueChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   **/
  @Schema(description = "The type of the notification.")
      @NotNull

    public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ProductAttributeValueChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   **/
  @Schema(description = "The correlation id for this event.")
      @NotNull

    public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ProductAttributeValueChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   **/
  @Schema(description = "The domain of the event.")
      @NotNull

    public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ProductAttributeValueChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   **/
  @Schema(description = "The title of the event.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductAttributeValueChangeEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   **/
  @Schema(description = "An explnatory of the event.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductAttributeValueChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   **/
  @Schema(description = "A priority.")
      @NotNull

    public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ProductAttributeValueChangeEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
   **/
  @Schema(description = "The time the event occured.")
      @NotNull

    @Valid
    public Date getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public ProductAttributeValueChangeEvent fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * The path identifying the object field concerned by this notification.
   * @return fieldPath
   **/
  @Schema(description = "The path identifying the object field concerned by this notification.")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public ProductAttributeValueChangeEvent event(ProductAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(ProductAttributeValueChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAttributeValueChangeEvent productAttributeValueChangeEvent = (ProductAttributeValueChangeEvent) o;
    return Objects.equals(this.eventId, productAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, productAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, productAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.correlationId, productAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, productAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, productAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, productAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, productAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, productAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.fieldPath, productAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.event, productAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, fieldPath, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAttributeValueChangeEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
