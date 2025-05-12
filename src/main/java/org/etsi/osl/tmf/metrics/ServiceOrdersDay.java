package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersDay {

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final GroupByDayAggregations aggregations;

    public ServiceOrdersDay(int total, GroupByDayAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public GroupByDayAggregations getAggregations() {
        return aggregations;
    }
}
