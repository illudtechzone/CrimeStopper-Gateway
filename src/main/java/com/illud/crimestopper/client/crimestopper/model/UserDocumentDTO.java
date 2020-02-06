package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserDocumentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class UserDocumentDTO   {
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

  @JsonProperty("userId")
  private String userId = null;

  public UserDocumentDTO createdOn(OffsetDateTime createdOn) {
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

  public UserDocumentDTO fileBlob(byte[] fileBlob) {
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

  public UserDocumentDTO fileBlobContentType(String fileBlobContentType) {
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

  public UserDocumentDTO fileName(String fileName) {
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

  public UserDocumentDTO id(Long id) {
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

  public UserDocumentDTO type(String type) {
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

  public UserDocumentDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDocumentDTO userDocumentDTO = (UserDocumentDTO) o;
    return Objects.equals(this.createdOn, userDocumentDTO.createdOn) &&
        Objects.equals(this.fileBlob, userDocumentDTO.fileBlob) &&
        Objects.equals(this.fileBlobContentType, userDocumentDTO.fileBlobContentType) &&
        Objects.equals(this.fileName, userDocumentDTO.fileName) &&
        Objects.equals(this.id, userDocumentDTO.id) &&
        Objects.equals(this.type, userDocumentDTO.type) &&
        Objects.equals(this.userId, userDocumentDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, fileBlob, fileBlobContentType, fileName, id, type, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDocumentDTO {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    fileBlob: ").append(toIndentedString(fileBlob)).append("\n");
    sb.append("    fileBlobContentType: ").append(toIndentedString(fileBlobContentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

