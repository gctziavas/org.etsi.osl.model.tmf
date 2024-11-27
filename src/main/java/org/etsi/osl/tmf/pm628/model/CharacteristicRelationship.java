package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootEntity;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * CharacteristicRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_CharRel")
public class CharacteristicRelationship extends BaseRootEntity {

    @JsonProperty("relationshipType")
    private String relationshipType;

    public CharacteristicRelationship() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CharacteristicRelationship(String type) {
        this.type = type;
    }

    public CharacteristicRelationship type(String type) {
        this.type = type;
        return this;
    }

    public CharacteristicRelationship relationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * The type of relationship
     * @return relationshipType
     */

    @Schema(name = "relationshipType", description = "The type of relationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        CharacteristicRelationship characteristicRelationship = (CharacteristicRelationship) o;
        return Objects.equals(this.type, characteristicRelationship.type) &&
                Objects.equals(this.baseType, characteristicRelationship.baseType) &&
                Objects.equals(this.schemaLocation, characteristicRelationship.schemaLocation) &&
                Objects.equals(this.uuid, characteristicRelationship.uuid) &&
                Objects.equals(this.relationshipType, characteristicRelationship.relationshipType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, baseType, schemaLocation, uuid, relationshipType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacteristicRelationship {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
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