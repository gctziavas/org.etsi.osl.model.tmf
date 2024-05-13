package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * Sets the communication endpoint address the service instance must use to deliver notification information
 */

@Schema(name = "EventSubscription", description = "Sets the communication endpoint address the service instance must use to deliver notification information")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class EventSubscription {
  @JsonProperty("id")
  private String id;
  @JsonProperty("callback")
  private String callback;
  @JsonProperty("query")
  private String query;

  public EventSubscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventSubscription(String id, String callback) {
    this.id = id;
    this.callback = callback;
  }

  public EventSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the listener
   * @return id
  */
  @NotNull
  @Schema(name = "id", description = "Id of the listener", requiredMode = Schema.RequiredMode.REQUIRED)

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventSubscription callback(String callback) {
    this.callback = callback;
    return this;
  }

  /**
   * The callback being registered.
   * @return callback
  */
  @NotNull 
  @Schema(name = "callback", description = "The callback being registered.", requiredMode = Schema.RequiredMode.REQUIRED)

  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public EventSubscription query(String query) {
    this.query = query;
    return this;
  }

  /**
   * additional data to be passed
   * @return query
  */
  
  @Schema(name = "query", description = "additional data to be passed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.id, eventSubscription.id) &&
        Objects.equals(this.callback, eventSubscription.callback) &&
        Objects.equals(this.query, eventSubscription.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

