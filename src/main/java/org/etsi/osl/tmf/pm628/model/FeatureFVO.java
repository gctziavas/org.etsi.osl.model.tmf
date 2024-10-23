package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FeatureFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FeatureFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("isBundle")
  private Boolean isBundle;

  @JsonProperty("featureRelationship")
  @Valid
  private List<FeatureRelationshipFVO> featureRelationship = new ArrayList<>();

  @JsonProperty("featureCharacteristic")
  @Valid
  private List<CharacteristicFVO> featureCharacteristic = new ArrayList<>();

  @JsonProperty("policyConstraint")
  @Valid
  private List<PolicyRefFVO> policyConstraint = new ArrayList<>();

  @JsonProperty("isEnabled")
  private Boolean isEnabled;

  @JsonProperty("name")
  private String name;

  public FeatureFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureFVO(String type) {
    this.type = type;
  }

  public FeatureFVO type(String type) {
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

  public FeatureFVO baseType(String baseType) {
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

  public FeatureFVO schemaLocation(String schemaLocation) {
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

  public FeatureFVO isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * True if this is a feature group. Default is false.
   * @return isBundle
  */
  
  @Schema(name = "isBundle", description = "True if this is a feature group. Default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public FeatureFVO featureRelationship(List<FeatureRelationshipFVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public FeatureFVO addFeatureRelationshipItem(FeatureRelationshipFVO featureRelationshipItem) {
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
  @JsonProperty("featureRelationship")
  public List<FeatureRelationshipFVO> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationshipFVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }

  public FeatureFVO featureCharacteristic(List<CharacteristicFVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public FeatureFVO addFeatureCharacteristicItem(CharacteristicFVO featureCharacteristicItem) {
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
  @JsonProperty("featureCharacteristic")
  public List<CharacteristicFVO> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<CharacteristicFVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public FeatureFVO policyConstraint(List<PolicyRefFVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public FeatureFVO addPolicyConstraintItem(PolicyRefFVO policyConstraintItem) {
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
  @JsonProperty("policyConstraint")
  public List<PolicyRefFVO> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRefFVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public FeatureFVO isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * True if this feature is enabled. Default is true.
   * @return isEnabled
  */
  
  @Schema(name = "isEnabled", description = "True if this feature is enabled. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public FeatureFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name for the feature.
   * @return name
  */
  
  @Schema(name = "name", description = "This is the name for the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFVO featureFVO = (FeatureFVO) o;
    return Objects.equals(this.type, featureFVO.type) &&
        Objects.equals(this.baseType, featureFVO.baseType) &&
        Objects.equals(this.schemaLocation, featureFVO.schemaLocation) &&
        Objects.equals(this.isBundle, featureFVO.isBundle) &&
        Objects.equals(this.featureRelationship, featureFVO.featureRelationship) &&
        Objects.equals(this.featureCharacteristic, featureFVO.featureCharacteristic) &&
        Objects.equals(this.policyConstraint, featureFVO.policyConstraint) &&
        Objects.equals(this.isEnabled, featureFVO.isEnabled) &&
        Objects.equals(this.name, featureFVO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, isBundle, featureRelationship, featureCharacteristic, policyConstraint, isEnabled, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    featureRelationship: ").append(toIndentedString(featureRelationship)).append("\n");
    sb.append("    featureCharacteristic: ").append(toIndentedString(featureCharacteristic)).append("\n");
    sb.append("    policyConstraint: ").append(toIndentedString(policyConstraint)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

