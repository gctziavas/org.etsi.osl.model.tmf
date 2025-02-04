package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PerformanceIndicatorSpecificationRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PerfIndSpecRef")
public class PerformanceIndicatorSpecificationRef extends BaseRootNamedEntity implements PerformanceIndicatorSpecificationRefOrValue {

  @JsonProperty("@referredType")
  private String referredType;

  @JsonProperty("version")
  private String version;

  public PerformanceIndicatorSpecificationRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PerformanceIndicatorSpecificationRef(String type, String uuid) {
    this.type = type;
    this.uuid = uuid;
  }

  public PerformanceIndicatorSpecificationRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public PerformanceIndicatorSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the performance indicator specification
   * @return version
  */
  
  @Schema(name = "version", description = "Version of the performance indicator specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PerformanceIndicatorSpecificationRef performanceIndicatorSpecificationRef = (PerformanceIndicatorSpecificationRef) o;
    return Objects.equals(this.type, performanceIndicatorSpecificationRef.type) &&
        Objects.equals(this.baseType, performanceIndicatorSpecificationRef.baseType) &&
        Objects.equals(this.schemaLocation, performanceIndicatorSpecificationRef.schemaLocation) &&
        Objects.equals(this.href, performanceIndicatorSpecificationRef.href) &&
        Objects.equals(this.uuid, performanceIndicatorSpecificationRef.uuid) &&
        Objects.equals(this.name, performanceIndicatorSpecificationRef.name) &&
        Objects.equals(this.referredType, performanceIndicatorSpecificationRef.referredType) &&
        Objects.equals(this.version, performanceIndicatorSpecificationRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, referredType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorSpecificationRef {\n");
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

