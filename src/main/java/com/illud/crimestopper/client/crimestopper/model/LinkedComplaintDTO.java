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
 * LinkedComplaintDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class LinkedComplaintDTO   {
  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("newComplaintId")
  private Long newComplaintId = null;

  @JsonProperty("previousComplaintId")
  private Long previousComplaintId = null;

  @JsonProperty("userId")
  private Long userId = null;

  public LinkedComplaintDTO createdOn(OffsetDateTime createdOn) {
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

  public LinkedComplaintDTO id(Long id) {
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

  public LinkedComplaintDTO newComplaintId(Long newComplaintId) {
    this.newComplaintId = newComplaintId;
    return this;
  }

  /**
   * Get newComplaintId
   * @return newComplaintId
  **/
  @ApiModelProperty(value = "")


  public Long getNewComplaintId() {
    return newComplaintId;
  }

  public void setNewComplaintId(Long newComplaintId) {
    this.newComplaintId = newComplaintId;
  }

  public LinkedComplaintDTO previousComplaintId(Long previousComplaintId) {
    this.previousComplaintId = previousComplaintId;
    return this;
  }

  /**
   * Get previousComplaintId
   * @return previousComplaintId
  **/
  @ApiModelProperty(value = "")


  public Long getPreviousComplaintId() {
    return previousComplaintId;
  }

  public void setPreviousComplaintId(Long previousComplaintId) {
    this.previousComplaintId = previousComplaintId;
  }

  public LinkedComplaintDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
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
    LinkedComplaintDTO linkedComplaintDTO = (LinkedComplaintDTO) o;
    return Objects.equals(this.createdOn, linkedComplaintDTO.createdOn) &&
        Objects.equals(this.id, linkedComplaintDTO.id) &&
        Objects.equals(this.newComplaintId, linkedComplaintDTO.newComplaintId) &&
        Objects.equals(this.previousComplaintId, linkedComplaintDTO.previousComplaintId) &&
        Objects.equals(this.userId, linkedComplaintDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, newComplaintId, previousComplaintId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedComplaintDTO {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newComplaintId: ").append(toIndentedString(newComplaintId)).append("\n");
    sb.append("    previousComplaintId: ").append(toIndentedString(previousComplaintId)).append("\n");
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

