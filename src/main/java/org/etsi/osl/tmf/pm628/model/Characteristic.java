package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Characteristic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_Characteristic")
public class Characteristic extends BaseRootNamedEntity {

    @JsonProperty("valueType")
    private String valueType;

    @JsonProperty("characteristicRelationship")
    @Valid
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinTable(
            name = "pm628_char_char_rel",
            joinColumns = @JoinColumn(name = "char_uuid"),
            inverseJoinColumns = @JoinColumn(name = "char_rel_uuid")
    )
    private List<CharacteristicRelationship> characteristicRelationship = new ArrayList<>();

    public Characteristic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Characteristic(String type) {
        this.type = type;
    }

    public Characteristic valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Data type of the value of the characteristic
     * @return valueType
     */

    @Schema(name = "valueType", description = "Data type of the value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("valueType")
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Characteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
        this.characteristicRelationship = characteristicRelationship;
        return this;
    }

    public Characteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
        if (this.characteristicRelationship == null) {
            this.characteristicRelationship = new ArrayList<>();
        }
        this.characteristicRelationship.add(characteristicRelationshipItem);
        return this;
    }

    /**
     * Collection of characteristic relationships
     * @return characteristicRelationship
     */
    @Valid
    @Schema(name = "characteristicRelationship", description = "Collection of characteristic relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("characteristicRelationship")
    public List<CharacteristicRelationship> getCharacteristicRelationship() {
        return characteristicRelationship;
    }

    public void setCharacteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
        this.characteristicRelationship = characteristicRelationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Characteristic characteristic = (Characteristic) o;
        return Objects.equals(this.type, characteristic.type) &&
                Objects.equals(this.baseType, characteristic.baseType) &&
                Objects.equals(this.schemaLocation, characteristic.schemaLocation) &&
                Objects.equals(this.uuid, characteristic.uuid) &&
                Objects.equals(this.name, characteristic.name) &&
                Objects.equals(this.valueType, characteristic.valueType) &&
                Objects.equals(this.characteristicRelationship, characteristic.characteristicRelationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, baseType, schemaLocation, uuid, name, valueType, characteristicRelationship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Characteristic {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    characteristicRelationship: ").append(toIndentedString(characteristicRelationship)).append("\n");
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