package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Valid values for the lifecycle state of the service
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public enum ServiceStateType {
  
  FEASIBILITY_CHECKED("feasibilityChecked"),
  
  DESIGNED("designed"),
  
  RESERVED("reserved"),
  
  INACTIVE("inactive"),
  
  ACTIVE("active"),
  
  TERMINATED("terminated");

  private final String value;

  ServiceStateType(String value) {
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
  public static ServiceStateType fromValue(String value) {
    for (ServiceStateType b : ServiceStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

