package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.crimestopper.client.crimestopper.model.AuthorityDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComplaintDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-11T14:29:41.420+05:30[Asia/Calcutta]")

public class ComplaintDTO   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("authorities")
  @Valid
  private List<AuthorityDTO> authorities = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("userIdpCode")
  private String userIdpCode = null;

  public ComplaintDTO address(String address) {
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

  public ComplaintDTO authorities(List<AuthorityDTO> authorities) {
    this.authorities = authorities;
    return this;
  }

  public ComplaintDTO addAuthoritiesItem(AuthorityDTO authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<AuthorityDTO>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

  /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuthorityDTO> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<AuthorityDTO> authorities) {
    this.authorities = authorities;
  }

  public ComplaintDTO createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ComplaintDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComplaintDTO id(Long id) {
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

  public ComplaintDTO latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public ComplaintDTO longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public ComplaintDTO userIdpCode(String userIdpCode) {
    this.userIdpCode = userIdpCode;
    return this;
  }

  /**
   * Get userIdpCode
   * @return userIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getUserIdpCode() {
    return userIdpCode;
  }

  public void setUserIdpCode(String userIdpCode) {
    this.userIdpCode = userIdpCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplaintDTO complaintDTO = (ComplaintDTO) o;
    return Objects.equals(this.address, complaintDTO.address) &&
        Objects.equals(this.authorities, complaintDTO.authorities) &&
        Objects.equals(this.createdOn, complaintDTO.createdOn) &&
        Objects.equals(this.description, complaintDTO.description) &&
        Objects.equals(this.id, complaintDTO.id) &&
        Objects.equals(this.latitude, complaintDTO.latitude) &&
        Objects.equals(this.longitude, complaintDTO.longitude) &&
        Objects.equals(this.userIdpCode, complaintDTO.userIdpCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authorities, createdOn, description, id, latitude, longitude, userIdpCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplaintDTO {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    userIdpCode: ").append(toIndentedString(userIdpCode)).append("\n");
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

