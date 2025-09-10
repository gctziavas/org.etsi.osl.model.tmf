package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.etsi.osl.tmf.sim638.model.ServiceUpdate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AiModel is a base class for defining the AiModel hierarchy Skipped properties: id,href,serviceDate
 */

@Schema(name = "AiModel_Update", description = "AiModel is a base class for defining the AiModel hierarchy Skipped properties: id,href,serviceDate")
@JsonTypeName("AiModel_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiModelUpdate extends ServiceUpdate{

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  private @Nullable AiModelSpecification aiModelSpecification;

  @Valid
  private List<Feature> feature = new ArrayList<>();

  private @Nullable Boolean isBundle;

  private @Nullable ResourceRef gpu;

  @Valid
  private List<RelatedEntityRefOrValue> relatedEntity = new ArrayList<>();

  @Valid
  private List<RelatedServiceOrderItem> serviceOrderItem = new ArrayList<>(); //in ServiceUpdate is ServiceOrder

  @Valid
  private List<SoftwareRef> software = new ArrayList<>();

  private @Nullable EntityRef trainingData;

  public AiModelUpdate category(@Nullable String category) {
    this.category = category;
    return this;
  }


  /**
   * Date when the service ends
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", description = "Date when the service ends", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public AiModelUpdate hasStarted(@Nullable Boolean hasStarted) {
    this.hasStarted = hasStarted;
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

  public AiModelUpdate isServiceEnabled(@Nullable Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
    return this;
  }


  /**
   * If TRUE, this Service can be changed without affecting any other services
   * @return isStateful
   */
  
  @Schema(name = "isStateful", description = "If TRUE, this Service can be changed without affecting any other services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isStateful")
  public @Nullable Boolean getIsStateful() {
    return isStateful;
  }

  public void setIsStateful(@Nullable Boolean isStateful) {
    this.isStateful = isStateful;
  }

  public AiModelUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AiModelUpdate serviceType(@Nullable String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Business type of the service
   * @return serviceType
   */
  
  @Schema(name = "serviceType", description = "Business type of the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceType")
  public @Nullable String getServiceType() {
    return serviceType;
  }

  public void setServiceType(@Nullable String serviceType) {
    this.serviceType = serviceType;
  }

  public AiModelUpdate startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the service starts
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", description = "Date when the service starts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AiModelUpdate startMode(@Nullable String startMode) {
    this.startMode = startMode;
    return this;
  }

  /**
   * This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above
   * @return startMode
   */
  
  @Schema(name = "startMode", description = "This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startMode")
  public @Nullable String getStartMode() {
    return startMode;
  }

  public void setStartMode(@Nullable String startMode) {
    this.startMode = startMode;
  }

  public AiModelUpdate aiModelSpecification(@Nullable AiModelSpecification aiModelSpecification) {
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

  public AiModelUpdate feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public AiModelUpdate addFeatureItem(Feature featureItem) {
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

  public AiModelUpdate gpu(@Nullable ResourceRef gpu) {
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


  public AiModelUpdate relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public AiModelUpdate addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
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
  
  public AiModelUpdate serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public AiModelUpdate addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
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

  public AiModelUpdate software(List<SoftwareRef> software) {
    this.software = software;
    return this;
  }

  public AiModelUpdate addSoftwareItem(SoftwareRef softwareItem) {
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

  public AiModelUpdate trainingData(@Nullable EntityRef trainingData) {
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
    AiModelUpdate aiModelUpdate = (AiModelUpdate) o;
    return Objects.equals(this.category, aiModelUpdate.category) &&
        Objects.equals(this.description, aiModelUpdate.description) &&
        Objects.equals(this.endDate, aiModelUpdate.endDate) &&
        Objects.equals(this.hasStarted, aiModelUpdate.hasStarted) &&
        Objects.equals(this.isBundle, aiModelUpdate.isBundle) &&
        Objects.equals(this.isServiceEnabled, aiModelUpdate.isServiceEnabled) &&
        Objects.equals(this.isStateful, aiModelUpdate.isStateful) &&
        Objects.equals(this.name, aiModelUpdate.name) &&
        Objects.equals(this.serviceType, aiModelUpdate.serviceType) &&
        Objects.equals(this.startDate, aiModelUpdate.startDate) &&
        Objects.equals(this.startMode, aiModelUpdate.startMode) &&
        Objects.equals(this.aiModelSpecification, aiModelUpdate.aiModelSpecification) &&
        Objects.equals(this.feature, aiModelUpdate.feature) &&
        Objects.equals(this.gpu, aiModelUpdate.gpu) &&
        Objects.equals(this.note, aiModelUpdate.note) &&
        Objects.equals(this.place, aiModelUpdate.place) &&
        Objects.equals(this.relatedEntity, aiModelUpdate.relatedEntity) &&
        Objects.equals(this.relatedParty, aiModelUpdate.relatedParty) &&
        Objects.equals(this.serviceCharacteristic, aiModelUpdate.serviceCharacteristic) &&
        Objects.equals(this.serviceOrderItem, aiModelUpdate.serviceOrderItem) &&
        Objects.equals(this.serviceRelationship, aiModelUpdate.serviceRelationship) &&
        Objects.equals(this.software, aiModelUpdate.software) &&
        Objects.equals(this.state, aiModelUpdate.state) &&
        Objects.equals(this.supportingResource, aiModelUpdate.supportingResource) &&
        Objects.equals(this.supportingService, aiModelUpdate.supportingService) &&
        Objects.equals(this.trainingData, aiModelUpdate.trainingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, endDate, hasStarted, isBundle, isServiceEnabled, isStateful, name, serviceType, startDate, startMode, aiModelSpecification, feature, gpu, note, place, relatedEntity, relatedParty, serviceCharacteristic, serviceOrderItem, serviceRelationship, software, state, supportingResource, supportingService, trainingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelUpdate {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hasStarted: ").append(toIndentedString(hasStarted)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isServiceEnabled: ").append(toIndentedString(isServiceEnabled)).append("\n");
    sb.append("    isStateful: ").append(toIndentedString(isStateful)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startMode: ").append(toIndentedString(startMode)).append("\n");
    sb.append("    aiModelSpecification: ").append(toIndentedString(aiModelSpecification)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    supportingService: ").append(toIndentedString(supportingService)).append("\n");
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

