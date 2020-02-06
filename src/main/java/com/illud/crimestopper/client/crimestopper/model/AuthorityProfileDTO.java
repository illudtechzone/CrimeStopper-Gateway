package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthorityProfileDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class AuthorityProfileDTO   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("authorityIdpCode")
  private String authorityIdpCode = null;

  @JsonProperty("authorityName")
  private String authorityName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("mobileNumber")
  private Long mobileNumber = null;

  @JsonProperty("placeAddress")
  private String placeAddress = null;

  @JsonProperty("placeGeopoint")
  private String placeGeopoint = null;

  public AuthorityProfileDTO address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AuthorityProfileDTO authorityIdpCode(String authorityIdpCode) {
    this.authorityIdpCode = authorityIdpCode;
    return this;
  }

  /**
   * Get authorityIdpCode
   * @return authorityIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getAuthorityIdpCode() {
    return authorityIdpCode;
  }

  public void setAuthorityIdpCode(String authorityIdpCode) {
    this.authorityIdpCode = authorityIdpCode;
  }

  public AuthorityProfileDTO authorityName(String authorityName) {
    this.authorityName = authorityName;
    return this;
  }

  /**
   * Get authorityName
   * @return authorityName
  **/
  @ApiModelProperty(value = "")


  public String getAuthorityName() {
    return authorityName;
  }

  public void setAuthorityName(String authorityName) {
    this.authorityName = authorityName;
  }

  public AuthorityProfileDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuthorityProfileDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AuthorityProfileDTO latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AuthorityProfileDTO longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AuthorityProfileDTO mobileNumber(Long mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")


  public Long getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(Long mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public AuthorityProfileDTO placeAddress(String placeAddress) {
    this.placeAddress = placeAddress;
    return this;
  }

  /**
   * Get placeAddress
   * @return placeAddress
  **/
  @ApiModelProperty(value = "")


  public String getPlaceAddress() {
    return placeAddress;
  }

  public void setPlaceAddress(String placeAddress) {
    this.placeAddress = placeAddress;
  }

  public AuthorityProfileDTO placeGeopoint(String placeGeopoint) {
    this.placeGeopoint = placeGeopoint;
    return this;
  }

  /**
   * Get placeGeopoint
   * @return placeGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getPlaceGeopoint() {
    return placeGeopoint;
  }

  public void setPlaceGeopoint(String placeGeopoint) {
    this.placeGeopoint = placeGeopoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorityProfileDTO authorityProfileDTO = (AuthorityProfileDTO) o;
    return Objects.equals(this.address, authorityProfileDTO.address) &&
        Objects.equals(this.authorityIdpCode, authorityProfileDTO.authorityIdpCode) &&
        Objects.equals(this.authorityName, authorityProfileDTO.authorityName) &&
        Objects.equals(this.email, authorityProfileDTO.email) &&
        Objects.equals(this.id, authorityProfileDTO.id) &&
        Objects.equals(this.latitude, authorityProfileDTO.latitude) &&
        Objects.equals(this.longitude, authorityProfileDTO.longitude) &&
        Objects.equals(this.mobileNumber, authorityProfileDTO.mobileNumber) &&
        Objects.equals(this.placeAddress, authorityProfileDTO.placeAddress) &&
        Objects.equals(this.placeGeopoint, authorityProfileDTO.placeGeopoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authorityIdpCode, authorityName, email, id, latitude, longitude, mobileNumber, placeAddress, placeGeopoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorityProfileDTO {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authorityIdpCode: ").append(toIndentedString(authorityIdpCode)).append("\n");
    sb.append("    authorityName: ").append(toIndentedString(authorityName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    placeAddress: ").append(toIndentedString(placeAddress)).append("\n");
    sb.append("    placeGeopoint: ").append(toIndentedString(placeGeopoint)).append("\n");
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

