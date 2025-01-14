package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Intent reference, for when Intent is used by other entities
 */

@Schema(name = "IntentRef", description = "Intent reference, for when Intent is used by other entities")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class IntentRef {

  @JsonProperty("@type")
  @Column(name = "ir_type")
  protected String type;

  @JsonProperty("@baseType")
  @Column(name = "ir_base_type")
  protected String baseType;

  @JsonProperty("@schemaLocation")
  @Column(name = "ir_schema_location")
  protected String schemaLocation;

  @JsonProperty("href")
  @Column(name = "ir_href")
  protected String href;

  @JsonProperty("id")
  @Column(name = "ir_id")
  protected String id;

  @JsonProperty("name")
  @Column(name = "ir_name")
  protected String name;
  
  @JsonProperty("@referredType")
  @Column(name = "ir_referred_type")
  private String referredType;

  public IntentRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntentRef(String type, String id) {
    this.type = type;
    this.id = id;
  }

  public IntentRef type(String type) {
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

  public IntentRef baseType(String baseType) {
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

  public IntentRef schemaLocation(String schemaLocation) {
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

  public IntentRef href(String href) {
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

  public IntentRef id(String id) {
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

  public IntentRef name(String name) {
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

  public IntentRef referredType(String referredType) {
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
    IntentRef intentRef = (IntentRef) o;
    return Objects.equals(this.type, intentRef.type) &&
        Objects.equals(this.baseType, intentRef.baseType) &&
        Objects.equals(this.schemaLocation, intentRef.schemaLocation) &&
        Objects.equals(this.href, intentRef.href) &&
        Objects.equals(this.id, intentRef.id) &&
        Objects.equals(this.name, intentRef.name) &&
        Objects.equals(this.referredType, intentRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, href, id, name, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentRef {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

