package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServicesGroupByState {

    @JsonProperty("services")
    private final Services services;

    public ServicesGroupByState(Services services) {
        this.services = services;
    }

    public Services getServices() {
        return services;
    }
}
