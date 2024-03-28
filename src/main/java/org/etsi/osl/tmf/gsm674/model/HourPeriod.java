package org.etsi.osl.tmf.gsm674.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import org.etsi.osl.tmf.common.model.BaseRootEntity;

import java.util.Objects;

@Entity(name="HourPeriod")
public class HourPeriod extends BaseRootEntity {

    @JsonProperty("endHour")
    private String endHour;
    @JsonProperty("startHour")
    private String startHour;

    public HourPeriod() {
    }

    public HourPeriod(String endHour, String startHour) {
        this.endHour = endHour;
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourPeriod that = (HourPeriod) o;
        return Objects.equals(endHour, that.endHour) && Objects.equals(startHour, that.startHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endHour, startHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HourPeriod {\n");
        sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
        sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
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
