package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PerformanceIndicatorGroupSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PerfIndGroupSpec")
public class PerformanceIndicatorGroupSpecification extends BaseRootNamedEntity implements PatchPerformanceIndicatorGroupSpecification200Response, PerformanceIndicatorGroupSpecificationRefOrValue {

  @JsonProperty("groupCategory")
  private String groupCategory;

  @JsonProperty("performanceIndicatorSpecification")
  @Valid
  @ManyToAny
  @AnyDiscriminator(DiscriminatorType.STRING)
  @Column(name = "performance_indicator_specification_type")
  @AnyKeyJavaClass(String.class)
  @AnyDiscriminatorValue(discriminator = "value", entity = PerformanceIndicatorSpecification.class)
  @AnyDiscriminatorValue(discriminator = "ref", entity = PerformanceIndicatorSpecificationRef.class)
  @Cascade(CascadeType.MERGE)
  @JoinTable(
          name = "perf_ind_group_spec_perf_ind_specs",
          joinColumns = @JoinColumn(name = "perf_ind_group_spec_id"),
          inverseJoinColumns = @JoinColumn(name = "perf_ind_spec_id")
  )
  private List<@Valid PerformanceIndicatorSpecificationRefOrValue> performanceIndicatorSpecification = new ArrayList<>();

  public PerformanceIndicatorGroupSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorGroupSpecification(String type) {
    this.type = type;
  }

  public PerformanceIndicatorGroupSpecification groupCategory(String groupCategory) {
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

  public PerformanceIndicatorGroupSpecification performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValue> performanceIndicatorSpecification) {
    this.performanceIndicatorSpecification = performanceIndicatorSpecification;
    return this;
  }

  public PerformanceIndicatorGroupSpecification addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValue performanceIndicatorSpecificationItem) {
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
  public List<@Valid PerformanceIndicatorSpecificationRefOrValue> getPerformanceIndicatorSpecification() {
    return performanceIndicatorSpecification;
  }

  public void setPerformanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValue> performanceIndicatorSpecification) {
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
    PerformanceIndicatorGroupSpecification performanceIndicatorGroupSpecification = (PerformanceIndicatorGroupSpecification) o;
    return Objects.equals(this.type, performanceIndicatorGroupSpecification.type) &&
        Objects.equals(this.baseType, performanceIndicatorGroupSpecification.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorGroupSpecification.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorGroupSpecification.href) &&
        Objects.equals(this.uuid, performanceIndicatorGroupSpecification.uuid) &&
        Objects.equals(this.name, performanceIndicatorGroupSpecification.name) &&
        Objects.equals(this.groupCategory, performanceIndicatorGroupSpecification.groupCategory) &&
        Objects.equals(this.performanceIndicatorSpecification, performanceIndicatorGroupSpecification.performanceIndicatorSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, groupCategory, performanceIndicatorSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorGroupSpecification {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

