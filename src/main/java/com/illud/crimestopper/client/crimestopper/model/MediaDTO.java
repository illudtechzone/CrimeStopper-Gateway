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
 * MediaDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class MediaDTO   {
  @JsonProperty("complaintId")
  private Long complaintId = null;

  @JsonProperty("fileBlob")
  private byte[] fileBlob = null;

  @JsonProperty("fileBlobContentType")
  private String fileBlobContentType = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("id")
  private Long id = null;

  public MediaDTO complaintId(Long complaintId) {
    this.complaintId = complaintId;
    return this;
  }

  /**
   * Get complaintId
   * @return complaintId
  **/
  @ApiModelProperty(value = "")


  public Long getComplaintId() {
    return complaintId;
  }

  public void setComplaintId(Long complaintId) {
    this.complaintId = complaintId;
  }

  public MediaDTO fileBlob(byte[] fileBlob) {
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

  public MediaDTO fileBlobContentType(String fileBlobContentType) {
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

  public MediaDTO fileName(String fileName) {
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

  public MediaDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaDTO mediaDTO = (MediaDTO) o;
    return Objects.equals(this.complaintId, mediaDTO.complaintId) &&
        Objects.equals(this.fileBlob, mediaDTO.fileBlob) &&
        Objects.equals(this.fileBlobContentType, mediaDTO.fileBlobContentType) &&
        Objects.equals(this.fileName, mediaDTO.fileName) &&
        Objects.equals(this.id, mediaDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complaintId, fileBlob, fileBlobContentType, fileName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaDTO {\n");
    
    sb.append("    complaintId: ").append(toIndentedString(complaintId)).append("\n");
    sb.append("    fileBlob: ").append(toIndentedString(fileBlob)).append("\n");
    sb.append("    fileBlobContentType: ").append(toIndentedString(fileBlobContentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

