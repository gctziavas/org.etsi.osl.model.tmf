package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PerformanceIndicatorGroupSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorGroupSpecificationFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("name")
  private String name;

  @JsonProperty("groupCategory")
  private String groupCategory;

  @JsonProperty("performanceIndicatorSpecification")
  @Valid
  private List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> performanceIndicatorSpecification = new ArrayList<>();

  public PerformanceIndicatorGroupSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorGroupSpecificationFVO(String type, String name, String groupCategory) {
    this.type = type;
    this.name = name;
    this.groupCategory = groupCategory;
  }

  public PerformanceIndicatorGroupSpecificationFVO type(String type) {
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

  public PerformanceIndicatorGroupSpecificationFVO atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return atBaseType;
  }

  public void setBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PerformanceIndicatorGroupSpecificationFVO schemaLocation(String schemaLocation) {
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

  public PerformanceIndicatorGroupSpecificationFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which a PerformanceIndicatorGroupSpecification is tagged.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "A word, term, or phrase by which a PerformanceIndicatorGroupSpecification is tagged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PerformanceIndicatorGroupSpecificationFVO groupCategory(String groupCategory) {
    this.groupCategory = groupCategory;
    return this;
  }

  /**
   * A grouping or set of PerformanceIndicatorGroupSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.
   * @return groupCategory
  */
  @NotNull 
  @Schema(name = "groupCategory", description = "A grouping or set of PerformanceIndicatorGroupSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("groupCategory")
  public String getGroupCategory() {
    return groupCategory;
  }

  public void setGroupCategory(String groupCategory) {
    this.groupCategory = groupCategory;
  }

  public PerformanceIndicatorGroupSpecificationFVO performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
    return this;
  }

  public PerformanceIndicatorGroupSpecificationFVO addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValueFVO performanceIndicatorSpecificationItem) {
    if (this.performanceIndicatorSpecification == null) {
      this.performanceIndicatorSpecification = new ArrayList<>();
    }
    this.performanceIndicatorSpecification.add(performanceIndicatorSpecificationItem);
    return this;
  }

  /**
   * Get performanceIndicatorSpecification
   * @return performanceIndicatorSpecification
  */
  @Valid @Size(min = 1) 
  @Schema(name = "performanceIndicatorSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorSpecification")
  public List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> getPerformanceIndicatorSpecification() {
    return performanceIndicatorSpecification;
  }

  public void setPerformanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorGroupSpecificationFVO performanceIndicatorGroupSpecificationFVO = (PerformanceIndicatorGroupSpecificationFVO) o;
    return Objects.equals(this.type, performanceIndicatorGroupSpecificationFVO.type) &&
        Objects.equals(this.atBaseType, performanceIndicatorGroupSpecificationFVO.atBaseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorGroupSpecificationFVO.schemaLocation) &&
        Objects.equals(this.name, performanceIndicatorGroupSpecificationFVO.name) &&
        Objects.equals(this.groupCategory, performanceIndicatorGroupSpecificationFVO.groupCategory) &&
        Objects.equals(this.performanceIndicatorSpecification, performanceIndicatorGroupSpecificationFVO.performanceIndicatorSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, atBaseType, schemaLocation, name, groupCategory, performanceIndicatorSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorGroupSpecificationFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupCategory: ").append(toIndentedString(groupCategory)).append("\n");
    sb.append("    performanceIndicatorSpecification: ").append(toIndentedString(performanceIndicatorSpecification)).append("\n");
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

