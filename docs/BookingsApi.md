# BookingsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulingBookingsBookingUidUpdateRsvpStatePut**](BookingsApi.md#schedulingBookingsBookingUidUpdateRsvpStatePut) | **PUT** /scheduling/bookings/{booking_uid}/update_rsvp_state | Update RSVP state
[**schedulingBookingsCancelPost**](BookingsApi.md#schedulingBookingsCancelPost) | **POST** /scheduling/bookings/cancel | Cancel a Booking [Alpha]
[**schedulingBookingsGet**](BookingsApi.md#schedulingBookingsGet) | **GET** /scheduling/bookings | Get Bookings [Alpha] 
[**schedulingBookingsPost**](BookingsApi.md#schedulingBookingsPost) | **POST** /scheduling/bookings | Create New Booking [Alpha]
[**schedulingWaitlistCancelPut**](BookingsApi.md#schedulingWaitlistCancelPut) | **PUT** /scheduling/waitlist/cancel | Cancel a Waitlist registration
[**schedulingWaitlistPost**](BookingsApi.md#schedulingWaitlistPost) | **POST** /scheduling/waitlist | Create event Waitlist


<a name="schedulingBookingsBookingUidUpdateRsvpStatePut"></a>
# **schedulingBookingsBookingUidUpdateRsvpStatePut**
> SchedulingBookingsBookingUidUpdateRsvpStatePut200Response schedulingBookingsBookingUidUpdateRsvpStatePut(bookingUid, newRsvpState, authorization, inlineObject27)

Update RSVP state

Update RSVP state

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String bookingUid = "bookingUid_example"; // String | Booking UID
    String newRsvpState = "newRsvpState_example"; // String | New RSVP State. 'confirmed' is the only valid option. any other state is forbidden (return 403)
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject27 inlineObject27 = new InlineObject27(); // InlineObject27 | 
    try {
      SchedulingBookingsBookingUidUpdateRsvpStatePut200Response result = apiInstance.schedulingBookingsBookingUidUpdateRsvpStatePut(bookingUid, newRsvpState, authorization, inlineObject27);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingBookingsBookingUidUpdateRsvpStatePut");
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
 **bookingUid** | **String**| Booking UID |
 **newRsvpState** | **String**| New RSVP State. &#39;confirmed&#39; is the only valid option. any other state is forbidden (return 403) |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **inlineObject27** | [**InlineObject27**](InlineObject27.md)|  | [optional]

### Return type

[**SchedulingBookingsBookingUidUpdateRsvpStatePut200Response**](SchedulingBookingsBookingUidUpdateRsvpStatePut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingBookingsCancelPost"></a>
# **schedulingBookingsCancelPost**
> Booking schedulingBookingsCancelPost(authorization, inlineObject26)

Cancel a Booking [Alpha]

cancel booking

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject26 inlineObject26 = new InlineObject26(); // InlineObject26 | 
    try {
      Booking result = apiInstance.schedulingBookingsCancelPost(authorization, inlineObject26);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingBookingsCancelPost");
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
 **inlineObject26** | [**InlineObject26**](InlineObject26.md)|  | [optional]

### Return type

[**Booking**](Booking.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingBookingsGet"></a>
# **schedulingBookingsGet**
> List&lt;Booking&gt; schedulingBookingsGet(perPage, offset, businessId, authorization, matterUid, passed, startTime, endTime)

Get Bookings [Alpha] 

Get bookings of client

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String perPage = "perPage_example"; // String | Maximum number of records which are returned for the request
    String offset = "offset_example"; // String | First record's index in the returned list (e.g. per_page = 10, offset = 1, reords 11 to 20 are returned)
    String businessId = "businessId_example"; // String | Business UID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String matterUid = "matterUid_example"; // String | Matter UID
    String passed = "passed_example"; // String | If equals to true, returns records from the past only. Otherwise, returns future bookings as well.
    String startTime = "startTime_example"; // String | Relevant to recurring appointment/event, returns appointment/event attendance which their start_time is bigger than this parameter
    String endTime = "endTime_example"; // String | Relevant to recurring appointment/event, returns appointment/event attendance which their start_time is smaller than this parameter
    try {
      List<Booking> result = apiInstance.schedulingBookingsGet(perPage, offset, businessId, authorization, matterUid, passed, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingBookingsGet");
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
 **perPage** | **String**| Maximum number of records which are returned for the request |
 **offset** | **String**| First record&#39;s index in the returned list (e.g. per_page &#x3D; 10, offset &#x3D; 1, reords 11 to 20 are returned) |
 **businessId** | **String**| Business UID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **matterUid** | **String**| Matter UID | [optional]
 **passed** | **String**| If equals to true, returns records from the past only. Otherwise, returns future bookings as well. | [optional]
 **startTime** | **String**| Relevant to recurring appointment/event, returns appointment/event attendance which their start_time is bigger than this parameter | [optional]
 **endTime** | **String**| Relevant to recurring appointment/event, returns appointment/event attendance which their start_time is smaller than this parameter | [optional]

### Return type

[**List&lt;Booking&gt;**](Booking.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingBookingsPost"></a>
# **schedulingBookingsPost**
> SchedulingBookingsPost201Response schedulingBookingsPost(authorization, inlineObject25)

Create New Booking [Alpha]

Create Booking

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject25 inlineObject25 = new InlineObject25(); // InlineObject25 | 
    try {
      SchedulingBookingsPost201Response result = apiInstance.schedulingBookingsPost(authorization, inlineObject25);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingBookingsPost");
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
 **inlineObject25** | [**InlineObject25**](InlineObject25.md)|  | [optional]

### Return type

[**SchedulingBookingsPost201Response**](SchedulingBookingsPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**422** | Failure |  -  |

<a name="schedulingWaitlistCancelPut"></a>
# **schedulingWaitlistCancelPut**
> SchedulingWaitlistCancelPut200Response schedulingWaitlistCancelPut(authorization, inlineObject29)

Cancel a Waitlist registration

Cancel a Waitlist registration

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject29 inlineObject29 = new InlineObject29(); // InlineObject29 | 
    try {
      SchedulingWaitlistCancelPut200Response result = apiInstance.schedulingWaitlistCancelPut(authorization, inlineObject29);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingWaitlistCancelPut");
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
 **inlineObject29** | [**InlineObject29**](InlineObject29.md)|  | [optional]

### Return type

[**SchedulingWaitlistCancelPut200Response**](SchedulingWaitlistCancelPut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="schedulingWaitlistPost"></a>
# **schedulingWaitlistPost**
> SchedulingWaitlistPost201Response schedulingWaitlistPost(authorization, inlineObject28)

Create event Waitlist

Create event Waitlist

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject28 inlineObject28 = new InlineObject28(); // InlineObject28 | 
    try {
      SchedulingWaitlistPost201Response result = apiInstance.schedulingWaitlistPost(authorization, inlineObject28);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#schedulingWaitlistPost");
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
 **inlineObject28** | [**InlineObject28**](InlineObject28.md)|  | [optional]

### Return type

[**SchedulingWaitlistPost201Response**](SchedulingWaitlistPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**422** | Failure |  -  |

