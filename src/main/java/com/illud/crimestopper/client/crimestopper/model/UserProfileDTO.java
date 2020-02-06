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
 * UserProfileDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class UserProfileDTO   {
  @JsonProperty("currentLocationId")
  private Long currentLocationId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mobileNumber")
  private Long mobileNumber = null;

  @JsonProperty("userIdpCode")
  private String userIdpCode = null;

  public UserProfileDTO currentLocationId(Long currentLocationId) {
    this.currentLocationId = currentLocationId;
    return this;
  }

  /**
   * Get currentLocationId
   * @return currentLocationId
  **/
  @ApiModelProperty(value = "")


  public Long getCurrentLocationId() {
    return currentLocationId;
  }

  public void setCurrentLocationId(Long currentLocationId) {
    this.currentLocationId = currentLocationId;
  }

  public UserProfileDTO email(String email) {
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

  public UserProfileDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserProfileDTO id(Long id) {
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

  public UserProfileDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserProfileDTO mobileNumber(Long mobileNumber) {
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

  public UserProfileDTO userIdpCode(String userIdpCode) {
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
    UserProfileDTO userProfileDTO = (UserProfileDTO) o;
    return Objects.equals(this.currentLocationId, userProfileDTO.currentLocationId) &&
        Objects.equals(this.email, userProfileDTO.email) &&
        Objects.equals(this.firstName, userProfileDTO.firstName) &&
        Objects.equals(this.id, userProfileDTO.id) &&
        Objects.equals(this.lastName, userProfileDTO.lastName) &&
        Objects.equals(this.mobileNumber, userProfileDTO.mobileNumber) &&
        Objects.equals(this.userIdpCode, userProfileDTO.userIdpCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentLocationId, email, firstName, id, lastName, mobileNumber, userIdpCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileDTO {\n");
    
    sb.append("    currentLocationId: ").append(toIndentedString(currentLocationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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

