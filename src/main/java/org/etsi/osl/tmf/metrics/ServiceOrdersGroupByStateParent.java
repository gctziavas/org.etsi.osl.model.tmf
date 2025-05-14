package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByStateParent {

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final ServiceOrdersGroupByStateAggregations aggregations;

    public ServiceOrdersGroupByStateParent(int total, ServiceOrdersGroupByStateAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public ServiceOrdersGroupByStateAggregations getAggregations() {
        return aggregations;
    }
}
