package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.springframework.format.annotation.DateTimeFormat;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * GeographicSiteUpdate
 */


@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSiteUpdate {
  @JsonProperty("@type")
  private String atType;
  @JsonProperty("@baseType")
  private String atBaseType;
  @JsonProperty("@schemaLocation")
  private String atSchemaLocation;
  @JsonProperty("code")
  private String code;
  @JsonProperty("creationDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;
  @JsonProperty("description")
  private String description;
  @JsonProperty("status")
  private String status;

  @Valid
  @JsonProperty("relatedParty")
  private List<RelatedParty> relatedParty = new ArrayList<>();

  @Valid
  @JsonProperty("externalIdentifier")
  private List<ExternalIdentifier> externalIdentifier = new ArrayList<>();

  @Valid
  @JsonProperty("calendar")
  private List<CalendarPeriod> calendar = new ArrayList<>();

  @Valid
  @JsonProperty("place")
  private List<PlaceRefOrValue> place = new ArrayList<>();

  @Valid
  @JsonProperty("siteRelationship")
  private List<GeographicSiteRelationship> siteRelationship = new ArrayList<>();

  public GeographicSiteUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteUpdate(String atType) {
    this.atType = atType;
  }

  public GeographicSiteUpdate atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @NotNull
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public GeographicSiteUpdate atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public GeographicSiteUpdate atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public GeographicSiteUpdate code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A code that may be used for some addressing schemes eg: [ANSI T1.253-1999]
   * @return code
  */
  
  @Schema(name = "code", description = "A code that may be used for some addressing schemes eg: [ANSI T1.253-1999]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GeographicSiteUpdate creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time when the GeographicSite was created
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creationDate", description = "Date and time when the GeographicSite was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public GeographicSiteUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing additional information regarding the site
   * @return description
  */
  
  @Schema(name = "description", description = "Text describing additional information regarding the site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeographicSiteUpdate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The condition of the GeographicSite, such as planned, underConstruction, cancelled, active, inactive, former
   * @return status
  */
  
  @Schema(name = "status", description = "The condition of the GeographicSite, such as planned, underConstruction, cancelled, active, inactive, former", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GeographicSiteUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSiteUpdate externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicSiteUpdate addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * Get externalIdentifier
   * @return externalIdentifier
  */
  @Valid 
  @Schema(name = "externalIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ExternalIdentifier> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public GeographicSiteUpdate calendar(List<CalendarPeriod> calendar) {
    this.calendar = calendar;
    return this;
  }

  public GeographicSiteUpdate addCalendarItem(CalendarPeriod calendarItem) {
    if (this.calendar == null) {
      this.calendar = new ArrayList<>();
    }
    this.calendar.add(calendarItem);
    return this;
  }

  /**
   * Get calendar
   * @return calendar
  */
  @Valid 
  @Schema(name = "calendar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CalendarPeriod> getCalendar() {
    return calendar;
  }

  public void setCalendar(List<CalendarPeriod> calendar) {
    this.calendar = calendar;
  }

  public GeographicSiteUpdate place(List<PlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public GeographicSiteUpdate addPlaceItem(PlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
  */
  @Valid 
  @Schema(name = "place", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<PlaceRefOrValue> place) {
    this.place = place;
  }

  public GeographicSiteUpdate siteRelationship(List<GeographicSiteRelationship> siteRelationship) {
    this.siteRelationship = siteRelationship;
    return this;
  }

  public GeographicSiteUpdate addSiteRelationshipItem(GeographicSiteRelationship siteRelationshipItem) {
    if (this.siteRelationship == null) {
      this.siteRelationship = new ArrayList<>();
    }
    this.siteRelationship.add(siteRelationshipItem);
    return this;
  }

  /**
   * Get siteRelationship
   * @return siteRelationship
  */
  @Valid 
  @Schema(name = "siteRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<GeographicSiteRelationship> getSiteRelationship() {
    return siteRelationship;
  }

  public void setSiteRelationship(List<GeographicSiteRelationship> siteRelationship) {
    this.siteRelationship = siteRelationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSiteUpdate geographicSiteUpdate = (GeographicSiteUpdate) o;
    return Objects.equals(this.atType, geographicSiteUpdate.atType) &&
        Objects.equals(this.atBaseType, geographicSiteUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, geographicSiteUpdate.atSchemaLocation) &&
        Objects.equals(this.code, geographicSiteUpdate.code) &&
        Objects.equals(this.creationDate, geographicSiteUpdate.creationDate) &&
        Objects.equals(this.description, geographicSiteUpdate.description) &&
        Objects.equals(this.status, geographicSiteUpdate.status) &&
        Objects.equals(this.relatedParty, geographicSiteUpdate.relatedParty) &&
        Objects.equals(this.externalIdentifier, geographicSiteUpdate.externalIdentifier) &&
        Objects.equals(this.calendar, geographicSiteUpdate.calendar) &&
        Objects.equals(this.place, geographicSiteUpdate.place) &&
        Objects.equals(this.siteRelationship, geographicSiteUpdate.siteRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, code, creationDate, description, status, relatedParty, externalIdentifier, calendar, place, siteRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteUpdate {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    siteRelationship: ").append(toIndentedString(siteRelationship)).append("\n");
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

