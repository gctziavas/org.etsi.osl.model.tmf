package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * DayOfWeekRecurrenceFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DayOfWeekRecurrenceFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dates;

  public DayOfWeekRecurrenceFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DayOfWeekRecurrenceFVO(String type) {
    this.type = type;
  }

  public DayOfWeekRecurrenceFVO type(String type) {
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

  public DayOfWeekRecurrenceFVO baseType(String baseType) {
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

  public DayOfWeekRecurrenceFVO schemaLocation(String schemaLocation) {
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

  public DayOfWeekRecurrenceFVO dates(OffsetDateTime dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   * @return dates
  */
  @Valid 
  @Schema(name = "dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dates")
  public String getDatesString() {
    return (dates != null) ? dates.toString() : null;
  }

  public void setDates(String dates) {
    if ( dates!= null ) {
      this.dates = OffsetDateTime.parse( dates );
    }
  }

  public OffsetDateTime getDates() {
    return dates;
  }

  public void setDates(OffsetDateTime dates) {
    this.dates = dates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayOfWeekRecurrenceFVO dayOfWeekRecurrenceFVO = (DayOfWeekRecurrenceFVO) o;
    return Objects.equals(this.type, dayOfWeekRecurrenceFVO.type) &&
        Objects.equals(this.baseType, dayOfWeekRecurrenceFVO.baseType) &&
        Objects.equals(this.schemaLocation, dayOfWeekRecurrenceFVO.schemaLocation) &&
        Objects.equals(this.dates, dayOfWeekRecurrenceFVO.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekRecurrenceFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

