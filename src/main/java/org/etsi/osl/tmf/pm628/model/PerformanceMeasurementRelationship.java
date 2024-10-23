package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceMeasurementRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceMeasurementRelationship {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  private String relationshipType;

  private PerformanceMeasurementRefOrValue relatedMeasurement;

  private String role;

  private TimePeriod validFor;

  public PerformanceMeasurementRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceMeasurementRelationship(String atType) {
    this.atType = atType;
  }

  public PerformanceMeasurementRelationship atType(String atType) {
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

  public PerformanceMeasurementRelationship atBaseType(String atBaseType) {
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

  public PerformanceMeasurementRelationship atSchemaLocation(String atSchemaLocation) {
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

  public PerformanceMeasurementRelationship href(String href) {
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

  public PerformanceMeasurementRelationship id(String id) {
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

  public PerformanceMeasurementRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * 
   * @return relationshipType
  */
  
  @Schema(name = "relationshipType", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public PerformanceMeasurementRelationship relatedMeasurement(PerformanceMeasurementRefOrValue relatedMeasurement) {
    this.relatedMeasurement = relatedMeasurement;
    return this;
  }

  /**
   * Get relatedMeasurement
   * @return relatedMeasurement
  */
  @Valid 
  @Schema(name = "relatedMeasurement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedMeasurement")
  public PerformanceMeasurementRefOrValue getRelatedMeasurement() {
    return relatedMeasurement;
  }

  public void setRelatedMeasurement(PerformanceMeasurementRefOrValue relatedMeasurement) {
    this.relatedMeasurement = relatedMeasurement;
  }

  public PerformanceMeasurementRelationship role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this PerformanceMeasurement
   * @return role
  */
  
  @Schema(name = "role", description = "The association role for this PerformanceMeasurement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public PerformanceMeasurementRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
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
    PerformanceMeasurementRelationship performanceMeasurementRelationship = (PerformanceMeasurementRelationship) o;
    return Objects.equals(this.atType, performanceMeasurementRelationship.atType) &&
        Objects.equals(this.atBaseType, performanceMeasurementRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, performanceMeasurementRelationship.atSchemaLocation) &&
        Objects.equals(this.href, performanceMeasurementRelationship.href) &&
        Objects.equals(this.id, performanceMeasurementRelationship.id) &&
        Objects.equals(this.relationshipType, performanceMeasurementRelationship.relationshipType) &&
        Objects.equals(this.relatedMeasurement, performanceMeasurementRelationship.relatedMeasurement) &&
        Objects.equals(this.role, performanceMeasurementRelationship.role) &&
        Objects.equals(this.validFor, performanceMeasurementRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, relationshipType, relatedMeasurement, role, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceMeasurementRelationship {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    relatedMeasurement: ").append(toIndentedString(relatedMeasurement)).append("\n");
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

