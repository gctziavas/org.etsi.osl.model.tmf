package org.etsi.osl.tmf.pim637.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.service.Characteristic;
import org.etsi.osl.tmf.common.model.service.ResourceRef;
import org.etsi.osl.tmf.common.model.service.ServiceRef;
import org.etsi.osl.tmf.pcm620.model.ProductOfferingRef;
import org.etsi.osl.tmf.po622.model.AgreementItemRef;
import org.etsi.osl.tmf.po622.model.RelatedProductOrderItem;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s). Skipped properties: id,href
 */
@Schema(description = "A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s). Skipped properties: id,href")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")


public class ProductUpdate   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isCustomerVisible")
  private Boolean isCustomerVisible = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orderDate")
  private Date orderDate = null;

  @JsonProperty("productSerialNumber")
  private String productSerialNumber = null;

  @JsonProperty("startDate")
  private Date startDate = null;

  @JsonProperty("terminationDate")
  private Date terminationDate = null;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementItemRef> agreement = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("place")
  @Valid
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("product")
  @Valid
  private List<ProductRefOrValue> product = null;

  @JsonProperty("productCharacteristic")
  @Valid
  private List<Characteristic> productCharacteristic = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  @JsonProperty("productOrderItem")
  @Valid
  private List<RelatedProductOrderItem> productOrderItem = null;

  @JsonProperty("productPrice")
  @Valid
  private List<ProductPrice> productPrice = null;

  @JsonProperty("productRelationship")
  @Valid
  private List<ProductRelationship> productRelationship = null;

  @JsonProperty("productSpecification")
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("productTerm")
  @Valid
  private List<ProductTerm> productTerm = null;

  @JsonProperty("realizingResource")
  @Valid
  private List<ResourceRef> realizingResource = null;

  @JsonProperty("realizingService")
  @Valid
  private List<ServiceRef> realizingService = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("status")
  private ProductStatusType status = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ProductUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   * @return description
   **/
  @Schema(description = "Is the description of the product. It could be copied from the description of the Product Offering.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductUpdate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.
   * @return isBundle
   **/
  @Schema(description = "If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.")
      @NotNull

    public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductUpdate isCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
    return this;
  }

  /**
   * If true, the product is visible by the customer.
   * @return isCustomerVisible
   **/
  @Schema(description = "If true, the product is visible by the customer.")
      @NotNull

    public Boolean isIsCustomerVisible() {
    return isCustomerVisible;
  }

  public void setIsCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
  }

  public ProductUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product. It could be the same as the name of the product offering
   * @return name
   **/
  @Schema(description = "Name of the product. It could be the same as the name of the product offering")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductUpdate orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Is the date when the product was ordered
   * @return orderDate
   **/
  @Schema(description = "Is the date when the product was ordered")
      @NotNull

    @Valid
    public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public ProductUpdate productSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
    return this;
  }

  /**
   * Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.
   * @return productSerialNumber
   **/
  @Schema(description = "Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.")
      @NotNull

    public String getProductSerialNumber() {
    return productSerialNumber;
  }

  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  public ProductUpdate startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Is the date from which the product starts
   * @return startDate
   **/
  @Schema(description = "Is the date from which the product starts")
      @NotNull

    @Valid
    public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ProductUpdate terminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Is the date when the product was terminated
   * @return terminationDate
   **/
  @Schema(description = "Is the date when the product was terminated")
      @NotNull

    @Valid
    public Date getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  public ProductUpdate agreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductUpdate addAgreementItem(AgreementItemRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementItemRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<AgreementItemRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
  }

  public ProductUpdate billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductUpdate place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ProductUpdate addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ProductUpdate product(List<ProductRefOrValue> product) {
    this.product = product;
    return this;
  }

  public ProductUpdate addProductItem(ProductRefOrValue productItem) {
    if (this.product == null) {
      this.product = new ArrayList<ProductRefOrValue>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductRefOrValue> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRefOrValue> product) {
    this.product = product;
  }

  public ProductUpdate productCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public ProductUpdate addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<Characteristic>();
    }
    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

  /**
   * Get productCharacteristic
   * @return productCharacteristic
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductUpdate productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductUpdate productOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public ProductUpdate addProductOrderItemItem(RelatedProductOrderItem productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<RelatedProductOrderItem>();
    }
    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  /**
   * Get productOrderItem
   * @return productOrderItem
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductUpdate productPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public ProductUpdate addProductPriceItem(ProductPrice productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new ArrayList<ProductPrice>();
    }
    this.productPrice.add(productPriceItem);
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public ProductUpdate productRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public ProductUpdate addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<ProductRelationship>();
    }
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

  /**
   * Get productRelationship
   * @return productRelationship
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public ProductUpdate productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductUpdate productTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public ProductUpdate addProductTermItem(ProductTerm productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new ArrayList<ProductTerm>();
    }
    this.productTerm.add(productTermItem);
    return this;
  }

  /**
   * Get productTerm
   * @return productTerm
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public ProductUpdate realizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  public ProductUpdate addRealizingResourceItem(ResourceRef realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new ArrayList<ResourceRef>();
    }
    this.realizingResource.add(realizingResourceItem);
    return this;
  }

  /**
   * Get realizingResource
   * @return realizingResource
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ResourceRef> getRealizingResource() {
    return realizingResource;
  }

  public void setRealizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public ProductUpdate realizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  public ProductUpdate addRealizingServiceItem(ServiceRef realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new ArrayList<ServiceRef>();
    }
    this.realizingService.add(realizingServiceItem);
    return this;
  }

  /**
   * Get realizingService
   * @return realizingService
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ServiceRef> getRealizingService() {
    return realizingService;
  }

  public void setRealizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
  }

  public ProductUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductUpdate status(ProductStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductStatusType getStatus() {
    return status;
  }

  public void setStatus(ProductStatusType status) {
    this.status = status;
  }

  public ProductUpdate _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
      @NotNull

    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ProductUpdate _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
      @NotNull

    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ProductUpdate _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
      @NotNull

    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUpdate productUpdate = (ProductUpdate) o;
    return Objects.equals(this.description, productUpdate.description) &&
        Objects.equals(this.isBundle, productUpdate.isBundle) &&
        Objects.equals(this.isCustomerVisible, productUpdate.isCustomerVisible) &&
        Objects.equals(this.name, productUpdate.name) &&
        Objects.equals(this.orderDate, productUpdate.orderDate) &&
        Objects.equals(this.productSerialNumber, productUpdate.productSerialNumber) &&
        Objects.equals(this.startDate, productUpdate.startDate) &&
        Objects.equals(this.terminationDate, productUpdate.terminationDate) &&
        Objects.equals(this.agreement, productUpdate.agreement) &&
        Objects.equals(this.billingAccount, productUpdate.billingAccount) &&
        Objects.equals(this.place, productUpdate.place) &&
        Objects.equals(this.product, productUpdate.product) &&
        Objects.equals(this.productCharacteristic, productUpdate.productCharacteristic) &&
        Objects.equals(this.productOffering, productUpdate.productOffering) &&
        Objects.equals(this.productOrderItem, productUpdate.productOrderItem) &&
        Objects.equals(this.productPrice, productUpdate.productPrice) &&
        Objects.equals(this.productRelationship, productUpdate.productRelationship) &&
        Objects.equals(this.productSpecification, productUpdate.productSpecification) &&
        Objects.equals(this.productTerm, productUpdate.productTerm) &&
        Objects.equals(this.realizingResource, productUpdate.realizingResource) &&
        Objects.equals(this.realizingService, productUpdate.realizingService) &&
        Objects.equals(this.relatedParty, productUpdate.relatedParty) &&
        Objects.equals(this.status, productUpdate.status) &&
        Objects.equals(this._atBaseType, productUpdate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, productUpdate._atSchemaLocation) &&
        Objects.equals(this._atType, productUpdate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, isCustomerVisible, name, orderDate, productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isCustomerVisible: ").append(toIndentedString(isCustomerVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    productSerialNumber: ").append(toIndentedString(productSerialNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    realizingResource: ").append(toIndentedString(realizingResource)).append("\n");
    sb.append("    realizingService: ").append(toIndentedString(realizingService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
