# AvailabilityApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**servicesServiceIdAvailabilityGet**](AvailabilityApi.md#servicesServiceIdAvailabilityGet) | **GET** /services/{service_id}/availability | Get Service availability By ID [Alpha]


<a name="servicesServiceIdAvailabilityGet"></a>
# **servicesServiceIdAvailabilityGet**
> ServicesServiceIdAvailabilityGet200Response servicesServiceIdAvailabilityGet(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray)

Get Service availability By ID [Alpha]

Get Service availability By ID [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.AvailabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
    String serviceId = "serviceId_example"; // String | Service ID
    String startDate = "startDate_example"; // String | Start date YYYY-MM-DD format
    String endDate = "endDate_example"; // String | End date YYYY-MM-DD format
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String timeZone = "timeZone_example"; // String | Time zone
    String includeDst = "includeDst_example"; // String | Include DST - When this parameter set to true the response will calculate availability times including dst offset
    List<String> staffIdsArray = Arrays.asList(); // List<String> | Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]=ID1&staff_ids_array[]=ID2
    try {
      ServicesServiceIdAvailabilityGet200Response result = apiInstance.servicesServiceIdAvailabilityGet(serviceId, startDate, endDate, authorization, timeZone, includeDst, staffIdsArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#servicesServiceIdAvailabilityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service ID |
 **startDate** | **String**| Start date YYYY-MM-DD format |
 **endDate** | **String**| End date YYYY-MM-DD format |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **timeZone** | **String**| Time zone | [optional]
 **includeDst** | **String**| Include DST - When this parameter set to true the response will calculate availability times including dst offset | [optional]
 **staffIdsArray** | [**List&lt;String&gt;**](String.md)| Staff ids array[].   In case of more than one id, query in URL will appear as:   staff_ids_array[]&#x3D;ID1&amp;staff_ids_array[]&#x3D;ID2 | [optional]

### Return type

[**ServicesServiceIdAvailabilityGet200Response**](ServicesServiceIdAvailabilityGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

