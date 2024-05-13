package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.etsi.osl.tmf.prm669.model.RelatedParty;


/**
 * GeographicSiteCreate
 */

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSiteCreate extends BaseRootEntity {

  @JsonProperty("code")
  private String code;
  @JsonProperty("description")
  private String description;

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

  public GeographicSiteCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteCreate(String atType) {
    this.type = atType;
  }

  public GeographicSiteCreate atType(String atType) {
    this.type = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @NotNull
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return type;
  }

  public void setAtType(String atType) {
    this.type = atType;
  }

  public GeographicSiteCreate atBaseType(String atBaseType) {
    this.baseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return baseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.baseType = atBaseType;
  }

  public GeographicSiteCreate atSchemaLocation(String atSchemaLocation) {
    this.schemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return schemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.schemaLocation = atSchemaLocation;
  }

  public GeographicSiteCreate code(String code) {
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

  public GeographicSiteCreate description(String description) {
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

  public GeographicSiteCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public GeographicSiteCreate externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicSiteCreate addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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

  public GeographicSiteCreate calendar(List<CalendarPeriod> calendar) {
    this.calendar = calendar;
    return this;
  }

  public GeographicSiteCreate addCalendarItem(CalendarPeriod calendarItem) {
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

  public GeographicSiteCreate place(List<PlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public GeographicSiteCreate addPlaceItem(PlaceRefOrValue placeItem) {
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

  public GeographicSiteCreate siteRelationship(List<GeographicSiteRelationship> siteRelationship) {
    this.siteRelationship = siteRelationship;
    return this;
  }

  public GeographicSiteCreate addSiteRelationshipItem(GeographicSiteRelationship siteRelationshipItem) {
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
    GeographicSiteCreate geographicSiteCreate = (GeographicSiteCreate) o;
    return Objects.equals(this.type, geographicSiteCreate.type) &&
        Objects.equals(this.baseType, geographicSiteCreate.baseType) &&
        Objects.equals(this.schemaLocation, geographicSiteCreate.schemaLocation) &&
        Objects.equals(this.code, geographicSiteCreate.code) &&
        Objects.equals(this.description, geographicSiteCreate.description) &&
        Objects.equals(this.relatedParty, geographicSiteCreate.relatedParty) &&
        Objects.equals(this.externalIdentifier, geographicSiteCreate.externalIdentifier) &&
        Objects.equals(this.calendar, geographicSiteCreate.calendar) &&
        Objects.equals(this.place, geographicSiteCreate.place) &&
        Objects.equals(this.siteRelationship, geographicSiteCreate.siteRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, code, description, relatedParty, externalIdentifier, calendar, place, siteRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteCreate {\n");
    sb.append("    @type: ").append(toIndentedString(type)).append("\n");
    sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

