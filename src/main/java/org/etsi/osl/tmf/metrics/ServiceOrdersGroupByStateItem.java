package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.service.ServiceStateType;
import org.etsi.osl.tmf.so641.model.ServiceOrderStateType;

public class ServiceOrdersGroupByStateItem {

    @JsonProperty("key")
    private final ServiceOrderStateType key;

    @JsonProperty("count")
    private final int count;

    public ServiceOrdersGroupByStateItem(ServiceOrderStateType key, int count) {
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
