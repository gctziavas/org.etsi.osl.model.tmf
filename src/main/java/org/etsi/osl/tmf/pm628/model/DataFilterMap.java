package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DataFilterMap
 */

@Embeddable
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterMap {

  @JsonProperty("@type")
  @Column(name = "dfm_type")
  private String type;

  @JsonProperty("@baseType")
  @Column(name = "dfm_base_type")
  private String baseType;

  @JsonProperty("@schemaLocation")
  @Column(name = "dfm_schema_location")
  private String schemaLocation;

  @ElementCollection(targetClass = DataFilterMapItem.class)
  @JsonProperty("mappings")
  private List<@Valid DataFilterMapItem> mappings = new ArrayList<>();

  public DataFilterMap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataFilterMap(String type) {
    this.type = type;
  }

  public DataFilterMap type(String type) {
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

  public DataFilterMap baseType(String baseType) {
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

  public DataFilterMap schemaLocation(String schemaLocation) {
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


  public DataFilterMap mappings(List<@Valid DataFilterMapItem> mappings) {
    this.mappings = mappings;
    return this;
  }

  public DataFilterMap addMappingsItem(DataFilterMapItem mappingsItem) {
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
  public List<@Valid DataFilterMapItem> getMappings() {
    return mappings;
  }

  public void setMappings(List<@Valid DataFilterMapItem> mappings) {
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
    DataFilterMap dataFilterMap = (DataFilterMap) o;
    return Objects.equals(this.type, dataFilterMap.type) &&
        Objects.equals(this.baseType, dataFilterMap.baseType) &&
        Objects.equals(this.schemaLocation, dataFilterMap.schemaLocation) &&
        Objects.equals(this.mappings, dataFilterMap.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterMap {\n");
    sb.append("    atType: ").append(toIndentedString(type)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

