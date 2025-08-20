package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Topic;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "TopicDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class TopicDeleteEventPayload {

  private @Nullable Topic topic;

  public TopicDeleteEventPayload topic(@Nullable Topic topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @Valid 
  @Schema(name = "topic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topic")
  public @Nullable Topic getTopic() {
    return topic;
  }

  public void setTopic(@Nullable Topic topic) {
    this.topic = topic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicDeleteEventPayload topicDeleteEventPayload = (TopicDeleteEventPayload) o;
    return Objects.equals(this.topic, topicDeleteEventPayload.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicDeleteEventPayload {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

