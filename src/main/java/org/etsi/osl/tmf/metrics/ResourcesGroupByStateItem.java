package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.service.ServiceStateType;
import org.etsi.osl.tmf.ri639.model.ResourceStatusType;

public class ResourcesGroupByStateItem {

    @JsonProperty("key")
    private final ResourceStatusType key;

    @JsonProperty("count")
    private final int count;

    public ResourcesGroupByStateItem(ResourceStatusType key, int count) {
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
