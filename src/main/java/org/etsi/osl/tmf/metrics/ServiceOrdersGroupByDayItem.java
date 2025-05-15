package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.so641.model.ServiceOrderStateType;

public class ServiceOrdersGroupByDayItem {

    @JsonProperty("key")
    private final String key;

    @JsonProperty("count")
    private final int count;

    public ServiceOrdersGroupByDayItem(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public int getCount() {
        return count;
    }
}
