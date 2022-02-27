# EventAttendanceApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEventAttendancesGet**](EventAttendanceApi.md#globalEventAttendancesGet) | **GET** /global/event_attendances | Gets a list of event attendances


<a name="globalEventAttendancesGet"></a>
# **globalEventAttendancesGet**
> GlobalEventAttendancesGet200Response globalEventAttendancesGet(date, authorization, page)

Gets a list of event attendances

Gets a list of event attendances

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EventAttendanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EventAttendanceApi apiInstance = new EventAttendanceApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalEventAttendancesGet200Response result = apiInstance.globalEventAttendancesGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventAttendanceApi#globalEventAttendancesGet");
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
 **date** | **String**| Date timestamp to start iteration. Default interval: 1 hour |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **page** | **Integer**| Page number of results. Default: 1 | [optional]

### Return type

[**GlobalEventAttendancesGet200Response**](GlobalEventAttendancesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

