package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByDayParent {

    @JsonProperty("total")
    private final int total;

    @JsonProperty("aggregations")
    private final ServiceOrdersGroupByDayAggregations aggregations;

    public ServiceOrdersGroupByDayParent(int total, ServiceOrdersGroupByDayAggregations aggregations) {
        this.total = total;
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public ServiceOrdersGroupByDayAggregations getAggregations() {
        return aggregations;
    }
}
