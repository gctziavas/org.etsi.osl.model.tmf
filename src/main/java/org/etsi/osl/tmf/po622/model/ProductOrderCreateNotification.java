package org.etsi.osl.tmf.po622.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.Notification;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

public class ProductOrderCreateNotification  extends Notification  {
  
  @JsonProperty("event")
  private ProductOrderCreateEvent event = null;

  public ProductOrderCreateNotification eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }



  public ProductOrderCreateNotification event(ProductOrderCreateEvent event) {
    this.event = event;
    return this;
  }

  /**
   * The event linked to the involved resource object
   * @return event
  **/
  @Schema(description = "The event linked to the involved resource object")

  @Valid

  public ProductOrderCreateEvent getEvent() {
    return event;
  }

  public void setEvent(ProductOrderCreateEvent event) {
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
    ProductOrderCreateNotification prodOrderCreateNotification = (ProductOrderCreateNotification) o;
    return Objects.equals(this.eventId, prodOrderCreateNotification.eventId) &&
        Objects.equals(this.eventTime, prodOrderCreateNotification.eventTime) &&
        Objects.equals(this.eventType, prodOrderCreateNotification.eventType) &&
        Objects.equals(this.fieldPath, prodOrderCreateNotification.fieldPath) &&
        Objects.equals(this.resourcePath, prodOrderCreateNotification.resourcePath) &&
        Objects.equals(this.event, prodOrderCreateNotification.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, fieldPath, resourcePath, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderCreateNotification {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
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

