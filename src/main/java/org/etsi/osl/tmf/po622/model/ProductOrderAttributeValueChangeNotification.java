package org.etsi.osl.tmf.po622.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.Notification;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

public class ProductOrderAttributeValueChangeNotification extends Notification {


  @JsonProperty("event")
  private ProductOrderAttributeValueChangeEvent event = null;

  public ProductOrderAttributeValueChangeNotification eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 

  public ProductOrderAttributeValueChangeNotification event(ProductOrderAttributeValueChangeEvent event) {
    this.event = event;
    return this;
  }

  /**
   * The event linked to the involved resource object
   * @return event
  **/
  @Schema(description = "The event linked to the involved resource object")

  @Valid

  public ProductOrderAttributeValueChangeEvent getEvent() {
    return event;
  }

  public void setEvent(ProductOrderAttributeValueChangeEvent event) {
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
    ProductOrderAttributeValueChangeNotification productOrderAttributeValueChangeNotification = (ProductOrderAttributeValueChangeNotification) o;
    return Objects.equals(this.eventId, productOrderAttributeValueChangeNotification.eventId) &&
        Objects.equals(this.eventTime, productOrderAttributeValueChangeNotification.eventTime) &&
        Objects.equals(this.eventType, productOrderAttributeValueChangeNotification.eventType) &&
        Objects.equals(this.fieldPath, productOrderAttributeValueChangeNotification.fieldPath) &&
        Objects.equals(this.resourcePath, productOrderAttributeValueChangeNotification.resourcePath) &&
        Objects.equals(this.event, productOrderAttributeValueChangeNotification.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, fieldPath, resourcePath, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderAttributeValueChangeNotification {\n");
    
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

