# EventInstanceApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEventInstancesGet**](EventInstanceApi.md#globalEventInstancesGet) | **GET** /global/event_instances | Gets a list of event instances
[**schedulingEventInstanceEventInstanceIdGet**](EventInstanceApi.md#schedulingEventInstanceEventInstanceIdGet) | **GET** /scheduling/event_instance/{event_instance_id} | Get Event Instance


<a name="globalEventInstancesGet"></a>
# **globalEventInstancesGet**
> GlobalEventInstancesGet200Response globalEventInstancesGet(date, authorization, page)

Gets a list of event instances

Gets a list of event instances

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EventInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EventInstanceApi apiInstance = new EventInstanceApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalEventInstancesGet200Response result = apiInstance.globalEventInstancesGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventInstanceApi#globalEventInstancesGet");
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

[**GlobalEventInstancesGet200Response**](GlobalEventInstancesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingEventInstanceEventInstanceIdGet"></a>
# **schedulingEventInstanceEventInstanceIdGet**
> SchedulingEventInstanceEventInstanceIdGet200Response schedulingEventInstanceEventInstanceIdGet(authorization, eventInstanceId)

Get Event Instance

Get Event Instance Details.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EventInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EventInstanceApi apiInstance = new EventInstanceApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String eventInstanceId = "eventInstanceId_example"; // String | The id of the event instance
    try {
      SchedulingEventInstanceEventInstanceIdGet200Response result = apiInstance.schedulingEventInstanceEventInstanceIdGet(authorization, eventInstanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventInstanceApi#schedulingEventInstanceEventInstanceIdGet");
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
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **eventInstanceId** | **String**| The id of the event instance |

### Return type

[**SchedulingEventInstanceEventInstanceIdGet200Response**](SchedulingEventInstanceEventInstanceIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

