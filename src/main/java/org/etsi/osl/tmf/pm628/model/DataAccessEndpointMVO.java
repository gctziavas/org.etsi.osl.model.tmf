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
 * DataAccessEndpointMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataAccessEndpointMVO extends LogicalResourceMVO {

  @JsonProperty("uri")
  private URI uri;

  @JsonProperty("uriQueryFilter")
  private DataFilterMapMVO uriQueryFilter;

  @JsonProperty("apiType")
  private String apiType;

  public DataAccessEndpointMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataAccessEndpointMVO(String atType) {
    super(atType);
  }

  public DataAccessEndpointMVO uri(URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI for using the data access API
   * @return uri
  */
  @Valid 
  @Schema(name = "uri", description = "URI for using the data access API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public DataAccessEndpointMVO uriQueryFilter(DataFilterMapMVO uriQueryFilter) {
    this.uriQueryFilter = uriQueryFilter;
    return this;
  }

  /**
   * Get uriQueryFilter
   * @return uriQueryFilter
  */
  @Valid 
  @Schema(name = "uriQueryFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DataFilterMapMVO getUriQueryFilter() {
    return uriQueryFilter;
  }

  public void setUriQueryFilter(DataFilterMapMVO uriQueryFilter) {
    this.uriQueryFilter = uriQueryFilter;
  }

  public DataAccessEndpointMVO apiType(String apiType) {
    this.apiType = apiType;
    return this;
  }

  /**
   * Get apiType
   * @return apiType
  */
  
  @Schema(name = "apiType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }


  public DataAccessEndpointMVO value(String value) {
    super.value(value);
    return this;
  }

  public DataAccessEndpointMVO type(String type) {
    super.type(type);
    return this;
  }

  public DataAccessEndpointMVO baseType(String baseType) {
    super.baseType(baseType);
    return this;
  }

  public DataAccessEndpointMVO schemaLocation(String schemaLocation) {
    super.schemaLocation(schemaLocation);
    return this;
  }

  public DataAccessEndpointMVO href(String href) {
    super.href(href);
    return this;
  }

  public DataAccessEndpointMVO uuid(String uuid) {
    super.uuid(uuid);
    return this;
  }

  public DataAccessEndpointMVO category(String category) {
    super.category(category);
    return this;
  }

  public DataAccessEndpointMVO description(String description) {
    super.description(description);
    return this;
  }

  public DataAccessEndpointMVO name(String name) {
    super.name(name);
    return this;
  }

  public DataAccessEndpointMVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public DataAccessEndpointMVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public DataAccessEndpointMVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public DataAccessEndpointMVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public DataAccessEndpointMVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public DataAccessEndpointMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public DataAccessEndpointMVO note(List<NoteMVO> note) {
    super.note(note);
    return this;
  }

  public DataAccessEndpointMVO addNoteItem(NoteMVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public DataAccessEndpointMVO resourceOrderItem(List<RelatedResourceOrderItemMVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public DataAccessEndpointMVO addResourceOrderItemItem(RelatedResourceOrderItemMVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public DataAccessEndpointMVO place(List<RelatedPlaceRefMVO> place) {
    super.place(place);
    return this;
  }

  public DataAccessEndpointMVO addPlaceItem(RelatedPlaceRefMVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public DataAccessEndpointMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public DataAccessEndpointMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public DataAccessEndpointMVO resourceRelationship(List<ResourceRelationshipMVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public DataAccessEndpointMVO addResourceRelationshipItem(ResourceRelationshipMVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public DataAccessEndpointMVO resourceCharacteristic(List<CharacteristicMVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public DataAccessEndpointMVO addResourceCharacteristicItem(CharacteristicMVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public DataAccessEndpointMVO attachment(List<AttachmentRefMVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public DataAccessEndpointMVO addAttachmentItem(AttachmentRefMVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public DataAccessEndpointMVO resourceSpecification(ResourceSpecificationRefMVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public DataAccessEndpointMVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public DataAccessEndpointMVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public DataAccessEndpointMVO activationFeature(List<FeatureMVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public DataAccessEndpointMVO addActivationFeatureItem(FeatureMVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public DataAccessEndpointMVO intent(IntentRefMVO intent) {
    super.intent(intent);
    return this;
  }

  public DataAccessEndpointMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public DataAccessEndpointMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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
    DataAccessEndpointMVO dataAccessEndpointMVO = (DataAccessEndpointMVO) o;
    return Objects.equals(this.uri, dataAccessEndpointMVO.uri) &&
        Objects.equals(this.uriQueryFilter, dataAccessEndpointMVO.uriQueryFilter) &&
        Objects.equals(this.apiType, dataAccessEndpointMVO.apiType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uriQueryFilter, apiType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAccessEndpointMVO {\n");
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

