package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExternalIdentifier
 */
@Entity(name = "ExternalIdentifier")
@Table(name = "ExternalIdentifier")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ExternalIdentifier extends BaseRootEntity {
  @JsonProperty("owner")
  private String owner;
  @JsonProperty("externalIdentifierType")
  private String externalIdentifierType;
  @JsonProperty("id")
  private String id;

  public ExternalIdentifier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExternalIdentifier(String id) {
    this.id = id;
  }


  public ExternalIdentifier owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Name of the external system that owns the entity.
   * @return owner
  */
  
  @Schema(name = "owner", example = "MagentoCommerce", description = "Name of the external system that owns the entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ExternalIdentifier externalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
    return this;
  }

  /**
   * Type of the identification, typically would be the type of the entity within the external system
   * @return externalIdentifierType
  */
  
  @Schema(name = "externalIdentifierType", example = "ProductOrder", description = "Type of the identification, typically would be the type of the entity within the external system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getExternalIdentifierType() {
    return externalIdentifierType;
  }

  public void setExternalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
  }

  public ExternalIdentifier id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identification of the entity within the external system.
   * @return id
  */
  @NotNull
  @Schema(name = "id", description = "identification of the entity within the external system.", requiredMode = Schema.RequiredMode.REQUIRED)

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdentifier externalIdentifier = (ExternalIdentifier) o;
    return Objects.equals(this.schemaLocation, externalIdentifier.schemaLocation) &&
        Objects.equals(this.baseType, externalIdentifier.baseType) &&
        Objects.equals(this.type, externalIdentifier.type) &&
        Objects.equals(this.owner, externalIdentifier.owner) &&
        Objects.equals(this.externalIdentifierType, externalIdentifier.externalIdentifierType) &&
        Objects.equals(this.id, externalIdentifier.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, baseType, type, owner, externalIdentifierType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdentifier {\n");
    sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    @type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    externalIdentifierType: ").append(toIndentedString(externalIdentifierType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

