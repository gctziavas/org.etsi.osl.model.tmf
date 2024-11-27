package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Enumeration of supported compressions. All extensions allowed.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public enum CompressionEnumType {
  
  NO_COMPRESSION("no_compression"),
  
  GZIP("gzip"),
  
  VENDOR_EXT("vendor_ext"),
  
  MINOR_EXT("minor_ext");

  private String value;

  CompressionEnumType(String value) {
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
  public static CompressionEnumType fromValue(String value) {
    for (CompressionEnumType b : CompressionEnumType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

