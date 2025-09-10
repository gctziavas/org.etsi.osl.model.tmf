package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.etsi.osl.tmf.scm633.model.ServiceSpecificationUpdate;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AiModelSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same  specification, these services would therefore share the same set of characteristics. Skipped properties: id,href,lastUpdate
 */

@Schema(name = "AiModelSpecification_Update", description = "AiModelSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same  specification, these services would therefore share the same set of characteristics. Skipped properties: id,href,lastUpdate")
@JsonTypeName("AiModelSpecification_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiModelSpecificationUpdate extends ServiceSpecificationUpdate {

  private @Nullable Object deploymentRecord;

  private @Nullable Object inheritedModel;

  private @Nullable Object modelContractVersionHistory;

  private @Nullable Object modelDataSheet;

  private @Nullable Object modelEvaluationData;

  private @Nullable Object modelSpecificationHistory;

  private @Nullable Object modelTrainingData;

  @Valid
  private List<ConstraintRef> constraint = new ArrayList<>();

  @Valid
  private List<EntitySpecificationRelationship> entitySpecRelationship = new ArrayList<>();

  @Valid
  private List<FeatureSpecification> featureSpecification = new ArrayList<>();

  @Valid
  private List<CharacteristicSpecification> specCharacteristic = new ArrayList<>();   // in ServiceSpecificationUpdate it is serviceSpecCharacteristic

  private @Nullable TargetEntitySchema targetEntitySchema;  // in ServiceSpecificationUpdate it is TargetServiceSchema


  public AiModelSpecificationUpdate deploymentRecord(@Nullable Object deploymentRecord) {
    this.deploymentRecord = deploymentRecord;
    return this;
  }

  /**
   * Get deploymentRecord
   * @return deploymentRecord
   */
  
  @Schema(name = "deploymentRecord", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentRecord")
  public @Nullable Object getDeploymentRecord() {
    return deploymentRecord;
  }

  public void setDeploymentRecord(@Nullable Object deploymentRecord) {
    this.deploymentRecord = deploymentRecord;
  }

  public AiModelSpecificationUpdate description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get inheritedModel
   * @return inheritedModel
   */
  
  @Schema(name = "inheritedModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inheritedModel")
  public @Nullable Object getInheritedModel() {
    return inheritedModel;
  }

  public void setInheritedModel(@Nullable Object inheritedModel) {
    this.inheritedModel = inheritedModel;
  }

  public AiModelSpecificationUpdate isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  public AiModelSpecificationUpdate modelContractVersionHistory(@Nullable Object modelContractVersionHistory) {
    this.modelContractVersionHistory = modelContractVersionHistory;
    return this;
  }

  /**
   * Get modelContractVersionHistory
   * @return modelContractVersionHistory
   */
  
  @Schema(name = "modelContractVersionHistory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelContractVersionHistory")
  public @Nullable Object getModelContractVersionHistory() {
    return modelContractVersionHistory;
  }

  public void setModelContractVersionHistory(@Nullable Object modelContractVersionHistory) {
    this.modelContractVersionHistory = modelContractVersionHistory;
  }

  public AiModelSpecificationUpdate modelDataSheet(@Nullable Object modelDataSheet) {
    this.modelDataSheet = modelDataSheet;
    return this;
  }

  /**
   * Get modelDataSheet
   * @return modelDataSheet
   */
  
  @Schema(name = "modelDataSheet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelDataSheet")
  public @Nullable Object getModelDataSheet() {
    return modelDataSheet;
  }

  public void setModelDataSheet(@Nullable Object modelDataSheet) {
    this.modelDataSheet = modelDataSheet;
  }

  public AiModelSpecificationUpdate modelEvaluationData(@Nullable Object modelEvaluationData) {
    this.modelEvaluationData = modelEvaluationData;
    return this;
  }

  /**
   * Get modelEvaluationData
   * @return modelEvaluationData
   */
  
  @Schema(name = "modelEvaluationData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelEvaluationData")
  public @Nullable Object getModelEvaluationData() {
    return modelEvaluationData;
  }

  public void setModelEvaluationData(@Nullable Object modelEvaluationData) {
    this.modelEvaluationData = modelEvaluationData;
  }

  public AiModelSpecificationUpdate modelSpecificationHistory(@Nullable Object modelSpecificationHistory) {
    this.modelSpecificationHistory = modelSpecificationHistory;
    return this;
  }

  /**
   * Get modelSpecificationHistory
   * @return modelSpecificationHistory
   */
  
  @Schema(name = "modelSpecificationHistory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelSpecificationHistory")
  public @Nullable Object getModelSpecificationHistory() {
    return modelSpecificationHistory;
  }

  public void setModelSpecificationHistory(@Nullable Object modelSpecificationHistory) {
    this.modelSpecificationHistory = modelSpecificationHistory;
  }

  public AiModelSpecificationUpdate modelTrainingData(@Nullable Object modelTrainingData) {
    this.modelTrainingData = modelTrainingData;
    return this;
  }

  /**
   * Get modelTrainingData
   * @return modelTrainingData
   */
  
  @Schema(name = "modelTrainingData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelTrainingData")
  public @Nullable Object getModelTrainingData() {
    return modelTrainingData;
  }

  public void setModelTrainingData(@Nullable Object modelTrainingData) {
    this.modelTrainingData = modelTrainingData;
  }


  public AiModelSpecificationUpdate constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public AiModelSpecificationUpdate addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * This is a list of constraint references applied to this specification
   * @return constraint
   */
  @Valid 
  @Schema(name = "constraint", description = "This is a list of constraint references applied to this specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("constraint")
  public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public AiModelSpecificationUpdate entitySpecRelationship(List<EntitySpecificationRelationship> entitySpecRelationship) {
    this.entitySpecRelationship = entitySpecRelationship;
    return this;
  }

  public AiModelSpecificationUpdate addEntitySpecRelationshipItem(EntitySpecificationRelationship entitySpecRelationshipItem) {
    if (this.entitySpecRelationship == null) {
      this.entitySpecRelationship = new ArrayList<>();
    }
    this.entitySpecRelationship.add(entitySpecRelationshipItem);
    return this;
  }

  /**
   * Relationship to another specification
   * @return entitySpecRelationship
   */
  @Valid 
  @Schema(name = "entitySpecRelationship", description = "Relationship to another specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entitySpecRelationship")
  public List<EntitySpecificationRelationship> getEntitySpecRelationship() {
    return entitySpecRelationship;
  }

  public void setEntitySpecRelationship(List<EntitySpecificationRelationship> entitySpecRelationship) {
    this.entitySpecRelationship = entitySpecRelationship;
  }

  public AiModelSpecificationUpdate featureSpecification(List<FeatureSpecification> featureSpecification) {
    this.featureSpecification = featureSpecification;
    return this;
  }

  public AiModelSpecificationUpdate addFeatureSpecificationItem(FeatureSpecification featureSpecificationItem) {
    if (this.featureSpecification == null) {
      this.featureSpecification = new ArrayList<>();
    }
    this.featureSpecification.add(featureSpecificationItem);
    return this;
  }

  /**
   * A list of Features for this specification.
   * @return featureSpecification
   */
  @Valid 
  @Schema(name = "featureSpecification", description = "A list of Features for this specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureSpecification")
  public List<FeatureSpecification> getFeatureSpecification() {
    return featureSpecification;
  }

  public void setFeatureSpecification(List<FeatureSpecification> featureSpecification) {
    this.featureSpecification = featureSpecification;
  }


  public AiModelSpecificationUpdate specCharacteristic(List<CharacteristicSpecification> specCharacteristic) {
    this.specCharacteristic = specCharacteristic;
    return this;
  }

  public AiModelSpecificationUpdate addSpecCharacteristicItem(CharacteristicSpecification specCharacteristicItem) {
    if (this.specCharacteristic == null) {
      this.specCharacteristic = new ArrayList<>();
    }
    this.specCharacteristic.add(specCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics that the entity can take
   * @return specCharacteristic
   */
  @Valid 
  @Schema(name = "specCharacteristic", description = "List of characteristics that the entity can take", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specCharacteristic")
  public List<CharacteristicSpecification> getSpecCharacteristic() {
    return specCharacteristic;
  }

  public void setSpecCharacteristic(List<CharacteristicSpecification> specCharacteristic) {
    this.specCharacteristic = specCharacteristic;
  }

  public AiModelSpecificationUpdate targetEntitySchema(@Nullable TargetEntitySchema targetEntitySchema) {
    this.targetEntitySchema = targetEntitySchema;
    return this;
  }

  /**
   * Get targetEntitySchema
   * @return targetEntitySchema
   */
  @Valid 
  @Schema(name = "targetEntitySchema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetEntitySchema")
  public @Nullable TargetEntitySchema getTargetEntitySchema() {
    return targetEntitySchema;
  }

  public void setTargetEntitySchema(@Nullable TargetEntitySchema targetEntitySchema) {
    this.targetEntitySchema = targetEntitySchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModelSpecificationUpdate aiModelSpecificationUpdate = (AiModelSpecificationUpdate) o;
    return Objects.equals(this.deploymentRecord, aiModelSpecificationUpdate.deploymentRecord) &&
        Objects.equals(this.description, aiModelSpecificationUpdate.description) &&
        Objects.equals(this.inheritedModel, aiModelSpecificationUpdate.inheritedModel) &&
        Objects.equals(this.isBundle, aiModelSpecificationUpdate.isBundle) &&
        Objects.equals(this.lifecycleStatus, aiModelSpecificationUpdate.lifecycleStatus) &&
        Objects.equals(this.modelContractVersionHistory, aiModelSpecificationUpdate.modelContractVersionHistory) &&
        Objects.equals(this.modelDataSheet, aiModelSpecificationUpdate.modelDataSheet) &&
        Objects.equals(this.modelEvaluationData, aiModelSpecificationUpdate.modelEvaluationData) &&
        Objects.equals(this.modelSpecificationHistory, aiModelSpecificationUpdate.modelSpecificationHistory) &&
        Objects.equals(this.modelTrainingData, aiModelSpecificationUpdate.modelTrainingData) &&
        Objects.equals(this.name, aiModelSpecificationUpdate.name) &&
        Objects.equals(this.version, aiModelSpecificationUpdate.version) &&
        Objects.equals(this.attachment, aiModelSpecificationUpdate.attachment) &&
        Objects.equals(this.constraint, aiModelSpecificationUpdate.constraint) &&
        Objects.equals(this.entitySpecRelationship, aiModelSpecificationUpdate.entitySpecRelationship) &&
        Objects.equals(this.featureSpecification, aiModelSpecificationUpdate.featureSpecification) &&
        Objects.equals(this.relatedParty, aiModelSpecificationUpdate.relatedParty) &&
        Objects.equals(this.resourceSpecification, aiModelSpecificationUpdate.resourceSpecification) &&
        Objects.equals(this.serviceLevelSpecification, aiModelSpecificationUpdate.serviceLevelSpecification) &&
        Objects.equals(this.serviceSpecRelationship, aiModelSpecificationUpdate.serviceSpecRelationship) &&
        Objects.equals(this.specCharacteristic, aiModelSpecificationUpdate.specCharacteristic) &&
        Objects.equals(this.targetEntitySchema, aiModelSpecificationUpdate.targetEntitySchema) &&
        Objects.equals(this.validFor, aiModelSpecificationUpdate.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentRecord, description, inheritedModel, isBundle, lifecycleStatus, modelContractVersionHistory, modelDataSheet, modelEvaluationData, modelSpecificationHistory, modelTrainingData, name, version, attachment, constraint, entitySpecRelationship, featureSpecification, relatedParty, resourceSpecification, serviceLevelSpecification, serviceSpecRelationship, specCharacteristic, targetEntitySchema, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelSpecificationUpdate {\n");
    sb.append("    deploymentRecord: ").append(toIndentedString(deploymentRecord)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inheritedModel: ").append(toIndentedString(inheritedModel)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    modelContractVersionHistory: ").append(toIndentedString(modelContractVersionHistory)).append("\n");
    sb.append("    modelDataSheet: ").append(toIndentedString(modelDataSheet)).append("\n");
    sb.append("    modelEvaluationData: ").append(toIndentedString(modelEvaluationData)).append("\n");
    sb.append("    modelSpecificationHistory: ").append(toIndentedString(modelSpecificationHistory)).append("\n");
    sb.append("    modelTrainingData: ").append(toIndentedString(modelTrainingData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    entitySpecRelationship: ").append(toIndentedString(entitySpecRelationship)).append("\n");
    sb.append("    featureSpecification: ").append(toIndentedString(featureSpecification)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    serviceLevelSpecification: ").append(toIndentedString(serviceLevelSpecification)).append("\n");
    sb.append("    serviceSpecRelationship: ").append(toIndentedString(serviceSpecRelationship)).append("\n");
    sb.append("    specCharacteristic: ").append(toIndentedString(specCharacteristic)).append("\n");
    sb.append("    targetEntitySchema: ").append(toIndentedString(targetEntitySchema)).append("\n");
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

