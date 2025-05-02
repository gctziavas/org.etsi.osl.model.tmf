package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.etsi.osl.tmf.ri639.model.FeatureRelationship;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Feature
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_Feature")
public class Feature extends BaseRootNamedEntity {

  @JsonProperty("isBundle")
  private Boolean isBundle;

  @JsonProperty("featureRelationship")
  @Valid
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_feature_feat_rel",
          joinColumns = @JoinColumn(name = "feat_uuid"),
          inverseJoinColumns = @JoinColumn(name = "feat_rel_uuid")
  )
  private List<FeatureRelationship> featureRelationship = new ArrayList<>();

  @JsonProperty("featureCharacteristic")
  @Valid
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_feature_feat_char",
          joinColumns = @JoinColumn(name = "feat_uuid"),
          inverseJoinColumns = @JoinColumn(name = "feat_char_uuid")
  )
  private List<Characteristic> featureCharacteristic = new ArrayList<>();

  @JsonProperty("policyConstraint")
  @Valid
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_feature_pol_const",
          joinColumns = @JoinColumn(name = "feat_uuid"),
          inverseJoinColumns = @JoinColumn(name = "pol_const_uuid")
  )
  private List<PolicyRef> policyConstraint = new ArrayList<>();

  @JsonProperty("isEnabled")
  private Boolean isEnabled;

  public Feature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Feature(String type) {
    this.type = type;
  }
  
  public Feature isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * True if this is a feature group. Default is false.
   * @return isBundle
  */
  
  @Schema(name = "isBundle", description = "True if this is a feature group. Default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public Feature featureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public Feature addFeatureRelationshipItem(FeatureRelationship featureRelationshipItem) {
    if (this.featureRelationship == null) {
      this.featureRelationship = new ArrayList<>();
    }
    this.featureRelationship.add(featureRelationshipItem);
    return this;
  }

  /**
   * Collection of feature relationships
   * @return featureRelationship
  */
  @Valid 
  @Schema(name = "featureRelationship", description = "Collection of feature relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<FeatureRelationship> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }

  public Feature featureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public Feature addFeatureCharacteristicItem(Characteristic featureCharacteristicItem) {
    if (this.featureCharacteristic == null) {
      this.featureCharacteristic = new ArrayList<>();
    }
    this.featureCharacteristic.add(featureCharacteristicItem);
    return this;
  }

  /**
   * This is a list of Characteristics for a particular feature.
   * @return featureCharacteristic
  */
  @Valid 
  @Schema(name = "featureCharacteristic", description = "This is a list of Characteristics for a particular feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Characteristic> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public Feature policyConstraint(List<PolicyRef> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public Feature addPolicyConstraintItem(PolicyRef policyConstraintItem) {
    if (this.policyConstraint == null) {
      this.policyConstraint = new ArrayList<>();
    }
    this.policyConstraint.add(policyConstraintItem);
    return this;
  }

  /**
   * Reference to manage a list of feature specification policy constraints
   * @return policyConstraint
  */
  @Valid 
  @Schema(name = "policyConstraint", description = "Reference to manage a list of feature specification policy constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PolicyRef> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRef> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public Feature isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * True if this feature is enabled. Default is true.
   * @return isEnabled
  */
  
  @Schema(name = "isEnabled", description = "True if this feature is enabled. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.type, feature.type) &&
        Objects.equals(this.baseType, feature.baseType) &&
        Objects.equals(this.schemaLocation, feature.schemaLocation) &&
        Objects.equals(this.isBundle, feature.isBundle) &&
        Objects.equals(this.featureRelationship, feature.featureRelationship) &&
        Objects.equals(this.featureCharacteristic, feature.featureCharacteristic) &&
        Objects.equals(this.policyConstraint, feature.policyConstraint) &&
        Objects.equals(this.isEnabled, feature.isEnabled) &&
        Objects.equals(this.uuid, feature.uuid) &&
        Objects.equals(this.name, feature.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, isBundle, featureRelationship, featureCharacteristic, policyConstraint, isEnabled, uuid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    featureRelationship: ").append(toIndentedString(featureRelationship)).append("\n");
    sb.append("    featureCharacteristic: ").append(toIndentedString(featureCharacteristic)).append("\n");
    sb.append("    policyConstraint: ").append(toIndentedString(policyConstraint)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

