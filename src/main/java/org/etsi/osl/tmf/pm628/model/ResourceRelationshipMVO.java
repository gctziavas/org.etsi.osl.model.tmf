package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResourceRelationshipMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ResourceRelationshipMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("resourceRelationshipCharacteristic")
  @Valid
  private List<CharacteristicMVO> resourceRelationshipCharacteristic = new ArrayList<>();

  @JsonProperty("resource")
  private ResourceRefOrValueMVO resource;

  @JsonProperty("relationshipType")
  private String relationshipType;

  public ResourceRelationshipMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceRelationshipMVO(String type, ResourceRefOrValueMVO resource, String relationshipType) {
    this.type = type;
    this.resource = resource;
    this.relationshipType = relationshipType;
  }

  public ResourceRelationshipMVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResourceRelationshipMVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ResourceRelationshipMVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    public ResourceRelationshipMVO uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

  /**
   * Unique identifier of the characteristic
   * @return id
   */

  @Schema(name = "uuid", description = "Unique identifier of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ResourceRelationshipMVO resourceRelationshipCharacteristic(List<CharacteristicMVO> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
    return this;
  }

  public ResourceRelationshipMVO addResourceRelationshipCharacteristicItem(CharacteristicMVO resourceRelationshipCharacteristicItem) {
    if (this.resourceRelationshipCharacteristic == null) {
      this.resourceRelationshipCharacteristic = new ArrayList<>();
    }
    this.resourceRelationshipCharacteristic.add(resourceRelationshipCharacteristicItem);
    return this;
  }

  /**
   * Get resourceRelationshipCharacteristic
   * @return resourceRelationshipCharacteristic
  */
  @Valid 
  @Schema(name = "resourceRelationshipCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CharacteristicMVO> getResourceRelationshipCharacteristic() {
    return resourceRelationshipCharacteristic;
  }

  public void setResourceRelationshipCharacteristic(List<CharacteristicMVO> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
  }

  public ResourceRelationshipMVO resource(ResourceRefOrValueMVO resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  @NotNull @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.REQUIRED)
  public ResourceRefOrValueMVO getResource() {
    return resource;
  }

  public void setResource(ResourceRefOrValueMVO resource) {
    this.resource = resource;
  }

  public ResourceRelationshipMVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful
   * @return relationshipType
  */
  @NotNull 
  @Schema(name = "relationshipType", description = "Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRelationshipMVO resourceRelationshipMVO = (ResourceRelationshipMVO) o;
    return Objects.equals(this.type, resourceRelationshipMVO.type) &&
        Objects.equals(this.baseType, resourceRelationshipMVO.baseType) &&
        Objects.equals(this.schemaLocation, resourceRelationshipMVO.schemaLocation) &&
        Objects.equals(this.uuid, resourceRelationshipMVO.uuid) &&
        Objects.equals(this.resourceRelationshipCharacteristic, resourceRelationshipMVO.resourceRelationshipCharacteristic) &&
        Objects.equals(this.resource, resourceRelationshipMVO.resource) &&
        Objects.equals(this.relationshipType, resourceRelationshipMVO.relationshipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, resourceRelationshipCharacteristic, resource, relationshipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRelationshipMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    resourceRelationshipCharacteristic: ").append(toIndentedString(resourceRelationshipCharacteristic)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

