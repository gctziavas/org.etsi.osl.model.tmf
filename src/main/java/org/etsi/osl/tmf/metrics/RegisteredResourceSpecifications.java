package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisteredResourceSpecifications {

    @JsonProperty("registeredResourceSpecifications")
    private final int registeredResourceSpecifications;

    public RegisteredResourceSpecifications(int registeredResourceSpecifications) {
        this.registeredResourceSpecifications = registeredResourceSpecifications;
    }

    public int getRegisteredResourceSpecifications() {
        return registeredResourceSpecifications;
    }
}
