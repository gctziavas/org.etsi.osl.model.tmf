package org.etsi.osl.tmf.gsm674.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * The event data structure
 */

@Schema(name = "GeographicSiteEventPayload", description = "The event data structure")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class GeographicSiteEventPayload {
  @JsonProperty("geographicSite")
  private GeographicSite geographicSite;

  public GeographicSiteEventPayload geographicSite(GeographicSite geographicSite) {
    this.geographicSite = geographicSite;
    return this;
  }

  /**
   * Get geographicSite
   * @return geographicSite
  */
  @Valid
  @Schema(name = "geographicSite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public GeographicSite getGeographicSite() {
    return geographicSite;
  }

  public void setGeographicSite(GeographicSite geographicSite) {
    this.geographicSite = geographicSite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSiteEventPayload geographicSiteEventPayload = (GeographicSiteEventPayload) o;
    return Objects.equals(this.geographicSite, geographicSiteEventPayload.geographicSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteEventPayload {\n");
    sb.append("    geographicSite: ").append(toIndentedString(geographicSite)).append("\n");
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

