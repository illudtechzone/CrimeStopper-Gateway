package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.illud.crimestopper.client.crimestopper.model.Action;
import com.illud.crimestopper.client.crimestopper.model.Comment;
import com.illud.crimestopper.client.crimestopper.model.ComplainUserReactions;
import com.illud.crimestopper.client.crimestopper.model.Media;
import com.illud.crimestopper.client.crimestopper.model.UserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Complaint
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class Complaint   {
  @JsonProperty("actions")
  @Valid
  private List<Action> actions = null;

  @JsonProperty("comments")
  @Valid
  private List<Comment> comments = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("medias")
  @Valid
  private List<Media> medias = null;

  @JsonProperty("placeAddress")
  private String placeAddress = null;

  @JsonProperty("placeGeopoint")
  private String placeGeopoint = null;

  @JsonProperty("reactions")
  @Valid
  private List<ComplainUserReactions> reactions = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("user")
  private UserProfile user = null;

  public Complaint actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Complaint addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Action>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public Complaint comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Complaint addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public Complaint createdOn(OffsetDateTime createdOn) {
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

  public Complaint description(String description) {
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

  public Complaint id(Long id) {
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

  public Complaint latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Complaint longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Complaint medias(List<Media> medias) {
    this.medias = medias;
    return this;
  }

  public Complaint addMediasItem(Media mediasItem) {
    if (this.medias == null) {
      this.medias = new ArrayList<Media>();
    }
    this.medias.add(mediasItem);
    return this;
  }

  /**
   * Get medias
   * @return medias
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Media> getMedias() {
    return medias;
  }

  public void setMedias(List<Media> medias) {
    this.medias = medias;
  }

  public Complaint placeAddress(String placeAddress) {
    this.placeAddress = placeAddress;
    return this;
  }

  /**
   * Get placeAddress
   * @return placeAddress
  **/
  @ApiModelProperty(value = "")


  public String getPlaceAddress() {
    return placeAddress;
  }

  public void setPlaceAddress(String placeAddress) {
    this.placeAddress = placeAddress;
  }

  public Complaint placeGeopoint(String placeGeopoint) {
    this.placeGeopoint = placeGeopoint;
    return this;
  }

  /**
   * Get placeGeopoint
   * @return placeGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getPlaceGeopoint() {
    return placeGeopoint;
  }

  public void setPlaceGeopoint(String placeGeopoint) {
    this.placeGeopoint = placeGeopoint;
  }

  public Complaint reactions(List<ComplainUserReactions> reactions) {
    this.reactions = reactions;
    return this;
  }

  public Complaint addReactionsItem(ComplainUserReactions reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<ComplainUserReactions>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

  /**
   * Get reactions
   * @return reactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ComplainUserReactions> getReactions() {
    return reactions;
  }

  public void setReactions(List<ComplainUserReactions> reactions) {
    this.reactions = reactions;
  }

  public Complaint status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Complaint subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Complaint user(UserProfile user) {
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
    Complaint complaint = (Complaint) o;
    return Objects.equals(this.actions, complaint.actions) &&
        Objects.equals(this.comments, complaint.comments) &&
        Objects.equals(this.createdOn, complaint.createdOn) &&
        Objects.equals(this.description, complaint.description) &&
        Objects.equals(this.id, complaint.id) &&
        Objects.equals(this.latitude, complaint.latitude) &&
        Objects.equals(this.longitude, complaint.longitude) &&
        Objects.equals(this.medias, complaint.medias) &&
        Objects.equals(this.placeAddress, complaint.placeAddress) &&
        Objects.equals(this.placeGeopoint, complaint.placeGeopoint) &&
        Objects.equals(this.reactions, complaint.reactions) &&
        Objects.equals(this.status, complaint.status) &&
        Objects.equals(this.subject, complaint.subject) &&
        Objects.equals(this.user, complaint.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, comments, createdOn, description, id, latitude, longitude, medias, placeAddress, placeGeopoint, reactions, status, subject, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complaint {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    medias: ").append(toIndentedString(medias)).append("\n");
    sb.append("    placeAddress: ").append(toIndentedString(placeAddress)).append("\n");
    sb.append("    placeGeopoint: ").append(toIndentedString(placeGeopoint)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

