package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.TimePeriod;
import org.etsi.osl.tmf.ri639.model.ResourceAdministrativeStateType;
import org.etsi.osl.tmf.ri639.model.ResourceOperationalStateType;
import org.etsi.osl.tmf.ri639.model.ResourceUsageStateType;

import javax.annotation.Generated;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * DataAccessEndpointFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataAccessEndpointFVO extends LogicalResourceFVO {

  @JsonProperty("uri")
  private URI uri;

  @JsonProperty("uriQueryFilter")
  private DataFilterMapFVO uriQueryFilter;

  @JsonProperty("apiType")
  private String apiType;

  public DataAccessEndpointFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataAccessEndpointFVO(String atType) {
    super(atType);
  }

  public DataAccessEndpointFVO uri(URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI for using the data access API
   * @return uri
  */
  @Valid 
  @Schema(name = "uri", description = "URI for using the data access API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public DataAccessEndpointFVO uriQueryFilter(DataFilterMapFVO uriQueryFilter) {
    this.uriQueryFilter = uriQueryFilter;
    return this;
  }

  /**
   * Get uriQueryFilter
   * @return uriQueryFilter
  */
  @Valid 
  @Schema(name = "uriQueryFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uriQueryFilter")
  public DataFilterMapFVO getUriQueryFilter() {
    return uriQueryFilter;
  }

  public void setUriQueryFilter(DataFilterMapFVO uriQueryFilter) {
    this.uriQueryFilter = uriQueryFilter;
  }

  public DataAccessEndpointFVO apiType(String apiType) {
    this.apiType = apiType;
    return this;
  }

  /**
   * Get apiType
   * @return apiType
  */
  
  @Schema(name = "apiType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiType")
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }


  public DataAccessEndpointFVO value(String value) {
    super.value(value);
    return this;
  }

  public DataAccessEndpointFVO type(String type) {
    super.type(type);
    return this;
  }

  public DataAccessEndpointFVO baseType(String baseType) {
    super.baseType(baseType);
    return this;
  }

  public DataAccessEndpointFVO schemaLocation(String schemaLocation) {
    super.schemaLocation(schemaLocation);
    return this;
  }

  public DataAccessEndpointFVO href(String href) {
    super.href(href);
    return this;
  }

  public DataAccessEndpointFVO uuid(String uuid) {
    super.uuid(uuid);
    return this;
  }

  public DataAccessEndpointFVO category(String category) {
    super.category(category);
    return this;
  }

  public DataAccessEndpointFVO description(String description) {
    super.description(description);
    return this;
  }

  public DataAccessEndpointFVO name(String name) {
    super.name(name);
    return this;
  }

  public DataAccessEndpointFVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public DataAccessEndpointFVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public DataAccessEndpointFVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public DataAccessEndpointFVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public DataAccessEndpointFVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public DataAccessEndpointFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public DataAccessEndpointFVO note(List<NoteFVO> note) {
    super.note(note);
    return this;
  }

  public DataAccessEndpointFVO addNoteItem(NoteFVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public DataAccessEndpointFVO resourceOrderItem(List<RelatedResourceOrderItemFVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public DataAccessEndpointFVO addResourceOrderItemItem(RelatedResourceOrderItemFVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public DataAccessEndpointFVO place(List<RelatedPlaceRefFVO> place) {
    super.place(place);
    return this;
  }

  public DataAccessEndpointFVO addPlaceItem(RelatedPlaceRefFVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public DataAccessEndpointFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public DataAccessEndpointFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public DataAccessEndpointFVO resourceRelationship(List<ResourceRelationshipFVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public DataAccessEndpointFVO addResourceRelationshipItem(ResourceRelationshipFVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public DataAccessEndpointFVO resourceCharacteristic(List<CharacteristicFVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public DataAccessEndpointFVO addResourceCharacteristicItem(CharacteristicFVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public DataAccessEndpointFVO attachment(List<AttachmentRefFVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public DataAccessEndpointFVO addAttachmentItem(AttachmentRefFVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public DataAccessEndpointFVO resourceSpecification(ResourceSpecificationRefFVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public DataAccessEndpointFVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public DataAccessEndpointFVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public DataAccessEndpointFVO activationFeature(List<FeatureFVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public DataAccessEndpointFVO addActivationFeatureItem(FeatureFVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public DataAccessEndpointFVO intent(IntentRefFVO intent) {
    super.intent(intent);
    return this;
  }

  public DataAccessEndpointFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public DataAccessEndpointFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
    super.addExternalIdentifierItem(externalIdentifierItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataAccessEndpointFVO dataAccessEndpointFVO = (DataAccessEndpointFVO) o;
    return Objects.equals(this.uri, dataAccessEndpointFVO.uri) &&
        Objects.equals(this.uriQueryFilter, dataAccessEndpointFVO.uriQueryFilter) &&
        Objects.equals(this.apiType, dataAccessEndpointFVO.apiType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uriQueryFilter, apiType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAccessEndpointFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriQueryFilter: ").append(toIndentedString(uriQueryFilter)).append("\n");
    sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
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

