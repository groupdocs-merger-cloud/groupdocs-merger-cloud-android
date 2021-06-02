/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MoveOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.merger.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.merger.model.FileInfo;
import com.groupdocs.cloud.merger.model.Options;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Move page options
 */
@ApiModel(description = "Move page options")
public class MoveOptions extends Options {
  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("newPageNumber")
  private Integer newPageNumber = null;

  public MoveOptions pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number to move
   * @return pageNumber
  **/
  @ApiModelProperty(required = true, value = "Page number to move")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public MoveOptions newPageNumber(Integer newPageNumber) {
    this.newPageNumber = newPageNumber;
    return this;
  }

   /**
   * New page number
   * @return newPageNumber
  **/
  @ApiModelProperty(required = true, value = "New page number")
  public Integer getNewPageNumber() {
    return newPageNumber;
  }

  public void setNewPageNumber(Integer newPageNumber) {
    this.newPageNumber = newPageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveOptions moveOptions = (MoveOptions) o;
    return Objects.equals(this.pageNumber, moveOptions.pageNumber) &&
        Objects.equals(this.newPageNumber, moveOptions.newPageNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, newPageNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    newPageNumber: ").append(toIndentedString(newPageNumber)).append("\n");
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

