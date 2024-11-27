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
 * DataFilterMapFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterMapFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("mappings")
  @Valid
  private List<@Valid DataFilterMapItemFVO> mappings = new ArrayList<>();

  public DataFilterMapFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataFilterMapFVO(String type) {
    this.type = type;
  }

  public DataFilterMapFVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataFilterMapFVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public DataFilterMapFVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public DataFilterMapFVO mappings(List<@Valid DataFilterMapItemFVO> mappings) {
    this.mappings = mappings;
    return this;
  }

  public DataFilterMapFVO addMappingsItem(DataFilterMapItemFVO mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

  /**
   * Get mappings
   * @return mappings
  */
  @Valid 
  @Schema(name = "mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mappings")
  public List<@Valid DataFilterMapItemFVO> getMappings() {
    return mappings;
  }

  public void setMappings(List<@Valid DataFilterMapItemFVO> mappings) {
    this.mappings = mappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFilterMapFVO dataFilterMapFVO = (DataFilterMapFVO) o;
    return Objects.equals(this.type, dataFilterMapFVO.type) &&
        Objects.equals(this.baseType, dataFilterMapFVO.baseType) &&
        Objects.equals(this.schemaLocation, dataFilterMapFVO.schemaLocation) &&
        Objects.equals(this.mappings, dataFilterMapFVO.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterMapFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

