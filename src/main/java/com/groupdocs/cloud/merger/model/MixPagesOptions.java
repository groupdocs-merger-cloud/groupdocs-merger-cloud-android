/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MixPagesOptions.java">
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
import com.groupdocs.cloud.merger.model.MixPagesItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines options for documents JoinPages method
 */
@ApiModel(description = "Defines options for documents JoinPages method")
public class MixPagesOptions {
  @SerializedName("files")
  private List<FileInfo> files = null;

  @SerializedName("filesPages")
  private List<MixPagesItem> filesPages = null;

  @SerializedName("outputPath")
  private String outputPath = null;

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
   * Compliance mode for the Word Ooxml format
   */
  @JsonAdapter(WordJoinComplianceEnum.Adapter.class)
  public enum WordJoinComplianceEnum {
    ECMA376_2006("Ecma376_2006"),
    
    ISO29500_2008_TRANSITIONAL("Iso29500_2008_Transitional"),
    
    ISO29500_2008_STRICT("Iso29500_2008_Strict"),
    
    AUTO("Auto");

    private String value;

    WordJoinComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WordJoinComplianceEnum fromValue(String text) {
      for (WordJoinComplianceEnum b : WordJoinComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WordJoinComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WordJoinComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WordJoinComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WordJoinComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("wordJoinCompliance")
  private WordJoinComplianceEnum wordJoinCompliance = null;

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

  public MixPagesOptions files(List<FileInfo> files) {
    this.files = files;
    return this;
  }

  public MixPagesOptions addFilesItem(FileInfo filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<FileInfo>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Source documents for JoinPages operation
   * @return files
  **/
  @ApiModelProperty(value = "Source documents for JoinPages operation")
  public List<FileInfo> getFiles() {
    return files;
  }

  public void setFiles(List<FileInfo> files) {
    this.files = files;
  }

  public MixPagesOptions filesPages(List<MixPagesItem> filesPages) {
    this.filesPages = filesPages;
    return this;
  }

  public MixPagesOptions addFilesPagesItem(MixPagesItem filesPagesItem) {
    if (this.filesPages == null) {
      this.filesPages = new ArrayList<MixPagesItem>();
    }
    this.filesPages.add(filesPagesItem);
    return this;
  }

   /**
   * Page numbers for document indicies in Files collection.
   * @return filesPages
  **/
  @ApiModelProperty(value = "Page numbers for document indicies in Files collection.")
  public List<MixPagesItem> getFilesPages() {
    return filesPages;
  }

  public void setFilesPages(List<MixPagesItem> filesPages) {
    this.filesPages = filesPages;
  }

  public MixPagesOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * The output path
   * @return outputPath
  **/
  @ApiModelProperty(value = "The output path")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public MixPagesOptions wordJoinMode(WordJoinModeEnum wordJoinMode) {
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

  public MixPagesOptions wordJoinCompliance(WordJoinComplianceEnum wordJoinCompliance) {
    this.wordJoinCompliance = wordJoinCompliance;
    return this;
  }

   /**
   * Compliance mode for the Word Ooxml format
   * @return wordJoinCompliance
  **/
  @ApiModelProperty(required = true, value = "Compliance mode for the Word Ooxml format")
  public WordJoinComplianceEnum getWordJoinCompliance() {
    return wordJoinCompliance;
  }

  public void setWordJoinCompliance(WordJoinComplianceEnum wordJoinCompliance) {
    this.wordJoinCompliance = wordJoinCompliance;
  }

  public MixPagesOptions imageJoinMode(ImageJoinModeEnum imageJoinMode) {
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
    MixPagesOptions mixPagesOptions = (MixPagesOptions) o;
    return Objects.equals(this.files, mixPagesOptions.files) &&
        Objects.equals(this.filesPages, mixPagesOptions.filesPages) &&
        Objects.equals(this.outputPath, mixPagesOptions.outputPath) &&
        Objects.equals(this.wordJoinMode, mixPagesOptions.wordJoinMode) &&
        Objects.equals(this.wordJoinCompliance, mixPagesOptions.wordJoinCompliance) &&
        Objects.equals(this.imageJoinMode, mixPagesOptions.imageJoinMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, filesPages, outputPath, wordJoinMode, wordJoinCompliance, imageJoinMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixPagesOptions {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    filesPages: ").append(toIndentedString(filesPages)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    wordJoinMode: ").append(toIndentedString(wordJoinMode)).append("\n");
    sb.append("    wordJoinCompliance: ").append(toIndentedString(wordJoinCompliance)).append("\n");
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

