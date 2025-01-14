package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyDiscriminator;
import org.hibernate.annotations.AnyDiscriminatorValue;
import org.hibernate.annotations.AnyKeyJavaClass;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * RelatedPartyRefOrPartyRoleRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class RelatedPartyRefOrPartyRoleRef {

  @JsonProperty("@type")
  @Column(name = "rproprr_type")
  private String type;

  @JsonProperty("@baseType")
  @Column(name = "rproprr_base_type")
  private String baseType;

  @JsonProperty("@schemaLocation")
  @Column(name = "rproprr_schema_location")
  private String schemaLocation;

  @JsonProperty("role")
  private String role;

  @JsonProperty("partyOrPartyRole")
  @Any
  @AnyDiscriminator(DiscriminatorType.STRING)
  @AnyDiscriminatorValue(discriminator = "pr", entity = PartyRef.class)
  @AnyDiscriminatorValue(discriminator = "prr", entity = PartyRoleRef.class)
  @AnyKeyJavaClass(String.class)
  @Column(name = "party_or_party_role_type")
  @JoinColumn(name = "party_ref_or_party_role_ref_id")
  private PartyRefOrPartyRoleRef partyOrPartyRole;

  public RelatedPartyRefOrPartyRoleRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPartyRefOrPartyRoleRef(String type) {
    this.type = type;
  }

  public RelatedPartyRefOrPartyRoleRef type(String type) {
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

  public RelatedPartyRefOrPartyRoleRef baseType(String baseType) {
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

  public RelatedPartyRefOrPartyRoleRef schemaLocation(String schemaLocation) {
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

  public RelatedPartyRefOrPartyRoleRef role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'
   * @return role
  */
  
  @Schema(name = "role", description = "Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPartyRefOrPartyRoleRef partyOrPartyRole(PartyRefOrPartyRoleRef partyOrPartyRole) {
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
  public PartyRefOrPartyRoleRef getPartyOrPartyRole() {
    return partyOrPartyRole;
  }

  public void setPartyOrPartyRole(PartyRefOrPartyRoleRef partyOrPartyRole) {
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
    RelatedPartyRefOrPartyRoleRef relatedPartyRefOrPartyRoleRef = (RelatedPartyRefOrPartyRoleRef) o;
    return Objects.equals(this.type, relatedPartyRefOrPartyRoleRef.type) &&
        Objects.equals(this.baseType, relatedPartyRefOrPartyRoleRef.baseType) &&
        Objects.equals(this.schemaLocation, relatedPartyRefOrPartyRoleRef.schemaLocation) &&
        Objects.equals(this.role, relatedPartyRefOrPartyRoleRef.role) &&
        Objects.equals(this.partyOrPartyRole, relatedPartyRefOrPartyRoleRef.partyOrPartyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, role, partyOrPartyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRefOrPartyRoleRef {\n");
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

