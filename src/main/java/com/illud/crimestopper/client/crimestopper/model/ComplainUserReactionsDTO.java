package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComplainUserReactionsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class ComplainUserReactionsDTO   {
  @JsonProperty("complaintId")
  private Long complaintId = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * Gets or Sets reaction
   */
  public enum ReactionEnum {
    GENUINE("GENUINE"),
    
    FAKE("FAKE"),
    
    SOLVED("SOLVED"),
    
    EMERGENCY("EMERGENCY");

    private String value;

    ReactionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReactionEnum fromValue(String text) {
      for (ReactionEnum b : ReactionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("reaction")
  private ReactionEnum reaction = null;

  @JsonProperty("userId")
  private Long userId = null;

  public ComplainUserReactionsDTO complaintId(Long complaintId) {
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

  public ComplainUserReactionsDTO id(Long id) {
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

  public ComplainUserReactionsDTO reaction(ReactionEnum reaction) {
    this.reaction = reaction;
    return this;
  }

  /**
   * Get reaction
   * @return reaction
  **/
  @ApiModelProperty(value = "")


  public ReactionEnum getReaction() {
    return reaction;
  }

  public void setReaction(ReactionEnum reaction) {
    this.reaction = reaction;
  }

  public ComplainUserReactionsDTO userId(Long userId) {
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
    ComplainUserReactionsDTO complainUserReactionsDTO = (ComplainUserReactionsDTO) o;
    return Objects.equals(this.complaintId, complainUserReactionsDTO.complaintId) &&
        Objects.equals(this.id, complainUserReactionsDTO.id) &&
        Objects.equals(this.reaction, complainUserReactionsDTO.reaction) &&
        Objects.equals(this.userId, complainUserReactionsDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complaintId, id, reaction, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplainUserReactionsDTO {\n");
    
    sb.append("    complaintId: ").append(toIndentedString(complaintId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
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

