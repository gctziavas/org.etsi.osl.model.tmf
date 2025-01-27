package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TrackingRecord
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_TrackRec")
public class TrackingRecord extends BaseRootEntity {

  @JsonProperty("description")
  private String description;

  @JsonProperty("characteristic")
  @Valid
  @ManyToMany(cascade = {  CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(
          name = "pm628_track_rec_char",
          joinColumns = @JoinColumn(name = "track_rec_uuid"),
          inverseJoinColumns = @JoinColumn(name = "char_uuid")
  )
  private List<Characteristic> characteristic = new ArrayList<>();

  @JsonProperty("systemId")
  private String systemId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @JsonProperty("user")
  private String user;

  public TrackingRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackingRecord(String type) {
    this.type = type;
  }
  
  public TrackingRecord description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Describes the action being done, such as: ack, clear
   * @return description
  */
  
  @Schema(name = "description", example = "[\"acknowledge\",\"clear\"]", description = "Describes the action being done, such as: ack, clear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrackingRecord characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public TrackingRecord addCharacteristicItem(Characteristic characteristicItem) {
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
  @JsonProperty("characteristic")
  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public TrackingRecord systemId(String systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * Describes the system Id from which the action was done
   * @return systemId
  */
  
  @Schema(name = "systemId", description = "Describes the system Id from which the action was done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemId")
  public String getSystemId() {
    return systemId;
  }

  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  public TrackingRecord time(OffsetDateTime time) {
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
    return time.toString();
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

  public TrackingRecord user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Describes the user doing the action
   * @return user
  */
  
  @Schema(name = "user", description = "Describes the user doing the action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
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
    TrackingRecord trackingRecord = (TrackingRecord) o;
    return Objects.equals(this.type, trackingRecord.type) &&
        Objects.equals(this.baseType, trackingRecord.baseType) &&
        Objects.equals(this.schemaLocation, trackingRecord.schemaLocation) &&
        Objects.equals(this.description, trackingRecord.description) &&
        Objects.equals(this.characteristic, trackingRecord.characteristic) &&
        Objects.equals(this.systemId, trackingRecord.systemId) &&
        Objects.equals(this.time, trackingRecord.time) &&
        Objects.equals(this.user, trackingRecord.user) &&
        Objects.equals(this.uuid, trackingRecord.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, description, characteristic, systemId, time, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingRecord {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
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

