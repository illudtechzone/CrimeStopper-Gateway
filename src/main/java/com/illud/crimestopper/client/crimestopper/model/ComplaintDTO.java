package com.illud.crimestopper.client.crimestopper.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComplaintDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T10:41:21.873813800+05:30[Asia/Colombo]")

public class ComplaintDTO   {
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

  @JsonProperty("placeAddress")
  private String placeAddress = null;

  @JsonProperty("placeGeopoint")
  private String placeGeopoint = null;

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

  @JsonProperty("userId")
  private String userId = null;

  public ComplaintDTO createdOn(OffsetDateTime createdOn) {
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

  public ComplaintDTO description(String description) {
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

  public ComplaintDTO id(Long id) {
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

  public ComplaintDTO latitude(Double latitude) {
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

  public ComplaintDTO longitude(Double longitude) {
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

  public ComplaintDTO placeAddress(String placeAddress) {
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

  public ComplaintDTO placeGeopoint(String placeGeopoint) {
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

  public ComplaintDTO status(StatusEnum status) {
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

  public ComplaintDTO subject(String subject) {
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

  public ComplaintDTO userId(String userId) {
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
    ComplaintDTO complaintDTO = (ComplaintDTO) o;
    return Objects.equals(this.createdOn, complaintDTO.createdOn) &&
        Objects.equals(this.description, complaintDTO.description) &&
        Objects.equals(this.id, complaintDTO.id) &&
        Objects.equals(this.latitude, complaintDTO.latitude) &&
        Objects.equals(this.longitude, complaintDTO.longitude) &&
        Objects.equals(this.placeAddress, complaintDTO.placeAddress) &&
        Objects.equals(this.placeGeopoint, complaintDTO.placeGeopoint) &&
        Objects.equals(this.status, complaintDTO.status) &&
        Objects.equals(this.subject, complaintDTO.subject) &&
        Objects.equals(this.userId, complaintDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, description, id, latitude, longitude, placeAddress, placeGeopoint, status, subject, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplaintDTO {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    placeAddress: ").append(toIndentedString(placeAddress)).append("\n");
    sb.append("    placeGeopoint: ").append(toIndentedString(placeGeopoint)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

