/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MixPagesItem.java">
 *   Copyright (c) Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines item options for documents MixPages method
 */
@ApiModel(description = "Defines item options for documents MixPages method")
public class MixPagesItem {
  @SerializedName("fileIndex")
  private Integer fileIndex = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public MixPagesItem fileIndex(Integer fileIndex) {
    this.fileIndex = fileIndex;
    return this;
  }

   /**
   * Index of the file from MixPagesOptions.Files collection.
   * @return fileIndex
  **/
  @ApiModelProperty(required = true, value = "Index of the file from MixPagesOptions.Files collection.")
  public Integer getFileIndex() {
    return fileIndex;
  }

  public void setFileIndex(Integer fileIndex) {
    this.fileIndex = fileIndex;
  }

  public MixPagesItem pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public MixPagesItem addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * List of page numbers to use in a MixPages operation. NOTE: page numbering starts from 1.
   * @return pages
  **/
  @ApiModelProperty(value = "List of page numbers to use in a MixPages operation. NOTE: page numbering starts from 1.")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixPagesItem mixPagesItem = (MixPagesItem) o;
    return Objects.equals(this.fileIndex, mixPagesItem.fileIndex) &&
        Objects.equals(this.pages, mixPagesItem.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIndex, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixPagesItem {\n");
    
    sb.append("    fileIndex: ").append(toIndentedString(fileIndex)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

