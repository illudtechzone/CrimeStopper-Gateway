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
 * FriendsListDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class FriendsListDTO   {
  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("followerUserId")
  private Long followerUserId = null;

  @JsonProperty("followingId")
  private Long followingId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isAccepted")
  private Boolean isAccepted = null;

  public FriendsListDTO createdOn(OffsetDateTime createdOn) {
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

  public FriendsListDTO followerUserId(Long followerUserId) {
    this.followerUserId = followerUserId;
    return this;
  }

  /**
   * Get followerUserId
   * @return followerUserId
  **/
  @ApiModelProperty(value = "")


  public Long getFollowerUserId() {
    return followerUserId;
  }

  public void setFollowerUserId(Long followerUserId) {
    this.followerUserId = followerUserId;
  }

  public FriendsListDTO followingId(Long followingId) {
    this.followingId = followingId;
    return this;
  }

  /**
   * Get followingId
   * @return followingId
  **/
  @ApiModelProperty(value = "")


  public Long getFollowingId() {
    return followingId;
  }

  public void setFollowingId(Long followingId) {
    this.followingId = followingId;
  }

  public FriendsListDTO id(Long id) {
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

  public FriendsListDTO isAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
    return this;
  }

  /**
   * Get isAccepted
   * @return isAccepted
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsAccepted() {
    return isAccepted;
  }

  public void setIsAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendsListDTO friendsListDTO = (FriendsListDTO) o;
    return Objects.equals(this.createdOn, friendsListDTO.createdOn) &&
        Objects.equals(this.followerUserId, friendsListDTO.followerUserId) &&
        Objects.equals(this.followingId, friendsListDTO.followingId) &&
        Objects.equals(this.id, friendsListDTO.id) &&
        Objects.equals(this.isAccepted, friendsListDTO.isAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, followerUserId, followingId, id, isAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendsListDTO {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    followerUserId: ").append(toIndentedString(followerUserId)).append("\n");
    sb.append("    followingId: ").append(toIndentedString(followingId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAccepted: ").append(toIndentedString(isAccepted)).append("\n");
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

