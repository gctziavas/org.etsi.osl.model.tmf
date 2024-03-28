package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.etsi.osl.tmf.common.model.BaseRootEntity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name="CalendarPeriod")
public class CalendarPeriod extends BaseRootEntity {
    @JsonProperty("day")
    private String day;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timeZone")
    private String timeZone;

    @JsonProperty("hourPeriod")
    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    Set<HourPeriod> hourPeriod  = new HashSet<>();

    public CalendarPeriod() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Set<HourPeriod> getHourPeriod() {
        return hourPeriod;
    }

    public void setHourPeriod(Set<HourPeriod> hourPeriod) {
        this.hourPeriod = hourPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CalendarPeriod that = (CalendarPeriod) o;
        return Objects.equals(day, that.day) && Objects.equals(status, that.status) && Objects.equals(timeZone, that.timeZone) && Objects.equals(hourPeriod, that.hourPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, status, timeZone, hourPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalendarPeriod {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    hourPeriod: ").append(toIndentedString(hourPeriod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
