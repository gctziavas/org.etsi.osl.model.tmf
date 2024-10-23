package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecificationRefMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceIndicatorSpecificationRefMVO implements PerformanceIndicatorSpecificationRefOrValueMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("href")
  private String href;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("@referredType")
  private String referredType;

  @JsonProperty("version")
  private String version;

  public PerformanceIndicatorSpecificationRefMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecificationRefMVO(String type) {
    this.type = type;
  }

  public PerformanceIndicatorSpecificationRefMVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
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

  public PerformanceIndicatorSpecificationRefMVO baseType(String atBaseType) {
    this.baseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public PerformanceIndicatorSpecificationRefMVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getschemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public PerformanceIndicatorSpecificationRefMVO href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PerformanceIndicatorSpecificationRefMVO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The identifier of the referred entity.
   * @return id
  */
  
  @Schema(name = "id", description = "The identifier of the referred entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public PerformanceIndicatorSpecificationRefMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referred entity.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the referred entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PerformanceIndicatorSpecificationRefMVO referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public PerformanceIndicatorSpecificationRefMVO version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the performance indicator specification
   * @return version
  */
  
  @Schema(name = "version", description = "Version of the performance indicator specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorSpecificationRefMVO performanceIndicatorSpecificationRefMVO = (PerformanceIndicatorSpecificationRefMVO) o;
    return Objects.equals(this.type, performanceIndicatorSpecificationRefMVO.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecificationRefMVO.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecificationRefMVO.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecificationRefMVO.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecificationRefMVO.uuid) &&
        Objects.equals(this.name, performanceIndicatorSpecificationRefMVO.name) &&
        Objects.equals(this.referredType, performanceIndicatorSpecificationRefMVO.referredType) &&
        Objects.equals(this.version, performanceIndicatorSpecificationRefMVO.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, referredType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecificationRefMVO {\n");
    sb.append("    atType: ").append(toIndentedString(type)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

