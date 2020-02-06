package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.crimestopper.client.crimestopper.model.UserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserDocument
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class UserDocument   {
  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("fileBlob")
  private byte[] fileBlob = null;

  @JsonProperty("fileBlobContentType")
  private String fileBlobContentType = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("user")
  private UserProfile user = null;

  public UserDocument createdOn(OffsetDateTime createdOn) {
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

  public UserDocument fileBlob(byte[] fileBlob) {
    this.fileBlob = fileBlob;
    return this;
  }

  /**
   * Get fileBlob
   * @return fileBlob
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getFileBlob() {
    return fileBlob;
  }

  public void setFileBlob(byte[] fileBlob) {
    this.fileBlob = fileBlob;
  }

  public UserDocument fileBlobContentType(String fileBlobContentType) {
    this.fileBlobContentType = fileBlobContentType;
    return this;
  }

  /**
   * Get fileBlobContentType
   * @return fileBlobContentType
  **/
  @ApiModelProperty(value = "")


  public String getFileBlobContentType() {
    return fileBlobContentType;
  }

  public void setFileBlobContentType(String fileBlobContentType) {
    this.fileBlobContentType = fileBlobContentType;
  }

  public UserDocument fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public UserDocument id(Long id) {
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

  public UserDocument type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UserDocument user(UserProfile user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserProfile getUser() {
    return user;
  }

  public void setUser(UserProfile user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDocument userDocument = (UserDocument) o;
    return Objects.equals(this.createdOn, userDocument.createdOn) &&
        Objects.equals(this.fileBlob, userDocument.fileBlob) &&
        Objects.equals(this.fileBlobContentType, userDocument.fileBlobContentType) &&
        Objects.equals(this.fileName, userDocument.fileName) &&
        Objects.equals(this.id, userDocument.id) &&
        Objects.equals(this.type, userDocument.type) &&
        Objects.equals(this.user, userDocument.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, fileBlob, fileBlobContentType, fileName, id, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDocument {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    fileBlob: ").append(toIndentedString(fileBlob)).append("\n");
    sb.append("    fileBlobContentType: ").append(toIndentedString(fileBlobContentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

