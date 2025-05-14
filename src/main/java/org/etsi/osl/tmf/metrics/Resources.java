package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resources{

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final ResourcesGroupByStateAggregations aggregations;

    public Resources(int total, ResourcesGroupByStateAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public ResourcesGroupByStateAggregations getAggregations() {
        return aggregations;
    }
}
