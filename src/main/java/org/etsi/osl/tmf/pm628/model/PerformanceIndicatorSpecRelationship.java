package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PerfIndSpecRel")
public class PerformanceIndicatorSpecRelationship extends BaseRootEntity {

  @JsonProperty("relationshipType")
  private String relationshipType;

  @JsonProperty("role")
  private String role;

  @JsonProperty("validFor")
  @Embedded
  private TimePeriod validFor;

  public PerformanceIndicatorSpecRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecRelationship(String type) {
    this.type = type;
  }

  public PerformanceIndicatorSpecRelationship relationshipType(String relationshipType) {
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

  public PerformanceIndicatorSpecRelationship role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this service specification
   * @return role
  */
  
  @Schema(name = "role", description = "The association role for this service specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public PerformanceIndicatorSpecRelationship validFor(TimePeriod validFor) {
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
    PerformanceIndicatorSpecRelationship performanceIndicatorSpecRelationship = (PerformanceIndicatorSpecRelationship) o;
    return Objects.equals(this.type, performanceIndicatorSpecRelationship.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecRelationship.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecRelationship.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecRelationship.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecRelationship.uuid) &&
        Objects.equals(this.relationshipType, performanceIndicatorSpecRelationship.relationshipType) &&
        Objects.equals(this.role, performanceIndicatorSpecRelationship.role) &&
        Objects.equals(this.validFor, performanceIndicatorSpecRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, relationshipType, role, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecRelationship {\n");
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

