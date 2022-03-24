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


import com.vcita.platform.client.model.ClientsClientIdInvoicesGet201Response;
import com.vcita.platform.client.model.InlineObject14;
import com.vcita.platform.client.model.InvoicesGet201Response;
import com.vcita.platform.client.model.InvoicesInvoiceIdGet201Response;
import com.vcita.platform.client.model.InvoicesPost201Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvoicesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvoicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoicesApi(ApiClient apiClient) {
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
     * Build call for clientsClientIdInvoicesGet
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param clientId client&#39;s id (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsClientIdInvoicesGetCall(String authorization, String clientId, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/clients/{client_id}/invoices"
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
    private okhttp3.Call clientsClientIdInvoicesGetValidateBeforeCall(String authorization, String clientId, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling clientsClientIdInvoicesGet(Async)");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling clientsClientIdInvoicesGet(Async)");
        }
        

        okhttp3.Call localVarCall = clientsClientIdInvoicesGetCall(authorization, clientId, filter, sort, page, perPage, _callback);
        return localVarCall;

    }

    /**
     * Get Invoices Of Client
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param clientId client&#39;s id (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @return ClientsClientIdInvoicesGet201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public ClientsClientIdInvoicesGet201Response clientsClientIdInvoicesGet(String authorization, String clientId, String filter, String sort, String page, String perPage) throws ApiException {
        ApiResponse<ClientsClientIdInvoicesGet201Response> localVarResp = clientsClientIdInvoicesGetWithHttpInfo(authorization, clientId, filter, sort, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Get Invoices Of Client
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param clientId client&#39;s id (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @return ApiResponse&lt;ClientsClientIdInvoicesGet201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClientsClientIdInvoicesGet201Response> clientsClientIdInvoicesGetWithHttpInfo(String authorization, String clientId, String filter, String sort, String page, String perPage) throws ApiException {
        okhttp3.Call localVarCall = clientsClientIdInvoicesGetValidateBeforeCall(authorization, clientId, filter, sort, page, perPage, null);
        try {
            Type localVarReturnType = new TypeToken<ClientsClientIdInvoicesGet201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Get Invoices Of Client (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param clientId client&#39;s id (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clientsClientIdInvoicesGetAsync(String authorization, String clientId, String filter, String sort, String page, String perPage, final ApiCallback<ClientsClientIdInvoicesGet201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = clientsClientIdInvoicesGetValidateBeforeCall(authorization, clientId, filter, sort, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<ClientsClientIdInvoicesGet201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invoicesGet
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesGetCall(String authorization, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/invoices";

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
    private okhttp3.Call invoicesGetValidateBeforeCall(String authorization, String filter, String sort, String page, String perPage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling invoicesGet(Async)");
        }
        

        okhttp3.Call localVarCall = invoicesGetCall(authorization, filter, sort, page, perPage, _callback);
        return localVarCall;

    }

    /**
     * Get Invoices List
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @return InvoicesGet201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public InvoicesGet201Response invoicesGet(String authorization, String filter, String sort, String page, String perPage) throws ApiException {
        ApiResponse<InvoicesGet201Response> localVarResp = invoicesGetWithHttpInfo(authorization, filter, sort, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Get Invoices List
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @return ApiResponse&lt;InvoicesGet201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoicesGet201Response> invoicesGetWithHttpInfo(String authorization, String filter, String sort, String page, String perPage) throws ApiException {
        okhttp3.Call localVarCall = invoicesGetValidateBeforeCall(authorization, filter, sort, page, perPage, null);
        try {
            Type localVarReturnType = new TypeToken<InvoicesGet201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Get Invoices List (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param filter Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft (optional)
     * @param sort Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc (optional)
     * @param page Page offset (optional)
     * @param perPage Page size (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesGetAsync(String authorization, String filter, String sort, String page, String perPage, final ApiCallback<InvoicesGet201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = invoicesGetValidateBeforeCall(authorization, filter, sort, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<InvoicesGet201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invoicesInvoiceIdGet
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param invoiceId Invoice ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesInvoiceIdGetCall(String authorization, String invoiceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/invoices/{invoice_id}"
            .replaceAll("\\{" + "invoice_id" + "\\}", localVarApiClient.escapeString(invoiceId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "default" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invoicesInvoiceIdGetValidateBeforeCall(String authorization, String invoiceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling invoicesInvoiceIdGet(Async)");
        }
        
        // verify the required parameter 'invoiceId' is set
        if (invoiceId == null) {
            throw new ApiException("Missing the required parameter 'invoiceId' when calling invoicesInvoiceIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = invoicesInvoiceIdGetCall(authorization, invoiceId, _callback);
        return localVarCall;

    }

    /**
     * Get Invoice By ID
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param invoiceId Invoice ID (required)
     * @return InvoicesInvoiceIdGet201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public InvoicesInvoiceIdGet201Response invoicesInvoiceIdGet(String authorization, String invoiceId) throws ApiException {
        ApiResponse<InvoicesInvoiceIdGet201Response> localVarResp = invoicesInvoiceIdGetWithHttpInfo(authorization, invoiceId);
        return localVarResp.getData();
    }

    /**
     * Get Invoice By ID
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param invoiceId Invoice ID (required)
     * @return ApiResponse&lt;InvoicesInvoiceIdGet201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoicesInvoiceIdGet201Response> invoicesInvoiceIdGetWithHttpInfo(String authorization, String invoiceId) throws ApiException {
        okhttp3.Call localVarCall = invoicesInvoiceIdGetValidateBeforeCall(authorization, invoiceId, null);
        try {
            Type localVarReturnType = new TypeToken<InvoicesInvoiceIdGet201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Get Invoice By ID (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param invoiceId Invoice ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoices Returned </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesInvoiceIdGetAsync(String authorization, String invoiceId, final ApiCallback<InvoicesInvoiceIdGet201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = invoicesInvoiceIdGetValidateBeforeCall(authorization, invoiceId, _callback);
        Type localVarReturnType = new TypeToken<InvoicesInvoiceIdGet201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invoicesPost
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject14  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoice Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesPostCall(String authorization, InlineObject14 inlineObject14, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineObject14;

        // create path and map variables
        String localVarPath = "/invoices";

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
    private okhttp3.Call invoicesPostValidateBeforeCall(String authorization, InlineObject14 inlineObject14, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling invoicesPost(Async)");
        }
        

        okhttp3.Call localVarCall = invoicesPostCall(authorization, inlineObject14, _callback);
        return localVarCall;

    }

    /**
     * Create New Invoice
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject14  (optional)
     * @return InvoicesPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoice Created </td><td>  -  </td></tr>
     </table>
     */
    public InvoicesPost201Response invoicesPost(String authorization, InlineObject14 inlineObject14) throws ApiException {
        ApiResponse<InvoicesPost201Response> localVarResp = invoicesPostWithHttpInfo(authorization, inlineObject14);
        return localVarResp.getData();
    }

    /**
     * Create New Invoice
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject14  (optional)
     * @return ApiResponse&lt;InvoicesPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoice Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoicesPost201Response> invoicesPostWithHttpInfo(String authorization, InlineObject14 inlineObject14) throws ApiException {
        okhttp3.Call localVarCall = invoicesPostValidateBeforeCall(authorization, inlineObject14, null);
        try {
            Type localVarReturnType = new TypeToken<InvoicesPost201Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<Map<String, Object>>(){}.getType()));
            e.setErrorObjectType(new GenericType<Map<String, Object>>(){});
            throw e;
        }
    }

    /**
     * Create New Invoice (asynchronously)
     * 
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param inlineObject14  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Invoice Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoicesPostAsync(String authorization, InlineObject14 inlineObject14, final ApiCallback<InvoicesPost201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = invoicesPostValidateBeforeCall(authorization, inlineObject14, _callback);
        Type localVarReturnType = new TypeToken<InvoicesPost201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
