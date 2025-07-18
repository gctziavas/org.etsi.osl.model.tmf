package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.service.ServiceStateType;

public class ServicesGroupByStateItem {

    @JsonProperty("key")
    private final ServiceStateType key;

    @JsonProperty("count")
    private final int count;

    public ServicesGroupByStateItem(ServiceStateType key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key.name();
    }

    public int getCount() {
        return count;
    }
}
