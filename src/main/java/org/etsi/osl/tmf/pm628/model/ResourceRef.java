package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Resource reference, for when Resource is used by other entities.
 */

@Schema(name = "ResourceRef", description = "Resource reference, for when Resource is used by other entities.")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_ResourceRef")
public class ResourceRef extends BaseRootNamedEntity implements ResourceRefOrValue {

  @JsonProperty("@referredType")
  private String referredType;

  public ResourceRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceRef(String type, String uuid) {
    this.type = type;
    this.uuid = uuid;
  }

  public ResourceRef referredType(String referredType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRef resourceRef = (ResourceRef) o;
    return Objects.equals(this.type, resourceRef.type) &&
        Objects.equals(this.baseType, resourceRef.baseType) &&
        Objects.equals(this.schemaLocation, resourceRef.schemaLocation) &&
        Objects.equals(this.href, resourceRef.href) &&
        Objects.equals(this.uuid, resourceRef.uuid) &&
        Objects.equals(this.name, resourceRef.name) &&
        Objects.equals(this.referredType, resourceRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRef {\n");
    sb.append("    atType: ").append(toIndentedString(type)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

