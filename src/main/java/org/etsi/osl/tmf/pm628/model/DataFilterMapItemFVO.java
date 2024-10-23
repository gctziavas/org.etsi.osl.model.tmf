package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * definition of a field used for filtering template with the associated attributes.
 */

@Schema(name = "DataFilterMapItem_FVO", description = "definition of a field used for filtering template with the associated attributes.")
@JsonTypeName("DataFilterMapItem_FVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DataFilterMapItemFVO {

  @JsonProperty("filterTemplate")
  private DataFilterTemplateFVO filterTemplate;

  @JsonProperty("stringArray")
  private DataFilterAttributeStringArray stringArray;

  public DataFilterMapItemFVO filterTemplate(DataFilterTemplateFVO filterTemplate) {
    this.filterTemplate = filterTemplate;
    return this;
  }

  /**
   * Get filterTemplate
   * @return filterTemplate
  */
  @Valid 
  @Schema(name = "filterTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterTemplate")
  public DataFilterTemplateFVO getFilterTemplate() {
    return filterTemplate;
  }

  public void setFilterTemplate(DataFilterTemplateFVO filterTemplate) {
    this.filterTemplate = filterTemplate;
  }

  public DataFilterMapItemFVO stringArray(DataFilterAttributeStringArray stringArray) {
    this.stringArray = stringArray;
    return this;
  }

  /**
   * Get stringArray
   * @return stringArray
  */
  @Valid 
  @Schema(name = "stringArray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringArray")
  public DataFilterAttributeStringArray getStringArray() {
    return stringArray;
  }

  public void setStringArray(DataFilterAttributeStringArray stringArray) {
    this.stringArray = stringArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFilterMapItemFVO dataFilterMapItemFVO = (DataFilterMapItemFVO) o;
    return Objects.equals(this.filterTemplate, dataFilterMapItemFVO.filterTemplate) &&
        Objects.equals(this.stringArray, dataFilterMapItemFVO.stringArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterTemplate, stringArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilterMapItemFVO {\n");
    sb.append("    filterTemplate: ").append(toIndentedString(filterTemplate)).append("\n");
    sb.append("    stringArray: ").append(toIndentedString(stringArray)).append("\n");
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

