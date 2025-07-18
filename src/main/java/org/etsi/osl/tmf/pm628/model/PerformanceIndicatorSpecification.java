package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.etsi.osl.tmf.common.model.TimePeriod;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PerfIndSpec")
public class PerformanceIndicatorSpecification extends BaseRootNamedEntity implements PatchPerformanceIndicatorSpecification200Response, PerformanceIndicatorSpecificationRefOrValue {

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
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_perf_ind_spec_perf_ind_spec_rel",
          joinColumns = @JoinColumn(name = "perf_ind_spec_uuid"),
          inverseJoinColumns = @JoinColumn(name = "perf_ind_spec_rel_uuid")
  )
  private List<PerformanceIndicatorSpecRelationship> performanceIndicatorSpecRelationship = new ArrayList<>();

  public PerformanceIndicatorSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecification(String type) {
    this.type = type;
  }

  public PerformanceIndicatorSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail what the PerformanceIndicatorSpecification is.
   * @return description
  */
  
  @Schema(name = "description", description = "A narrative that explains in detail what the PerformanceIndicatorSpecification is.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PerformanceIndicatorSpecification perspective(String perspective) {
    this.perspective = perspective;
    return this;
  }

  /**
   * The point of view for the PerformanceIndicatorSpecification, such as a single user instance or aggregation.
   * @return perspective
  */
  
  @Schema(name = "perspective", description = "The point of view for the PerformanceIndicatorSpecification, such as a single user instance or aggregation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPerspective() {
    return perspective;
  }

  public void setPerspective(String perspective) {
    this.perspective = perspective;
  }

  public PerformanceIndicatorSpecification indicatorCategory(String indicatorCategory) {
    this.indicatorCategory = indicatorCategory;
    return this;
  }

  /**
   * A grouping or set of PerformanceIndicatorSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.
   * @return indicatorCategory
  */
  
  @Schema(name = "indicatorCategory", description = "A grouping or set of PerformanceIndicatorSpecifications that are classified together because of common characteristics, such as technology specific, service specific, or technology/service independent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getIndicatorCategory() {
    return indicatorCategory;
  }

  public void setIndicatorCategory(String indicatorCategory) {
    this.indicatorCategory = indicatorCategory;
  }

  public PerformanceIndicatorSpecification indicatorType(IndicatorType indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

  /**
   * Get indicatorType
   * @return indicatorType
  */
  @Valid 
  @Schema(name = "indicatorType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public IndicatorType getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(IndicatorType indicatorType) {
    this.indicatorType = indicatorType;
  }

  public PerformanceIndicatorSpecification derivationAlgorithm(String derivationAlgorithm) {
    this.derivationAlgorithm = derivationAlgorithm;
    return this;
  }

  /**
   * A step-by-step procedure used to calculate the value of PerformanceIndicator.
   * @return derivationAlgorithm
  */
  
  @Schema(name = "derivationAlgorithm", description = "A step-by-step procedure used to calculate the value of PerformanceIndicator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDerivationAlgorithm() {
    return derivationAlgorithm;
  }

  public void setDerivationAlgorithm(String derivationAlgorithm) {
    this.derivationAlgorithm = derivationAlgorithm;
  }

  public PerformanceIndicatorSpecification derivationMethod(String derivationMethod) {
    this.derivationMethod = derivationMethod;
    return this;
  }

  /**
   * For simple calculations, the method used to calculate the value of a PerformanceIndicator, such as average, minimum, maximum, sum and so forth.
   * @return derivationMethod
  */
  
  @Schema(name = "derivationMethod", description = "For simple calculations, the method used to calculate the value of a PerformanceIndicator, such as average, minimum, maximum, sum and so forth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDerivationMethod() {
    return derivationMethod;
  }

  public void setDerivationMethod(String derivationMethod) {
    this.derivationMethod = derivationMethod;
  }

  public PerformanceIndicatorSpecification validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PerformanceIndicatorSpecification collectionType(CollectionType collectionType) {
    this.collectionType = collectionType;
    return this;
  }

  /**
   * Get collectionType
   * @return collectionType
  */
  @Valid 
  @Schema(name = "collectionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CollectionType getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(CollectionType collectionType) {
    this.collectionType = collectionType;
  }

  public PerformanceIndicatorSpecification indicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
    return this;
  }

  /**
   * The unit by which the indicator is measured. For example, seconds, KBs, rate per second, etc.
   * @return indicatorUnit
  */
  
  @Schema(name = "indicatorUnit", description = "The unit by which the indicator is measured. For example, seconds, KBs, rate per second, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getIndicatorUnit() {
    return indicatorUnit;
  }

  public void setIndicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
  }

  public PerformanceIndicatorSpecification performanceIndicatorSpecRelationship(List<PerformanceIndicatorSpecRelationship> performanceIndicatorSpecRelationship) {
    this.performanceIndicatorSpecRelationship = performanceIndicatorSpecRelationship;
    return this;
  }

  public PerformanceIndicatorSpecification addPerformanceIndicatorSpecRelationshipItem(PerformanceIndicatorSpecRelationship performanceIndicatorSpecRelationshipItem) {
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
  public List<PerformanceIndicatorSpecRelationship> getPerformanceIndicatorSpecRelationship() {
    return performanceIndicatorSpecRelationship;
  }

  public void setPerformanceIndicatorSpecRelationship(List<PerformanceIndicatorSpecRelationship> performanceIndicatorSpecRelationship) {
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
    PerformanceIndicatorSpecification performanceIndicatorSpecification = (PerformanceIndicatorSpecification) o;
    return Objects.equals(this.type, performanceIndicatorSpecification.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecification.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecification.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecification.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecification.uuid) &&
        Objects.equals(this.name, performanceIndicatorSpecification.name) &&
        Objects.equals(this.description, performanceIndicatorSpecification.description) &&
        Objects.equals(this.perspective, performanceIndicatorSpecification.perspective) &&
        Objects.equals(this.indicatorCategory, performanceIndicatorSpecification.indicatorCategory) &&
        Objects.equals(this.indicatorType, performanceIndicatorSpecification.indicatorType) &&
        Objects.equals(this.derivationAlgorithm, performanceIndicatorSpecification.derivationAlgorithm) &&
        Objects.equals(this.derivationMethod, performanceIndicatorSpecification.derivationMethod) &&
        Objects.equals(this.validFor, performanceIndicatorSpecification.validFor) &&
        Objects.equals(this.collectionType, performanceIndicatorSpecification.collectionType) &&
        Objects.equals(this.indicatorUnit, performanceIndicatorSpecification.indicatorUnit) &&
        Objects.equals(this.performanceIndicatorSpecRelationship, performanceIndicatorSpecification.performanceIndicatorSpecRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, description, perspective, indicatorCategory, indicatorType, derivationAlgorithm, derivationMethod, validFor, collectionType, indicatorUnit, performanceIndicatorSpecRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecification {\n");
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

