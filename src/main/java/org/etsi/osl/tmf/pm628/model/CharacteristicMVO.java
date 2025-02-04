package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CharacteristicMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class CharacteristicMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("characteristicRelationship")
  @Valid
  private List<CharacteristicRelationshipMVO> characteristicRelationship = new ArrayList<>();

  public CharacteristicMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicMVO(String type) {
    this.type = type;
  }

  public CharacteristicMVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CharacteristicMVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public CharacteristicMVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public CharacteristicMVO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Unique identifier of the characteristic
   * @return id
  */
  
  @Schema(name = "uuid", description = "Unique identifier of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public CharacteristicMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacteristicMVO valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Data type of the value of the characteristic
   * @return valueType
  */
  
  @Schema(name = "valueType", description = "Data type of the value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicMVO characteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
    return this;
  }

  public CharacteristicMVO addCharacteristicRelationshipItem(CharacteristicRelationshipMVO characteristicRelationshipItem) {
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
  public List<CharacteristicRelationshipMVO> getCharacteristicRelationship() {
    return characteristicRelationship;
  }

  public void setCharacteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
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
    CharacteristicMVO characteristicMVO = (CharacteristicMVO) o;
    return Objects.equals(this.type, characteristicMVO.type) &&
        Objects.equals(this.baseType, characteristicMVO.baseType) &&
        Objects.equals(this.schemaLocation, characteristicMVO.schemaLocation) &&
        Objects.equals(this.uuid, characteristicMVO.uuid) &&
        Objects.equals(this.name, characteristicMVO.name) &&
        Objects.equals(this.valueType, characteristicMVO.valueType) &&
        Objects.equals(this.characteristicRelationship, characteristicMVO.characteristicRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, name, valueType, characteristicRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicMVO {\n");
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

