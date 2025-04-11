package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TrackingRecordFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class TrackingRecordFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("href")
  protected String href = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("characteristic")
  @Valid
  private List<CharacteristicFVO> characteristic = new ArrayList<>();

  @JsonProperty("systemId")
  private String systemId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @JsonProperty("user")
  private String user;

  public TrackingRecordFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackingRecordFVO(String type) {
    this.type = type;
  }

  public TrackingRecordFVO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TrackingRecordFVO baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public TrackingRecordFVO schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TrackingRecordFVO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Describes the action being done, such as: ack, clear
   * @return description
  */
  
  @Schema(name = "description", example = "[\"acknowledge\",\"clear\"]", description = "Describes the action being done, such as: ack, clear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrackingRecordFVO characteristic(List<CharacteristicFVO> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public TrackingRecordFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * A generic list of any type of elements. Used for vendor Extensions or loose element encapsulation from other namespaces
   * @return characteristic
  */
  @Valid 
  @Schema(name = "characteristic", description = "A generic list of any type of elements. Used for vendor Extensions or loose element encapsulation from other namespaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CharacteristicFVO> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<CharacteristicFVO> characteristic) {
    this.characteristic = characteristic;
  }

  public TrackingRecordFVO systemId(String systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * Describes the system Id from which the action was done
   * @return systemId
  */
  
  @Schema(name = "systemId", description = "Describes the system Id from which the action was done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSystemId() {
    return systemId;
  }

  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  public TrackingRecordFVO time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Describes the time at which the action was done
   * @return time
  */
  @Valid 
  @Schema(name = "time", description = "Describes the time at which the action was done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public String getTimeString() {
    return (time != null) ? time.toString() : null;
  }

  public void setTime(String time) {
    if ( time!= null ) {
      this.time = OffsetDateTime.parse( time );
    }
  }

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public TrackingRecordFVO user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Describes the user doing the action
   * @return user
  */
  
  @Schema(name = "user", description = "Describes the user doing the action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingRecordFVO trackingRecordFVO = (TrackingRecordFVO) o;
    return Objects.equals(this.type, trackingRecordFVO.type) &&
        Objects.equals(this.baseType, trackingRecordFVO.baseType) &&
        Objects.equals(this.schemaLocation, trackingRecordFVO.schemaLocation) &&
        Objects.equals(this.description, trackingRecordFVO.description) &&
        Objects.equals(this.characteristic, trackingRecordFVO.characteristic) &&
        Objects.equals(this.systemId, trackingRecordFVO.systemId) &&
        Objects.equals(this.time, trackingRecordFVO.time) &&
        Objects.equals(this.user, trackingRecordFVO.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, description, characteristic, systemId, time, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingRecordFVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

