package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.etsi.osl.tmf.prm669.model.RelatedParty;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "GeographicSite")
public class GeographicSite extends BaseRootNamedEntity {

    @JsonProperty("id")
    private String id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private String status;

    @JsonProperty("calendar")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private Set<CalendarPeriod> calendar = new HashSet<>();

    @JsonProperty("place")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private Set<PlaceRefOrValue> placeRefOrValue = new HashSet<>();

    @JsonProperty("siteRelationship")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private Set<GeographicSiteRelationship> geographicSiteRelationship = new HashSet<>();

    @JsonProperty("relatedParty")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private Set<RelatedParty> relatedParties = new HashSet<>();

    public GeographicSite addCalendarPeriod(CalendarPeriod calendarPeriod){
        if(this.calendar==null){
            this.calendar=new HashSet<>();
        }
        this.calendar.add(calendarPeriod);
        return this;
    }

    public GeographicSite addPlaceRefOrValue(PlaceRefOrValue placeRefOrValue){
        if(this.placeRefOrValue==null){
            this.placeRefOrValue=new HashSet<>();
        }
        this.placeRefOrValue.add(placeRefOrValue);
        return this;
    }

    public GeographicSite addGeographicSiteRelationship(GeographicSiteRelationship geographicSiteRelationship){
        if (this.geographicSiteRelationship==null){
            this.geographicSiteRelationship=new HashSet<>();

        }
        this.geographicSiteRelationship.add(geographicSiteRelationship);
        return this;
    }

    public GeographicSite addRelatedParty(RelatedParty relatedParty){
        if(this.relatedParties==null){
            this.relatedParties=new HashSet<>();
        }
        this.relatedParties.add(relatedParty);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GeographicSite that = (GeographicSite) o;
        return Objects.equals(id, that.id) && Objects.equals(code, that.code) && Objects.equals(description, that.description) && Objects.equals(name, that.name) && Objects.equals(status, that.status) && Objects.equals(calendar, that.calendar) && Objects.equals(placeRefOrValue, that.placeRefOrValue) && Objects.equals(geographicSiteRelationship, that.geographicSiteRelationship) && Objects.equals(relatedParties, that.relatedParties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, description, name, status, calendar, placeRefOrValue, geographicSiteRelationship, relatedParties);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<CalendarPeriod> getCalendar() {
        return calendar;
    }

    public void setCalendar(Set<CalendarPeriod> calendar) {
        this.calendar = calendar;
    }

    public Set<PlaceRefOrValue> getPlaceRefOrValue() {
        return placeRefOrValue;
    }

    public void setPlaceRefOrValue(Set<PlaceRefOrValue> placeRefOrValue) {
        this.placeRefOrValue = placeRefOrValue;
    }

    public Set<GeographicSiteRelationship> getGeographicSiteRelationship() {
        return geographicSiteRelationship;
    }

    public void setGeographicSiteRelationship(Set<GeographicSiteRelationship> geographicSiteRelationship) {
        this.geographicSiteRelationship = geographicSiteRelationship;
    }

    public Set<RelatedParty> getRelatedParties() {
        return relatedParties;
    }

    public void setRelatedParties(Set<RelatedParty> relatedParties) {
        this.relatedParties = relatedParties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSite {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
        sb.append("    place: ").append(toIndentedString(placeRefOrValue)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParties)).append("\n");
        sb.append("    siteRelationship: ").append(toIndentedString(geographicSiteRelationship)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
