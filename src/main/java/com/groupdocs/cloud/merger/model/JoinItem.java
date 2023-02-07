/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="JoinItem.java">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes document for join operation.
 */
@ApiModel(description = "Describes document for join operation.")
public class JoinItem {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

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

  /**
   * Allows to join word documents without empty space between documents.
   */
  @JsonAdapter(WordJoinModeEnum.Adapter.class)
  public enum WordJoinModeEnum {
    DEFAULT("Default"),
    
    CONTINUOUS("Continuous");

    private String value;

    WordJoinModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WordJoinModeEnum fromValue(String text) {
      for (WordJoinModeEnum b : WordJoinModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WordJoinModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WordJoinModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WordJoinModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WordJoinModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("wordJoinMode")
  private WordJoinModeEnum wordJoinMode = null;

  /**
   * Possible modes for the image joining.
   */
  @JsonAdapter(ImageJoinModeEnum.Adapter.class)
  public enum ImageJoinModeEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical");

    private String value;

    ImageJoinModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageJoinModeEnum fromValue(String text) {
      for (ImageJoinModeEnum b : ImageJoinModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageJoinModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageJoinModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageJoinModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageJoinModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("imageJoinMode")
  private ImageJoinModeEnum imageJoinMode = null;

  public JoinItem fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * File info.
   * @return fileInfo
  **/
  @ApiModelProperty(value = "File info.")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public JoinItem pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public JoinItem addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * List of page numbers to use in a Join operation. NOTE: page numbering starts from 1.
   * @return pages
  **/
  @ApiModelProperty(value = "List of page numbers to use in a Join operation. NOTE: page numbering starts from 1.")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }

  public JoinItem startPageNumber(Integer startPageNumber) {
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

  public JoinItem endPageNumber(Integer endPageNumber) {
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

  public JoinItem rangeMode(RangeModeEnum rangeMode) {
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

  public JoinItem wordJoinMode(WordJoinModeEnum wordJoinMode) {
    this.wordJoinMode = wordJoinMode;
    return this;
  }

   /**
   * Allows to join word documents without empty space between documents.
   * @return wordJoinMode
  **/
  @ApiModelProperty(required = true, value = "Allows to join word documents without empty space between documents.")
  public WordJoinModeEnum getWordJoinMode() {
    return wordJoinMode;
  }

  public void setWordJoinMode(WordJoinModeEnum wordJoinMode) {
    this.wordJoinMode = wordJoinMode;
  }

  public JoinItem imageJoinMode(ImageJoinModeEnum imageJoinMode) {
    this.imageJoinMode = imageJoinMode;
    return this;
  }

   /**
   * Possible modes for the image joining.
   * @return imageJoinMode
  **/
  @ApiModelProperty(required = true, value = "Possible modes for the image joining.")
  public ImageJoinModeEnum getImageJoinMode() {
    return imageJoinMode;
  }

  public void setImageJoinMode(ImageJoinModeEnum imageJoinMode) {
    this.imageJoinMode = imageJoinMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinItem joinItem = (JoinItem) o;
    return Objects.equals(this.fileInfo, joinItem.fileInfo) &&
        Objects.equals(this.pages, joinItem.pages) &&
        Objects.equals(this.startPageNumber, joinItem.startPageNumber) &&
        Objects.equals(this.endPageNumber, joinItem.endPageNumber) &&
        Objects.equals(this.rangeMode, joinItem.rangeMode) &&
        Objects.equals(this.wordJoinMode, joinItem.wordJoinMode) &&
        Objects.equals(this.imageJoinMode, joinItem.imageJoinMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, pages, startPageNumber, endPageNumber, rangeMode, wordJoinMode, imageJoinMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinItem {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    endPageNumber: ").append(toIndentedString(endPageNumber)).append("\n");
    sb.append("    rangeMode: ").append(toIndentedString(rangeMode)).append("\n");
    sb.append("    wordJoinMode: ").append(toIndentedString(wordJoinMode)).append("\n");
    sb.append("    imageJoinMode: ").append(toIndentedString(imageJoinMode)).append("\n");
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

