/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.merger.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.merger.client.ApiException;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.model.*;

import org.junit.Test;


public class MergerInfoApiTests extends BaseApiTest {

    @Test
    public void TestGetInfoReturnsFileNotFound()
    {
        // Arrange        
        GetInfoRequest request = new GetInfoRequest(TestFiles.NotExist.ToFileInfo());

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'some-folder/NotExist.docx'.", ex.getMessage());
        }  
    }

    @Test
    public void TestGetInfo() throws ApiException
    {
        // Arrange
        GetInfoRequest request = new GetInfoRequest(TestFiles.FourPagesDocx.ToFileInfo());

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(4, infoResult.getPages().size());        
    }

    @Test
    public void TestGetInfoProtected() throws ApiException
    {
        // Arrange
        GetInfoRequest request = new GetInfoRequest(TestFiles.PasswordProtectedDocx.ToFileInfo());

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(4, infoResult.getPages().size());        
    }    
}

