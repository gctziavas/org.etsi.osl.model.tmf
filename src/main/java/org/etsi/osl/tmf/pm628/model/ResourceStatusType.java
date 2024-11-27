package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * ResourceStatusType enumerations
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum ResourceStatusType {
  
  ALARM("alarm"),
  
  AVAILABLE("available"),
  
  INSTALLED("installed"),
  
  NOT_EXISTS("not exists"),
  
  PENDINGREMOVAL("pendingRemoval"),
  
  PLANNED("planned"),
  
  RESERVED("reserved"),
  
  STANDBY("standby"),
  
  SUSPENDED("suspended"),
  
  UNKNOWN("unknown");

  private String value;

  ResourceStatusType(String value) {
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
  public static ResourceStatusType fromValue(String value) {
    for (ResourceStatusType b : ResourceStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

