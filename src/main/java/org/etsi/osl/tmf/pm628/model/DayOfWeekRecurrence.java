package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * DayOfWeekRecurrence
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Embeddable
public class DayOfWeekRecurrence {

  @JsonProperty("@type")
  @Column(name = "dowr_type")
  private String type;

  @JsonProperty("@baseType")
  @Column(name = "dowr_base_type")
  private String baseType;

  @JsonProperty("@schemaLocation")
  @Column(name = "dowr_schema_location")
  private String schemaLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dates;

  public DayOfWeekRecurrence() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DayOfWeekRecurrence(String type) {
    this.type = type;
  }

  public DayOfWeekRecurrence type(String type) {
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

  public DayOfWeekRecurrence baseType(String baseType) {
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

  public DayOfWeekRecurrence schemaLocation(String schemaLocation) {
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

  public DayOfWeekRecurrence dates(OffsetDateTime dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   * @return dates
  */
  @Valid 
  @Schema(name = "dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getDates() {
    return dates;
  }
  
  @JsonProperty("dates")
  public String getDatesString() {
    return dates.toString();
  }

  public void setDates(String dates) {
    if ( dates!= null ) {
      this.dates = OffsetDateTime.parse( dates );
  }
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
    DayOfWeekRecurrence dayOfWeekRecurrence = (DayOfWeekRecurrence) o;
    return Objects.equals(this.type, dayOfWeekRecurrence.type) &&
        Objects.equals(this.baseType, dayOfWeekRecurrence.baseType) &&
        Objects.equals(this.schemaLocation, dayOfWeekRecurrence.schemaLocation) &&
        Objects.equals(this.dates, dayOfWeekRecurrence.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekRecurrence {\n");
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

