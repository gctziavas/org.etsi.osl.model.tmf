package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * DataFilterTemplateFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterTemplateFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  public DataFilterTemplateFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataFilterTemplateFVO(String type) {
    this.type = type;
  }

  public DataFilterTemplateFVO type(String type) {
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

  public DataFilterTemplateFVO baseType(String baseType) {
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

  public DataFilterTemplateFVO schemaLocation(String schemaLocation) {
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

  public DataFilterTemplateFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to this DataFilterTemplate
   * @return name
  */
  
  @Schema(name = "name", description = "Name given to this DataFilterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataFilterTemplateFVO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this DataFilterTemplate
   * @return description
  */
  
  @Schema(name = "description", description = "Description of this DataFilterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DataFilterTemplateFVO dataFilterTemplateFVO = (DataFilterTemplateFVO) o;
    return Objects.equals(this.type, dataFilterTemplateFVO.type) &&
        Objects.equals(this.baseType, dataFilterTemplateFVO.baseType) &&
        Objects.equals(this.schemaLocation, dataFilterTemplateFVO.schemaLocation) &&
        Objects.equals(this.name, dataFilterTemplateFVO.name) &&
        Objects.equals(this.description, dataFilterTemplateFVO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterTemplateFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

