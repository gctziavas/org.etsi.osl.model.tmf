package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.etsi.osl.tmf.common.model.BaseRootEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name="CalendarPeriod")
public class CalendarPeriod extends BaseRootEntity {
    @JsonProperty("day")
    private String day;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("id")
    private String id;
    @Valid
    @JsonProperty("hourPeriod")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    List<HourPeriod> hourPeriod  = new ArrayList<>();

    public CalendarPeriod() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CalendarPeriod(String status) {
        this.status = status;
    }

    public CalendarPeriod id(String id) {
        this.id = id;
        return this;
    }

    /**
     * unique identifier of the calendar period
     * @return id
     */

    @Schema(name = "id", description = "unique identifier of the calendar period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CalendarPeriod day(String day) {
        this.day = day;
        return this;
    }

    /**
     * Day where the calendar status applies (e.g.: monday, mon-to-fri, weekdays, weekend, all week, ...)
     * @return day
     */

    @Schema(name = "day", description = "Day where the calendar status applies (e.g.: monday, mon-to-fri, weekdays, weekend, all week, ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public CalendarPeriod timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Indication of the timezone applicable to the calendar information (e.g.: Paris, GMT+1)
     * @return timeZone
     */

    @Schema(name = "timeZone", description = "Indication of the timezone applicable to the calendar information (e.g.: Paris, GMT+1)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CalendarPeriod hourPeriod(List<HourPeriod> hourPeriod) {
        this.hourPeriod = hourPeriod;
        return this;
    }

    public CalendarPeriod addHourPeriodItem(HourPeriod hourPeriodItem) {
        if (this.hourPeriod == null) {
            this.hourPeriod = new ArrayList<>();
        }
        this.hourPeriod.add(hourPeriodItem);
        return this;
    }

    /**
     * Get hourPeriod
     * @return hourPeriod
     */
    @Valid
    @Schema(name = "hourPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hourPeriod")
    public List<HourPeriod> getHourPeriod() {
        return hourPeriod;
    }

    public void setHourPeriod(List<HourPeriod> hourPeriod) {
        this.hourPeriod = hourPeriod;
    }

    public CalendarPeriod status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Indication of the availability of the caledar period (e.g.: available, booked, etc.)
     * @return status
     */
    @NotNull
    @Schema(name = "status", description = "Indication of the availability of the caledar period (e.g.: available, booked, etc.)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CalendarPeriod calendarPeriod = (CalendarPeriod) o;
        return Objects.equals(this.schemaLocation, calendarPeriod.schemaLocation) &&
                Objects.equals(this.baseType, calendarPeriod.baseType) &&
                Objects.equals(this.type, calendarPeriod.type) &&
                Objects.equals(this.href, calendarPeriod.href) &&
                Objects.equals(this.id, calendarPeriod.id) &&
                Objects.equals(this.day, calendarPeriod.day) &&
                Objects.equals(this.timeZone, calendarPeriod.timeZone) &&
                Objects.equals(this.hourPeriod, calendarPeriod.hourPeriod) &&
                Objects.equals(this.status, calendarPeriod.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, baseType, type, href, id, day, timeZone, hourPeriod, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalendarPeriod {\n");
        sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    atType: ").append(toIndentedString(type)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    hourPeriod: ").append(toIndentedString(hourPeriod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
