package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceOrdersGroupByDay {

    @JsonProperty("serviceOrders")
    private final ServiceOrdersGroupByDayParent serviceOrders;

    public ServiceOrdersGroupByDay(ServiceOrdersGroupByDayParent serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public ServiceOrdersGroupByDayParent getServiceOrders() {
        return serviceOrders;
    }
}
