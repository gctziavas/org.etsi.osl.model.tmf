package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByState {

    @JsonProperty("serviceOrders")
    private final ServiceOrdersGroupByStateParent serviceOrders;

    public ServiceOrdersGroupByState(ServiceOrdersGroupByStateParent serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public ServiceOrdersGroupByStateParent getServiceOrders() {
        return serviceOrders;
    }
}
