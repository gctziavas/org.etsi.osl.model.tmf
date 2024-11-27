package org.etsi.osl.tmf.pim637.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.service.Characteristic;
import org.etsi.osl.tmf.common.model.service.ResourceRef;
import org.etsi.osl.tmf.common.model.service.ServiceRef;
import org.etsi.osl.tmf.pcm620.model.ProductOfferingRef;
import org.etsi.osl.tmf.pcm620.model.ProductSpecificationRef;
import org.etsi.osl.tmf.po622.model.AgreementItemRef;
import org.etsi.osl.tmf.po622.model.RelatedProductOrderItem;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * A product to be created defined by value or existing defined by reference. The polymorphic
 * attributes @type, @schemaLocation &amp; @referredType are related to the product entity and not
 * the RelatedProductRefOrValue class itself
 */
@Schema(
    description = "A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product entity and not the RelatedProductRefOrValue class itself")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")

@Entity(name = "ProdRefOrVal637")
@JsonIgnoreProperties({"uuid"})
public class ProductRefOrValue extends Product {


  @Schema(description = "Unique identifier of the product")
  @NotNull

  public String getId() {
    if (id == null) {
      return super.getId();
    }
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Characteristic findCharacteristicByName(String aName) {
    for (Characteristic c : productCharacteristic) {
      if (c.getName().equals(aName)) {
        return c;
      }
    }

    return null;
  }

  public Object getRealizingServiceById(@NotNull String id) {
    for (ServiceRef sr : realizingService) {
      if ( sr.getId().equals(id)) {
          return sr;
      }
  }
    return null;
  }

  public Object getRealizingResourceById(@NotNull String id) {
    for (ResourceRef sr : realizingResource) {
      if ( sr.getId().equals(id)) {
          return sr;
      }
  }
    return null;
  }



}
