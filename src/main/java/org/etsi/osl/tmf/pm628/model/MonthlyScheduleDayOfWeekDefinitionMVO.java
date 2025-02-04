package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MonthlyScheduleDayOfWeekDefinitionMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MonthlyScheduleDayOfWeekDefinitionMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("dayOfMonthRecurrence")
  @Valid
  private List<DayOfMonthRecurrenceMVO> dayOfMonthRecurrence = new ArrayList<>();

  @JsonProperty("recurringDaySequence")
  private String recurringDaySequence;

  public MonthlyScheduleDayOfWeekDefinitionMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MonthlyScheduleDayOfWeekDefinitionMVO(String type) {
    this.type = type;
  }

  public MonthlyScheduleDayOfWeekDefinitionMVO type(String type) {
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

  public MonthlyScheduleDayOfWeekDefinitionMVO baseType(String baseType) {
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

  public MonthlyScheduleDayOfWeekDefinitionMVO schemaLocation(String schemaLocation) {
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

  public MonthlyScheduleDayOfWeekDefinitionMVO dayOfMonthRecurrence(List<DayOfMonthRecurrenceMVO> dayOfMonthRecurrence) {
    this.dayOfMonthRecurrence = dayOfMonthRecurrence;
    return this;
  }

  public MonthlyScheduleDayOfWeekDefinitionMVO addDayOfMonthRecurrenceItem(DayOfMonthRecurrenceMVO dayOfMonthRecurrenceItem) {
    if (this.dayOfMonthRecurrence == null) {
      this.dayOfMonthRecurrence = new ArrayList<>();
    }
    this.dayOfMonthRecurrence.add(dayOfMonthRecurrenceItem);
    return this;
  }

  /**
   * Get dayOfMonthRecurrence
   * @return dayOfMonthRecurrence
  */
  @Valid 
  @Schema(name = "dayOfMonthRecurrence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<DayOfMonthRecurrenceMVO> getDayOfMonthRecurrence() {
    return dayOfMonthRecurrence;
  }

  public void setDayOfMonthRecurrence(List<DayOfMonthRecurrenceMVO> dayOfMonthRecurrence) {
    this.dayOfMonthRecurrence = dayOfMonthRecurrence;
  }

  public MonthlyScheduleDayOfWeekDefinitionMVO recurringDaySequence(String recurringDaySequence) {
    this.recurringDaySequence = recurringDaySequence;
    return this;
  }

  /**
   * Get recurringDaySequence
   * @return recurringDaySequence
  */
  
  @Schema(name = "recurringDaySequence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRecurringDaySequence() {
    return recurringDaySequence;
  }

  public void setRecurringDaySequence(String recurringDaySequence) {
    this.recurringDaySequence = recurringDaySequence;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyScheduleDayOfWeekDefinitionMVO monthlyScheduleDayOfWeekDefinitionMVO = (MonthlyScheduleDayOfWeekDefinitionMVO) o;
    return Objects.equals(this.type, monthlyScheduleDayOfWeekDefinitionMVO.type) &&
        Objects.equals(this.baseType, monthlyScheduleDayOfWeekDefinitionMVO.baseType) &&
        Objects.equals(this.schemaLocation, monthlyScheduleDayOfWeekDefinitionMVO.schemaLocation) &&
        Objects.equals(this.dayOfMonthRecurrence, monthlyScheduleDayOfWeekDefinitionMVO.dayOfMonthRecurrence) &&
        Objects.equals(this.recurringDaySequence, monthlyScheduleDayOfWeekDefinitionMVO.recurringDaySequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, dayOfMonthRecurrence, recurringDaySequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyScheduleDayOfWeekDefinitionMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    dayOfMonthRecurrence: ").append(toIndentedString(dayOfMonthRecurrence)).append("\n");
    sb.append("    recurringDaySequence: ").append(toIndentedString(recurringDaySequence)).append("\n");
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

