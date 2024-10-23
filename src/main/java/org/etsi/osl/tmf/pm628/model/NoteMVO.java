package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * NoteMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class NoteMVO {

  @JsonProperty("@type")
  private String type;

  @JsonProperty("@baseType")
  private String baseType;

  @JsonProperty("@schemaLocation")
  private String schemaLocation;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("author")
  private String author;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  @JsonProperty("text")
  private String text;

  public NoteMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NoteMVO(String type) {
    this.type = type;
  }

  public NoteMVO type(String type) {
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

  public NoteMVO baseType(String baseType) {
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

  public NoteMVO schemaLocation(String schemaLocation) {
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

  public NoteMVO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Identifier of the note within its containing entity
   * @return id
  */
  
  @Schema(name = "uuid", example = "afa9-3d90aaa8da0f", description = "Identifier of the note within its containing entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public NoteMVO author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Author of the note
   * @return author
  */
  
  @Schema(name = "author", example = "Mr. N. Bene", description = "Author of the note", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public NoteMVO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the note
   * @return date
  */
  @Valid 
  @Schema(name = "date", example = "2020-11-20T08:00Z", description = "Date of the note", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public NoteMVO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the note
   * @return text
  */
  
  @Schema(name = "text", example = "This is important", description = "Text of the note", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteMVO noteMVO = (NoteMVO) o;
    return Objects.equals(this.type, noteMVO.type) &&
        Objects.equals(this.baseType, noteMVO.baseType) &&
        Objects.equals(this.schemaLocation, noteMVO.schemaLocation) &&
        Objects.equals(this.uuid, noteMVO.uuid) &&
        Objects.equals(this.author, noteMVO.author) &&
        Objects.equals(this.date, noteMVO.date) &&
        Objects.equals(this.text, noteMVO.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, uuid, author, date, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteMVO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

