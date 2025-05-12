package org.etsi.osl.tmf.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupByItem {

    @JsonProperty("key")
    private final String key;

    @JsonProperty("count")
    private final int count;

    public GroupByItem(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public int getCount() {
        return count;
    }
}
