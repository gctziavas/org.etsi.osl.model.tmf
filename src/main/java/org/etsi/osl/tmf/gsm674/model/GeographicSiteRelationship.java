package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.etsi.osl.tmf.common.model.TimePeriod;

import java.util.Objects;

@Entity(name="GeographicSiteRelationship")
public class GeographicSiteRelationship extends BaseRootEntity {
    @JsonProperty("relationshipType")
    private String relationshipType;
    @JsonProperty("role")
    private String role;
    @JsonProperty("id")
    private String id;

    @JsonProperty("validFor")
    private TimePeriod validFor;

    public GeographicSiteRelationship() {
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GeographicSiteRelationship that = (GeographicSiteRelationship) o;
        return Objects.equals(relationshipType, that.relationshipType) && Objects.equals(role, that.role) && Objects.equals(id, that.id) && Objects.equals(validFor, that.validFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationshipType, role, id, validFor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSiteRelationship {\n");
        sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
