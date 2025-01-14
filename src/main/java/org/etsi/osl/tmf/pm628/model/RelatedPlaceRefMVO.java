package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * RelatedPlaceRefMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class RelatedPlaceRefMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("role")
  private String role;

  @JsonProperty("place")
  private PlaceRefMVO place;

  public RelatedPlaceRefMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPlaceRefMVO(String type, String role, PlaceRefMVO place) {
    this.type = type;
    this.role = role;
    this.place = place;
  }

  public RelatedPlaceRefMVO type(String type) {
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

  public RelatedPlaceRefMVO baseType(String baseType) {
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

  public RelatedPlaceRefMVO schemaLocation(String schemaLocation) {
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

  public RelatedPlaceRefMVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPlaceRefMVO place(PlaceRefMVO place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  */
  @NotNull @Valid 
  @Schema(name = "place", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("place")
  public PlaceRefMVO getPlace() {
    return place;
  }

  public void setPlace(PlaceRefMVO place) {
    this.place = place;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPlaceRefMVO relatedPlaceRefMVO = (RelatedPlaceRefMVO) o;
    return Objects.equals(this.type, relatedPlaceRefMVO.type) &&
        Objects.equals(this.baseType, relatedPlaceRefMVO.baseType) &&
        Objects.equals(this.schemaLocation, relatedPlaceRefMVO.schemaLocation) &&
        Objects.equals(this.role, relatedPlaceRefMVO.role) &&
        Objects.equals(this.place, relatedPlaceRefMVO.place);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, role, place);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPlaceRefMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
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

