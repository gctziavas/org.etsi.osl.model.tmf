package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DataFilterAttributeStringArray
 */

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterAttributeStringArray extends DataFilterAttribute {

  @JsonProperty("value")
  @Valid
  private List<String> value = new ArrayList<>();

  public DataFilterAttributeStringArray value(List<String> value) {
    this.value = value;
    return this;
  }

  public DataFilterAttributeStringArray addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * an array of field names
   * @return value
  */
  
  @Schema(name = "value", example = "[\"Dallas\",\"Houston\",\"Paris\"]", description = "an array of field names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }


  public DataFilterAttributeStringArray valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFilterAttributeStringArray dataFilterAttributeStringArray = (DataFilterAttributeStringArray) o;
    return Objects.equals(this.value, dataFilterAttributeStringArray.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterAttributeStringArray {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

