# StaffApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessesBusinessIdStaffsGet**](StaffApi.md#businessesBusinessIdStaffsGet) | **GET** /businesses/{business_id}/staffs | Get Staff Members
[**businessesBusinessIdStaffsPost**](StaffApi.md#businessesBusinessIdStaffsPost) | **POST** /businesses/{business_id}/staffs | Create Staff Member
[**businessesBusinessIdStaffsStaffIdDelete**](StaffApi.md#businessesBusinessIdStaffsStaffIdDelete) | **DELETE** /businesses/{business_id}/staffs/{staff_id} | Delete Staff Member
[**businessesBusinessIdStaffsStaffIdGet**](StaffApi.md#businessesBusinessIdStaffsStaffIdGet) | **GET** /businesses/{business_id}/staffs/{staff_id} | Get Staff Member Details
[**globalStaffsGet**](StaffApi.md#globalStaffsGet) | **GET** /global/staffs | Gets a list of staffs
[**schedulingStaffGet**](StaffApi.md#schedulingStaffGet) | **GET** /scheduling/staff | Get Staff List [Alpha]
[**schedulingStaffStaffIdGet**](StaffApi.md#schedulingStaffStaffIdGet) | **GET** /scheduling/staff/{staff_id} | Get Staff By ID [Alpha]


<a name="businessesBusinessIdStaffsGet"></a>
# **businessesBusinessIdStaffsGet**
> BusinessesBusinessIdStaffsGet200Response businessesBusinessIdStaffsGet(authorization, businessId, status)

Get Staff Members

Get Staff List and Details (ordered by position field).

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    String status = "status_example"; // String | Optional fetch status active/all
    try {
      BusinessesBusinessIdStaffsGet200Response result = apiInstance.businessesBusinessIdStaffsGet(authorization, businessId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#businessesBusinessIdStaffsGet");
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
 **businessId** | **String**| Business ID |
 **status** | **String**| Optional fetch status active/all | [optional]

### Return type

[**BusinessesBusinessIdStaffsGet200Response**](BusinessesBusinessIdStaffsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="businessesBusinessIdStaffsPost"></a>
# **businessesBusinessIdStaffsPost**
> BusinessesBusinessIdStaffsPost200Response businessesBusinessIdStaffsPost(businessId, authorization, inlineObject6)

Create Staff Member

Creates a Staff.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject6 inlineObject6 = new InlineObject6(); // InlineObject6 | 
    try {
      BusinessesBusinessIdStaffsPost200Response result = apiInstance.businessesBusinessIdStaffsPost(businessId, authorization, inlineObject6);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#businessesBusinessIdStaffsPost");
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional]

### Return type

[**BusinessesBusinessIdStaffsPost200Response**](BusinessesBusinessIdStaffsPost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="businessesBusinessIdStaffsStaffIdDelete"></a>
# **businessesBusinessIdStaffsStaffIdDelete**
> BusinessesBusinessIdStaffsStaffIdDelete200Response businessesBusinessIdStaffsStaffIdDelete(authorization, businessId, staffId)

Delete Staff Member

Delete Staff Member.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    String staffId = "staffId_example"; // String | Staff ID
    try {
      BusinessesBusinessIdStaffsStaffIdDelete200Response result = apiInstance.businessesBusinessIdStaffsStaffIdDelete(authorization, businessId, staffId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#businessesBusinessIdStaffsStaffIdDelete");
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
 **businessId** | **String**| Business ID |
 **staffId** | **String**| Staff ID |

### Return type

[**BusinessesBusinessIdStaffsStaffIdDelete200Response**](BusinessesBusinessIdStaffsStaffIdDelete200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="businessesBusinessIdStaffsStaffIdGet"></a>
# **businessesBusinessIdStaffsStaffIdGet**
> BusinessesBusinessIdStaffsStaffIdGet200Response businessesBusinessIdStaffsStaffIdGet(authorization, businessId, staffId)

Get Staff Member Details

Get Staff Details.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    String staffId = "staffId_example"; // String | Staff ID
    try {
      BusinessesBusinessIdStaffsStaffIdGet200Response result = apiInstance.businessesBusinessIdStaffsStaffIdGet(authorization, businessId, staffId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#businessesBusinessIdStaffsStaffIdGet");
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
 **businessId** | **String**| Business ID |
 **staffId** | **String**| Staff ID |

### Return type

[**BusinessesBusinessIdStaffsStaffIdGet200Response**](BusinessesBusinessIdStaffsStaffIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="globalStaffsGet"></a>
# **globalStaffsGet**
> GlobalStaffsGet200Response globalStaffsGet(date, authorization, page)

Gets a list of staffs

Gets a list of staffs

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalStaffsGet200Response result = apiInstance.globalStaffsGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#globalStaffsGet");
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

[**GlobalStaffsGet200Response**](GlobalStaffsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingStaffGet"></a>
# **schedulingStaffGet**
> SchedulingStaffGet200Response schedulingStaffGet(businessId, onlyActiveServices, serviceId, categoryId)

Get Staff List [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String onlyActiveServices = "onlyActiveServices_example"; // String | Filter only active services or all
    String serviceId = "serviceId_example"; // String | Filter by service id
    String categoryId = "categoryId_example"; // String | Filter by category id
    try {
      SchedulingStaffGet200Response result = apiInstance.schedulingStaffGet(businessId, onlyActiveServices, serviceId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#schedulingStaffGet");
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
 **onlyActiveServices** | **String**| Filter only active services or all |
 **serviceId** | **String**| Filter by service id | [optional]
 **categoryId** | **String**| Filter by category id | [optional]

### Return type

[**SchedulingStaffGet200Response**](SchedulingStaffGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Staff Returned |  -  |

<a name="schedulingStaffStaffIdGet"></a>
# **schedulingStaffStaffIdGet**
> SchedulingStaffStaffIdGet200Response schedulingStaffStaffIdGet(staffId, businessId, onlyActiveServices)

Get Staff By ID [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");

    StaffApi apiInstance = new StaffApi(defaultClient);
    String staffId = "staffId_example"; // String | Staff ID
    String businessId = "businessId_example"; // String | Business ID
    String onlyActiveServices = "onlyActiveServices_example"; // String | Filter only active services or all
    try {
      SchedulingStaffStaffIdGet200Response result = apiInstance.schedulingStaffStaffIdGet(staffId, businessId, onlyActiveServices);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#schedulingStaffStaffIdGet");
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
 **staffId** | **String**| Staff ID |
 **businessId** | **String**| Business ID |
 **onlyActiveServices** | **String**| Filter only active services or all |

### Return type

[**SchedulingStaffStaffIdGet200Response**](SchedulingStaffStaffIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Staff Returned |  -  |

