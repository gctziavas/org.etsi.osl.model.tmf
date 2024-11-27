package org.etsi.osl.tmf.pim637.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
import org.etsi.osl.tmf.common.model.Quantity;
import org.etsi.osl.tmf.common.model.TimePeriod;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
/**
 * Description of a productTerm linked to this product. This represent a commitment with a duration
 */
@Schema(description = "Description of a productTerm linked to this product. This represent a commitment with a duration")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")

@Entity(name = "ProdTerm637")
public class ProductTerm   extends BaseRootNamedEntity {
  @JsonProperty("description")
  private String description = null;


  @JsonProperty("duration")
  private Quantity duration = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  public ProductTerm description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productTerm
   * @return description
   **/
  @Schema(description = "Description of the productTerm")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductTerm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productTerm
   * @return name
   **/
  @Schema(description = "Name of the productTerm")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductTerm duration(Quantity duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public Quantity getDuration() {
    return duration;
  }

  public void setDuration(Quantity duration) {
    this.duration = duration;
  }

  public ProductTerm validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTerm productTerm = (ProductTerm) o;
    return Objects.equals(this.description, productTerm.description) &&
        Objects.equals(this.name, productTerm.name) &&
        Objects.equals(this.duration, productTerm.duration) &&
        Objects.equals(this.validFor, productTerm.validFor) &&
        Objects.equals(this.baseType, productTerm.baseType) &&
        Objects.equals(this.schemaLocation, productTerm.schemaLocation) &&
        Objects.equals(this.type, productTerm.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, duration, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(type)).append("\n");
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
