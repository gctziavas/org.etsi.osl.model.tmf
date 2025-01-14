package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * DataFilterTemplateMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterTemplateMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("href")
  protected String href = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  public DataFilterTemplateMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataFilterTemplateMVO(String type) {
    this.type = type;
  }

  public DataFilterTemplateMVO type(String type) {
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

  public DataFilterTemplateMVO baseType(String baseType) {
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

  public DataFilterTemplateMVO schemaLocation(String schemaLocation) {
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

  /**
   * Unique reference of the entity
   *
   * @return href
   **/
  @Schema(description = "Unique reference of the entity")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public DataFilterTemplateMVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this DataFilterTemplate
   * @return id
  */

  @Schema(name = "id", example = "6c088cf7f1bc", description = "Unique identifier of this DataFilterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataFilterTemplateMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to this DataFilterTemplate
   * @return name
  */

  @Schema(name = "name", description = "Name given to this DataFilterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataFilterTemplateMVO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this DataFilterTemplate
   * @return description
  */

  @Schema(name = "description", description = "Description of this DataFilterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFilterTemplateMVO dataFilterTemplateMVO = (DataFilterTemplateMVO) o;
    return Objects.equals(this.type, dataFilterTemplateMVO.type) &&
        Objects.equals(this.baseType, dataFilterTemplateMVO.baseType) &&
        Objects.equals(this.schemaLocation, dataFilterTemplateMVO.schemaLocation) &&
        Objects.equals(this.id, dataFilterTemplateMVO.id) &&
        Objects.equals(this.name, dataFilterTemplateMVO.name) &&
        Objects.equals(this.description, dataFilterTemplateMVO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterTemplateMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

