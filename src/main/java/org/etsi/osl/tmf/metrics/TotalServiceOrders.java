package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalServiceOrders {

    @JsonProperty("totalServiceOrders")
    private final int totalServiceOrders;

    public TotalServiceOrders(int totalServiceOrders) {
        this.totalServiceOrders = totalServiceOrders;
    }

    public int getTotalServiceOrders() {
        return totalServiceOrders;
    }
}
