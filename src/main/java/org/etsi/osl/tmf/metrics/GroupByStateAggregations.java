package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupByStateAggregations {

    @JsonProperty("groupByState")
    private final List<GroupByItem> groupByState;

    public GroupByStateAggregations(List<GroupByItem> groupByState) {
        this.groupByState = groupByState;
    }

    public List<GroupByItem> getGroupByState() {
        return groupByState;
    }
}
