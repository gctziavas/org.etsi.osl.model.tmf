package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Services {

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final GroupByStateAggregations aggregations;

    public Services(int total, GroupByStateAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public GroupByStateAggregations getAggregations() {
        return aggregations;
    }
}
