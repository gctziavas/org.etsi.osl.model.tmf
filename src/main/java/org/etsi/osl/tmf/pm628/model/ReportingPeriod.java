package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Possible values for the reporting period
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum ReportingPeriod {
  
  R_1MN("r_1mn"),
  
  R_5MN("r_5mn"),
  
  R_15MN("r_15mn"),
  
  R_30MN("r_30mn"),
  
  R_1H("r_1h"),
  
  R_24H("r_24h"),
  
  NA("na");

  private String value;

  ReportingPeriod(String value) {
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
  public static ReportingPeriod fromValue(String value) {
    for (ReportingPeriod b : ReportingPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

