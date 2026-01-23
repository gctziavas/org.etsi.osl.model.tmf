package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * This datatype lists the possible severities that can be allocated to a Alarm. The values are consistent with ITU-T Recommendation X.733. This specification does not recommend the use of indeterminate.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public enum PerceivedSeverity {
  
  CRITICAL("CRITICAL"),
  
  MAJOR("MAJOR"),
  
  MINOR("MINOR"),
  
  WARNING("WARNING"),
  
  INDETERMINATE("INDETERMINATE"),
  
  CLEARED("CLEARED");

  private final String value;

  PerceivedSeverity(String value) {
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
  public static PerceivedSeverity fromValue(String value) {
    for (PerceivedSeverity b : PerceivedSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

