package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyDiscriminator;
import org.hibernate.annotations.AnyDiscriminatorValue;
import org.hibernate.annotations.AnyKeyJavaClass;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResourceRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_ResourceRel")
public class ResourceRelationship extends BaseRootEntity {

  @JsonProperty("resourceRelationshipCharacteristic")
  @Valid
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_resource_rel_res_rel_char",
          joinColumns = @JoinColumn(name = "resource_rel_uuid"),
          inverseJoinColumns = @JoinColumn(name = "res_rel_char_uuid")
  )
  private List<Characteristic> resourceRelationshipCharacteristic = new ArrayList<>();

  @JsonProperty("resource")
  @Any
  @AnyDiscriminator(DiscriminatorType.STRING)
  @AnyDiscriminatorValue(discriminator = "dae", entity = DataAccessEndpoint.class)
  @AnyDiscriminatorValue(discriminator = "lr", entity = LogicalResource.class)
  @AnyDiscriminatorValue(discriminator = "r", entity = Resource.class)
  @AnyDiscriminatorValue(discriminator = "rr", entity = ResourceRef.class)
  @AnyKeyJavaClass(String.class)
  @Column(name = "resource_type")
  @JoinColumn(name = "resource_id")
  private ResourceRefOrValue resource;

  @JsonProperty("relationshipType")
  private String relationshipType;

  public ResourceRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceRelationship(String type) {
    this.type = type;
  }

  public ResourceRelationship type(String type) {
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

  public ResourceRelationship baseType(String baseType) {
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

  public ResourceRelationship schemaLocation(String schemaLocation) {
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

  public ResourceRelationship resourceRelationshipCharacteristic(List<Characteristic> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
    return this;
  }

  public ResourceRelationship addResourceRelationshipCharacteristicItem(Characteristic resourceRelationshipCharacteristicItem) {
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
  public List<Characteristic> getResourceRelationshipCharacteristic() {
    return resourceRelationshipCharacteristic;
  }

  public void setResourceRelationshipCharacteristic(List<Characteristic> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
  }

  public ResourceRelationship resource(ResourceRefOrValue resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ResourceRefOrValue getResource() {
    return resource;
  }

  public void setResource(ResourceRefOrValue resource) {
    this.resource = resource;
  }

  public ResourceRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful
   * @return relationshipType
  */
  
  @Schema(name = "relationshipType", description = "Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResourceRelationship resourceRelationship = (ResourceRelationship) o;
    return Objects.equals(this.type, resourceRelationship.type) &&
        Objects.equals(this.baseType, resourceRelationship.baseType) &&
        Objects.equals(this.schemaLocation, resourceRelationship.schemaLocation) &&
        Objects.equals(this.uuid, resourceRelationship.uuid) &&
        Objects.equals(this.resourceRelationshipCharacteristic, resourceRelationship.resourceRelationshipCharacteristic) &&
        Objects.equals(this.resource, resourceRelationship.resource) &&
        Objects.equals(this.relationshipType, resourceRelationship.relationshipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, resourceRelationshipCharacteristic, resource, relationshipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRelationship {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

