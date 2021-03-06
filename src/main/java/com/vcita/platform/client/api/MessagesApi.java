/*
 * Platform API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vcita.platform.client.api;

import com.vcita.platform.client.ApiCallback;
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.ApiResponse;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.Pair;
import com.vcita.platform.client.ProgressRequestBody;
import com.vcita.platform.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.vcita.platform.client.model.InlineObject16;
import com.vcita.platform.client.model.MessagesPost201Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for messagesPost
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject16  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call messagesPostCall(String authorization, InlineObject16 inlineObject16, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = inlineObject16;

        // create path and map variables
        String localVarPath = "/messages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "default" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call messagesPostValidateBeforeCall(String authorization, InlineObject16 inlineObject16, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling messagesPost(Async)");
        }
        

        okhttp3.Call localVarCall = messagesPostCall(authorization, inlineObject16, _callback);
        return localVarCall;

    }

    /**
     * Create a Message
     * Creates a Message.
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject16  (optional)
     * @return MessagesPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public MessagesPost201Response messagesPost(String authorization, InlineObject16 inlineObject16) throws ApiException {
        ApiResponse<MessagesPost201Response> localVarResp = messagesPostWithHttpInfo(authorization, inlineObject16);
        return localVarResp.getData();
    }

    /**
     * Create a Message
     * Creates a Message.
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject16  (optional)
     * @return ApiResponse&lt;MessagesPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MessagesPost201Response> messagesPostWithHttpInfo(String authorization, InlineObject16 inlineObject16) throws ApiException {
        okhttp3.Call localVarCall = messagesPostValidateBeforeCall(authorization, inlineObject16, null);
        try {
            Type localVarReturnType = new TypeToken<MessagesPost201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Create a Message (asynchronously)
     * Creates a Message.
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject16  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call messagesPostAsync(String authorization, InlineObject16 inlineObject16, final ApiCallback<MessagesPost201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = messagesPostValidateBeforeCall(authorization, inlineObject16, _callback);
        Type localVarReturnType = new TypeToken<MessagesPost201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
