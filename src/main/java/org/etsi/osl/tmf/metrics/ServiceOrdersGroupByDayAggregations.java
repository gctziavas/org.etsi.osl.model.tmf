package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServiceOrdersGroupByDayAggregations {

    @JsonProperty("groupByDay")
    private final List<ServiceOrdersGroupByDayItem> groupByState;

    public ServiceOrdersGroupByDayAggregations(List<ServiceOrdersGroupByDayItem> groupByState) {
        this.groupByState = groupByState;
    }

    public List<ServiceOrdersGroupByDayItem> getGroupByState() {
        return groupByState;
    }
}
