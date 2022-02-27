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


import com.vcita.platform.client.model.ClientsClientIdEstimatesGet200Response;
import com.vcita.platform.client.model.EstimatesGet200Response;
import com.vcita.platform.client.model.EstimatesPost201Response;
import com.vcita.platform.client.model.InlineObject10;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EstimatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EstimatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EstimatesApi(ApiClient apiClient) {
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
     * Build call for clientsClientIdEstimatesGet
     * @param clientId client&#39;s id (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsClientIdEstimatesGetCall(String clientId, String authorization, String filter, String sort, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/clients/{client_id}/estimates"
            .replaceAll("\\{" + "client_id" + "\\}", localVarApiClient.escapeString(clientId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
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
    private okhttp3.Call clientsClientIdEstimatesGetValidateBeforeCall(String clientId, String authorization, String filter, String sort, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling clientsClientIdEstimatesGet(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling clientsClientIdEstimatesGet(Async)");
        }
        

        okhttp3.Call localVarCall = clientsClientIdEstimatesGetCall(clientId, authorization, filter, sort, _callback);
        return localVarCall;

    }

    /**
     * Get Estimates Of Client
     * 
     * @param clientId client&#39;s id (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @return ClientsClientIdEstimatesGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public ClientsClientIdEstimatesGet200Response clientsClientIdEstimatesGet(String clientId, String authorization, String filter, String sort) throws ApiException {
        ApiResponse<ClientsClientIdEstimatesGet200Response> localVarResp = clientsClientIdEstimatesGetWithHttpInfo(clientId, authorization, filter, sort);
        return localVarResp.getData();
    }

    /**
     * Get Estimates Of Client
     * 
     * @param clientId client&#39;s id (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @return ApiResponse&lt;ClientsClientIdEstimatesGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClientsClientIdEstimatesGet200Response> clientsClientIdEstimatesGetWithHttpInfo(String clientId, String authorization, String filter, String sort) throws ApiException {
        okhttp3.Call localVarCall = clientsClientIdEstimatesGetValidateBeforeCall(clientId, authorization, filter, sort, null);
        try {
            Type localVarReturnType = new TypeToken<ClientsClientIdEstimatesGet200Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ClientsClientIdEstimatesGet200Response>(){}.getType()));
            e.setErrorObjectType(new GenericType<ClientsClientIdEstimatesGet200Response>(){});
            throw e;
        }
    }

    /**
     * Get Estimates Of Client (asynchronously)
     * 
     * @param clientId client&#39;s id (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsClientIdEstimatesGetAsync(String clientId, String authorization, String filter, String sort, final ApiCallback<ClientsClientIdEstimatesGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsClientIdEstimatesGetValidateBeforeCall(clientId, authorization, filter, sort, _callback);
        Type localVarReturnType = new TypeToken<ClientsClientIdEstimatesGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for estimatesGet
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (default: 25) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call estimatesGetCall(String authorization, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/estimates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
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
    private okhttp3.Call estimatesGetValidateBeforeCall(String authorization, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling estimatesGet(Async)");
        }
        

        okhttp3.Call localVarCall = estimatesGetCall(authorization, filter, sort, page, perPage, _callback);
        return localVarCall;

    }

    /**
     * Get Estimates List
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (default: 25) (optional)
     * @return EstimatesGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public EstimatesGet200Response estimatesGet(String authorization, String filter, String sort, String page, String perPage) throws ApiException {
        ApiResponse<EstimatesGet200Response> localVarResp = estimatesGetWithHttpInfo(authorization, filter, sort, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Get Estimates List
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (default: 25) (optional)
     * @return ApiResponse&lt;EstimatesGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EstimatesGet200Response> estimatesGetWithHttpInfo(String authorization, String filter, String sort, String page, String perPage) throws ApiException {
        okhttp3.Call localVarCall = estimatesGetValidateBeforeCall(authorization, filter, sort, page, perPage, null);
        try {
            Type localVarReturnType = new TypeToken<EstimatesGet200Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<EstimatesGet200Response>(){}.getType()));
            e.setErrorObjectType(new GenericType<EstimatesGet200Response>(){});
            throw e;
        }
    }

    /**
     * Get Estimates List (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (default: 25) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Estimates Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call estimatesGetAsync(String authorization, String filter, String sort, String page, String perPage, final ApiCallback<EstimatesGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = estimatesGetValidateBeforeCall(authorization, filter, sort, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<EstimatesGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for estimatesPost
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject10  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Estimate Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call estimatesPostCall(String authorization, InlineObject10 inlineObject10, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineObject10;

        // create path and map variables
        String localVarPath = "/estimates";

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
    private okhttp3.Call estimatesPostValidateBeforeCall(String authorization, InlineObject10 inlineObject10, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling estimatesPost(Async)");
        }
        

        okhttp3.Call localVarCall = estimatesPostCall(authorization, inlineObject10, _callback);
        return localVarCall;

    }

    /**
     * Create New Estimate
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject10  (optional)
     * @return EstimatesPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Estimate Created </td><td>  -  </td></tr>
     </table>
     */
    public EstimatesPost201Response estimatesPost(String authorization, InlineObject10 inlineObject10) throws ApiException {
        ApiResponse<EstimatesPost201Response> localVarResp = estimatesPostWithHttpInfo(authorization, inlineObject10);
        return localVarResp.getData();
    }

    /**
     * Create New Estimate
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject10  (optional)
     * @return ApiResponse&lt;EstimatesPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Estimate Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EstimatesPost201Response> estimatesPostWithHttpInfo(String authorization, InlineObject10 inlineObject10) throws ApiException {
        okhttp3.Call localVarCall = estimatesPostValidateBeforeCall(authorization, inlineObject10, null);
        try {
            Type localVarReturnType = new TypeToken<EstimatesPost201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<EstimatesPost201Response>(){}.getType()));
            e.setErrorObjectType(new GenericType<EstimatesPost201Response>(){});
            throw e;
        }
    }

    /**
     * Create New Estimate (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject10  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Estimate Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call estimatesPostAsync(String authorization, InlineObject10 inlineObject10, final ApiCallback<EstimatesPost201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = estimatesPostValidateBeforeCall(authorization, inlineObject10, _callback);
        Type localVarReturnType = new TypeToken<EstimatesPost201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
