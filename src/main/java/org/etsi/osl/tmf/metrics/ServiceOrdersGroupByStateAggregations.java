package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServiceOrdersGroupByStateAggregations {

    @JsonProperty("groupByState")
    private final List<ServiceOrdersGroupByStateItem> groupByState;

    public ServiceOrdersGroupByStateAggregations(List<ServiceOrdersGroupByStateItem> groupByState) {
        this.groupByState = groupByState;
    }

    public List<ServiceOrdersGroupByStateItem> getGroupByState() {
        return groupByState;
    }
}
