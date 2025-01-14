package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceMeasurementRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PerformanceMeasurementRef implements PerformanceMeasurementRefOrValue {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  private String name;

  private String atReferredType;

  private String version;

  public PerformanceMeasurementRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceMeasurementRef(String atType, String id) {
    this.atType = atType;
    this.id = id;
  }

  public PerformanceMeasurementRef atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public PerformanceMeasurementRef atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PerformanceMeasurementRef atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public PerformanceMeasurementRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The URI of the referred entity.
   * @return href
  */
  
  @Schema(name = "href", description = "The URI of the referred entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PerformanceMeasurementRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the referred entity.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The identifier of the referred entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PerformanceMeasurementRef name(String name) {
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

  public PerformanceMeasurementRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  public PerformanceMeasurementRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the PerformanceMeasurement
   * @return version
  */
  
  @Schema(name = "version", description = "Version of the PerformanceMeasurement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PerformanceMeasurementRef performanceMeasurementRef = (PerformanceMeasurementRef) o;
    return Objects.equals(this.atType, performanceMeasurementRef.atType) &&
        Objects.equals(this.atBaseType, performanceMeasurementRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, performanceMeasurementRef.atSchemaLocation) &&
        Objects.equals(this.href, performanceMeasurementRef.href) &&
        Objects.equals(this.id, performanceMeasurementRef.id) &&
        Objects.equals(this.name, performanceMeasurementRef.name) &&
        Objects.equals(this.atReferredType, performanceMeasurementRef.atReferredType) &&
        Objects.equals(this.version, performanceMeasurementRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, atReferredType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceMeasurementRef {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

