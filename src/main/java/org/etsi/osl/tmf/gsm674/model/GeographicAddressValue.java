package org.etsi.osl.tmf.gsm674.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;


/**
 * GeographicAddressValue
 */


@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-24T14:24:54.867613034Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name="GeographicAddress")
public class GeographicAddressValue extends PlaceRefOrValue {
  @JsonProperty("locality")
  private String locality;
  @JsonProperty("postcode")
  private String postcode;
  @JsonProperty("stateOrProvince")
  private String stateOrProvince;
  @JsonProperty("streetNr")
  private String streetNr;
  @JsonProperty("streetNrLast")
  private String streetNrLast;
  @JsonProperty("streetNrLastSuffix")
  private String streetNrLastSuffix;
  @JsonProperty("streetNrSuffix")
  private String streetNrSuffix;
  @JsonProperty("streetSuffix")
  private String streetSuffix;
  @JsonProperty("streetType")
  private String streetType;
  @JsonProperty("geographicSubAddress")
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private GeographicSubAddressValue geographicSubAddress;
  @JsonProperty("city")
  private String city;
  @JsonProperty("country")
  private String country;
  @JsonProperty("streetName")
  private String streetName;

  public GeographicAddressValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicAddressValue locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]
   * @return locality
  */
  
  @Schema(name = "locality", description = "An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public GeographicAddressValue postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)
   * @return postcode
  */
  
  @Schema(name = "postcode", description = "descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public GeographicAddressValue stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * the State or Province that the address is in
   * @return stateOrProvince
  */
  
  @Schema(name = "stateOrProvince", description = "the State or Province that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public GeographicAddressValue streetNr(String streetNr) {
    this.streetNr = streetNr;
    return this;
  }

  /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
   * @return streetNr
  */
  
  @Schema(name = "streetNr", description = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetNr() {
    return streetNr;
  }

  public void setStreetNr(String streetNr) {
    this.streetNr = streetNr;
  }

  public GeographicAddressValue streetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
    return this;
  }

  /**
   * Last number in a range of street numbers allocated to a property
   * @return streetNrLast
  */
  
  @Schema(name = "streetNrLast", description = "Last number in a range of street numbers allocated to a property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetNrLast() {
    return streetNrLast;
  }

  public void setStreetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

  public GeographicAddressValue streetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
    return this;
  }

  /**
   * Last street number suffix for a ranged address
   * @return streetNrLastSuffix
  */
  
  @Schema(name = "streetNrLastSuffix", description = "Last street number suffix for a ranged address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }

  public void setStreetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

  public GeographicAddressValue streetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
    return this;
  }

  /**
   * the first street number suffix
   * @return streetNrSuffix
  */
  
  @Schema(name = "streetNrSuffix", description = "the first street number suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetNrSuffix() {
    return streetNrSuffix;
  }

  public void setStreetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

  public GeographicAddressValue streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

  /**
   * A modifier denoting a relative direction
   * @return streetSuffix
  */
  
  @Schema(name = "streetSuffix", description = "A modifier denoting a relative direction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public GeographicAddressValue streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf 
   * @return streetType
  */
  
  @Schema(name = "streetType", description = "alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public GeographicAddressValue geographicSubAddress(GeographicSubAddressValue geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
    return this;
  }

  /**
   * Get geographicSubAddress
   * @return geographicSubAddress
  */
  @Valid
  @Schema(name = "geographicSubAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public GeographicSubAddressValue getGeographicSubAddress() {
    return geographicSubAddress;
  }

  public void setGeographicSubAddress(GeographicSubAddressValue geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
  }

  public GeographicAddressValue city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City that the address is in
   * @return city
  */
  
  @Schema(name = "city", description = "City that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeographicAddressValue country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country that the address is in
   * @return country
  */
  
  @Schema(name = "country", description = "Country that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GeographicAddressValue streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of the street or other street type
   * @return streetName
  */
  
  @Schema(name = "streetName", description = "Name of the street or other street type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressValue geographicAddressValue = (GeographicAddressValue) o;
    return Objects.equals(this.type, geographicAddressValue.type) &&
        Objects.equals(this.baseType, geographicAddressValue.baseType) &&
        Objects.equals(this.schemaLocation, geographicAddressValue.schemaLocation) &&
        Objects.equals(this.locality, geographicAddressValue.locality) &&
        Objects.equals(this.postcode, geographicAddressValue.postcode) &&
        Objects.equals(this.stateOrProvince, geographicAddressValue.stateOrProvince) &&
        Objects.equals(this.streetNr, geographicAddressValue.streetNr) &&
        Objects.equals(this.streetNrLast, geographicAddressValue.streetNrLast) &&
        Objects.equals(this.streetNrLastSuffix, geographicAddressValue.streetNrLastSuffix) &&
        Objects.equals(this.streetNrSuffix, geographicAddressValue.streetNrSuffix) &&
        Objects.equals(this.streetSuffix, geographicAddressValue.streetSuffix) &&
        Objects.equals(this.streetType, geographicAddressValue.streetType) &&
        Objects.equals(this.geographicSubAddress, geographicAddressValue.geographicSubAddress) &&
        Objects.equals(this.city, geographicAddressValue.city) &&
        Objects.equals(this.country, geographicAddressValue.country) &&
        Objects.equals(this.streetName, geographicAddressValue.streetName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseType, schemaLocation, locality, postcode, stateOrProvince, streetNr, streetNrLast, streetNrLastSuffix, streetNrSuffix, streetSuffix, streetType, geographicSubAddress, city, country, streetName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    @type: ").append(toIndentedString(type)).append("\n");
    sb.append("    @baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    @schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    streetNr: ").append(toIndentedString(streetNr)).append("\n");
    sb.append("    streetNrLast: ").append(toIndentedString(streetNrLast)).append("\n");
    sb.append("    streetNrLastSuffix: ").append(toIndentedString(streetNrLastSuffix)).append("\n");
    sb.append("    streetNrSuffix: ").append(toIndentedString(streetNrSuffix)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
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

