# ServicesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesCategoryIdServicesGet**](ServicesApi.md#categoriesCategoryIdServicesGet) | **GET** /categories/{category_id}/services | Get Services List by category [Alpha]
[**globalServicesGet**](ServicesApi.md#globalServicesGet) | **GET** /global/services | Gets a list of services
[**servicesGet**](ServicesApi.md#servicesGet) | **GET** /services | Get Services List [Alpha]
[**servicesServiceIdGet**](ServicesApi.md#servicesServiceIdGet) | **GET** /services/{service_id} | Get Service By ID [Alpha]


<a name="categoriesCategoryIdServicesGet"></a>
# **categoriesCategoryIdServicesGet**
> CategoriesCategoryIdServicesGet200Response categoriesCategoryIdServicesGet(categoryId, businessId, authorization, staffArray, hasFutureInstance, page, perPage)

Get Services List by category [Alpha]

Get Services List by category [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Service ID
    String businessId = "businessId_example"; // String | Business ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    List<String> staffArray = Arrays.asList(); // List<String> | Staff uids array
    Boolean hasFutureInstance = true; // Boolean | Return only services that have events with future instances
    Integer page = 56; // Integer | Page number of results. Default: 1
    Integer perPage = 56; // Integer | How many items to return per page. Default: 25. Max: 100
    try {
      CategoriesCategoryIdServicesGet200Response result = apiInstance.categoriesCategoryIdServicesGet(categoryId, businessId, authorization, staffArray, hasFutureInstance, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#categoriesCategoryIdServicesGet");
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
 **categoryId** | **String**| Service ID |
 **businessId** | **String**| Business ID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **staffArray** | [**List&lt;String&gt;**](String.md)| Staff uids array | [optional]
 **hasFutureInstance** | **Boolean**| Return only services that have events with future instances | [optional]
 **page** | **Integer**| Page number of results. Default: 1 | [optional]
 **perPage** | **Integer**| How many items to return per page. Default: 25. Max: 100 | [optional]

### Return type

[**CategoriesCategoryIdServicesGet200Response**](CategoriesCategoryIdServicesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="globalServicesGet"></a>
# **globalServicesGet**
> GlobalServicesGet200Response globalServicesGet(date, authorization, page)

Gets a list of services

Gets a list of services

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalServicesGet200Response result = apiInstance.globalServicesGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#globalServicesGet");
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

[**GlobalServicesGet200Response**](GlobalServicesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="servicesGet"></a>
# **servicesGet**
> ServicesGet200Response servicesGet(businessId, authorization, staffArray, hasFutureInstance, includeHidden, activeStaffOnly, extraDecoratorFields, page, perPage)

Get Services List [Alpha]

Get Services List [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    List<String> staffArray = Arrays.asList(); // List<String> | Staff uids array
    Boolean hasFutureInstance = true; // Boolean | Return only services that have events with future instances
    Boolean includeHidden = true; // Boolean | Including hidden services
    Boolean activeStaffOnly = true; // Boolean | Return only services which at least one of the staff of the service is active
    Boolean extraDecoratorFields = true; // Boolean | Adding the following fields to response: min_hours_before_meeting , future_bookings_limit, remind_before_in_hours_1, remind_before_in_hours_2, meeting_reminder_sms_1, sms_booking_confirmation, meeting_reminder_sms_2, auto_follow_up_hours, default_staff, order, rwg_eligible, padding
    Integer page = 56; // Integer | Page number of results. Default: 1
    Integer perPage = 56; // Integer | How many items to return per page. Default: 25. Max: 100
    try {
      ServicesGet200Response result = apiInstance.servicesGet(businessId, authorization, staffArray, hasFutureInstance, includeHidden, activeStaffOnly, extraDecoratorFields, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#servicesGet");
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
 **businessId** | **String**| Business ID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **staffArray** | [**List&lt;String&gt;**](String.md)| Staff uids array | [optional]
 **hasFutureInstance** | **Boolean**| Return only services that have events with future instances | [optional]
 **includeHidden** | **Boolean**| Including hidden services | [optional]
 **activeStaffOnly** | **Boolean**| Return only services which at least one of the staff of the service is active | [optional]
 **extraDecoratorFields** | **Boolean**| Adding the following fields to response: min_hours_before_meeting , future_bookings_limit, remind_before_in_hours_1, remind_before_in_hours_2, meeting_reminder_sms_1, sms_booking_confirmation, meeting_reminder_sms_2, auto_follow_up_hours, default_staff, order, rwg_eligible, padding | [optional]
 **page** | **Integer**| Page number of results. Default: 1 | [optional]
 **perPage** | **Integer**| How many items to return per page. Default: 25. Max: 100 | [optional]

### Return type

[**ServicesGet200Response**](ServicesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="servicesServiceIdGet"></a>
# **servicesServiceIdGet**
> ServicesServiceIdGet200Response servicesServiceIdGet(serviceId, authorization)

Get Service By ID [Alpha]

Get Service By ID [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String serviceId = "serviceId_example"; // String | Service ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      ServicesServiceIdGet200Response result = apiInstance.servicesServiceIdGet(serviceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#servicesServiceIdGet");
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
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**ServicesServiceIdGet200Response**](ServicesServiceIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

