package org.etsi.osl.tmf.pim637.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

/**
 * Related Entity reference. A related place defines a place described by reference or by value linked to a specific entity. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the place entity and not the RelatedPlaceRefOrValue class itself
 */
@Schema(description = "Related Entity reference. A related place defines a place described by reference or by value linked to a specific entity. The polymorphic attributes @type, @schemaLocation & @referredType are related to the place entity and not the RelatedPlaceRefOrValue class itself")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")

@Entity(name = "RelPlaceROrV637")
public class RelatedPlaceRefOrValue  extends BaseRootNamedEntity {
  @JsonProperty("id")
  private String id = null;


  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public RelatedPlaceRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the place
   * @return id
   **/
  @Schema(description = "Unique identifier of the place")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPlaceRefOrValue href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Unique reference of the place
   * @return href
   **/
  @Schema(description = "Unique reference of the place")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedPlaceRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]
   * @return name
   **/
  @Schema(description = "A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedPlaceRefOrValue role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
   **/
  @Schema(description = "The actual type of the target instance when needed for disambiguation.")
      @NotNull

    public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPlaceRefOrValue relatedPlaceRefOrValue = (RelatedPlaceRefOrValue) o;
    return Objects.equals(this.id, relatedPlaceRefOrValue.id) &&
        Objects.equals(this.href, relatedPlaceRefOrValue.href) &&
        Objects.equals(this.name, relatedPlaceRefOrValue.name) &&
        Objects.equals(this.role, relatedPlaceRefOrValue.role) &&
        Objects.equals(this.baseType, relatedPlaceRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, relatedPlaceRefOrValue.schemaLocation) &&
        Objects.equals(this.type, relatedPlaceRefOrValue.type) &&
        Objects.equals(this._atReferredType, relatedPlaceRefOrValue._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, role, baseType, schemaLocation, type, _atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPlaceRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(type)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
