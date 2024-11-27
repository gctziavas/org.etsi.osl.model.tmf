package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Objects;

/**
 * FileTransferDataMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FileTransferDataMVO extends ProtocolTransferData {

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

  public FileTransferDataMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FileTransferDataMVO(String type) {
    super();
    this.type = type;
  }

  public FileTransferDataMVO type(String type) {
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

  public FileTransferDataMVO baseType(String baseType) {
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

  public FileTransferDataMVO schemaLocation(String schemaLocation) {
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

  public FileTransferDataMVO fileLocation(URI fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  /**
   * Get fileLocation
   * @return fileLocation
  */
  @Valid 
  @Schema(name = "fileLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileLocation")
  public URI getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(URI fileLocation) {
    this.fileLocation = fileLocation;
  }

  public FileTransferDataMVO fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Get fileFormat
   * @return fileFormat
  */
  
  @Schema(name = "fileFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileFormat")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public FileTransferDataMVO compressionType(CompressionType compressionType) {
    this.compressionType = compressionType;
    return this;
  }

  /**
   * Get compressionType
   * @return compressionType
  */
  @Valid 
  @Schema(name = "compressionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compressionType")
  public CompressionType getCompressionType() {
    return compressionType;
  }

  public void setCompressionType(CompressionType compressionType) {
    this.compressionType = compressionType;
  }

  public FileTransferDataMVO retentionPeriod(Duration retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
    return this;
  }

  /**
   * Get retentionPeriod
   * @return retentionPeriod
  */
  @Valid 
  @Schema(name = "retentionPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionPeriod")
  public Duration getRetentionPeriod() {
    return retentionPeriod;
  }

  public void setRetentionPeriod(Duration retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
  }

  public FileTransferDataMVO packingType(PackingType packingType) {
    this.packingType = packingType;
    return this;
  }

  /**
   * Get packingType
   * @return packingType
  */
  @Valid 
  @Schema(name = "packingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packingType")
  public PackingType getPackingType() {
    return packingType;
  }

  public void setPackingType(PackingType packingType) {
    this.packingType = packingType;
  }


  public FileTransferDataMVO transportProtocol(String transportProtocol) {
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
    FileTransferDataMVO fileTransferDataMVO = (FileTransferDataMVO) o;
    return Objects.equals(this.type, fileTransferDataMVO.type) &&
        Objects.equals(this.baseType, fileTransferDataMVO.baseType) &&
        Objects.equals(this.schemaLocation, fileTransferDataMVO.schemaLocation) &&
        Objects.equals(this.fileLocation, fileTransferDataMVO.fileLocation) &&
        Objects.equals(this.fileFormat, fileTransferDataMVO.fileFormat) &&
        Objects.equals(this.compressionType, fileTransferDataMVO.compressionType) &&
        Objects.equals(this.retentionPeriod, fileTransferDataMVO.retentionPeriod) &&
        Objects.equals(this.packingType, fileTransferDataMVO.packingType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, fileLocation, fileFormat, compressionType, retentionPeriod, packingType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTransferDataMVO {\n");
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

