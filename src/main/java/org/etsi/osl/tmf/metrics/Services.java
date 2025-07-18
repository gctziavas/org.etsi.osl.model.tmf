package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Services {

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final ServicesGroupByStateAggregations aggregations;

    public Services(int total, ServicesGroupByStateAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public ServicesGroupByStateAggregations getAggregations() {
        return aggregations;
    }
}
