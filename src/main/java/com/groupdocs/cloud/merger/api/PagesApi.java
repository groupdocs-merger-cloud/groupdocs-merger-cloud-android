/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PagesApi.java">
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

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;

public class PagesApi {
    private ApiClient apiClient;

    /**
     * Initializes new instance of PagesApi
     * @param appSid Application identifier (App SID)
     * @param appKey Application private key (App Key)
     */
    public PagesApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    /**
     * Initializes new instance of PagesApi
     * @param configuration Configuration The configuration
     */
    public PagesApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    /**
     * Gets ApiClient
     *
     * @return ApiClient The Api client
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Sets ApiClient
     *
     * @param apiClient The Api client
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for extract
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call extractCall(ExtractRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/extract";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call extractValidateBeforeCall(ExtractRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling extract(Async)");
        }
        

        com.squareup.okhttp.Call call = extractCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Make new document with some pages from source document
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult extract(ExtractRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = extractWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Make new document with some pages from source document
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> extractWithHttpInfo(ExtractRequest request) throws ApiException {
        com.squareup.okhttp.Call call = extractValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Make new document with some pages from source document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call extractAsync(ExtractRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = extractValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for move
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveCall(MoveRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/move";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveValidateBeforeCall(MoveRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling move(Async)");
        }
        

        com.squareup.okhttp.Call call = moveCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move page to a new position within document
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult move(MoveRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = moveWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Move page to a new position within document
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> moveWithHttpInfo(MoveRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move page to a new position within document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveAsync(MoveRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = moveValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for orientation
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orientationCall(OrientationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/orientation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call orientationValidateBeforeCall(OrientationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling orientation(Async)");
        }
        

        com.squareup.okhttp.Call call = orientationCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Make new document and apply new orientation mode for specified pages
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult orientation(OrientationRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = orientationWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Make new document and apply new orientation mode for specified pages
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> orientationWithHttpInfo(OrientationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = orientationValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Make new document and apply new orientation mode for specified pages (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orientationAsync(OrientationRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orientationValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for remove
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeCall(RemoveRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/remove";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeValidateBeforeCall(RemoveRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling remove(Async)");
        }
        

        com.squareup.okhttp.Call call = removeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove pages from document
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult remove(RemoveRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = removeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Remove pages from document
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> removeWithHttpInfo(RemoveRequest request) throws ApiException {
        com.squareup.okhttp.Call call = removeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove pages from document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeAsync(RemoveRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rotate
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rotateCall(RotateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/rotate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rotateValidateBeforeCall(RotateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling rotate(Async)");
        }
        

        com.squareup.okhttp.Call call = rotateCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotate pages in document
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult rotate(RotateRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = rotateWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Rotate pages in document
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> rotateWithHttpInfo(RotateRequest request) throws ApiException {
        com.squareup.okhttp.Call call = rotateValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate pages in document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rotateAsync(RotateRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = rotateValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for swap
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swapCall(SwapRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/pages/swap";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swapValidateBeforeCall(SwapRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling swap(Async)");
        }
        

        com.squareup.okhttp.Call call = swapCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Swap two pages within document
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult swap(SwapRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = swapWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Swap two pages within document
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> swapWithHttpInfo(SwapRequest request) throws ApiException {
        com.squareup.okhttp.Call call = swapValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Swap two pages within document (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swapAsync(SwapRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swapValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

