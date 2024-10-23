package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.AttachmentRef;
import org.etsi.osl.tmf.common.model.TimePeriod;
import org.etsi.osl.tmf.common.model.service.Note;
import org.etsi.osl.tmf.rcm634.model.ResourceSpecificationRef;
import org.etsi.osl.tmf.ri639.model.ResourceAdministrativeStateType;
import org.etsi.osl.tmf.ri639.model.ResourceOperationalStateType;
import org.etsi.osl.tmf.ri639.model.ResourceUsageStateType;

import javax.annotation.Generated;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * DataAccessEndpoint
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_DAE")
public class DataAccessEndpoint extends LogicalResource {

  @JsonProperty("uri")
  private URI uri;

  @Embedded
  @JsonProperty("uriQueryFilter")
  private DataFilterMap uriQueryFilter;

  @JsonProperty("apiType")
  private String apiType;

  public DataAccessEndpoint() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataAccessEndpoint(String atType) {
    super(atType);
  }

  public DataAccessEndpoint uri(URI uri) {
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

  public DataAccessEndpoint uriQueryFilter(DataFilterMap uriQueryFilter) {
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
  public DataFilterMap getUriQueryFilter() {
    return uriQueryFilter;
  }

  public void setUriQueryFilter(DataFilterMap uriQueryFilter) {
    this.uriQueryFilter = uriQueryFilter;
  }

  public DataAccessEndpoint apiType(String apiType) {
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


  public DataAccessEndpoint value(String value) {
    super.value(value);
    return this;
  }

  public DataAccessEndpoint category(String category) {
    super.category(category);
    return this;
  }

  public DataAccessEndpoint description(String description) {
    super.description(description);
    return this;
  }

  public DataAccessEndpoint name(String name) {
    super.name(name);
    return this;
  }

  public DataAccessEndpoint endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public DataAccessEndpoint administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public DataAccessEndpoint operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public DataAccessEndpoint resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public DataAccessEndpoint usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public DataAccessEndpoint validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public DataAccessEndpoint note(List<Note> note) {
    super.note(note);
    return this;
  }

  public DataAccessEndpoint addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public DataAccessEndpoint resourceOrderItem(List<RelatedResourceOrderItem> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public DataAccessEndpoint addResourceOrderItemItem(RelatedResourceOrderItem resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public DataAccessEndpoint place(List<RelatedPlaceRef> place) {
    super.place(place);
    return this;
  }

  public DataAccessEndpoint addPlaceItem(RelatedPlaceRef placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public DataAccessEndpoint relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public DataAccessEndpoint addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public DataAccessEndpoint resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public DataAccessEndpoint addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public DataAccessEndpoint resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public DataAccessEndpoint addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public DataAccessEndpoint attachment(List<AttachmentRef> attachment) {
    super.attachment(attachment);
    return this;
  }

  public DataAccessEndpoint addAttachmentItem(AttachmentRef attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public DataAccessEndpoint resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public DataAccessEndpoint startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public DataAccessEndpoint resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public DataAccessEndpoint activationFeature(List<Feature> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public DataAccessEndpoint addActivationFeatureItem(Feature activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public DataAccessEndpoint intent(IntentRef intent) {
    super.intent(intent);
    return this;
  }

  public DataAccessEndpoint externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public DataAccessEndpoint addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    DataAccessEndpoint dataAccessEndpoint = (DataAccessEndpoint) o;
    return Objects.equals(this.uri, dataAccessEndpoint.uri) &&
        Objects.equals(this.uriQueryFilter, dataAccessEndpoint.uriQueryFilter) &&
        Objects.equals(this.apiType, dataAccessEndpoint.apiType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uriQueryFilter, apiType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAccessEndpoint {\n");
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

