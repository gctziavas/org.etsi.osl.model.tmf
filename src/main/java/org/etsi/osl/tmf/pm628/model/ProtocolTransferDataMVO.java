package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * ProtocolTransferDataMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ProtocolTransferDataMVO {

  @JsonProperty("transportProtocol")
  private String transportProtocol;

  public ProtocolTransferDataMVO transportProtocol(String transportProtocol) {
    this.transportProtocol = transportProtocol;
    return this;
  }

  /**
   * Get transportProtocol
   * @return transportProtocol
  */
  
  @Schema(name = "transportProtocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTransportProtocol() {
    return transportProtocol;
  }

  public void setTransportProtocol(String transportProtocol) {
    this.transportProtocol = transportProtocol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtocolTransferDataMVO protocolTransferDataMVO = (ProtocolTransferDataMVO) o;
    return Objects.equals(this.transportProtocol, protocolTransferDataMVO.transportProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolTransferDataMVO {\n");
    sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
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

