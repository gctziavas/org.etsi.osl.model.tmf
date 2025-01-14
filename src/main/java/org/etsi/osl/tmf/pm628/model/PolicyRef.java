package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PolicyRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PolicyRef")
public class PolicyRef extends BaseRootNamedEntity {

  @JsonProperty("@referredType")
  private String referredType;

  @JsonProperty("version")
  private String version;

  public PolicyRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PolicyRef(String type, String uuid) {
    this.type = type;
    this.uuid = uuid;
  }

  public PolicyRef referredType(String referredType) {
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

  public PolicyRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PolicyRef policyRef = (PolicyRef) o;
    return Objects.equals(this.type, policyRef.type) &&
        Objects.equals(this.baseType, policyRef.baseType) &&
        Objects.equals(this.schemaLocation, policyRef.schemaLocation) &&
        Objects.equals(this.href, policyRef.href) &&
        Objects.equals(this.uuid, policyRef.uuid) &&
        Objects.equals(this.name, policyRef.name) &&
        Objects.equals(this.referredType, policyRef.referredType) &&
        Objects.equals(this.version, policyRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, referredType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRef {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

