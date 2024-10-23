package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Sampling rate of the collection or production of performance indicators.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum Granularity {

  G_1MN("g_1mn"),
  
  G_5MN("g_5mn"),
  
  G_15MN("g_15mn"),
  
  G_30MN("g_30mn"),
  
  G_1H("g_1h"),
  
  G_24H("g_24h"),
  
  G_1M("g_1m"),
  
  G_1Y("g_1y"),
  
  NA("na"),

  // Bellow values are an extension to the spec in order to offer finer granularity for Performance Measurement

  G_10SEC("g_10sec"),

  G_30SEC("g_30sec");

  private String value;

  Granularity(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Granularity fromValue(String value) {
    for (Granularity b : Granularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static boolean contains(String value) {
    try {
      Granularity.valueOf(value.toUpperCase());
      return true;
    } catch (IllegalArgumentException e) {
      return false;
    }
  }

  public static String getPossibleValues() {
    StringBuilder values = new StringBuilder();
    for (Granularity granularity : Granularity.values()) {
      values.append(granularity.name()).append(" ");
    }
    return values.toString().trim();
  }

}

