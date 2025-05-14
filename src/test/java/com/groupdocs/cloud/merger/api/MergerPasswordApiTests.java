/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.merger.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.merger.client.ApiException;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.model.*;

import org.junit.Test;


public class MergerPasswordApiTests extends BaseApiTest {
    
    @Test
    public void TestCheckPassword() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;

        CheckPasswordRequest request = new CheckPasswordRequest(testFile.getPath(), null, null);

        // Act & Assert
        PasswordResult result = passwordApi.checkPassword(request);

        assertEquals(false, result.getIsPasswordSet());
    }

    @Test
    public void TestCheckPasswordProtected() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;

        CheckPasswordRequest request = new CheckPasswordRequest(testFile.getPath(), null, null);

        // Act & Assert
        PasswordResult result = passwordApi.checkPassword(request);

        assertEquals(true, result.getIsPasswordSet());
    }

    @Test
    public void TestRemovePassword() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;

        Options options = new Options();
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());

        RemovePasswordRequest request = new RemovePasswordRequest(options);

        // Act & Assert
        DocumentResult result = passwordApi.removePassword(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }

    @Test
    public void TestAddPassword() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.FourPagesDocx;

        Options options = new Options();
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.getFileInfo().setPassword("NewPassword");
        AddPasswordRequest request = new AddPasswordRequest(options);

        // Act & Assert
        DocumentResult result = passwordApi.addPassword(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }
    
    @Test
    public void TestUpdatePassword() throws ApiException
    {
        // Arrange
        TestFile testFile = TestFiles.PasswordProtectedDocx;

        UpdatePasswordOptions options = new UpdatePasswordOptions();
        options.setFileInfo(testFile.ToFileInfo());
        options.setOutputPath(DefaultOutputPath + "\\" + testFile.getFileName());
        options.setNewPassword("NewPassword");
        UpdatePasswordRequest request = new UpdatePasswordRequest(options);

        // Act & Assert
        DocumentResult result = passwordApi.updatePassword(request);

        assertEquals(options.getOutputPath(), result.getPath());
    }    
}

