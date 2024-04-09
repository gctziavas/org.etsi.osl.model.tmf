package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;

import java.util.Objects;

@Entity(name="PlaceRefOrValue")
public class PlaceRefOrValue extends BaseRootNamedEntity {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("@referredType")
    private String referredType;

    public PlaceRefOrValue() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaceRefOrValue that = (PlaceRefOrValue) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(referredType, that.referredType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, referredType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaceRefOrValue {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    @referredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
