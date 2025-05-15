package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisteredIndividuals {

    @JsonProperty("registeredIndividuals")
    private final int registeredIndividuals;

    public RegisteredIndividuals(int registeredIndividuals) {
        this.registeredIndividuals = registeredIndividuals;
    }

    public int getRegisteredIndividuals() {
        return registeredIndividuals;
    }
}
