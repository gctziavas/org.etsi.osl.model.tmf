package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Enumeration of supported packing/packaging. All extensions allowed.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum PackingEnumType {
  
  NO_PACKING("NO_PACKING"),
  
  GZIP("GZIP"),
  
  TAR("TAR"),
  
  VENDOR_EXT("VENDOR_EXT"),
  
  MINOR_EXT("MINOR_EXT");

  private String value;

  PackingEnumType(String value) {
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
  public static PackingEnumType fromValue(String value) {
    for (PackingEnumType b : PackingEnumType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

