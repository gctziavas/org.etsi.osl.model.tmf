package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ScheduleDefinition
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_SchedDef")
public class ScheduleDefinition extends BaseRootEntity {

  @JsonProperty("scheduleDefinitionStartTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduleDefinitionStartTime;

  @JsonProperty("scheduleDefinitionEndTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduleDefinitionEndTime;

  @JsonProperty("recurringFrequency")
  private String recurringFrequency;

  @JsonProperty("excludedDate")
  @Valid
  private List<OffsetDateTime> excludedDate = new ArrayList<>();

  @JsonProperty("scheduleDefinitionHourRange")
  private String scheduleDefinitionHourRange;

  @JsonProperty("WeeklyScheduledDefinition")
  @Valid
  @ElementCollection(targetClass = DayOfWeekRecurrence.class)
  @CollectionTable(
          name = "pm628_sched_def_wsd",
          joinColumns = @JoinColumn(name = "sched_def_uuid")
  )
  private List<DayOfWeekRecurrence> weeklyScheduledDefinition = new ArrayList<>();

  @JsonProperty("monthlyScheduleDayOfMonthDefinition")
  @Valid
  private List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition = new ArrayList<>();

  @JsonProperty("MonthlyScheduleDayOfWeekDefinition")
  @Embedded
  private MonthlyScheduleDayOfWeekDefinition monthlyScheduleDayOfWeekDefinition;

  @JsonProperty("dateScheduleDefintion")
  @Valid
  private List<OffsetDateTime> dateScheduleDefintion = new ArrayList<>();

  public ScheduleDefinition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleDefinition(String type) {
    this.type = type;
  }

  public ScheduleDefinition scheduleDefinitionStartTime(OffsetDateTime scheduleDefinitionStartTime) {
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
  public OffsetDateTime getScheduleDefinitionStartTime() {
    return scheduleDefinitionStartTime;
  }

  public void setScheduleDefinitionStartTime(OffsetDateTime scheduleDefinitionStartTime) {
    this.scheduleDefinitionStartTime = scheduleDefinitionStartTime;
  }

  public ScheduleDefinition scheduleDefinitionEndTime(OffsetDateTime scheduleDefinitionEndTime) {
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
  public OffsetDateTime getScheduleDefinitionEndTime() {
    return scheduleDefinitionEndTime;
  }

  public void setScheduleDefinitionEndTime(OffsetDateTime scheduleDefinitionEndTime) {
    this.scheduleDefinitionEndTime = scheduleDefinitionEndTime;
  }

  public ScheduleDefinition recurringFrequency(String recurringFrequency) {
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

  public ScheduleDefinition excludedDate(List<OffsetDateTime> excludedDate) {
    this.excludedDate = excludedDate;
    return this;
  }

  public ScheduleDefinition addExcludedDateItem(OffsetDateTime excludedDateItem) {
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
  public List<OffsetDateTime> getExcludedDate() {
    return excludedDate;
  }

  public void setExcludedDate(List<OffsetDateTime> excludedDate) {
    this.excludedDate = excludedDate;
  }

  public ScheduleDefinition scheduleDefinitionHourRange(String scheduleDefinitionHourRange) {
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

  public ScheduleDefinition weeklyScheduledDefinition(List<DayOfWeekRecurrence> weeklyScheduledDefinition) {
    this.weeklyScheduledDefinition = weeklyScheduledDefinition;
    return this;
  }

  public ScheduleDefinition addWeeklyScheduledDefinitionItem(DayOfWeekRecurrence weeklyScheduledDefinitionItem) {
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
  public List<DayOfWeekRecurrence> getWeeklyScheduledDefinition() {
    return weeklyScheduledDefinition;
  }

  public void setWeeklyScheduledDefinition(List<DayOfWeekRecurrence> weeklyScheduledDefinition) {
    this.weeklyScheduledDefinition = weeklyScheduledDefinition;
  }

  public ScheduleDefinition monthlyScheduleDayOfMonthDefinition(List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition) {
    this.monthlyScheduleDayOfMonthDefinition = monthlyScheduleDayOfMonthDefinition;
    return this;
  }

  public ScheduleDefinition addMonthlyScheduleDayOfMonthDefinitionItem(OffsetDateTime monthlyScheduleDayOfMonthDefinitionItem) {
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
  public List<OffsetDateTime> getMonthlyScheduleDayOfMonthDefinition() {
    return monthlyScheduleDayOfMonthDefinition;
  }

  public void setMonthlyScheduleDayOfMonthDefinition(List<OffsetDateTime> monthlyScheduleDayOfMonthDefinition) {
    this.monthlyScheduleDayOfMonthDefinition = monthlyScheduleDayOfMonthDefinition;
  }

  public ScheduleDefinition monthlyScheduleDayOfWeekDefinition(MonthlyScheduleDayOfWeekDefinition monthlyScheduleDayOfWeekDefinition) {
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
  public MonthlyScheduleDayOfWeekDefinition getMonthlyScheduleDayOfWeekDefinition() {
    return monthlyScheduleDayOfWeekDefinition;
  }

  public void setMonthlyScheduleDayOfWeekDefinition(MonthlyScheduleDayOfWeekDefinition monthlyScheduleDayOfWeekDefinition) {
    this.monthlyScheduleDayOfWeekDefinition = monthlyScheduleDayOfWeekDefinition;
  }

  public ScheduleDefinition dateScheduleDefintion(List<OffsetDateTime> dateScheduleDefintion) {
    this.dateScheduleDefintion = dateScheduleDefintion;
    return this;
  }

  public ScheduleDefinition addDateScheduleDefintionItem(OffsetDateTime dateScheduleDefintionItem) {
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
    ScheduleDefinition scheduleDefinition = (ScheduleDefinition) o;
    return Objects.equals(this.type, scheduleDefinition.type) &&
        Objects.equals(this.baseType, scheduleDefinition.baseType) &&
        Objects.equals(this.schemaLocation, scheduleDefinition.schemaLocation) &&
        Objects.equals(this.uuid, scheduleDefinition.uuid) &&
        Objects.equals(this.scheduleDefinitionStartTime, scheduleDefinition.scheduleDefinitionStartTime) &&
        Objects.equals(this.scheduleDefinitionEndTime, scheduleDefinition.scheduleDefinitionEndTime) &&
        Objects.equals(this.recurringFrequency, scheduleDefinition.recurringFrequency) &&
        Objects.equals(this.excludedDate, scheduleDefinition.excludedDate) &&
        Objects.equals(this.scheduleDefinitionHourRange, scheduleDefinition.scheduleDefinitionHourRange) &&
        Objects.equals(this.weeklyScheduledDefinition, scheduleDefinition.weeklyScheduledDefinition) &&
        Objects.equals(this.monthlyScheduleDayOfMonthDefinition, scheduleDefinition.monthlyScheduleDayOfMonthDefinition) &&
        Objects.equals(this.monthlyScheduleDayOfWeekDefinition, scheduleDefinition.monthlyScheduleDayOfWeekDefinition) &&
        Objects.equals(this.dateScheduleDefintion, scheduleDefinition.dateScheduleDefintion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, scheduleDefinitionStartTime, scheduleDefinitionEndTime, recurringFrequency, excludedDate, scheduleDefinitionHourRange, weeklyScheduledDefinition, monthlyScheduleDayOfMonthDefinition, monthlyScheduleDayOfWeekDefinition, dateScheduleDefintion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDefinition {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
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

