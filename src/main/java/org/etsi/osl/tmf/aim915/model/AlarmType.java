package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Categorizes the alarm (X.733 8.1.1, 3GPP TS 32.111-2 Annex A)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public enum AlarmType {
  
  COMMUNICATIONS_ALARM("communicationsAlarm"),
  
  PROCESSING_ERROR_ALARM("processingErrorAlarm"),
  
  ENVIRONMENTAL_ALARM("environmentalAlarm"),
  
  QUALITY_OF_SERVICE_ALARM("qualityOfServiceAlarm"),
  
  EQUIPMENT_ALARM("equipmentAlarm"),
  
  INTEGRITY_VIOLATION("integrityViolation"),
  
  OPERATIONAL_VIOLATION("operationalViolation"),
  
  PHYSICAL_VIOLATION("physicalViolation"),
  
  SECURITY_SERVICE("securityService"),
  
  MECHANISM_VIOLATION("mechanismViolation"),
  
  TIME_DOMAIN_VIOLATION("timeDomainViolation");

  private final String value;

  AlarmType(String value) {
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
  public static AlarmType fromValue(String value) {
    for (AlarmType b : AlarmType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

