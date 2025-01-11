package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ScheduleDefinitionFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ScheduleDefinitionFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduleDefinitionStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduleDefinitionEndTime;

  @JsonProperty("recurringFrequency")
  private String recurringFrequency;

  @Valid
  private List<OffsetDateTime> excludedDate = new ArrayList<>();

  private String scheduleDefinitionHourRange;

  @Valid
  private List<DayOfWeekRecurrenceFVO> weeklyScheduledDefinition = new ArrayList<>();

  @Valid
  private List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition = new ArrayList<>();

  private MonthlyScheduleDayOfWeekDefinitionFVO monthlyScheduleDayOfWeekDefinition;

  @Valid
  private List<OffsetDateTime> dateScheduleDefintion = new ArrayList<>();

  public ScheduleDefinitionFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleDefinitionFVO(String type) {
    this.type = type;
  }

  public ScheduleDefinitionFVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ScheduleDefinitionFVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ScheduleDefinitionFVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ScheduleDefinitionFVO scheduleDefinitionStartTime(OffsetDateTime scheduleDefinitionStartTime) {
    this.scheduleDefinitionStartTime = scheduleDefinitionStartTime;
    return this;
  }

  /**
   * The Start time of the Schedule Definition
   * @return scheduleDefinitionStartTime
  */
  @Valid 
  @Schema(name = "scheduleDefinitionStartTime", description = "The Start time of the Schedule Definition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  @JsonProperty("scheduleDefinitionStartTime")
  public String getScheduleDefinitionStartTimeString() {
    return scheduleDefinitionStartTime.toString();
  }
  
  
  public void setScheduleDefinitionStartTime(String t) {
      if ( t!= null ) {
          this.scheduleDefinitionStartTime = OffsetDateTime.parse( t );
      }
  }
  public OffsetDateTime getScheduleDefinitionStartTime() {
    return scheduleDefinitionStartTime;
  }

  public void setScheduleDefinitionStartTime(OffsetDateTime scheduleDefinitionStartTime) {
    this.scheduleDefinitionStartTime = scheduleDefinitionStartTime;
  }

  public ScheduleDefinitionFVO scheduleDefinitionEndTime(OffsetDateTime scheduleDefinitionEndTime) {
    this.scheduleDefinitionEndTime = scheduleDefinitionEndTime;
    return this;
  }

  /**
   * The End time of the Schedule Definition. If the attribute is empty the Schedule run forever, not having a time constraint.
   * @return scheduleDefinitionEndTime
  */
  @Valid 
  @Schema(name = "scheduleDefinitionEndTime", description = "The End time of the Schedule Definition. If the attribute is empty the Schedule run forever, not having a time constraint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleDefinitionEndTime")
  public String getScheduleDefinitionEndTimeString() {
    return scheduleDefinitionEndTime.toString();
  }
  
  public void setScheduleDefinitionEndTime(String t) {
    if ( t!= null ) {
        this.scheduleDefinitionEndTime = OffsetDateTime.parse( t );
    }
}
  
  public OffsetDateTime getScheduleDefinitionEndTime() {
    return scheduleDefinitionEndTime;
  }

  public void setScheduleDefinitionEndTime(OffsetDateTime scheduleDefinitionEndTime) {
    this.scheduleDefinitionEndTime = scheduleDefinitionEndTime;
  }

  public ScheduleDefinitionFVO recurringFrequency(String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
    return this;
  }

  /**
   * A recurring frequency to run a job within day that is included in schedule definition, for example: every 5 minutes, 15 minute, 30 minutes, 1 hour
   * @return recurringFrequency
  */
  
  @Schema(name = "recurringFrequency", description = "A recurring frequency to run a job within day that is included in schedule definition, for example: every 5 minutes, 15 minute, 30 minutes, 1 hour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringFrequency")
  public String getRecurringFrequency() {
    return recurringFrequency;
  }

  public void setRecurringFrequency(String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
  }

  public ScheduleDefinitionFVO excludedDate(List<OffsetDateTime> excludedDate) {
    this.excludedDate = excludedDate;
    return this;
  }

  public ScheduleDefinitionFVO addExcludedDateItem(OffsetDateTime excludedDateItem) {
    if (this.excludedDate == null) {
      this.excludedDate = new ArrayList<>();
    }
    this.excludedDate.add(excludedDateItem);
    return this;
  }

  /**
   * A list of specific dates that should be excluded from the Schedule Definition.
   * @return excludedDate
  */
  @Valid 
  @Schema(name = "excludedDate", description = "A list of specific dates that should be excluded from the Schedule Definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedDate")
  public List<String> getExcludedDateString() {
    // Transforming List<OffsetDateTime> to List<String>
    List<String> stringList = excludedDate.stream()
            .map(OffsetDateTime::toString)
            .collect(Collectors.toList());
    return stringList;
  }


  @JsonProperty("excludedDate")
  public void setExcludedDateString(List<String> excludedDate) {
    this.excludedDate = excludedDate.stream()
        .map(date -> {
            try {
                return OffsetDateTime.parse(date);
            } catch (DateTimeParseException e) {
                // Handle parse exception
                System.err.println("Invalid date format: " + date);
                return null; // or handle it as per your requirement
            }
        })
        .collect(Collectors.toList());
  }
  public List<OffsetDateTime> getExcludedDate() {
    return excludedDate;
  }

  public void setExcludedDate(List<OffsetDateTime> excludedDate) {
    this.excludedDate = excludedDate;
  }

  public ScheduleDefinitionFVO scheduleDefinitionHourRange(String scheduleDefinitionHourRange) {
    this.scheduleDefinitionHourRange = scheduleDefinitionHourRange;
    return this;
  }

  /**
   * A list of time ranges within a specific day that the schedule will be active on, for example 08:00-12:00, 16:00-19:00.
   * @return scheduleDefinitionHourRange
  */
  
  @Schema(name = "scheduleDefinitionHourRange", description = "A list of time ranges within a specific day that the schedule will be active on, for example 08:00-12:00, 16:00-19:00.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleDefinitionHourRange")
  public String getScheduleDefinitionHourRange() {
    return scheduleDefinitionHourRange;
  }

  public void setScheduleDefinitionHourRange(String scheduleDefinitionHourRange) {
    this.scheduleDefinitionHourRange = scheduleDefinitionHourRange;
  }

  public ScheduleDefinitionFVO weeklyScheduledDefinition(List<DayOfWeekRecurrenceFVO> weeklyScheduledDefinition) {
    this.weeklyScheduledDefinition = weeklyScheduledDefinition;
    return this;
  }

  public ScheduleDefinitionFVO addWeeklyScheduledDefinitionItem(DayOfWeekRecurrenceFVO weeklyScheduledDefinitionItem) {
    if (this.weeklyScheduledDefinition == null) {
      this.weeklyScheduledDefinition = new ArrayList<>();
    }
    this.weeklyScheduledDefinition.add(weeklyScheduledDefinitionItem);
    return this;
  }

  /**
   * The weekly schedule is used to define a schedule that is based on the days of the week, e.g. a schedule that will be active only on Monday and Tuesday.
   * @return weeklyScheduledDefinition
  */
  @Valid 
  @Schema(name = "WeeklyScheduledDefinition", description = "The weekly schedule is used to define a schedule that is based on the days of the week, e.g. a schedule that will be active only on Monday and Tuesday.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeeklyScheduledDefinition")
  public List<DayOfWeekRecurrenceFVO> getWeeklyScheduledDefinition() {
    return weeklyScheduledDefinition;
  }

  public void setWeeklyScheduledDefinition(List<DayOfWeekRecurrenceFVO> weeklyScheduledDefinition) {
    this.weeklyScheduledDefinition = weeklyScheduledDefinition;
  }

  public ScheduleDefinitionFVO monthlyScheduleDayOfMonthDefinition(List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition) {
    this.monthlyScheduleDayOfMonthDefinition = monthlyScheduleDayOfMonthDefinition;
    return this;
  }

  public ScheduleDefinitionFVO addMonthlyScheduleDayOfMonthDefinitionItem(OffsetDateTime monthlyScheduleDayOfMonthDefinitionItem) {
    if (this.monthlyScheduleDayOfMonthDefinition == null) {
      this.monthlyScheduleDayOfMonthDefinition = new ArrayList<>();
    }
    this.monthlyScheduleDayOfMonthDefinition.add(monthlyScheduleDayOfMonthDefinitionItem);
    return this;
  }

  /**
   * The schedule definition for running the threshold job
   * @return monthlyScheduleDayOfMonthDefinition
  */
  @Valid 
  @Schema(name = "monthlyScheduleDayOfMonthDefinition", description = "The schedule definition for running the threshold job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthlyScheduleDayOfMonthDefinition")
  public List<String> getMonthlyScheduleDayOfMonthDefinitionString() {
    // Transforming List<OffsetDateTime> to List<String>
    List<String> stringList = monthlyScheduleDayOfMonthDefinition.stream()
            .map(OffsetDateTime::toString)
            .collect(Collectors.toList());
    return stringList;
  }
  
  @JsonProperty("monthlyScheduleDayOfMonthDefinition")
  public void setMonthlyScheduleDayOfMonthDefinitionString(List<String> monthlyScheduleDayOfMonthDefinition) {
    
    this.monthlyScheduleDayOfMonthDefinition = monthlyScheduleDayOfMonthDefinition.stream()
        .map(date -> {
            try {
                return OffsetDateTime.parse(date);
            } catch (DateTimeParseException e) {
                // Handle parse exception
                System.err.println("Invalid date format: " + date);
                return null; // or handle it as per your requirement
            }
        })
        .collect(Collectors.toList());
  }
  
  public List<OffsetDateTime> getMonthlyScheduleDayOfMonthDefinition() {
    return monthlyScheduleDayOfMonthDefinition;
  }

  public void setMonthlyScheduleDayOfMonthDefinition(List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition) {
    this.monthlyScheduleDayOfMonthDefinition = monthlyScheduleDayOfMonthDefinition;
  }

  public ScheduleDefinitionFVO monthlyScheduleDayOfWeekDefinition(MonthlyScheduleDayOfWeekDefinitionFVO monthlyScheduleDayOfWeekDefinition) {
    this.monthlyScheduleDayOfWeekDefinition = monthlyScheduleDayOfWeekDefinition;
    return this;
  }

  /**
   * Get monthlyScheduleDayOfWeekDefinition
   * @return monthlyScheduleDayOfWeekDefinition
  */
  @Valid 
  @Schema(name = "MonthlyScheduleDayOfWeekDefinition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MonthlyScheduleDayOfWeekDefinition")
  public MonthlyScheduleDayOfWeekDefinitionFVO getMonthlyScheduleDayOfWeekDefinition() {
    return monthlyScheduleDayOfWeekDefinition;
  }

  public void setMonthlyScheduleDayOfWeekDefinition(MonthlyScheduleDayOfWeekDefinitionFVO monthlyScheduleDayOfWeekDefinition) {
    this.monthlyScheduleDayOfWeekDefinition = monthlyScheduleDayOfWeekDefinition;
  }

  public ScheduleDefinitionFVO dateScheduleDefintion(List<OffsetDateTime> dateScheduleDefintion) {
    this.dateScheduleDefintion = dateScheduleDefintion;
    return this;
  }

  public ScheduleDefinitionFVO addDateScheduleDefintionItem(OffsetDateTime dateScheduleDefintionItem) {
    if (this.dateScheduleDefintion == null) {
      this.dateScheduleDefintion = new ArrayList<>();
    }
    this.dateScheduleDefintion.add(dateScheduleDefintionItem);
    return this;
  }

  /**
   * The date schedule is used to define a schedule that is based on specific dates, such as December 31st 2015, February 28th 2013
   * @return dateScheduleDefintion
  */
  @Valid 
  @Schema(name = "dateScheduleDefintion", description = "The date schedule is used to define a schedule that is based on specific dates, such as December 31st 2015, February 28th 2013", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateScheduleDefintion")
  public List<String> getDateScheduleDefintionString() {
    List<String> stringList = dateScheduleDefintion.stream()
        .map(OffsetDateTime::toString)
        .collect(Collectors.toList());
    return stringList;
  }


  @JsonProperty("dateScheduleDefintion")
  public void setDateScheduleDefintionString(List<String> dateScheduleDefintion) {
    this.dateScheduleDefintion = dateScheduleDefintion.stream()
        .map(date -> {
            try {
                return OffsetDateTime.parse(date);
            } catch (DateTimeParseException e) {
                // Handle parse exception
                System.err.println("Invalid date format: " + date);
                return null; // or handle it as per your requirement
            }
        })
        .collect(Collectors.toList());
  }
  public List<OffsetDateTime> getDateScheduleDefintion() {
    return dateScheduleDefintion;
  }

  public void setDateScheduleDefintion(List<OffsetDateTime> dateScheduleDefintion) {
    this.dateScheduleDefintion = dateScheduleDefintion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDefinitionFVO scheduleDefinitionFVO = (ScheduleDefinitionFVO) o;
    return Objects.equals(this.type, scheduleDefinitionFVO.type) &&
        Objects.equals(this.baseType, scheduleDefinitionFVO.baseType) &&
        Objects.equals(this.schemaLocation, scheduleDefinitionFVO.schemaLocation) &&
        Objects.equals(this.scheduleDefinitionStartTime, scheduleDefinitionFVO.scheduleDefinitionStartTime) &&
        Objects.equals(this.scheduleDefinitionEndTime, scheduleDefinitionFVO.scheduleDefinitionEndTime) &&
        Objects.equals(this.recurringFrequency, scheduleDefinitionFVO.recurringFrequency) &&
        Objects.equals(this.excludedDate, scheduleDefinitionFVO.excludedDate) &&
        Objects.equals(this.scheduleDefinitionHourRange, scheduleDefinitionFVO.scheduleDefinitionHourRange) &&
        Objects.equals(this.weeklyScheduledDefinition, scheduleDefinitionFVO.weeklyScheduledDefinition) &&
        Objects.equals(this.monthlyScheduleDayOfMonthDefinition, scheduleDefinitionFVO.monthlyScheduleDayOfMonthDefinition) &&
        Objects.equals(this.monthlyScheduleDayOfWeekDefinition, scheduleDefinitionFVO.monthlyScheduleDayOfWeekDefinition) &&
        Objects.equals(this.dateScheduleDefintion, scheduleDefinitionFVO.dateScheduleDefintion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, scheduleDefinitionStartTime, scheduleDefinitionEndTime, recurringFrequency, excludedDate, scheduleDefinitionHourRange, weeklyScheduledDefinition, monthlyScheduleDayOfMonthDefinition, monthlyScheduleDayOfWeekDefinition, dateScheduleDefintion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDefinitionFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    scheduleDefinitionStartTime: ").append(toIndentedString(scheduleDefinitionStartTime)).append("\n");
    sb.append("    scheduleDefinitionEndTime: ").append(toIndentedString(scheduleDefinitionEndTime)).append("\n");
    sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
    sb.append("    excludedDate: ").append(toIndentedString(excludedDate)).append("\n");
    sb.append("    scheduleDefinitionHourRange: ").append(toIndentedString(scheduleDefinitionHourRange)).append("\n");
    sb.append("    weeklyScheduledDefinition: ").append(toIndentedString(weeklyScheduledDefinition)).append("\n");
    sb.append("    monthlyScheduleDayOfMonthDefinition: ").append(toIndentedString(monthlyScheduleDayOfMonthDefinition)).append("\n");
    sb.append("    monthlyScheduleDayOfWeekDefinition: ").append(toIndentedString(monthlyScheduleDayOfWeekDefinition)).append("\n");
    sb.append("    dateScheduleDefintion: ").append(toIndentedString(dateScheduleDefintion)).append("\n");
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

