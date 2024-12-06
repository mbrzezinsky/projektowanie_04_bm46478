package com.example.models;

import java.util.Objects;
import com.example.models.RequestHeader;
import com.example.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-23T10:30:01.108+01:00[Europe/Belgrade]")

public class UserResponse   {
  @JsonProperty("responseHeader")
  private RequestHeader responseHeader;

  @JsonProperty("user")
  private User user;

  public UserResponse responseHeader(RequestHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(RequestHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public UserResponse user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
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
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.responseHeader, userResponse.responseHeader) &&
        Objects.equals(this.user, userResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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

