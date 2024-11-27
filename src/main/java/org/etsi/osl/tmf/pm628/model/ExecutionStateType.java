package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Possible values for the state of the execution
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum ExecutionStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  PENDING("pending"),
  
  INPROGRESS("inProgress"),
  
  CANCELLED("cancelled"),
  
  COMPLETED("completed"),
  
  FAILED("failed");

  private String value;

  ExecutionStateType(String value) {
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
  public static ExecutionStateType fromValue(String value) {
    for (ExecutionStateType b : ExecutionStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

