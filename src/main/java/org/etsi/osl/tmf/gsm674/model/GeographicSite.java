package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "GeographicSite")
public class GeographicSite extends BaseRootEntity implements PatchGeographicSite200Response {
    @JsonProperty("creationDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private String status;
    @JsonProperty("externalIdentifier")
    private List<ExternalIdentifier> externalIdentifier = new ArrayList<>();
    @JsonProperty("calendar")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<CalendarPeriod> calendar = new ArrayList<>();
    @JsonProperty("place")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<PlaceRefOrValue> place = new ArrayList<>();
    @JsonProperty("siteRelationship")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<GeographicSiteRelationship> siteRelationship = new ArrayList<>();
    @JsonProperty("relatedParty")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<RelatedParty> relatedParty = new ArrayList<>();


    public GeographicSite() {
        super();
    }


    public GeographicSite code(String code) {
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

    public GeographicSite creationDate(OffsetDateTime creationDate) {
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

    public GeographicSite description(String description) {
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

    public GeographicSite status(String status) {
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

    public GeographicSite relatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public GeographicSite addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

    public GeographicSite externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
        return this;
    }

    public GeographicSite addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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

    public GeographicSite calendar(List<CalendarPeriod> calendar) {
        this.calendar = calendar;
        return this;
    }

    public GeographicSite addCalendarItem(CalendarPeriod calendarItem) {
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

    public GeographicSite place(List<PlaceRefOrValue> place) {
        this.place = place;
        return this;
    }

    public GeographicSite addPlaceItem(PlaceRefOrValue placeItem) {
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

    public GeographicSite siteRelationship(List<GeographicSiteRelationship> siteRelationship) {
        this.siteRelationship = siteRelationship;
        return this;
    }

    public GeographicSite addSiteRelationshipItem(GeographicSiteRelationship siteRelationshipItem) {
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
        GeographicSite geographicSite = (GeographicSite) o;
        return Objects.equals(this.code, geographicSite.code) &&
                Objects.equals(this.creationDate, geographicSite.creationDate) &&
                Objects.equals(this.description, geographicSite.description) &&
                Objects.equals(this.status, geographicSite.status) &&
                Objects.equals(this.relatedParty, geographicSite.relatedParty) &&
                Objects.equals(this.externalIdentifier, geographicSite.externalIdentifier) &&
                Objects.equals(this.calendar, geographicSite.calendar) &&
                Objects.equals(this.place, geographicSite.place) &&
                Objects.equals(this.siteRelationship, geographicSite.siteRelationship) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, creationDate, description, status, relatedParty, externalIdentifier, calendar, place, siteRelationship, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSite {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
