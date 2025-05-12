package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByDay {

    @JsonProperty("serviceOrders")
    private final ServiceOrdersDay serviceOrders;

    public ServiceOrdersGroupByDay(ServiceOrdersDay serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public ServiceOrdersDay getServiceOrders() {
        return serviceOrders;
    }
}
