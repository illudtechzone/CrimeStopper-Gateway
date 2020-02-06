package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.crimestopper.client.crimestopper.model.Complaint;
import com.illud.crimestopper.client.crimestopper.model.CurrentLocation;
import com.illud.crimestopper.client.crimestopper.model.UserDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProfile
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class UserProfile   {
  @JsonProperty("complaints")
  @Valid
  private List<Complaint> complaints = null;

  @JsonProperty("currentLocation")
  private CurrentLocation currentLocation = null;

  @JsonProperty("documents")
  @Valid
  private List<UserDocument> documents = null;

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

  public UserProfile complaints(List<Complaint> complaints) {
    this.complaints = complaints;
    return this;
  }

  public UserProfile addComplaintsItem(Complaint complaintsItem) {
    if (this.complaints == null) {
      this.complaints = new ArrayList<Complaint>();
    }
    this.complaints.add(complaintsItem);
    return this;
  }

  /**
   * Get complaints
   * @return complaints
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Complaint> getComplaints() {
    return complaints;
  }

  public void setComplaints(List<Complaint> complaints) {
    this.complaints = complaints;
  }

  public UserProfile currentLocation(CurrentLocation currentLocation) {
    this.currentLocation = currentLocation;
    return this;
  }

  /**
   * Get currentLocation
   * @return currentLocation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CurrentLocation getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(CurrentLocation currentLocation) {
    this.currentLocation = currentLocation;
  }

  public UserProfile documents(List<UserDocument> documents) {
    this.documents = documents;
    return this;
  }

  public UserProfile addDocumentsItem(UserDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<UserDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<UserDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<UserDocument> documents) {
    this.documents = documents;
  }

  public UserProfile email(String email) {
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

  public UserProfile firstName(String firstName) {
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

  public UserProfile id(Long id) {
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

  public UserProfile lastName(String lastName) {
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

  public UserProfile mobileNumber(Long mobileNumber) {
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

  public UserProfile userIdpCode(String userIdpCode) {
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
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.complaints, userProfile.complaints) &&
        Objects.equals(this.currentLocation, userProfile.currentLocation) &&
        Objects.equals(this.documents, userProfile.documents) &&
        Objects.equals(this.email, userProfile.email) &&
        Objects.equals(this.firstName, userProfile.firstName) &&
        Objects.equals(this.id, userProfile.id) &&
        Objects.equals(this.lastName, userProfile.lastName) &&
        Objects.equals(this.mobileNumber, userProfile.mobileNumber) &&
        Objects.equals(this.userIdpCode, userProfile.userIdpCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complaints, currentLocation, documents, email, firstName, id, lastName, mobileNumber, userIdpCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    currentLocation: ").append(toIndentedString(currentLocation)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

