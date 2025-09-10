package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.sim638.model.Service;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AiModel is a base class for defining the AiModel hierarchy
 */

@Schema(name = "AiModel", description = "AiModel is a base class for defining the AiModel hierarchy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
@Entity(name = "AIM915_AiModel")
public class AiModel extends Service{



  private @Nullable AiModelSpecification aiModelSpecification;

  @Valid
  private List<Feature> feature = new ArrayList<>();

  private @Nullable ResourceRef gpu;

  private @Nullable boolean isBundle;

  @Valid
  private List<RelatedEntityRefOrValue> relatedEntity = new ArrayList<>();

  @Valid
  private List<RelatedServiceOrderItem> serviceOrderItem = new ArrayList<>(); //in service is serviceOrder

  @Valid
  private List<SoftwareRef> software = new ArrayList<>();

  private @Nullable EntityRef trainingData;

  public AiModel isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public AiModel aiModelSpecification(@Nullable AiModelSpecification aiModelSpecification) {
    this.aiModelSpecification = aiModelSpecification;
    return this;
  }

  /**
   * Get aiModelSpecification
   * @return aiModelSpecification
   */
  @Valid 
  @Schema(name = "aiModelSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiModelSpecification")
  public @Nullable AiModelSpecification getAiModelSpecification() {
    return aiModelSpecification;
  }

  public void setAiModelSpecification(@Nullable AiModelSpecification aiModelSpecification) {
    this.aiModelSpecification = aiModelSpecification;
  }

  public AiModel feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public AiModel addFeatureItem(Feature featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<>();
    }
    this.feature.add(featureItem);
    return this;
  }

  /**
   * A list of feature associated with this service 
   * @return feature
   */
  @Valid 
  @Schema(name = "feature", description = "A list of feature associated with this service ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature")
  public List<Feature> getFeature() {
    return feature;
  }

  public void setFeature(List<Feature> feature) {
    this.feature = feature;
  }

  public AiModel gpu(@Nullable ResourceRef gpu) {
    this.gpu = gpu;
    return this;
  }

  /**
   * Get gpu
   * @return gpu
   */
  @Valid 
  @Schema(name = "gpu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gpu")
  public @Nullable ResourceRef getGpu() {
    return gpu;
  }

  public void setGpu(@Nullable ResourceRef gpu) {
    this.gpu = gpu;
  }

  public AiModel relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public AiModel addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * A list of related  entity in relationship with this service 
   * @return relatedEntity
   */
  @Valid 
  @Schema(name = "relatedEntity", description = "A list of related  entity in relationship with this service ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedEntity")
  public List<RelatedEntityRefOrValue> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }
  public AiModel serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public AiModel addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items related to this service
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of service order items related to this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<RelatedServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public AiModel software(List<SoftwareRef> software) {
    this.software = software;
    return this;
  }

  public AiModel addSoftwareItem(SoftwareRef softwareItem) {
    if (this.software == null) {
      this.software = new ArrayList<>();
    }
    this.software.add(softwareItem);
    return this;
  }

  /**
   * Reference to Software in Inventory
   * @return software
   */
  @Valid 
  @Schema(name = "software", description = "Reference to Software in Inventory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("software")
  public List<SoftwareRef> getSoftware() {
    return software;
  }

  public void setSoftware(List<SoftwareRef> software) {
    this.software = software;
  }

  public AiModel trainingData(@Nullable EntityRef trainingData) {
    this.trainingData = trainingData;
    return this;
  }

  /**
   * Get trainingData
   * @return trainingData
   */
  @Valid 
  @Schema(name = "trainingData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingData")
  public @Nullable EntityRef getTrainingData() {
    return trainingData;
  }

  public void setTrainingData(@Nullable EntityRef trainingData) {
    this.trainingData = trainingData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModel aiModel = (AiModel) o;
    return
        Objects.equals(this.href, aiModel.href) &&
        Objects.equals(this.isBundle, aiModel.isBundle) &&
        Objects.equals(this.name, aiModel.name) &&
        Objects.equals(this.aiModelSpecification, aiModel.aiModelSpecification) &&
        Objects.equals(this.feature, aiModel.feature) &&
        Objects.equals(this.gpu, aiModel.gpu) &&
        Objects.equals(this.relatedEntity, aiModel.relatedEntity) &&
        Objects.equals(this.serviceOrderItem, aiModel.serviceOrderItem) &&
        Objects.equals(this.software, aiModel.software) &&
        Objects.equals(this.trainingData, aiModel.trainingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, isBundle, name, aiModelSpecification, feature, gpu, relatedEntity, serviceOrderItem, software, trainingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModel {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    aiModelSpecification: ").append(toIndentedString(aiModelSpecification)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    trainingData: ").append(toIndentedString(trainingData)).append("\n");
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

