/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SecurityApi.java">
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

public class SecurityApi {
    private ApiClient apiClient;

    /**
     * Initializes new instance of SecurityApi
     * @param appSid Application identifier (App SID)
     * @param appKey Application private key (App Key)
     */
    public SecurityApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    /**
     * Initializes new instance of SecurityApi
     * @param configuration Configuration The configuration
     */
    public SecurityApi(Configuration configuration) {
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
     * Build call for addPassword
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPasswordCall(AddPasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/password";

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addPasswordValidateBeforeCall(AddPasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling addPassword(Async)");
        }
        

        com.squareup.okhttp.Call call = addPasswordCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add document password protection
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult addPassword(AddPasswordRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = addPasswordWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Add document password protection
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> addPasswordWithHttpInfo(AddPasswordRequest request) throws ApiException {
        com.squareup.okhttp.Call call = addPasswordValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add document password protection (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPasswordAsync(AddPasswordRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addPasswordValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for checkPassword
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call checkPasswordCall(CheckPasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merger/password";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getfilePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("filePath", request.getfilePath()));
        if (request.getstorageName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", request.getstorageName()));
        if (request.getversionId() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("versionId", request.getversionId()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call checkPasswordValidateBeforeCall(CheckPasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'filePath' is set
        if (request.getfilePath() == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling checkPassword(Async)");
        }
        

        com.squareup.okhttp.Call call = checkPasswordCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Checks whether document is password protected
     * 
     * @param request The request model
     * @return PasswordResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PasswordResult checkPassword(CheckPasswordRequest request) throws ApiException {
        ApiResponse<PasswordResult> resp = checkPasswordWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Checks whether document is password protected
     * 
     * @param request The request model
     * @return ApiResponse&lt;PasswordResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PasswordResult> checkPasswordWithHttpInfo(CheckPasswordRequest request) throws ApiException {
        com.squareup.okhttp.Call call = checkPasswordValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PasswordResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Checks whether document is password protected (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkPasswordAsync(CheckPasswordRequest request, final ApiCallback<PasswordResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = checkPasswordValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PasswordResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removePassword
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removePasswordCall(RemovePasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/password";

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removePasswordValidateBeforeCall(RemovePasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling removePassword(Async)");
        }
        

        com.squareup.okhttp.Call call = removePasswordCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove document password protection
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult removePassword(RemovePasswordRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = removePasswordWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Remove document password protection
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> removePasswordWithHttpInfo(RemovePasswordRequest request) throws ApiException {
        com.squareup.okhttp.Call call = removePasswordValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove document password protection (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removePasswordAsync(RemovePasswordRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removePasswordValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePassword
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePasswordCall(UpdatePasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getoptions();

        // create path and map variables
        String localVarPath = "/merger/password";

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
    private com.squareup.okhttp.Call updatePasswordValidateBeforeCall(UpdatePasswordRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (request.getoptions() == null) {
            throw new ApiException("Missing the required parameter 'options' when calling updatePassword(Async)");
        }
        

        com.squareup.okhttp.Call call = updatePasswordCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update document password
     * 
     * @param request The request model
     * @return DocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResult updatePassword(UpdatePasswordRequest request) throws ApiException {
        ApiResponse<DocumentResult> resp = updatePasswordWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Update document password
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResult> updatePasswordWithHttpInfo(UpdatePasswordRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updatePasswordValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update document password (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePasswordAsync(UpdatePasswordRequest request, final ApiCallback<DocumentResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePasswordValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

