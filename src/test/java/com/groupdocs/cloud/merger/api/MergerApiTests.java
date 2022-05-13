/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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

package com.groupdocs.cloud.merger.api;

import static org.junit.Assert.*;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.ApiException;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.model.*;

import org.junit.Test;


public class MergerApiTests extends BaseApiTest {

    @Test
    public void TestMove() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        MoveOptions options = new MoveOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPageNumber(1);
        options.setNewPageNumber(2);
        MoveRequest request = new MoveRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.move(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }   

    @Test
    public void TestMoveProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        MoveOptions options = new MoveOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPageNumber(1);
        options.setNewPageNumber(2);
        MoveRequest request = new MoveRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.move(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }       

    @Test
    public void TestRemove() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourSheetsXlsx;
        RemoveOptions options = new RemoveOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));

        RemoveRequest request = new RemoveRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.remove(request);

        assertEquals(options.getOutputPath(), result.getPath());
    } 

    @Test
    public void TestRemoveProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourSheetsProtectedXlsx;
        RemoveOptions options = new RemoveOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));

        RemoveRequest request = new RemoveRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.remove(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }    

    @Test
    public void TestRotate() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.TenPagesPdf;
        RotateOptions options = new RotateOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setMode(RotateOptions.ModeEnum.ROTATE90);

        RotateRequest request = new RotateRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.rotate(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }  
    
    @Test
    public void TestRotateProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.OnePageProtectedPdf;
        RotateOptions options = new RotateOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(1));
        options.setMode(RotateOptions.ModeEnum.ROTATE90);

        RotateRequest request = new RotateRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.rotate(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestSplitPages() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        SplitOptions options = new SplitOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setMode(SplitOptions.ModeEnum.PAGES);

        SplitRequest request = new SplitRequest(options);

        // Act & Assert
        MultiDocumentResult result = documentApi.split(request);

        assertEquals(2, result.getDocuments().size());
    } 
    
    @Test
    public void TestSplitPagesProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        SplitOptions options = new SplitOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setMode(SplitOptions.ModeEnum.PAGES);

        SplitRequest request = new SplitRequest(options);

        // Act & Assert
        MultiDocumentResult result = documentApi.split(request);

        assertEquals(2, result.getDocuments().size());
    }
    
    @Test
    public void TestSwap() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        SwapOptions options = new SwapOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setFirstPageNumber(2);
        options.setSecondPageNumber(4);

        SwapRequest request = new SwapRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.swap(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }  

    @Test
    public void TestSwapProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        SwapOptions options = new SwapOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setFirstPageNumber(2);
        options.setSecondPageNumber(4);

        SwapRequest request = new SwapRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.swap(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestExtract() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        ExtractOptions options = new ExtractOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));

        ExtractRequest request = new ExtractRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.extract(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }
    
    @Test
    public void TestExtractProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        ExtractOptions options = new ExtractOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));

        ExtractRequest request = new ExtractRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.extract(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestOrientation() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        OrientationOptions options = new OrientationOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setMode(OrientationOptions.ModeEnum.LANDSCAPE);

        OrientationRequest request = new OrientationRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.orientation(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestOrientationProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        OrientationOptions options = new OrientationOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setMode(OrientationOptions.ModeEnum.LANDSCAPE);

        OrientationRequest request = new OrientationRequest(options);

        // Act & Assert
        DocumentResult result = mergeApi.orientation(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestPreview() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;
        PreviewOptions options = new PreviewOptions();         
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setWidth(600);
        options.setHeight(900);
        options.setFormat(PreviewOptions.FormatEnum.PNG);

        PreviewRequest request = new PreviewRequest(options);

        // Act & Assert
        MultiDocumentResult result = documentApi.preview(request);

        assertEquals(2, result.getDocuments().size());
    }

    @Test
    public void TestPreviewProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        PreviewOptions options = new PreviewOptions();        
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setPages(Arrays.asList(2, 4));
        options.setWidth(600);
        options.setHeight(900);
        options.setFormat(PreviewOptions.FormatEnum.PNG);

        PreviewRequest request = new PreviewRequest(options);

        // Act & Assert
        MultiDocumentResult result = documentApi.preview(request);

        assertEquals(2, result.getDocuments().size());
    }    
    
    @Test
    public void TestJoin() throws ApiException
    {
        // Arrange
        JoinItem item1 = new JoinItem();
        item1.setFileInfo(TestFiles.PasswordProtectedDocx.ToFileInfo());
        JoinItem item2 = new JoinItem();
        item2.setFileInfo(TestFiles.FourPagesDocx.ToFileInfo());
        JoinOptions options = new JoinOptions();        
        options.setJoinItems(Arrays.asList(item1, item2));
        options.setOutputPath(DefaultOutputPath + "\\" + "joined.docx");

        JoinRequest request = new JoinRequest(options);

        // Act & Assert
        DocumentResult result = documentApi.join(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }   
    
    @Test
    public void TestJoinCrossFormat() throws ApiException
    {
        // Arrange
        JoinItem item1 = new JoinItem();
        item1.setFileInfo(TestFiles.OnePageProtectedPdf.ToFileInfo());
        JoinItem item2 = new JoinItem();
        item2.setFileInfo(TestFiles.FourPagesDocx.ToFileInfo());
        JoinOptions options = new JoinOptions();        
        options.setJoinItems(Arrays.asList(item1, item2));
        options.setOutputPath(DefaultOutputPath + "\\" + "joined.pdf");

        JoinRequest request = new JoinRequest(options);

        // Act & Assert
        DocumentResult result = documentApi.join(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }    

    @Test
    public void TestImport() throws ApiException
    {
        // Arrange
        ImportOptions options = new ImportOptions();     
        options.setFileInfo(TestFiles.OnePageProtectedPdf.ToFileInfo());   
        options.addAttachmentsItem(TestFiles.Txt.getPath());
        options.setOutputPath(DefaultOutputPath + "\\" + "with-attachment.pdf");

        CallImportRequest request = new CallImportRequest(options);

        // Act & Assert
        DocumentResult result = documentApi.callImport(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }        
}

