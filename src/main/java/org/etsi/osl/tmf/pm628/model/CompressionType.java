package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * File compression type.
 */

@Schema(name = "CompressionType", description = "File compression type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class CompressionType {

  @JsonProperty("compressionEnumType")
  private CompressionEnumType compressionEnumType;

  public CompressionType compressionEnumType(CompressionEnumType compressionEnumType) {
    this.compressionEnumType = compressionEnumType;
    return this;
  }

  /**
   * Get compressionEnumType
   * @return compressionEnumType
  */
  @Valid 
  @Schema(name = "compressionEnumType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compressionEnumType")
  public CompressionEnumType getCompressionEnumType() {
    return compressionEnumType;
  }

  public void setCompressionEnumType(CompressionEnumType compressionEnumType) {
    this.compressionEnumType = compressionEnumType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompressionType compressionType = (CompressionType) o;
    return Objects.equals(this.compressionEnumType, compressionType.compressionEnumType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressionEnumType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionType {\n");
    sb.append("    compressionEnumType: ").append(toIndentedString(compressionEnumType)).append("\n");
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

