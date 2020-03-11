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
 * AuthorityDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-11T14:29:41.420+05:30[Asia/Calcutta]")

public class AuthorityDTO   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("authorityIdpCode")
  private String authorityIdpCode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("website")
  private String website = null;

  public AuthorityDTO address(String address) {
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

  public AuthorityDTO authorityIdpCode(String authorityIdpCode) {
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

  public AuthorityDTO id(Long id) {
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

  public AuthorityDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorityDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AuthorityDTO website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorityDTO authorityDTO = (AuthorityDTO) o;
    return Objects.equals(this.address, authorityDTO.address) &&
        Objects.equals(this.authorityIdpCode, authorityDTO.authorityIdpCode) &&
        Objects.equals(this.id, authorityDTO.id) &&
        Objects.equals(this.name, authorityDTO.name) &&
        Objects.equals(this.phone, authorityDTO.phone) &&
        Objects.equals(this.website, authorityDTO.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authorityIdpCode, id, name, phone, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorityDTO {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authorityIdpCode: ").append(toIndentedString(authorityIdpCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

