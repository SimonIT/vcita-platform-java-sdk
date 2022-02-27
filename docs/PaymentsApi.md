# PaymentsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsClientIdPaymentsGet**](PaymentsApi.md#clientsClientIdPaymentsGet) | **GET** /clients/{client_id}/payments | Get Payments of Client
[**globalPaymentsGet**](PaymentsApi.md#globalPaymentsGet) | **GET** /global/payments | Gets a list of payments
[**paymentsGet**](PaymentsApi.md#paymentsGet) | **GET** /payments | Get Payments List
[**paymentsPaymentUidMatchPost**](PaymentsApi.md#paymentsPaymentUidMatchPost) | **POST** /payments/{payment_uid}/match | Match Payment
[**paymentsPost**](PaymentsApi.md#paymentsPost) | **POST** /payments | Create New Payment


<a name="clientsClientIdPaymentsGet"></a>
# **clientsClientIdPaymentsGet**
> ClientsClientIdPaymentsGet201Response clientsClientIdPaymentsGet(authorization, clientId, page, perPage)

Get Payments of Client

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String clientId = "clientId_example"; // String | client's id
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size
    try {
      ClientsClientIdPaymentsGet201Response result = apiInstance.clientsClientIdPaymentsGet(authorization, clientId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#clientsClientIdPaymentsGet");
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
 **clientId** | **String**| client&#39;s id |
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size | [optional]

### Return type

[**ClientsClientIdPaymentsGet201Response**](ClientsClientIdPaymentsGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Payments Returned |  -  |

<a name="globalPaymentsGet"></a>
# **globalPaymentsGet**
> GlobalPaymentsGet200Response globalPaymentsGet(date, authorization, page)

Gets a list of payments

Gets a list of payments

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalPaymentsGet200Response result = apiInstance.globalPaymentsGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#globalPaymentsGet");
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

[**GlobalPaymentsGet200Response**](GlobalPaymentsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="paymentsGet"></a>
# **paymentsGet**
> PaymentsGet201Response paymentsGet(authorization, page, perPage, invoiceId)

Get Payments List

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size
    String invoiceId = "invoiceId_example"; // String | Filter all payments paid for specific invoice 
    try {
      PaymentsGet201Response result = apiInstance.paymentsGet(authorization, page, perPage, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#paymentsGet");
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
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size | [optional]
 **invoiceId** | **String**| Filter all payments paid for specific invoice  | [optional]

### Return type

[**PaymentsGet201Response**](PaymentsGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Payments Returned |  -  |

<a name="paymentsPaymentUidMatchPost"></a>
# **paymentsPaymentUidMatchPost**
> PaymentsPaymentUidMatchPost201Response paymentsPaymentUidMatchPost(authorization, paymentUid, inlineObject24)

Match Payment

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String paymentUid = "paymentUid_example"; // String | relevant payment UID
    InlineObject24 inlineObject24 = new InlineObject24(); // InlineObject24 | 
    try {
      PaymentsPaymentUidMatchPost201Response result = apiInstance.paymentsPaymentUidMatchPost(authorization, paymentUid, inlineObject24);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#paymentsPaymentUidMatchPost");
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
 **paymentUid** | **String**| relevant payment UID |
 **inlineObject24** | [**InlineObject24**](InlineObject24.md)|  | [optional]

### Return type

[**PaymentsPaymentUidMatchPost201Response**](PaymentsPaymentUidMatchPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Payment Matched |  -  |

<a name="paymentsPost"></a>
# **paymentsPost**
> PaymentsPost201Response paymentsPost(authorization, inlineObject23)

Create New Payment

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject23 inlineObject23 = new InlineObject23(); // InlineObject23 | 
    try {
      PaymentsPost201Response result = apiInstance.paymentsPost(authorization, inlineObject23);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#paymentsPost");
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
 **inlineObject23** | [**InlineObject23**](InlineObject23.md)|  | [optional]

### Return type

[**PaymentsPost201Response**](PaymentsPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Payment Created |  -  |

