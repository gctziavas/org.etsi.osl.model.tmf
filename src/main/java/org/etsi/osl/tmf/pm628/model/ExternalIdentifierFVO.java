package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * ExternalIdentifierFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ExternalIdentifierFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("externalIdentifierType")
  private String externalIdentifierType;

  public ExternalIdentifierFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExternalIdentifierFVO(String type) {
    this.type = type;
  }

  public ExternalIdentifierFVO type(String type) {
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

  public ExternalIdentifierFVO baseType(String baseType) {
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

  public ExternalIdentifierFVO schemaLocation(String schemaLocation) {
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

  public ExternalIdentifierFVO owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Name of the external system that owns the entity.
   * @return owner
  */
  
  @Schema(name = "owner", example = "MagentoCommerce", description = "Name of the external system that owns the entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ExternalIdentifierFVO externalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
    return this;
  }

  /**
   * Type of the identification, typically would be the type of the entity within the external system
   * @return externalIdentifierType
  */
  
  @Schema(name = "externalIdentifierType", example = "ProductOrder", description = "Type of the identification, typically would be the type of the entity within the external system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifierType")
  public String getExternalIdentifierType() {
    return externalIdentifierType;
  }

  public void setExternalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdentifierFVO externalIdentifierFVO = (ExternalIdentifierFVO) o;
    return Objects.equals(this.type, externalIdentifierFVO.type) &&
        Objects.equals(this.baseType, externalIdentifierFVO.baseType) &&
        Objects.equals(this.schemaLocation, externalIdentifierFVO.schemaLocation) &&
        Objects.equals(this.owner, externalIdentifierFVO.owner) &&
        Objects.equals(this.externalIdentifierType, externalIdentifierFVO.externalIdentifierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, owner, externalIdentifierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdentifierFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    externalIdentifierType: ").append(toIndentedString(externalIdentifierType)).append("\n");
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

