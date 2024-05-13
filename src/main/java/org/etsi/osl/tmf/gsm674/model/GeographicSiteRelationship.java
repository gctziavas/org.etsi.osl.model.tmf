package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GeographicSiteRelationship(String id, String relationshipType) {
        this.id = id;
        this.relationshipType = relationshipType;
    }

    /**
     * Role of the related site in the relationship
     * @return role
     */

    @Schema(name = "role", description = "Role of the related site in the relationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public GeographicSiteRelationship validFor(TimePeriod validFor) {
        this.validFor = validFor;
        return this;
    }

    /**
     * Get validFor
     * @return validFor
     */
    @Valid
    @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("validFor")
    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public GeographicSiteRelationship id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the related site entity within the server
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier of the related site entity within the server", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GeographicSiteRelationship relationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * Type of relationship
     * @return relationshipType
     */
    @NotNull
    @Schema(name = "relationshipType", description = "Type of relationship", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("relationshipType")
    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicSiteRelationship geographicSiteRelationship = (GeographicSiteRelationship) o;
        return Objects.equals(this.schemaLocation, geographicSiteRelationship.schemaLocation) &&
                Objects.equals(this.baseType, geographicSiteRelationship.baseType) &&
                Objects.equals(this.type, geographicSiteRelationship.type) &&
                Objects.equals(this.href, geographicSiteRelationship.href) &&
                Objects.equals(this.role, geographicSiteRelationship.role) &&
                Objects.equals(this.validFor, geographicSiteRelationship.validFor) &&
                Objects.equals(this.id, geographicSiteRelationship.id) &&
                Objects.equals(this.relationshipType, geographicSiteRelationship.relationshipType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, baseType, type, href, role, validFor, id, relationshipType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSiteRelationship {\n");
        sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    @type: ").append(toIndentedString(type)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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
