package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalServices {

    @JsonProperty("totalServices")
    private final int totalServices;

    public TotalServices(int totalServices) {
        this.totalServices = totalServices;
    }

    public int getTotalServices() {
        return totalServices;
    }
}
