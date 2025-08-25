package org.etsi.osl.tmf.aim915.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Identifies the managed object instance associated with the alarm.
 */

@Schema(name = "AlarmedObject", description = "Identifies the managed object instance associated with the alarm.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AlarmedObject {

  private @Nullable String id;

  private @Nullable String href;

  public AlarmedObject id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the managed object associated with the event.
   * @return id
   */
  
  @Schema(name = "id", description = "The identifier of the managed object associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AlarmedObject href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * A reference to the managed object associated with the event.
   * @return href
   */
  
  @Schema(name = "href", description = "A reference to the managed object associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmedObject alarmedObject = (AlarmedObject) o;
    return Objects.equals(this.id, alarmedObject.id) &&
        Objects.equals(this.href, alarmedObject.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmedObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

