package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * ExternalIdentifier
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class ExternalIdentifier {

    @JsonProperty("@type")
    @Column(name = "ei_type")
    protected String type;

    @JsonProperty("@baseType")
    @Column(name = "ei_base_type")
    protected String baseType;

    @JsonProperty("@schemaLocation")
    @Column(name = "ei_schema_location")
    protected String schemaLocation;

    @JsonProperty("owner")
    @Column(name = "ei_owner")
    private String owner;

    @JsonProperty("externalIdentifierType")
    @Column(name = "ei_ext_idf_type")
    private String externalIdentifierType;

    @JsonProperty("id")
    @Column(name = "ei_id")
    protected String id;

    public ExternalIdentifier() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ExternalIdentifier(String type) {
        this.type = type;
    }

    public ExternalIdentifier type(String type) {
        this.type = type;
        return this;
    }

    /**
     * When sub-classing, this defines the sub-class Extensible name
     * @return type
     */
    @NotNull
    @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExternalIdentifier baseType(String baseType) {
        this.baseType = baseType;
        return this;
    }

    /**
     * When sub-classing, this defines the super-class
     * @return baseType
     */

    @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public ExternalIdentifier schemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * A URI to a JSON-Schema file that defines additional attributes and relationships
     * @return schemaLocation
     */

    @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
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

    @Schema(name = "id", description = "identification of the entity within the external system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        return Objects.equals(this.type, externalIdentifier.type) &&
                Objects.equals(this.baseType, externalIdentifier.baseType) &&
                Objects.equals(this.schemaLocation, externalIdentifier.schemaLocation) &&
                Objects.equals(this.owner, externalIdentifier.owner) &&
                Objects.equals(this.externalIdentifierType, externalIdentifier.externalIdentifierType) &&
                Objects.equals(this.id, externalIdentifier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, baseType, schemaLocation, owner, externalIdentifierType, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalIdentifier {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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