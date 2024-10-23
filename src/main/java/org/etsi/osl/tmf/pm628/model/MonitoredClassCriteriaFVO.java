package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * MonitoredClassCriteriaFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MonitoredClassCriteriaFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("monitoredObjectClass")
  private String monitoredObjectClass;

  @JsonProperty("objectInstanceFilter")
  private String objectInstanceFilter;

  public MonitoredClassCriteriaFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MonitoredClassCriteriaFVO(String type) {
    this.type = type;
  }

  public MonitoredClassCriteriaFVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MonitoredClassCriteriaFVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public MonitoredClassCriteriaFVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public MonitoredClassCriteriaFVO monitoredObjectClass(String monitoredObjectClass) {
    this.monitoredObjectClass = monitoredObjectClass;
    return this;
  }

  /**
   * A monitored object class for specifying the set of instances that are referenced by a PM query.
   * @return monitoredObjectClass
  */
  
  @Schema(name = "monitoredObjectClass", description = "A monitored object class for specifying the set of instances that are referenced by a PM query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoredObjectClass")
  public String getMonitoredObjectClass() {
    return monitoredObjectClass;
  }

  public void setMonitoredObjectClass(String monitoredObjectClass) {
    this.monitoredObjectClass = monitoredObjectClass;
  }

  public MonitoredClassCriteriaFVO objectInstanceFilter(String objectInstanceFilter) {
    this.objectInstanceFilter = objectInstanceFilter;
    return this;
  }

  /**
   * A filter that can be used in conjunction with the monitored object class for specifying the set of instances that are referenced by a PM query.
   * @return objectInstanceFilter
  */
  
  @Schema(name = "objectInstanceFilter", description = "A filter that can be used in conjunction with the monitored object class for specifying the set of instances that are referenced by a PM query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectInstanceFilter")
  public String getObjectInstanceFilter() {
    return objectInstanceFilter;
  }

  public void setObjectInstanceFilter(String objectInstanceFilter) {
    this.objectInstanceFilter = objectInstanceFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoredClassCriteriaFVO monitoredClassCriteriaFVO = (MonitoredClassCriteriaFVO) o;
    return Objects.equals(this.type, monitoredClassCriteriaFVO.type) &&
        Objects.equals(this.baseType, monitoredClassCriteriaFVO.baseType) &&
        Objects.equals(this.schemaLocation, monitoredClassCriteriaFVO.schemaLocation) &&
        Objects.equals(this.monitoredObjectClass, monitoredClassCriteriaFVO.monitoredObjectClass) &&
        Objects.equals(this.objectInstanceFilter, monitoredClassCriteriaFVO.objectInstanceFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, monitoredObjectClass, objectInstanceFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoredClassCriteriaFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    monitoredObjectClass: ").append(toIndentedString(monitoredObjectClass)).append("\n");
    sb.append("    objectInstanceFilter: ").append(toIndentedString(objectInstanceFilter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

