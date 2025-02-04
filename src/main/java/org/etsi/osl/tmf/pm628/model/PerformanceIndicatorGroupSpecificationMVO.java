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
 * PerformanceIndicatorGroupSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorGroupSpecificationMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("groupCategory")
  private String groupCategory;

  @JsonProperty("performanceIndicatorSpecification")
  @Valid
  private List<@Valid PerformanceIndicatorSpecificationRefOrValueMVO> performanceIndicatorSpecification = new ArrayList<>();

  public PerformanceIndicatorGroupSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorGroupSpecificationMVO(String type) {
    this.type = type;
  }

  public PerformanceIndicatorGroupSpecificationMVO type(String type) {
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

  public PerformanceIndicatorGroupSpecificationMVO baseType(String baseType) {
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

  public PerformanceIndicatorGroupSpecificationMVO schemaLocation(String schemaLocation) {
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

  public PerformanceIndicatorGroupSpecificationMVO uuid(String uuid) {
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

  public PerformanceIndicatorGroupSpecificationMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which a PerformanceIndicatorGroupSpecification is tagged.
   * @return name
  */
  
  @Schema(name = "name", description = "A word, term, or phrase by which a PerformanceIndicatorGroupSpecification is tagged.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PerformanceIndicatorGroupSpecificationMVO groupCategory(String groupCategory) {
    this.groupCategory = groupCategory;
    return this;
  }

  /**
   * A grouping or set of PerformanceIndicatorGroupSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.
   * @return groupCategory
  */
  
  @Schema(name = "groupCategory", description = "A grouping or set of PerformanceIndicatorGroupSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGroupCategory() {
    return groupCategory;
  }

  public void setGroupCategory(String groupCategory) {
    this.groupCategory = groupCategory;
  }

  public PerformanceIndicatorGroupSpecificationMVO performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueMVO> performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
    return this;
  }

  public PerformanceIndicatorGroupSpecificationMVO addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValueMVO performanceIndicatorSpecificationItem) {
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
  public List<@Valid PerformanceIndicatorSpecificationRefOrValueMVO> getPerformanceIndicatorSpecification() {
    return performanceIndicatorSpecification;
  }

  public void setPerformanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueMVO> performanceIndicatorSpecification) {
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
    PerformanceIndicatorGroupSpecificationMVO performanceIndicatorGroupSpecificationMVO = (PerformanceIndicatorGroupSpecificationMVO) o;
    return Objects.equals(this.type, performanceIndicatorGroupSpecificationMVO.type) &&
        Objects.equals(this.baseType, performanceIndicatorGroupSpecificationMVO.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorGroupSpecificationMVO.schemaLocation) &&
        Objects.equals(this.uuid, performanceIndicatorGroupSpecificationMVO.uuid) &&
        Objects.equals(this.name, performanceIndicatorGroupSpecificationMVO.name) &&
        Objects.equals(this.groupCategory, performanceIndicatorGroupSpecificationMVO.groupCategory) &&
        Objects.equals(this.performanceIndicatorSpecification, performanceIndicatorGroupSpecificationMVO.performanceIndicatorSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, name, groupCategory, performanceIndicatorSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorGroupSpecificationMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
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

