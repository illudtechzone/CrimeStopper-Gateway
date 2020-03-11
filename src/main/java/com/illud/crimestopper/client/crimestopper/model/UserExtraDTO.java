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
 * UserExtraDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-11T14:29:41.420+05:30[Asia/Calcutta]")

public class UserExtraDTO   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("currentLatitude")
  private String currentLatitude = null;

  @JsonProperty("currentLongitude")
  private String currentLongitude = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("phone")
  private String phone = null;

  public UserExtraDTO address(String address) {
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

  public UserExtraDTO currentLatitude(String currentLatitude) {
    this.currentLatitude = currentLatitude;
    return this;
  }

  /**
   * Get currentLatitude
   * @return currentLatitude
  **/
  @ApiModelProperty(value = "")


  public String getCurrentLatitude() {
    return currentLatitude;
  }

  public void setCurrentLatitude(String currentLatitude) {
    this.currentLatitude = currentLatitude;
  }

  public UserExtraDTO currentLongitude(String currentLongitude) {
    this.currentLongitude = currentLongitude;
    return this;
  }

  /**
   * Get currentLongitude
   * @return currentLongitude
  **/
  @ApiModelProperty(value = "")


  public String getCurrentLongitude() {
    return currentLongitude;
  }

  public void setCurrentLongitude(String currentLongitude) {
    this.currentLongitude = currentLongitude;
  }

  public UserExtraDTO id(Long id) {
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

  public UserExtraDTO phone(String phone) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserExtraDTO userExtraDTO = (UserExtraDTO) o;
    return Objects.equals(this.address, userExtraDTO.address) &&
        Objects.equals(this.currentLatitude, userExtraDTO.currentLatitude) &&
        Objects.equals(this.currentLongitude, userExtraDTO.currentLongitude) &&
        Objects.equals(this.id, userExtraDTO.id) &&
        Objects.equals(this.phone, userExtraDTO.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, currentLatitude, currentLongitude, id, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExtraDTO {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    currentLatitude: ").append(toIndentedString(currentLatitude)).append("\n");
    sb.append("    currentLongitude: ").append(toIndentedString(currentLongitude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

