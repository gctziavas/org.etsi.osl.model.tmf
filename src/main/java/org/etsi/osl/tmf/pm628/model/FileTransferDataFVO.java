package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Objects;

/**
 * FileTransferDataFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FileTransferDataFVO extends ProtocolTransferDataFVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("fileLocation")
  private URI fileLocation;

  @JsonProperty("fileFormat")
  private String fileFormat;

  @JsonProperty("compressionType")
  private CompressionType compressionType;

  @JsonProperty("retentionPeriod")
  private Duration retentionPeriod;

  @JsonProperty("packingType")
  private PackingType packingType;

  public FileTransferDataFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FileTransferDataFVO(String type) {
    super();
    this.type = type;
  }

  public FileTransferDataFVO type(String type) {
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

  public FileTransferDataFVO baseType(String baseType) {
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

  public FileTransferDataFVO schemaLocation(String schemaLocation) {
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

  public FileTransferDataFVO fileLocation(URI fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  /**
   * Get fileLocation
   * @return fileLocation
  */
  @Valid 
  @Schema(name = "fileLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(URI fileLocation) {
    this.fileLocation = fileLocation;
  }

  public FileTransferDataFVO fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Get fileFormat
   * @return fileFormat
  */
  
  @Schema(name = "fileFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public FileTransferDataFVO compressionType(CompressionType compressionType) {
    this.compressionType = compressionType;
    return this;
  }

  /**
   * Get compressionType
   * @return compressionType
  */
  @Valid 
  @Schema(name = "compressionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CompressionType getCompressionType() {
    return compressionType;
  }

  public void setCompressionType(CompressionType compressionType) {
    this.compressionType = compressionType;
  }

  public FileTransferDataFVO retentionPeriod(Duration retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
    return this;
  }

  /**
   * Get retentionPeriod
   * @return retentionPeriod
  */
  @Valid 
  @Schema(name = "retentionPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Duration getRetentionPeriod() {
    return retentionPeriod;
  }

  public void setRetentionPeriod(Duration retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
  }

  public FileTransferDataFVO packingType(PackingType packingType) {
    this.packingType = packingType;
    return this;
  }

  /**
   * Get packingType
   * @return packingType
  */
  @Valid 
  @Schema(name = "packingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PackingType getPackingType() {
    return packingType;
  }

  public void setPackingType(PackingType packingType) {
    this.packingType = packingType;
  }


  public FileTransferDataFVO transportProtocol(String transportProtocol) {
    super.transportProtocol(transportProtocol);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileTransferDataFVO fileTransferDataFVO = (FileTransferDataFVO) o;
    return Objects.equals(this.type, fileTransferDataFVO.type) &&
        Objects.equals(this.baseType, fileTransferDataFVO.baseType) &&
        Objects.equals(this.schemaLocation, fileTransferDataFVO.schemaLocation) &&
        Objects.equals(this.fileLocation, fileTransferDataFVO.fileLocation) &&
        Objects.equals(this.fileFormat, fileTransferDataFVO.fileFormat) &&
        Objects.equals(this.compressionType, fileTransferDataFVO.compressionType) &&
        Objects.equals(this.retentionPeriod, fileTransferDataFVO.retentionPeriod) &&
        Objects.equals(this.packingType, fileTransferDataFVO.packingType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, fileLocation, fileFormat, compressionType, retentionPeriod, packingType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTransferDataFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
    sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
    sb.append("    packingType: ").append(toIndentedString(packingType)).append("\n");
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

