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

import java.util.ArrayList;

public class TestFiles {
    
    public static TestFile OnePageDocx = new TestFile("one-page.docx", "words\\");
    public static TestFile NotExist = new TestFile("NotExist.docx", "some-folder/");
    public static TestFile PasswordProtectedDocx = new TestFile("password-protected.docx", "words\\");
    public static TestFile FourPagesDocx = new TestFile("four-pages.docx", "words\\");    
    public static TestFile TenPagesPdf = new TestFile("ten-pages.pdf", "pdf\\");
    public static TestFile OnePageProtectedPdf = new TestFile("one-page-password.pdf", "pdf\\");
    public static TestFile FourSheetsXlsx = new TestFile("four-sheets.xlsx","cells\\");
    public static TestFile FourSheetsProtectedXlsx = new TestFile("four-sheets-protected.xlsx", "cells\\");
    public static TestFile Txt = new TestFile("document.txt", "txt\\");

    static {
        PasswordProtectedDocx.setPassword("password");
        OnePageProtectedPdf.setPassword("password");
        FourSheetsProtectedXlsx.setPassword("password");
    }

    public static ArrayList<TestFile> GetList() {
        
        ArrayList<TestFile> files = new ArrayList<TestFile>();

        files.add(OnePageDocx);
        files.add(PasswordProtectedDocx);
        files.add(FourPagesDocx);
        files.add(TenPagesPdf);
        files.add(OnePageProtectedPdf);
        files.add(FourSheetsXlsx);
        files.add(FourSheetsProtectedXlsx);
        files.add(Txt);

        return files; 
    } 
}