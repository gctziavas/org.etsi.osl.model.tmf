package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalResources {

    @JsonProperty("totalResources")
    private final int totalResources;

    public TotalResources(int totalResources) {
        this.totalResources = totalResources;
    }

    public int getTotalResources() {
        return totalResources;
    }
}
