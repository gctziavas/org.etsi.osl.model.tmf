/*-
 * ========================LICENSE_START=================================
 * org.etsi.osl.tmf.api
 * %%
 * Copyright (C) 2019 - 2021 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package org.etsi.osl.tmf.po622.model;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.etsi.osl.tmf.common.model.BaseRootEntity;
import org.etsi.osl.tmf.common.model.UserPartRoleType;
import org.etsi.osl.tmf.common.model.service.Note;
import org.etsi.osl.tmf.pim637.model.BillingAccountRef;
import org.etsi.osl.tmf.prm669.model.RelatedParty;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A Product Order is a type of order which can be used to place an order between a customer and a
 * service provider or between a service provider and a partner and vice versa,
 */
@Schema(
    description = "A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa,")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-10-30T10:29:21.184964400+02:00[Europe/Athens]")

@Entity(name = "ProductOrder")
@JsonIgnoreProperties("orderRequester")
public class ProductOrder extends BaseRootEntity {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cancellationDate")
  private OffsetDateTime cancellationDate = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("category")
  private String category = null;


  private OffsetDateTime completionDate = null;

  @Lob
  @Column(name = "LDESCRIPTION", columnDefinition = "LONGTEXT")
  @JsonProperty("description")
  private String description = null;;


  private OffsetDateTime expectedCompletionDate = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("notificationContact")
  private String notificationContact = null;

  private OffsetDateTime orderDate = null;

  @JsonProperty("priority")
  private String priority = null;


  private OffsetDateTime requestedCompletionDate = null;

  private OffsetDateTime requestedStartDate = null;

  @JsonProperty("agreement")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<AgreementRef> agreement = new HashSet<>();

  @JsonProperty("billingAccount")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "billing_acc_refuuid", referencedColumnName = "uuid")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("channel")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<RelatedChannel> channel = new HashSet<>();

  @JsonProperty("note")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<Note> note = new HashSet<>();

  @JsonProperty("orderTotalPrice")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<OrderPrice> orderTotalPrice = new HashSet<>();

  @JsonProperty("payment")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<PaymentRef> payment = new HashSet<>();

  @JsonProperty("productOfferingQualification")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<ProductOfferingQualificationRef> productOfferingQualification = new HashSet<>();

  @JsonProperty("productOrderItem")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<ProductOrderItem> productOrderItem = new HashSet<>();

  @JsonProperty("quote")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<QuoteRef> quote = new HashSet<>();

  @JsonProperty("relatedParty")
  @Valid
  @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  private Set<RelatedParty> relatedParty = new HashSet<>();

  @JsonProperty("state")
  private ProductOrderStateType state = ProductOrderStateType.INITIAL;



  /**
   * ID created on repository side (OM system)
   * 
   * @return id
   **/
  @Schema(description = "ID created on repository side (OM system)")

  public String getId() {
    if ((id != null) && (uuid == null)) { // this check is good for external partners when no uuid
                                          // exists
      return id;
    }
    return uuid;
  }


  public ProductOrder href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the order
   * 
   * @return href
   **/
  @Schema(description = "Hyperlink to access the order")

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOrder cancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled. This is used when order is cancelled.
   * 
   * @return cancellationDate
   **/
  @Schema(description = "Date when the order is cancelled. This is used when order is cancelled. ")

  @Valid
  public OffsetDateTime getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public ProductOrder cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled. This is used when order is cancelled.
   * 
   * @return cancellationReason
   **/
  @Schema(description = "Reason why the order is cancelled. This is used when order is cancelled. ")

  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public ProductOrder category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used to categorize the order from a business perspective that can be useful for the OM system
   * (e.g. \"enterprise\", \"residential\", ...)
   * 
   * @return category
   **/
  @Schema(
      description = "Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...)")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProductOrder completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date when the order was completed
   * 
   * @return completionDate
   **/
  @Schema(description = "Date when the order was completed")

  @Valid
  @JsonProperty("completionDate")
  public String getCompletionDateString() {
    if (this.completionDate == null) {
      return null;
    }
    return this.completionDate.toString();
  }

  @Valid
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public void setCompletionDate(String completionDate) {
    if (completionDate != null) {
      this.completionDate = OffsetDateTime.parse(completionDate);
    }
  }


  public ProductOrder description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the product order
   * 
   * @return description
   **/
  @Schema(description = "Description of the product order")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOrder expectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  /**
   * Expected delivery date amended by the provider
   * 
   * @return expectedCompletionDate
   **/
  @Schema(description = "Expected delivery date amended by the provider")

  @JsonProperty("expectedCompletionDate")
  public String getExpectedCompletionDateString() {

    if (this.expectedCompletionDate == null) {
      return null;
    }
    return this.expectedCompletionDate.toString();
  }

  @Valid
  public OffsetDateTime getExpectedCompletionDate() {
    return expectedCompletionDate;
  }

  public void setExpectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

  public void setExpectedCompletionDate(String expectedCompletionDate) {
    if (expectedCompletionDate != null) {
      this.expectedCompletionDate = OffsetDateTime.parse(expectedCompletionDate);

    }
  }

  public ProductOrder externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
   * 
   * @return externalId
   **/
  @Schema(
      description = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)")

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ProductOrder notificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
    return this;
  }

  /**
   * Contact attached to the order to send back information regarding this order
   * 
   * @return notificationContact
   **/
  @Schema(
      description = "Contact attached to the order to send back information regarding this order")

  public String getNotificationContact() {
    return notificationContact;
  }

  public void setNotificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
  }

  public ProductOrder orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Date when the order was created
   * 
   * @return orderDate
   **/
  @Schema(description = "Date when the order was created")

  @Valid
  @JsonProperty("orderDate")
  public String getOrderDateString() {
    if (this.orderDate == null) {
      return null;
    }
    return this.orderDate.toString();
  }

  @Valid
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public void setOrderDate(String orderDate) {

    if (orderDate != null) {
      this.orderDate = OffsetDateTime.parse(orderDate);

    }
  }

  public ProductOrder priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the
   * highest priority, and 4 the lowest)
   * 
   * @return priority
   **/
  @Schema(
      description = "A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)")

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ProductOrder requestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  /**
   * Requested delivery date from the requestor perspective
   * 
   * @return requestedCompletionDate
   **/
  @Schema(description = "Requested delivery date from the requestor perspective")

  @Valid
  @JsonProperty("requestedCompletionDate")
  public String getRequestedCompletionDateString() {

    if (this.requestedCompletionDate == null) {
      return null;
    }
    return this.requestedCompletionDate.toString();
  }

  @Valid
  public OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public void setRequestedCompletionDate(String requestedCompletionDate) {

    if (requestedCompletionDate != null) {
      this.requestedCompletionDate = OffsetDateTime.parse(requestedCompletionDate);

    }
  }

  public ProductOrder requestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * Order fulfillment start date wished by the requestor. This is used when, for any reason,
   * requestor cannot allow seller to begin to operationally begin the fulfillment before a date.
   * 
   * @return requestedStartDate
   **/
  @Schema(
      description = "Order fulfillment start date wished by the requestor. This is used when, for any reason, requestor cannot allow seller to begin to operationally begin the fulfillment before a date. ")

  @Valid
  @JsonProperty("requestedStartDate")
  public String getRequestedStartDateString() {

    if (this.requestedStartDate == null) {
      return null;
    }
    return this.requestedStartDate.toString();
  }

  @Valid
  public OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }


  public void setRequestedStartDate(String requestedStartDate) {

    if (requestedStartDate != null) {
      this.requestedStartDate = OffsetDateTime.parse(requestedStartDate);

    }
  }

  public ProductOrder agreement(Set<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductOrder addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new HashSet<>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * A reference to an agreement defined in the context of the product order
   * 
   * @return agreement
   **/
  @Schema(description = "A reference to an agreement defined in the context of the product order")
  @Valid
  public Set<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(Set<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public ProductOrder billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * 
   * @return billingAccount
   **/
  @Schema(description = "")

  @Valid
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductOrder channel(Set<RelatedChannel> channel) {
    this.channel = channel;
    return this;
  }

  public ProductOrder addChannelItem(RelatedChannel channelItem) {
    if (this.channel == null) {
      this.channel = new HashSet<>();
    }
    this.channel.add(channelItem);
    return this;
  }

  /**
   * Get channel
   * 
   * @return channel
   **/
  @Schema(description = "")
  @Valid
  public Set<RelatedChannel> getChannel() {
    return channel;
  }

  public void setChannel(Set<RelatedChannel> channel) {
    this.channel = channel;
  }

  public ProductOrder note(Set<Note> note) {
    this.note = note;
    return this;
  }

  public ProductOrder addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new HashSet<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Get note
   * 
   * @return note
   **/
  @Schema(description = "")
  @Valid
  public Set<Note> getNote() {
    return note;
  }

  public void setNote(Set<Note> note) {
    this.note = note;
  }

  public ProductOrder orderTotalPrice(Set<OrderPrice> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
    return this;
  }

  public ProductOrder addOrderTotalPriceItem(OrderPrice orderTotalPriceItem) {
    if (this.orderTotalPrice == null) {
      this.orderTotalPrice = new HashSet<>();
    }
    this.orderTotalPrice.add(orderTotalPriceItem);
    return this;
  }

  /**
   * Get orderTotalPrice
   * 
   * @return orderTotalPrice
   **/
  @Schema(description = "")
  @Valid
  public Set<OrderPrice> getOrderTotalPrice() {
    return orderTotalPrice;
  }

  public void setOrderTotalPrice(Set<OrderPrice> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
  }

  public ProductOrder payment(Set<PaymentRef> payment) {
    this.payment = payment;
    return this;
  }

  public ProductOrder addPaymentItem(PaymentRef paymentItem) {
    if (this.payment == null) {
      this.payment = new HashSet<>();
    }
    this.payment.add(paymentItem);
    return this;
  }

  /**
   * Get payment
   * 
   * @return payment
   **/
  @Schema(description = "")
  @Valid
  public Set<PaymentRef> getPayment() {
    return payment;
  }

  public void setPayment(Set<PaymentRef> payment) {
    this.payment = payment;
  }

  public ProductOrder productOfferingQualification(
      Set<ProductOfferingQualificationRef> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
    return this;
  }

  public ProductOrder addProductOfferingQualificationItem(
      ProductOfferingQualificationRef productOfferingQualificationItem) {
    if (this.productOfferingQualification == null) {
      this.productOfferingQualification = new HashSet<>();
    }
    this.productOfferingQualification.add(productOfferingQualificationItem);
    return this;
  }

  /**
   * Get productOfferingQualification
   * 
   * @return productOfferingQualification
   **/
  @Schema(description = "")
  @Valid
  public Set<ProductOfferingQualificationRef> getProductOfferingQualification() {
    return productOfferingQualification;
  }

  public void setProductOfferingQualification(
      Set<ProductOfferingQualificationRef> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
  }

  public ProductOrder productOrderItem(Set<ProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public ProductOrder addProductOrderItemItem(ProductOrderItem productOrderItemItem) {
    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  /**
   * Get productOrderItem
   * 
   * @return productOrderItem
   **/
  @Schema(description = "")
  @NotNull
  @Valid
  @Size(min = 1)
  public Set<ProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(Set<ProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductOrder quote(Set<QuoteRef> quote) {
    this.quote = quote;
    return this;
  }

  public ProductOrder addQuoteItem(QuoteRef quoteItem) {
    if (this.quote == null) {
      this.quote = new HashSet<>();
    }
    this.quote.add(quoteItem);
    return this;
  }

  /**
   * Get quote
   * 
   * @return quote
   **/
  @Schema(description = "")
  @Valid
  public Set<QuoteRef> getQuote() {
    return quote;
  }

  public void setQuote(Set<QuoteRef> quote) {
    this.quote = quote;
  }

  public ProductOrder relatedParty(Set<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOrder addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new HashSet<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * 
   * @return relatedParty
   **/
  @Schema(description = "")
  @Valid
  public Set<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(Set<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductOrder state(ProductOrderStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * 
   * @return state
   **/
  @Schema(description = "")

  @Valid
  public ProductOrderStateType getState() {
    return state;
  }

  public void setState(ProductOrderStateType state) {
    this.state = state;
  }

  public ProductOrder baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * 
   * @return baseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")

  public String getAtBaseType() {
    return baseType;
  }

  public void setAtBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductOrder schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * 
   * @return schemaLocation
   **/
  @Schema(
      description = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  public String getAtSchemaLocation() {
    return schemaLocation;
  }

  public void setAtSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductOrder type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * 
   * @return type
   **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")

  public String getAtType() {
    return type;
  }

  public void setAtType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrder productOrder = (ProductOrder) o;
    return Objects.equals(this.id, productOrder.id) && Objects.equals(this.href, productOrder.href)
        && Objects.equals(this.cancellationDate, productOrder.cancellationDate)
        && Objects.equals(this.cancellationReason, productOrder.cancellationReason)
        && Objects.equals(this.category, productOrder.category)
        && Objects.equals(this.completionDate, productOrder.completionDate)
        && Objects.equals(this.description, productOrder.description)
        && Objects.equals(this.expectedCompletionDate, productOrder.expectedCompletionDate)
        && Objects.equals(this.externalId, productOrder.externalId)
        && Objects.equals(this.notificationContact, productOrder.notificationContact)
        && Objects.equals(this.orderDate, productOrder.orderDate)
        && Objects.equals(this.priority, productOrder.priority)
        && Objects.equals(this.requestedCompletionDate, productOrder.requestedCompletionDate)
        && Objects.equals(this.requestedStartDate, productOrder.requestedStartDate)
        && Objects.equals(this.agreement, productOrder.agreement)
        && Objects.equals(this.billingAccount, productOrder.billingAccount)
        && Objects.equals(this.channel, productOrder.channel)
        && Objects.equals(this.note, productOrder.note)
        && Objects.equals(this.orderTotalPrice, productOrder.orderTotalPrice)
        && Objects.equals(this.payment, productOrder.payment)
        && Objects.equals(this.productOfferingQualification,
            productOrder.productOfferingQualification)
        && Objects.equals(this.productOrderItem, productOrder.productOrderItem)
        && Objects.equals(this.quote, productOrder.quote)
        && Objects.equals(this.relatedParty, productOrder.relatedParty)
        && Objects.equals(this.state, productOrder.state)
        && Objects.equals(this.baseType, productOrder.baseType)
        && Objects.equals(this.schemaLocation, productOrder.schemaLocation)
        && Objects.equals(this.type, productOrder.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationDate, cancellationReason, category, completionDate,
        description, expectedCompletionDate, externalId, notificationContact, orderDate, priority,
        requestedCompletionDate, requestedStartDate, agreement, billingAccount, channel, note,
        orderTotalPrice, payment, productOfferingQualification, productOrderItem, quote,
        relatedParty, state, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrder {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate))
        .append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact))
        .append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate))
        .append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    productOfferingQualification: ")
        .append(toIndentedString(productOfferingQualification)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public ProductOrderItem findOrderItemById(String id) {
    for (ProductOrderItem oi : this.productOrderItem) {
      if (oi.getId().equals(id)) {
        return oi;
      }
    }
    return null;
  }

  /**
   * @return the PartyRole that made the request
   */
  public RelatedParty getOrderRequester() {
    for (RelatedParty rp : relatedParty) {
      if (rp.getRole().equals(UserPartRoleType.REQUESTER.toString())) {
        return rp;
      }
    }
    return null;
  }
}
