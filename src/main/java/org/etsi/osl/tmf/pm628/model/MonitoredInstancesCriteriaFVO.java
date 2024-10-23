package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MonitoredInstancesCriteriaFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MonitoredInstancesCriteriaFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("monitoredObjectInstances")
  @Valid
  private List<String> monitoredObjectInstances = new ArrayList<>();

  public MonitoredInstancesCriteriaFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MonitoredInstancesCriteriaFVO(String type) {
    this.type = type;
  }

  public MonitoredInstancesCriteriaFVO type(String type) {
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

  public MonitoredInstancesCriteriaFVO baseType(String baseType) {
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

  public MonitoredInstancesCriteriaFVO schemaLocation(String schemaLocation) {
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

  public MonitoredInstancesCriteriaFVO monitoredObjectInstances(List<String> monitoredObjectInstances) {
    this.monitoredObjectInstances = monitoredObjectInstances;
    return this;
  }

  public MonitoredInstancesCriteriaFVO addMonitoredObjectInstancesItem(String monitoredObjectInstancesItem) {
    if (this.monitoredObjectInstances == null) {
      this.monitoredObjectInstances = new ArrayList<>();
    }
    this.monitoredObjectInstances.add(monitoredObjectInstancesItem);
    return this;
  }

  /**
   * Get monitoredObjectInstances
   * @return monitoredObjectInstances
  */
  @Size(min = 0) 
  @Schema(name = "monitoredObjectInstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoredObjectInstances")
  public List<String> getMonitoredObjectInstances() {
    return monitoredObjectInstances;
  }

  public void setMonitoredObjectInstances(List<String> monitoredObjectInstances) {
    this.monitoredObjectInstances = monitoredObjectInstances;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoredInstancesCriteriaFVO monitoredInstancesCriteriaFVO = (MonitoredInstancesCriteriaFVO) o;
    return Objects.equals(this.type, monitoredInstancesCriteriaFVO.type) &&
        Objects.equals(this.baseType, monitoredInstancesCriteriaFVO.baseType) &&
        Objects.equals(this.schemaLocation, monitoredInstancesCriteriaFVO.schemaLocation) &&
        Objects.equals(this.monitoredObjectInstances, monitoredInstancesCriteriaFVO.monitoredObjectInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, monitoredObjectInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoredInstancesCriteriaFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    monitoredObjectInstances: ").append(toIndentedString(monitoredObjectInstances)).append("\n");
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

