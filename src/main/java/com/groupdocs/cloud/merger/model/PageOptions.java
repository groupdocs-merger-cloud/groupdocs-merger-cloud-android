/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageOptions.java">
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
import com.groupdocs.cloud.merger.model.FileInfo;
import com.groupdocs.cloud.merger.model.Options;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes options for specifying page or pages range
 */
@ApiModel(description = "Describes options for specifying page or pages range")
public class PageOptions extends Options {
  @SerializedName("pages")
  private List<Integer> pages = null;

  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("endPageNumber")
  private Integer endPageNumber = null;

  /**
   * Range mode. Ignored if Pages collection is not empty. Default value is AllPages.
   */
  @JsonAdapter(RangeModeEnum.Adapter.class)
  public enum RangeModeEnum {
    ALLPAGES("AllPages"),
    
    ODDPAGES("OddPages"),
    
    EVENPAGES("EvenPages");

    private String value;

    RangeModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RangeModeEnum fromValue(String text) {
      for (RangeModeEnum b : RangeModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RangeModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RangeModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RangeModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RangeModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rangeMode")
  private RangeModeEnum rangeMode = null;

  public PageOptions pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public PageOptions addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * List of page numbers to use in a specific API method. NOTE: page numbering starts from 1.
   * @return pages
  **/
  @ApiModelProperty(value = "List of page numbers to use in a specific API method. NOTE: page numbering starts from 1.")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }

  public PageOptions startPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
    return this;
  }

   /**
   * Start page number. Ignored if Pages collection is not empty.
   * @return startPageNumber
  **/
  @ApiModelProperty(required = true, value = "Start page number. Ignored if Pages collection is not empty.")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  public PageOptions endPageNumber(Integer endPageNumber) {
    this.endPageNumber = endPageNumber;
    return this;
  }

   /**
   * End page number. Ignored if Pages collection is not empty.
   * @return endPageNumber
  **/
  @ApiModelProperty(required = true, value = "End page number. Ignored if Pages collection is not empty.")
  public Integer getEndPageNumber() {
    return endPageNumber;
  }

  public void setEndPageNumber(Integer endPageNumber) {
    this.endPageNumber = endPageNumber;
  }

  public PageOptions rangeMode(RangeModeEnum rangeMode) {
    this.rangeMode = rangeMode;
    return this;
  }

   /**
   * Range mode. Ignored if Pages collection is not empty. Default value is AllPages.
   * @return rangeMode
  **/
  @ApiModelProperty(required = true, value = "Range mode. Ignored if Pages collection is not empty. Default value is AllPages.")
  public RangeModeEnum getRangeMode() {
    return rangeMode;
  }

  public void setRangeMode(RangeModeEnum rangeMode) {
    this.rangeMode = rangeMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOptions pageOptions = (PageOptions) o;
    return Objects.equals(this.pages, pageOptions.pages) &&
        Objects.equals(this.startPageNumber, pageOptions.startPageNumber) &&
        Objects.equals(this.endPageNumber, pageOptions.endPageNumber) &&
        Objects.equals(this.rangeMode, pageOptions.rangeMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, startPageNumber, endPageNumber, rangeMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    endPageNumber: ").append(toIndentedString(endPageNumber)).append("\n");
    sb.append("    rangeMode: ").append(toIndentedString(rangeMode)).append("\n");
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

