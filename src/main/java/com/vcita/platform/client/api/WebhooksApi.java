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


import com.vcita.platform.client.model.InlineObject32;
import com.vcita.platform.client.model.InlineObject33;
import com.vcita.platform.client.model.InlineResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WebhooksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
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
     * Build call for webhookSubscribePost
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject32  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookSubscribePostCall(String authorization, InlineObject32 inlineObject32, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineObject32;

        // create path and map variables
        String localVarPath = "/webhook/subscribe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            
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
    private okhttp3.Call webhookSubscribePostValidateBeforeCall(String authorization, InlineObject32 inlineObject32, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling webhookSubscribePost(Async)");
        }
        

        okhttp3.Call localVarCall = webhookSubscribePostCall(authorization, inlineObject32, _callback);
        return localVarCall;

    }

    /**
     * Subscribe To Webhook
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject32  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed </td><td>  -  </td></tr>
     </table>
     */
    public void webhookSubscribePost(String authorization, InlineObject32 inlineObject32) throws ApiException {
        webhookSubscribePostWithHttpInfo(authorization, inlineObject32);
    }

    /**
     * Subscribe To Webhook
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject32  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> webhookSubscribePostWithHttpInfo(String authorization, InlineObject32 inlineObject32) throws ApiException {
        okhttp3.Call localVarCall = webhookSubscribePostValidateBeforeCall(authorization, inlineObject32, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Subscribe To Webhook (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject32  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookSubscribePostAsync(String authorization, InlineObject32 inlineObject32, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhookSubscribePostValidateBeforeCall(authorization, inlineObject32, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for webhookUnsubscribePost
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject33  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Unsubscribed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookUnsubscribePostCall(String authorization, InlineObject33 inlineObject33, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineObject33;

        // create path and map variables
        String localVarPath = "/webhook/unsubscribe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            
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
    private okhttp3.Call webhookUnsubscribePostValidateBeforeCall(String authorization, InlineObject33 inlineObject33, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling webhookUnsubscribePost(Async)");
        }
        

        okhttp3.Call localVarCall = webhookUnsubscribePostCall(authorization, inlineObject33, _callback);
        return localVarCall;

    }

    /**
     * Unsubscribe from Webhook
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject33  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Unsubscribed </td><td>  -  </td></tr>
     </table>
     */
    public void webhookUnsubscribePost(String authorization, InlineObject33 inlineObject33) throws ApiException {
        webhookUnsubscribePostWithHttpInfo(authorization, inlineObject33);
    }

    /**
     * Unsubscribe from Webhook
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject33  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Unsubscribed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> webhookUnsubscribePostWithHttpInfo(String authorization, InlineObject33 inlineObject33) throws ApiException {
        okhttp3.Call localVarCall = webhookUnsubscribePostValidateBeforeCall(authorization, inlineObject33, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unsubscribe from Webhook (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject33  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Unsubscribed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookUnsubscribePostAsync(String authorization, InlineObject33 inlineObject33, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhookUnsubscribePostValidateBeforeCall(authorization, inlineObject33, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for webhooksGet
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filtering the list of webhooks. Filter is a &#39;deepObject&#39; works with:   1. &#39;entity&#39; - object which listen to event (example: client)   2. &#39;event_type&#39; - type of event to triger hoom (example: created)  Example:   &lt;url&gt;?filter[entity]&#x3D;client&amp;filter[event_type]&#x3D;created  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhooksGetCall(String authorization, String filter, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "default" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call webhooksGetValidateBeforeCall(String authorization, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling webhooksGet(Async)");
        }
        

        okhttp3.Call localVarCall = webhooksGetCall(authorization, filter, _callback);
        return localVarCall;

    }

    /**
     * Get Webhooks List
     * Get appointment
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filtering the list of webhooks. Filter is a &#39;deepObject&#39; works with:   1. &#39;entity&#39; - object which listen to event (example: client)   2. &#39;event_type&#39; - type of event to triger hoom (example: created)  Example:   &lt;url&gt;?filter[entity]&#x3D;client&amp;filter[event_type]&#x3D;created  (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 webhooksGet(String authorization, String filter) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = webhooksGetWithHttpInfo(authorization, filter);
        return localVarResp.getData();
    }

    /**
     * Get Webhooks List
     * Get appointment
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filtering the list of webhooks. Filter is a &#39;deepObject&#39; works with:   1. &#39;entity&#39; - object which listen to event (example: client)   2. &#39;event_type&#39; - type of event to triger hoom (example: created)  Example:   &lt;url&gt;?filter[entity]&#x3D;client&amp;filter[event_type]&#x3D;created  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> webhooksGetWithHttpInfo(String authorization, String filter) throws ApiException {
        okhttp3.Call localVarCall = webhooksGetValidateBeforeCall(authorization, filter, null);
        try {
            Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Get Webhooks List (asynchronously)
     * Get appointment
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filtering the list of webhooks. Filter is a &#39;deepObject&#39; works with:   1. &#39;entity&#39; - object which listen to event (example: client)   2. &#39;event_type&#39; - type of event to triger hoom (example: created)  Example:   &lt;url&gt;?filter[entity]&#x3D;client&amp;filter[event_type]&#x3D;created  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhooksGetAsync(String authorization, String filter, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhooksGetValidateBeforeCall(authorization, filter, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
