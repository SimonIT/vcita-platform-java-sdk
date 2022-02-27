# AppointmentsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalAppointmentsGet**](AppointmentsApi.md#globalAppointmentsGet) | **GET** /global/appointments | Get appointments list
[**schedulingAppointmentsAppointmentIdGet**](AppointmentsApi.md#schedulingAppointmentsAppointmentIdGet) | **GET** /scheduling/appointments/{appointment_id} | Get Appointment
[**schedulingAppointmentsGet**](AppointmentsApi.md#schedulingAppointmentsGet) | **GET** /scheduling/appointments | Get Appointments List


<a name="globalAppointmentsGet"></a>
# **globalAppointmentsGet**
> GlobalAppointmentsGet200Response globalAppointmentsGet(date, authorization, page)

Get appointments list

Get appointments list

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.AppointmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    AppointmentsApi apiInstance = new AppointmentsApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalAppointmentsGet200Response result = apiInstance.globalAppointmentsGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentsApi#globalAppointmentsGet");
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

[**GlobalAppointmentsGet200Response**](GlobalAppointmentsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingAppointmentsAppointmentIdGet"></a>
# **schedulingAppointmentsAppointmentIdGet**
> SchedulingAppointmentsAppointmentIdGet200Response schedulingAppointmentsAppointmentIdGet(appointmentId, authorization)

Get Appointment

Get appointment

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.AppointmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    AppointmentsApi apiInstance = new AppointmentsApi(defaultClient);
    String appointmentId = "appointmentId_example"; // String | Appointment id
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      SchedulingAppointmentsAppointmentIdGet200Response result = apiInstance.schedulingAppointmentsAppointmentIdGet(appointmentId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentsApi#schedulingAppointmentsAppointmentIdGet");
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
 **appointmentId** | **String**| Appointment id |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**SchedulingAppointmentsAppointmentIdGet200Response**](SchedulingAppointmentsAppointmentIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingAppointmentsGet"></a>
# **schedulingAppointmentsGet**
> SchedulingAppointmentsGet200Response schedulingAppointmentsGet(authorization, businessId, clientId, state, sort, page, perPage)

Get Appointments List

Get appointments list

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.AppointmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    AppointmentsApi apiInstance = new AppointmentsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID (optional)
    String clientId = "clientId_example"; // String | Client ID Filter
    String state = "state_example"; // String | State Filter - rejected/scheduled/done/cancelled/pending_reschedule/reschedule e.g state=done,rejected
    String sort = "sort_example"; // String | Multiple order by option - updated:DESC,start_at:ASC,created:DESC
    Integer page = 56; // Integer | Page number of results. Default: 1
    Integer perPage = 56; // Integer | How many items to return per page. Default: 25. Max: 100
    try {
      SchedulingAppointmentsGet200Response result = apiInstance.schedulingAppointmentsGet(authorization, businessId, clientId, state, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentsApi#schedulingAppointmentsGet");
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
 **businessId** | **String**| Business ID (optional) | [optional]
 **clientId** | **String**| Client ID Filter | [optional]
 **state** | **String**| State Filter - rejected/scheduled/done/cancelled/pending_reschedule/reschedule e.g state&#x3D;done,rejected | [optional]
 **sort** | **String**| Multiple order by option - updated:DESC,start_at:ASC,created:DESC | [optional]
 **page** | **Integer**| Page number of results. Default: 1 | [optional]
 **perPage** | **Integer**| How many items to return per page. Default: 25. Max: 100 | [optional]

### Return type

[**SchedulingAppointmentsGet200Response**](SchedulingAppointmentsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

