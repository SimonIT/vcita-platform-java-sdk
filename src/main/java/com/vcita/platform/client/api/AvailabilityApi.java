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


import com.vcita.platform.client.model.ServicesServiceIdAvailabilityGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AvailabilityApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AvailabilityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AvailabilityApi(ApiClient apiClient) {
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
     * Build call for servicesServiceIdAvailabilityGet
     * @param serviceId Service ID (required)
     * @param startDate Start date YYYY-MM-DD format (required)
     * @param endDate End date YYYY-MM-DD format (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param timeZone Time zone (optional)
     * @param includeDst Include DST - When this parameter set to true the response will calculate availability times including dst offset (optional)
     * @param staffIdsArray Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]&#x3D;ID1&amp;staff_ids_array[]&#x3D;ID2 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call servicesServiceIdAvailabilityGetCall(String serviceId, String startDate, String endDate, String authorization, String timeZone, String includeDst, List<String> staffIdsArray, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/services/{service_id}/availability"
            .replaceAll("\\{" + "service_id" + "\\}", localVarApiClient.escapeString(serviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (timeZone != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_zone", timeZone));
        }

        if (includeDst != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_dst", includeDst));
        }

        if (staffIdsArray != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "staff_ids_array[]", staffIdsArray));
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
    private okhttp3.Call servicesServiceIdAvailabilityGetValidateBeforeCall(String serviceId, String startDate, String endDate, String authorization, String timeZone, String includeDst, List<String> staffIdsArray, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling servicesServiceIdAvailabilityGet(Async)");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling servicesServiceIdAvailabilityGet(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling servicesServiceIdAvailabilityGet(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling servicesServiceIdAvailabilityGet(Async)");
        }
        

        okhttp3.Call localVarCall = servicesServiceIdAvailabilityGetCall(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray, _callback);
        return localVarCall;

    }

    /**
     * Get Service availability By ID [Alpha]
     * Get Service availability By ID [Alpha]
     * @param serviceId Service ID (required)
     * @param startDate Start date YYYY-MM-DD format (required)
     * @param endDate End date YYYY-MM-DD format (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param timeZone Time zone (optional)
     * @param includeDst Include DST - When this parameter set to true the response will calculate availability times including dst offset (optional)
     * @param staffIdsArray Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]&#x3D;ID1&amp;staff_ids_array[]&#x3D;ID2 (optional)
     * @return ServicesServiceIdAvailabilityGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ServicesServiceIdAvailabilityGet200Response servicesServiceIdAvailabilityGet(String serviceId, String startDate, String endDate, String authorization, String timeZone, String includeDst, List<String> staffIdsArray) throws ApiException {
        ApiResponse<ServicesServiceIdAvailabilityGet200Response> localVarResp = servicesServiceIdAvailabilityGetWithHttpInfo(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray);
        return localVarResp.getData();
    }

    /**
     * Get Service availability By ID [Alpha]
     * Get Service availability By ID [Alpha]
     * @param serviceId Service ID (required)
     * @param startDate Start date YYYY-MM-DD format (required)
     * @param endDate End date YYYY-MM-DD format (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param timeZone Time zone (optional)
     * @param includeDst Include DST - When this parameter set to true the response will calculate availability times including dst offset (optional)
     * @param staffIdsArray Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]&#x3D;ID1&amp;staff_ids_array[]&#x3D;ID2 (optional)
     * @return ApiResponse&lt;ServicesServiceIdAvailabilityGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ServicesServiceIdAvailabilityGet200Response> servicesServiceIdAvailabilityGetWithHttpInfo(String serviceId, String startDate, String endDate, String authorization, String timeZone, String includeDst, List<String> staffIdsArray) throws ApiException {
        okhttp3.Call localVarCall = servicesServiceIdAvailabilityGetValidateBeforeCall(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray, null);
        try {
            Type localVarReturnType = new TypeToken<ServicesServiceIdAvailabilityGet200Response>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ServicesServiceIdAvailabilityGet200Response>(){}.getType()));
            e.setErrorObjectType(new GenericType<ServicesServiceIdAvailabilityGet200Response>(){});
            throw e;
        }
    }

    /**
     * Get Service availability By ID [Alpha] (asynchronously)
     * Get Service availability By ID [Alpha]
     * @param serviceId Service ID (required)
     * @param startDate Start date YYYY-MM-DD format (required)
     * @param endDate End date YYYY-MM-DD format (required)
     * @param authorization API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; (required)
     * @param timeZone Time zone (optional)
     * @param includeDst Include DST - When this parameter set to true the response will calculate availability times including dst offset (optional)
     * @param staffIdsArray Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]&#x3D;ID1&amp;staff_ids_array[]&#x3D;ID2 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call servicesServiceIdAvailabilityGetAsync(String serviceId, String startDate, String endDate, String authorization, String timeZone, String includeDst, List<String> staffIdsArray, final ApiCallback<ServicesServiceIdAvailabilityGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = servicesServiceIdAvailabilityGetValidateBeforeCall(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray, _callback);
        Type localVarReturnType = new TypeToken<ServicesServiceIdAvailabilityGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
