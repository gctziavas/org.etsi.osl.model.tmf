package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.po622.model.OrderItemActionType;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * RelatedResourceOrderItem
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class RelatedResourceOrderItem {

  @JsonProperty("@type")
  @Column(name = "rroi_type")
  private String type;

  @JsonProperty("@baseType")
  @Column(name = "rroi_base_type")
  private String baseType;

  @JsonProperty("@schemaLocation")
  @Column(name = "rroi_schema_location")
  private String schemaLocation;

  @JsonProperty("@referredType")
  @Column(name = "rroi_referred_type")
  private String referredType;

  @JsonProperty("resourceOrderHref")
  private String resourceOrderHref;

  @JsonProperty("resourceOrderId")
  private String resourceOrderId;

  @JsonProperty("itemAction")
  private OrderItemActionType itemAction;

  @JsonProperty("itemId")
  private String itemId;

  @JsonProperty("role")
  private String role;

  public RelatedResourceOrderItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedResourceOrderItem(String type) {
    this.type = type;
  }

  public RelatedResourceOrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelatedResourceOrderItem baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public RelatedResourceOrderItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public RelatedResourceOrderItem referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RelatedResourceOrderItem resourceOrderHref(String resourceOrderHref) {
    this.resourceOrderHref = resourceOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return resourceOrderHref
  */
  
  @Schema(name = "resourceOrderHref", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceOrderHref")
  public String getResourceOrderHref() {
    return resourceOrderHref;
  }

  public void setResourceOrderHref(String resourceOrderHref) {
    this.resourceOrderHref = resourceOrderHref;
  }

  public RelatedResourceOrderItem resourceOrderId(String resourceOrderId) {
    this.resourceOrderId = resourceOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return resourceOrderId
  */
  
  @Schema(name = "resourceOrderId", description = "Unique identifier of a related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceOrderId")
  public String getResourceOrderId() {
    return resourceOrderId;
  }

  public void setResourceOrderId(String resourceOrderId) {
    this.resourceOrderId = resourceOrderId;
  }

  public RelatedResourceOrderItem itemAction(OrderItemActionType itemAction) {
    this.itemAction = itemAction;
    return this;
  }

  /**
   * Get itemAction
   * @return itemAction
  */
  @Valid 
  @Schema(name = "itemAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemAction")
  public OrderItemActionType getItemAction() {
    return itemAction;
  }

  public void setItemAction(OrderItemActionType itemAction) {
    this.itemAction = itemAction;
  }

  public RelatedResourceOrderItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifier of the order item where the resource was managed
   * @return itemId
  */
  
  @Schema(name = "itemId", description = "Identifier of the order item where the resource was managed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RelatedResourceOrderItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the resource order item for this resource
   * @return role
  */
  
  @Schema(name = "role", description = "role of the resource order item for this resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedResourceOrderItem relatedResourceOrderItem = (RelatedResourceOrderItem) o;
    return Objects.equals(this.type, relatedResourceOrderItem.type) &&
        Objects.equals(this.baseType, relatedResourceOrderItem.baseType) &&
        Objects.equals(this.schemaLocation, relatedResourceOrderItem.schemaLocation) &&
        Objects.equals(this.referredType, relatedResourceOrderItem.referredType) &&
        Objects.equals(this.resourceOrderHref, relatedResourceOrderItem.resourceOrderHref) &&
        Objects.equals(this.resourceOrderId, relatedResourceOrderItem.resourceOrderId) &&
        Objects.equals(this.itemAction, relatedResourceOrderItem.itemAction) &&
        Objects.equals(this.itemId, relatedResourceOrderItem.itemId) &&
        Objects.equals(this.role, relatedResourceOrderItem.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, referredType, resourceOrderHref, resourceOrderId, itemAction, itemId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedResourceOrderItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    resourceOrderHref: ").append(toIndentedString(resourceOrderHref)).append("\n");
    sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
    sb.append("    itemAction: ").append(toIndentedString(itemAction)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

