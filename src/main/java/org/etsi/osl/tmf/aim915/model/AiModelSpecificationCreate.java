package org.etsi.osl.tmf.aim915.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.etsi.osl.tmf.aim915.model.AttachmentRefOrValue;
import org.etsi.osl.tmf.aim915.model.CharacteristicSpecification;
import org.etsi.osl.tmf.aim915.model.ConstraintRef;
import org.etsi.osl.tmf.aim915.model.EntitySpecificationRelationship;
import org.etsi.osl.tmf.aim915.model.FeatureSpecification;
import org.etsi.osl.tmf.aim915.model.RelatedParty;
import org.etsi.osl.tmf.aim915.model.ResourceSpecificationRef;
import org.etsi.osl.tmf.aim915.model.ServiceLevelSpecificationRef;
import org.etsi.osl.tmf.aim915.model.ServiceSpecRelationship;
import org.etsi.osl.tmf.aim915.model.TargetEntitySchema;
import org.etsi.osl.tmf.aim915.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AiModelSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same  specification, these services would therefore share the same set of characteristics. Skipped properties: id,href
 */

@Schema(name = "AiModelSpecification_Create", description = "AiModelSpecification is a class that offers characteristics to describe a type of service. Functionally, it acts as a template by which Services may be instantiated. By sharing the same  specification, these services would therefore share the same set of characteristics. Skipped properties: id,href")
@JsonTypeName("AiModelSpecification_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-20T10:43:54.824186919Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AiModelSpecificationCreate extends AiModelSpecificationUpdate {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  /**
   * Constructor with only required parameters
   */
  public AiModelSpecificationCreate() {
    super();
  }

  public AiModelSpecificationCreate lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update of the specification
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update of the specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModelSpecificationCreate aiModelSpecificationCreate = (AiModelSpecificationCreate) o;
    return Objects.equals(this.lastUpdate, aiModelSpecificationCreate.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelSpecificationCreate {\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

