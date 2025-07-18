package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourcesGroupByState {

    @JsonProperty("resources")
    private final Resources resources;

    public ResourcesGroupByState(Resources resources) {
        this.resources = resources;
    }

    public Resources getResources() {
        return resources;
    }
}
