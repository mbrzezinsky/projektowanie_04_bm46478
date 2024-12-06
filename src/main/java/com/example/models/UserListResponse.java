package com.example.models;

import java.util.Objects;
import com.example.models.RequestHeader;
import com.example.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-23T10:30:01.108+01:00[Europe/Belgrade]")

public class UserListResponse   {
  @JsonProperty("responseHeader")
  private RequestHeader responseHeader;

  @JsonProperty("usersList")
  @Valid
  private List<User> usersList = new ArrayList<>();

  public UserListResponse responseHeader(RequestHeader responseHeader) {
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

  public UserListResponse usersList(List<User> usersList) {
    this.usersList = usersList;
    return this;
  }

  public UserListResponse addUsersListItem(User usersListItem) {
    this.usersList.add(usersListItem);
    return this;
  }

  /**
   * Get usersList
   * @return usersList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<User> getUsersList() {
    return usersList;
  }

  public void setUsersList(List<User> usersList) {
    this.usersList = usersList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserListResponse userListResponse = (UserListResponse) o;
    return Objects.equals(this.responseHeader, userListResponse.responseHeader) &&
        Objects.equals(this.usersList, userListResponse.usersList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, usersList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserListResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    usersList: ").append(toIndentedString(usersList)).append("\n");
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

