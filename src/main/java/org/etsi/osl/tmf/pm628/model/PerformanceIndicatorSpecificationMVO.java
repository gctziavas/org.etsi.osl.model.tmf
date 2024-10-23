package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorSpecificationMVO implements PerformanceIndicatorSpecificationRefOrValueMVO {

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

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("perspective")
  private String perspective;

  @JsonProperty("indicatorCategory")
  private String indicatorCategory;

  @JsonProperty("indicatorType")
  private IndicatorType indicatorType;

  @JsonProperty("derivationAlgorithm")
  private String derivationAlgorithm;

  @JsonProperty("derivationMethod")
  private String derivationMethod;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("collectionType")
  private CollectionType collectionType;

  @JsonProperty("indicatorUnit")
  private String indicatorUnit;

  @JsonProperty("performanceIndicatorSpecRelationship")
  @Valid
  private List<PerformanceIndicatorSpecRelationshipMVO> performanceIndicatorSpecRelationship = new ArrayList<>();

  public PerformanceIndicatorSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecificationMVO(String type) {
    this.type = type;
  }

  public PerformanceIndicatorSpecificationMVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
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

  public PerformanceIndicatorSpecificationMVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getbaseType() {
    return baseType;
  }

  public void setbaseType(String baseType) {
    this.baseType = baseType;
  }

  public PerformanceIndicatorSpecificationMVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public PerformanceIndicatorSpecificationMVO href(String href) {
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

  public PerformanceIndicatorSpecificationMVO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public PerformanceIndicatorSpecificationMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which a PerformanceIndicatorSpecification is known and distinguished from other PerformanceIndicatorSpecifications.
   * @return name
  */
  
  @Schema(name = "name", description = "A word, term, or phrase by which a PerformanceIndicatorSpecification is known and distinguished from other PerformanceIndicatorSpecifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PerformanceIndicatorSpecificationMVO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail what the PerformanceIndicatorSpecification is.
   * @return description
  */
  
  @Schema(name = "description", description = "A narrative that explains in detail what the PerformanceIndicatorSpecification is.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PerformanceIndicatorSpecificationMVO perspective(String perspective) {
    this.perspective = perspective;
    return this;
  }

  /**
   * The point of view for the PerformanceIndicatorSpecification, such as a single user instance or aggregation.
   * @return perspective
  */
  
  @Schema(name = "perspective", description = "The point of view for the PerformanceIndicatorSpecification, such as a single user instance or aggregation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("perspective")
  public String getPerspective() {
    return perspective;
  }

  public void setPerspective(String perspective) {
    this.perspective = perspective;
  }

  public PerformanceIndicatorSpecificationMVO indicatorCategory(String indicatorCategory) {
    this.indicatorCategory = indicatorCategory;
    return this;
  }

  /**
   * A grouping or set of PerformanceIndicatorSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.
   * @return indicatorCategory
  */
  
  @Schema(name = "indicatorCategory", description = "A grouping or set of PerformanceIndicatorSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicatorCategory")
  public String getIndicatorCategory() {
    return indicatorCategory;
  }

  public void setIndicatorCategory(String indicatorCategory) {
    this.indicatorCategory = indicatorCategory;
  }

  public PerformanceIndicatorSpecificationMVO indicatorType(IndicatorType indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

  /**
   * Get indicatorType
   * @return indicatorType
  */
  @Valid 
  @Schema(name = "indicatorType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicatorType")
  public IndicatorType getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(IndicatorType indicatorType) {
    this.indicatorType = indicatorType;
  }

  public PerformanceIndicatorSpecificationMVO derivationAlgorithm(String derivationAlgorithm) {
    this.derivationAlgorithm = derivationAlgorithm;
    return this;
  }

  /**
   * A step-by-step procedure used to calculate the value of PerformanceIndicator.
   * @return derivationAlgorithm
  */
  
  @Schema(name = "derivationAlgorithm", description = "A step-by-step procedure used to calculate the value of PerformanceIndicator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("derivationAlgorithm")
  public String getDerivationAlgorithm() {
    return derivationAlgorithm;
  }

  public void setDerivationAlgorithm(String derivationAlgorithm) {
    this.derivationAlgorithm = derivationAlgorithm;
  }

  public PerformanceIndicatorSpecificationMVO derivationMethod(String derivationMethod) {
    this.derivationMethod = derivationMethod;
    return this;
  }

  /**
   * For simple calculations, the method used to calculate the value of a PerformanceIndicator, such as average, minimum, maximum, sum and so forth.
   * @return derivationMethod
  */
  
  @Schema(name = "derivationMethod", description = "For simple calculations, the method used to calculate the value of a PerformanceIndicator, such as average, minimum, maximum, sum and so forth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("derivationMethod")
  public String getDerivationMethod() {
    return derivationMethod;
  }

  public void setDerivationMethod(String derivationMethod) {
    this.derivationMethod = derivationMethod;
  }

  public PerformanceIndicatorSpecificationMVO validFor(TimePeriod validFor) {
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

  public PerformanceIndicatorSpecificationMVO collectionType(CollectionType collectionType) {
    this.collectionType = collectionType;
    return this;
  }

  /**
   * Get collectionType
   * @return collectionType
  */
  @Valid 
  @Schema(name = "collectionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collectionType")
  public CollectionType getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(CollectionType collectionType) {
    this.collectionType = collectionType;
  }

  public PerformanceIndicatorSpecificationMVO indicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
    return this;
  }

  /**
   * The unit by which the indicator is measured. For example, seconds, KBs, rate per second, etc.
   * @return indicatorUnit
  */
  
  @Schema(name = "indicatorUnit", description = "The unit by which the indicator is measured. For example, seconds, KBs, rate per second, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicatorUnit")
  public String getIndicatorUnit() {
    return indicatorUnit;
  }

  public void setIndicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
  }

  public PerformanceIndicatorSpecificationMVO performanceIndicatorSpecRelationship(List<PerformanceIndicatorSpecRelationshipMVO> performanceIndicatorSpecRelationship) {
    this.performanceIndicatorSpecRelationship = performanceIndicatorSpecRelationship;
    return this;
  }

  public PerformanceIndicatorSpecificationMVO addPerformanceIndicatorSpecRelationshipItem(PerformanceIndicatorSpecRelationshipMVO performanceIndicatorSpecRelationshipItem) {
    if (this.performanceIndicatorSpecRelationship == null) {
      this.performanceIndicatorSpecRelationship = new ArrayList<>();
    }
    this.performanceIndicatorSpecRelationship.add(performanceIndicatorSpecRelationshipItem);
    return this;
  }

  /**
   * Get performanceIndicatorSpecRelationship
   * @return performanceIndicatorSpecRelationship
  */
  @Valid @Size(min = 0) 
  @Schema(name = "performanceIndicatorSpecRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceIndicatorSpecRelationship")
  public List<PerformanceIndicatorSpecRelationshipMVO> getPerformanceIndicatorSpecRelationship() {
    return performanceIndicatorSpecRelationship;
  }

  public void setPerformanceIndicatorSpecRelationship(List<PerformanceIndicatorSpecRelationshipMVO> performanceIndicatorSpecRelationship) {
    this.performanceIndicatorSpecRelationship = performanceIndicatorSpecRelationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorSpecificationMVO performanceIndicatorSpecificationMVO = (PerformanceIndicatorSpecificationMVO) o;
    return Objects.equals(this.type, performanceIndicatorSpecificationMVO.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecificationMVO.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecificationMVO.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecificationMVO.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecificationMVO.uuid) &&
        Objects.equals(this.name, performanceIndicatorSpecificationMVO.name) &&
        Objects.equals(this.description, performanceIndicatorSpecificationMVO.description) &&
        Objects.equals(this.perspective, performanceIndicatorSpecificationMVO.perspective) &&
        Objects.equals(this.indicatorCategory, performanceIndicatorSpecificationMVO.indicatorCategory) &&
        Objects.equals(this.indicatorType, performanceIndicatorSpecificationMVO.indicatorType) &&
        Objects.equals(this.derivationAlgorithm, performanceIndicatorSpecificationMVO.derivationAlgorithm) &&
        Objects.equals(this.derivationMethod, performanceIndicatorSpecificationMVO.derivationMethod) &&
        Objects.equals(this.validFor, performanceIndicatorSpecificationMVO.validFor) &&
        Objects.equals(this.collectionType, performanceIndicatorSpecificationMVO.collectionType) &&
        Objects.equals(this.indicatorUnit, performanceIndicatorSpecificationMVO.indicatorUnit) &&
        Objects.equals(this.performanceIndicatorSpecRelationship, performanceIndicatorSpecificationMVO.performanceIndicatorSpecRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, description, perspective, indicatorCategory, indicatorType, derivationAlgorithm, derivationMethod, validFor, collectionType, indicatorUnit, performanceIndicatorSpecRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecificationMVO {\n");
    sb.append("    atType: ").append(toIndentedString(type)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    perspective: ").append(toIndentedString(perspective)).append("\n");
    sb.append("    indicatorCategory: ").append(toIndentedString(indicatorCategory)).append("\n");
    sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
    sb.append("    derivationAlgorithm: ").append(toIndentedString(derivationAlgorithm)).append("\n");
    sb.append("    derivationMethod: ").append(toIndentedString(derivationMethod)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    indicatorUnit: ").append(toIndentedString(indicatorUnit)).append("\n");
    sb.append("    performanceIndicatorSpecRelationship: ").append(toIndentedString(performanceIndicatorSpecRelationship)).append("\n");
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

