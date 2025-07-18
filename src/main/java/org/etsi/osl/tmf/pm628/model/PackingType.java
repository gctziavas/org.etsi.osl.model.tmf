package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Specify if the output file(s) are to be packed.
 */

@Schema(name = "PackingType", description = "Specify if the output file(s) are to be packed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class PackingType {

  @JsonProperty("packingEnumType")
  private PackingEnumType packingEnumType;

  public PackingType packingEnumType(PackingEnumType packingEnumType) {
    this.packingEnumType = packingEnumType;
    return this;
  }

  /**
   * Get packingEnumType
   * @return packingEnumType
  */
  @Valid 
  @Schema(name = "packingEnumType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PackingEnumType getPackingEnumType() {
    return packingEnumType;
  }

  public void setPackingEnumType(PackingEnumType packingEnumType) {
    this.packingEnumType = packingEnumType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingType packingType = (PackingType) o;
    return Objects.equals(this.packingEnumType, packingType.packingEnumType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packingEnumType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingType {\n");
    sb.append("    packingEnumType: ").append(toIndentedString(packingEnumType)).append("\n");
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

