package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * GeographicSubAddressUnit
 */

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSubAddressUnit {
  @JsonProperty("@schemaLocation")
  private String schemaLocation;
  @JsonProperty("@baseType")
  private String baseType;
  @JsonProperty("@type")
  private String type;
  @JsonProperty("subUnitNumber")
  private String subUnitNumber;
  @JsonProperty("subUnitType")
  private String subUnitType;

  public GeographicSubAddressUnit() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSubAddressUnit(String subUnitNumber, String subUnitType) {
    this.subUnitNumber = subUnitNumber;
    this.subUnitType = subUnitType;
  }

  public GeographicSubAddressUnit atSchemaLocation(String atSchemaLocation) {
    this.schemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAtSchemaLocation() {
    return schemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.schemaLocation = atSchemaLocation;
  }

  public GeographicSubAddressUnit atBaseType(String atBaseType) {
    this.baseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAtBaseType() {
    return baseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.baseType = atBaseType;
  }

  public GeographicSubAddressUnit atType(String atType) {
    this.type = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAtType() {
    return type;
  }

  public void setAtType(String atType) {
    this.type = atType;
  }

  public GeographicSubAddressUnit subUnitNumber(String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
    return this;
  }

  /**
   * The discriminator used for the subunit, often just a simple number but may also be a range.
   * @return subUnitNumber
  */
  @NotNull 
  @Schema(name = "subUnitNumber", description = "The discriminator used for the subunit, often just a simple number but may also be a range.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSubUnitNumber() {
    return subUnitNumber;
  }

  public void setSubUnitNumber(String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
  }

  public GeographicSubAddressUnit subUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
    return this;
  }

  /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF, RACK
   * @return subUnitType
  */
  @NotNull
  @Schema(name = "subUnitType", description = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF, RACK", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSubUnitType() {
    return subUnitType;
  }

  public void setSubUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSubAddressUnit geographicSubAddressUnit = (GeographicSubAddressUnit) o;
    return Objects.equals(this.schemaLocation, geographicSubAddressUnit.schemaLocation) &&
        Objects.equals(this.baseType, geographicSubAddressUnit.baseType) &&
        Objects.equals(this.type, geographicSubAddressUnit.type) &&
        Objects.equals(this.subUnitNumber, geographicSubAddressUnit.subUnitNumber) &&
        Objects.equals(this.subUnitType, geographicSubAddressUnit.subUnitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, baseType, type, subUnitNumber, subUnitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSubAddressUnit {\n");
    sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    @type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subUnitNumber: ").append(toIndentedString(subUnitNumber)).append("\n");
    sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
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

