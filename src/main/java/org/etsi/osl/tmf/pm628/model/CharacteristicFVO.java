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
 * CharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class CharacteristicFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("name")
  private String name;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("characteristicRelationship")
  @Valid
  private List<CharacteristicRelationshipFVO> characteristicRelationship = new ArrayList<>();

  public CharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicFVO(String type) {
    this.type = type;
  }

  public CharacteristicFVO type(String type) {
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

  public CharacteristicFVO baseType(String baseType) {
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

  public CharacteristicFVO schemaLocation(String schemaLocation) {
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

  public CharacteristicFVO name(String name) {
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

  public CharacteristicFVO valueType(String valueType) {
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

  public CharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
    return this;
  }

  public CharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
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
  public List<CharacteristicRelationshipFVO> getCharacteristicRelationship() {
    return characteristicRelationship;
  }

  public void setCharacteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
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
    CharacteristicFVO characteristicFVO = (CharacteristicFVO) o;
    return Objects.equals(this.type, characteristicFVO.type) &&
        Objects.equals(this.baseType, characteristicFVO.baseType) &&
        Objects.equals(this.schemaLocation, characteristicFVO.schemaLocation) &&
        Objects.equals(this.name, characteristicFVO.name) &&
        Objects.equals(this.valueType, characteristicFVO.valueType) &&
        Objects.equals(this.characteristicRelationship, characteristicFVO.characteristicRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, name, valueType, characteristicRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

