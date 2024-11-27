package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * PartyRoleRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_PartyRoleRef")
public class PartyRoleRef extends BaseRootNamedEntity implements PartyRefOrPartyRoleRef {

  @JsonProperty("@referredType")
  private String referredType;

  @JsonProperty("partyId")
  private String partyId;

  @JsonProperty("partyName")
  private String partyName;

  public PartyRoleRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyRoleRef(String type, String uuid) {
    this.type = type;
    this.uuid = uuid;
  }
  
  public PartyRoleRef referredType(String referredType) {
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

  public PartyRoleRef partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * The identifier of the engaged party that is linked to the PartyRole object.
   * @return partyId
  */
  
  @Schema(name = "partyId", description = "The identifier of the engaged party that is linked to the PartyRole object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyId")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public PartyRoleRef partyName(String partyName) {
    this.partyName = partyName;
    return this;
  }

  /**
   * The name of the engaged party that is linked to the PartyRole object.
   * @return partyName
  */
  
  @Schema(name = "partyName", description = "The name of the engaged party that is linked to the PartyRole object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyName")
  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleRef partyRoleRef = (PartyRoleRef) o;
    return Objects.equals(this.type, partyRoleRef.type) &&
        Objects.equals(this.baseType, partyRoleRef.baseType) &&
        Objects.equals(this.schemaLocation, partyRoleRef.schemaLocation) &&
        Objects.equals(this.href, partyRoleRef.href) &&
        Objects.equals(this.uuid, partyRoleRef.uuid) &&
        Objects.equals(this.name, partyRoleRef.name) &&
        Objects.equals(this.referredType, partyRoleRef.referredType) &&
        Objects.equals(this.partyId, partyRoleRef.partyId) &&
        Objects.equals(this.partyName, partyRoleRef.partyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, uuid, name, referredType, partyId, partyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleRef {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
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

