package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.crimestopper.client.crimestopper.model.Complaint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Action
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class Action   {
  @JsonProperty("authorityId")
  private Long authorityId = null;

  @JsonProperty("complaint")
  private Complaint complaint = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  public Action authorityId(Long authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * Get authorityId
   * @return authorityId
  **/
  @ApiModelProperty(value = "")


  public Long getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(Long authorityId) {
    this.authorityId = authorityId;
  }

  public Action complaint(Complaint complaint) {
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

  public Action createdOn(OffsetDateTime createdOn) {
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

  public Action description(String description) {
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

  public Action id(Long id) {
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
    Action action = (Action) o;
    return Objects.equals(this.authorityId, action.authorityId) &&
        Objects.equals(this.complaint, action.complaint) &&
        Objects.equals(this.createdOn, action.createdOn) &&
        Objects.equals(this.description, action.description) &&
        Objects.equals(this.id, action.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityId, complaint, createdOn, description, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    complaint: ").append(toIndentedString(complaint)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

