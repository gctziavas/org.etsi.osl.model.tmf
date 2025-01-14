package org.etsi.osl.tmf.pim637.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.BaseRootNamedEntity;
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
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s).
 */
@Schema(description = "A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s).")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-04T00:27:07.324017400+03:00[Europe/Athens]")

@Entity(name = "Product637")
public class Product  extends BaseRootNamedEntity {
  @JsonProperty("id")
  protected String id = null;


  @JsonProperty("description")
  protected String description = null;

  @JsonProperty("isBundle")
  protected Boolean isBundle = null;

  @JsonProperty("isCustomerVisible")
  protected Boolean isCustomerVisible = null;

  @JsonProperty("orderDate")
  protected Date orderDate = null;

  @JsonProperty("productSerialNumber")
  protected String productSerialNumber = null;

  @JsonProperty("startDate")
  protected Date startDate = null;

  @JsonProperty("terminationDate")
  protected Date terminationDate = null;

  @JsonProperty("agreement")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<AgreementItemRef> agreement = new HashSet<>();

  @JsonProperty("billingAccount")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "billing_acc_refuuid", referencedColumnName = "uuid")
  protected BillingAccountRef billingAccount = null;

  @JsonProperty("place")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<RelatedPlaceRefOrValue> place = new HashSet<>();

  @JsonProperty("product")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ProductRefOrValue> product = new HashSet<>();

  @JsonProperty("productCharacteristic")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<Characteristic> productCharacteristic = new HashSet<>();

  @JsonProperty("productOffering")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "prodoff_refuuid", referencedColumnName = "uuid")
  protected ProductOfferingRef productOffering = null;

  @JsonProperty("productOrderItem")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<RelatedProductOrderItem> productOrderItem = new HashSet<>();

  @JsonProperty("productPrice")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ProductPrice> productPrice = new HashSet<>();

  @JsonProperty("productRelationship")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ProductRelationship> productRelationship = new HashSet<>();

  @JsonProperty("productSpecification")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "prodspec_refuuid", referencedColumnName = "uuid")
  protected ProductSpecificationRef productSpecification = null;

  @JsonProperty("productTerm")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ProductTerm> productTerm = new HashSet<>();

  @JsonProperty("realizingResource")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ResourceRef> realizingResource = new HashSet<>();

  @JsonProperty("realizingService")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<ServiceRef> realizingService = new HashSet<>();

  @JsonProperty("relatedParty")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  protected Set<RelatedParty> relatedParty = new HashSet<>();

  @JsonProperty("status")
  protected ProductStatusType status = null;


  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the product
   * @return id
   **/
  @Schema(description = "Unique identifier of the product")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the product
   * @return href
   **/
  @Schema(description = "Reference of the product")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Product description(String description) {
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

  public Product isBundle(Boolean isBundle) {
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

  public Product isCustomerVisible(Boolean isCustomerVisible) {
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

  public Product name(String name) {
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

  public Product orderDate(Date orderDate) {
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

  public Product productSerialNumber(String productSerialNumber) {
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

  public Product startDate(Date startDate) {
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

  public Product terminationDate(Date terminationDate) {
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

  public Product agreement(Set<AgreementItemRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public Product addAgreementItem(AgreementItemRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new HashSet<AgreementItemRef>();
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
    public Set<AgreementItemRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(Set<AgreementItemRef> agreement) {
    this.agreement = agreement;
  }

  public Product billingAccount(BillingAccountRef billingAccount) {
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

  public Product place(Set<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public Product addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new HashSet<RelatedPlaceRefOrValue>();
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
    public Set<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(Set<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public Product product(Set<ProductRefOrValue> product) {
    this.product = product;
    return this;
  }

  public Product addProductItem(ProductRefOrValue productItem) {
    if (this.product == null) {
      this.product = new HashSet<ProductRefOrValue>();
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
    public Set<ProductRefOrValue> getProduct() {
    return product;
  }

  public void setProduct(Set<ProductRefOrValue> product) {
    this.product = product;
  }

  public Product productCharacteristic(Set<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public Product addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new HashSet<Characteristic>();
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
    public Set<Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(Set<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public Product productOffering(ProductOfferingRef productOffering) {
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

  public Product productOrderItem(Set<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public Product addProductOrderItemItem(RelatedProductOrderItem productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new HashSet<RelatedProductOrderItem>();
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
    public Set<RelatedProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(Set<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public Product productPrice(Set<ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public Product addProductPriceItem(ProductPrice productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new HashSet<ProductPrice>();
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
    public Set<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Set<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public Product productRelationship(Set<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public Product addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new HashSet<ProductRelationship>();
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
    public Set<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(Set<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public Product productSpecification(ProductSpecificationRef productSpecification) {
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

  public Product productTerm(Set<ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public Product addProductTermItem(ProductTerm productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new HashSet<ProductTerm>();
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
    public Set<ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(Set<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public Product realizingResource(Set<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  public Product addRealizingResourceItem(ResourceRef realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new HashSet<ResourceRef>();
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
    public Set<ResourceRef> getRealizingResource() {
    return realizingResource;
  }

  public void setRealizingResource(Set<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public Product realizingService(Set<ServiceRef> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  public Product addRealizingServiceItem(ServiceRef realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new HashSet<ServiceRef>();
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
    public Set<ServiceRef> getRealizingService() {
    return realizingService;
  }

  public void setRealizingService(Set<ServiceRef> realizingService) {
    this.realizingService = realizingService;
  }

  public Product relatedParty(Set<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Product addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new HashSet<RelatedParty>();
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
    public Set<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(Set<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Product status(ProductStatusType status) {
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

 

 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.href, product.href) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.isBundle, product.isBundle) &&
        Objects.equals(this.isCustomerVisible, product.isCustomerVisible) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.orderDate, product.orderDate) &&
        Objects.equals(this.productSerialNumber, product.productSerialNumber) &&
        Objects.equals(this.startDate, product.startDate) &&
        Objects.equals(this.terminationDate, product.terminationDate) &&
        Objects.equals(this.agreement, product.agreement) &&
        Objects.equals(this.billingAccount, product.billingAccount) &&
        Objects.equals(this.place, product.place) &&
        Objects.equals(this.product, product.product) &&
        Objects.equals(this.productCharacteristic, product.productCharacteristic) &&
        Objects.equals(this.productOffering, product.productOffering) &&
        Objects.equals(this.productOrderItem, product.productOrderItem) &&
        Objects.equals(this.productPrice, product.productPrice) &&
        Objects.equals(this.productRelationship, product.productRelationship) &&
        Objects.equals(this.productSpecification, product.productSpecification) &&
        Objects.equals(this.productTerm, product.productTerm) &&
        Objects.equals(this.realizingResource, product.realizingResource) &&
        Objects.equals(this.realizingService, product.realizingService) &&
        Objects.equals(this.relatedParty, product.relatedParty) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.baseType, product.baseType) &&
        Objects.equals(this.schemaLocation, product.schemaLocation) &&
        Objects.equals(this.type, product.type);
  }

//  @Override
//  public int hashCode() {
//    return Objects.hash(id, href, description, isBundle, isCustomerVisible, name, orderDate, 
//        productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, baseType, _atSchemaLocation, _atType);
//  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
