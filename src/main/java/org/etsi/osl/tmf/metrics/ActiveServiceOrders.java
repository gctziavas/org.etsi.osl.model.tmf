package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveServiceOrders {

    @JsonProperty("activeServiceOrders")
    private final int activeServiceOrders;

    public ActiveServiceOrders(int activeServiceOrders) {
        this.activeServiceOrders = activeServiceOrders;
    }

    public int getActiveServiceOrders() {
        return activeServiceOrders;
    }
}
