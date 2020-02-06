package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.crimestopper.client.crimestopper.model.Complaint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Media
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class Media   {
  @JsonProperty("complaint")
  private Complaint complaint = null;

  @JsonProperty("fileBlob")
  private byte[] fileBlob = null;

  @JsonProperty("fileBlobContentType")
  private String fileBlobContentType = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("id")
  private Long id = null;

  public Media complaint(Complaint complaint) {
    this.complaint = complaint;
    return this;
  }

  /**
   * Get complaint
   * @return complaint
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Complaint getComplaint() {
    return complaint;
  }

  public void setComplaint(Complaint complaint) {
    this.complaint = complaint;
  }

  public Media fileBlob(byte[] fileBlob) {
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

  public Media fileBlobContentType(String fileBlobContentType) {
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

  public Media fileName(String fileName) {
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

  public Media id(Long id) {
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
    Media media = (Media) o;
    return Objects.equals(this.complaint, media.complaint) &&
        Objects.equals(this.fileBlob, media.fileBlob) &&
        Objects.equals(this.fileBlobContentType, media.fileBlobContentType) &&
        Objects.equals(this.fileName, media.fileName) &&
        Objects.equals(this.id, media.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complaint, fileBlob, fileBlobContentType, fileName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    complaint: ").append(toIndentedString(complaint)).append("\n");
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

