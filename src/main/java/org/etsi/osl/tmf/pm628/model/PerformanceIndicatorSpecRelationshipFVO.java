package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecRelationshipFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorSpecRelationshipFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("href")
  private String href;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("relationshipType")
  private String relationshipType;

  @JsonProperty("role")
  private String role;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  public PerformanceIndicatorSpecRelationshipFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecRelationshipFVO(String type, String relationshipType, TimePeriod validFor) {
    this.type = type;
    this.relationshipType = relationshipType;
    this.validFor = validFor;
  }

  public PerformanceIndicatorSpecRelationshipFVO type(String type) {
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

  public PerformanceIndicatorSpecRelationshipFVO baseType(String baseType) {
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

  public PerformanceIndicatorSpecRelationshipFVO schemaLocation(String schemaLocation) {
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

  public PerformanceIndicatorSpecRelationshipFVO href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PerformanceIndicatorSpecRelationshipFVO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  
  @Schema(name = "uuid", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public PerformanceIndicatorSpecRelationshipFVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * 
   * @return relationshipType
  */
  @NotNull 
  @Schema(name = "relationshipType", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public PerformanceIndicatorSpecRelationshipFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this service specification
   * @return role
  */
  
  @Schema(name = "role", description = "The association role for this service specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public PerformanceIndicatorSpecRelationshipFVO validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @NotNull @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.REQUIRED)
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorSpecRelationshipFVO performanceIndicatorSpecRelationshipFVO = (PerformanceIndicatorSpecRelationshipFVO) o;
    return Objects.equals(this.type, performanceIndicatorSpecRelationshipFVO.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecRelationshipFVO.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecRelationshipFVO.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecRelationshipFVO.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecRelationshipFVO.uuid) &&
        Objects.equals(this.relationshipType, performanceIndicatorSpecRelationshipFVO.relationshipType) &&
        Objects.equals(this.role, performanceIndicatorSpecRelationshipFVO.role) &&
        Objects.equals(this.validFor, performanceIndicatorSpecRelationshipFVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, relationshipType, role, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecRelationshipFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

