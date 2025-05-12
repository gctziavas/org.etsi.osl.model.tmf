package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublishedServiceSpecifications {

    @JsonProperty("publishedServiceSpecifications")
    private final int publishedServiceSpecifications;

    public PublishedServiceSpecifications(int publishedServiceSpecifications) {
        this.publishedServiceSpecifications = publishedServiceSpecifications;
    }

    public int getPublishedServiceSpecifications() {
        return publishedServiceSpecifications;
    }
}
