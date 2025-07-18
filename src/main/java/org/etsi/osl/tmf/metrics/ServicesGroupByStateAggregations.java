package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServicesGroupByStateAggregations {

    @JsonProperty("groupByState")
    private final List<ServicesGroupByStateItem> groupByState;

    public ServicesGroupByStateAggregations(List<ServicesGroupByStateItem> groupByState) {
        this.groupByState = groupByState;
    }

    public List<ServicesGroupByStateItem> getGroupByState() {
        return groupByState;
    }
}
