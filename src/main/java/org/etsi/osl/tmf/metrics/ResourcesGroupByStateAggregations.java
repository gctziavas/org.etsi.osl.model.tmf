package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResourcesGroupByStateAggregations {

    @JsonProperty("groupByState")
    private final List<ResourcesGroupByStateItem> groupByState;

    public ResourcesGroupByStateAggregations(List<ResourcesGroupByStateItem> groupByState) {
        this.groupByState = groupByState;
    }

    public List<ResourcesGroupByStateItem> getGroupByState() {
        return groupByState;
    }
}
