package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * RelatedPartyRefOrPartyRoleRefFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class RelatedPartyRefOrPartyRoleRefFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("role")
  private String role;

  @JsonProperty("partyOrPartyRole")
  private PartyRefOrPartyRoleRefFVO partyOrPartyRole;

  public RelatedPartyRefOrPartyRoleRefFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPartyRefOrPartyRoleRefFVO(String type, String role) {
    this.type = type;
    this.role = role;
  }

  public RelatedPartyRefOrPartyRoleRefFVO type(String type) {
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

  public RelatedPartyRefOrPartyRoleRefFVO baseType(String baseType) {
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

  public RelatedPartyRefOrPartyRoleRefFVO schemaLocation(String schemaLocation) {
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

  public RelatedPartyRefOrPartyRoleRefFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'
   * @return role
  */
  @NotNull 
  @Schema(name = "role", description = "Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPartyRefOrPartyRoleRefFVO partyOrPartyRole(PartyRefOrPartyRoleRefFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
    return this;
  }

  /**
   * Get partyOrPartyRole
   * @return partyOrPartyRole
  */
  @Valid 
  @Schema(name = "partyOrPartyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyOrPartyRole")
  public PartyRefOrPartyRoleRefFVO getPartyOrPartyRole() {
    return partyOrPartyRole;
  }

  public void setPartyOrPartyRole(PartyRefOrPartyRoleRefFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPartyRefOrPartyRoleRefFVO relatedPartyRefOrPartyRoleRefFVO = (RelatedPartyRefOrPartyRoleRefFVO) o;
    return Objects.equals(this.type, relatedPartyRefOrPartyRoleRefFVO.type) &&
        Objects.equals(this.baseType, relatedPartyRefOrPartyRoleRefFVO.baseType) &&
        Objects.equals(this.schemaLocation, relatedPartyRefOrPartyRoleRefFVO.schemaLocation) &&
        Objects.equals(this.role, relatedPartyRefOrPartyRoleRefFVO.role) &&
        Objects.equals(this.partyOrPartyRole, relatedPartyRefOrPartyRoleRefFVO.partyOrPartyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, role, partyOrPartyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRefOrPartyRoleRefFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    partyOrPartyRole: ").append(toIndentedString(partyOrPartyRole)).append("\n");
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

