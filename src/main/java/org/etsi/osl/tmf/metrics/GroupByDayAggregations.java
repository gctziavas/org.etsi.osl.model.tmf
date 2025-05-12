package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupByDayAggregations {

    @JsonProperty("groupByDay")
    private final List<GroupByItem> groupByDay;

    public GroupByDayAggregations(List<GroupByItem> groupByDay) {
        this.groupByDay = groupByDay;
    }

    public List<GroupByItem> getGroupByDay() {
        return groupByDay;
    }
}
