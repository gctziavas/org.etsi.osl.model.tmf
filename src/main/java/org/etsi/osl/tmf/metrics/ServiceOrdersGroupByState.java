package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByState {

    @JsonProperty("serviceOrders")
    private final Services serviceOrders;

    public ServiceOrdersGroupByState(ServiceOrders serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public Services getServiceOrders() {
        return serviceOrders;
    }
}
