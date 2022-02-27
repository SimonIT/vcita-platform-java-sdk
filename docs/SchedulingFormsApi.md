# SchedulingFormsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulingSchedulingFormsGetFormGet**](SchedulingFormsApi.md#schedulingSchedulingFormsGetFormGet) | **GET** /scheduling/scheduling_forms/get_form | 


<a name="schedulingSchedulingFormsGetFormGet"></a>
# **schedulingSchedulingFormsGetFormGet**
> SchedulingSchedulingFormsGetFormGet200Response schedulingSchedulingFormsGetFormGet(businessId, serviceId, sourceName)



### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.SchedulingFormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");

    SchedulingFormsApi apiInstance = new SchedulingFormsApi(defaultClient);
    String businessId = "businessId_example"; // String | 
    String serviceId = "serviceId_example"; // String | 
    String sourceName = "sourceName_example"; // String | 
    try {
      SchedulingSchedulingFormsGetFormGet200Response result = apiInstance.schedulingSchedulingFormsGetFormGet(businessId, serviceId, sourceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulingFormsApi#schedulingSchedulingFormsGetFormGet");
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
 **businessId** | **String**|  |
 **serviceId** | **String**|  | [optional]
 **sourceName** | **String**|  | [optional]

### Return type

[**SchedulingSchedulingFormsGetFormGet200Response**](SchedulingSchedulingFormsGetFormGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Scheduling form |  -  |

