# ClientPackagesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsClientIdPaymentClientPackagesGet**](ClientPackagesApi.md#clientsClientIdPaymentClientPackagesGet) | **GET** /clients/{client_id}/payment/client_packages | Get Client Packages List Of Client [Alpha]
[**clientsPaymentClientPackagesUpdateUsagePost**](ClientPackagesApi.md#clientsPaymentClientPackagesUpdateUsagePost) | **POST** /clients/payment/client_packages/update_usage | Use Client Package Credit [Alpha]
[**clientsPaymentClientPackagesValidateGet**](ClientPackagesApi.md#clientsPaymentClientPackagesValidateGet) | **GET** /clients/payment/client_packages/validate | Validate Client Package has redemption [Alpha]
[**paymentClientPackagesPost**](ClientPackagesApi.md#paymentClientPackagesPost) | **POST** /payment/client_packages | Add package to client [Alpha]
[**paymentClientPackagesUpdateUsagePost**](ClientPackagesApi.md#paymentClientPackagesUpdateUsagePost) | **POST** /payment/client_packages/update_usage | Use Client Package Credit [Alpha]


<a name="clientsClientIdPaymentClientPackagesGet"></a>
# **clientsClientIdPaymentClientPackagesGet**
> ClientsClientIdPaymentClientPackagesGet200Response clientsClientIdPaymentClientPackagesGet(clientId, authorization, page, perPage)

Get Client Packages List Of Client [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientPackagesApi apiInstance = new ClientPackagesApi(defaultClient);
    String clientId = "clientId_example"; // String | Client ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size (default: 25)
    try {
      ClientsClientIdPaymentClientPackagesGet200Response result = apiInstance.clientsClientIdPaymentClientPackagesGet(clientId, authorization, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientPackagesApi#clientsClientIdPaymentClientPackagesGet");
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
 **clientId** | **String**| Client ID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size (default: 25) | [optional]

### Return type

[**ClientsClientIdPaymentClientPackagesGet200Response**](ClientsClientIdPaymentClientPackagesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Client Packages Returned |  -  |
**422** | Failure |  -  |

<a name="clientsPaymentClientPackagesUpdateUsagePost"></a>
# **clientsPaymentClientPackagesUpdateUsagePost**
> ClientsPaymentClientPackagesUpdateUsagePost200Response clientsPaymentClientPackagesUpdateUsagePost(authorization, body2)

Use Client Package Credit [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientPackagesApi apiInstance = new ClientPackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Body2 body2 = new Body2(); // Body2 | 
    try {
      ClientsPaymentClientPackagesUpdateUsagePost200Response result = apiInstance.clientsPaymentClientPackagesUpdateUsagePost(authorization, body2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientPackagesApi#clientsPaymentClientPackagesUpdateUsagePost");
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
 **body2** | [**Body2**](Body2.md)|  | [optional]

### Return type

[**ClientsPaymentClientPackagesUpdateUsagePost200Response**](ClientsPaymentClientPackagesUpdateUsagePost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Package updated by client |  -  |
**422** | Failure |  -  |

<a name="clientsPaymentClientPackagesValidateGet"></a>
# **clientsPaymentClientPackagesValidateGet**
> ClientsPaymentClientPackagesValidateGet200Response clientsPaymentClientPackagesValidateGet(authorization, paymentStatusId)

Validate Client Package has redemption [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientPackagesApi apiInstance = new ClientPackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String paymentStatusId = "paymentStatusId_example"; // String | Payment status ID
    try {
      ClientsPaymentClientPackagesValidateGet200Response result = apiInstance.clientsPaymentClientPackagesValidateGet(authorization, paymentStatusId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientPackagesApi#clientsPaymentClientPackagesValidateGet");
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
 **paymentStatusId** | **String**| Payment status ID |

### Return type

[**ClientsPaymentClientPackagesValidateGet200Response**](ClientsPaymentClientPackagesValidateGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Validation Occurred |  -  |
**422** | Failure |  -  |

<a name="paymentClientPackagesPost"></a>
# **paymentClientPackagesPost**
> PaymentClientPackagesPost201Response paymentClientPackagesPost(authorization, inlineObject19)

Add package to client [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientPackagesApi apiInstance = new ClientPackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject19 inlineObject19 = new InlineObject19(); // InlineObject19 | 
    try {
      PaymentClientPackagesPost201Response result = apiInstance.paymentClientPackagesPost(authorization, inlineObject19);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientPackagesApi#paymentClientPackagesPost");
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
 **inlineObject19** | [**InlineObject19**](InlineObject19.md)|  | [optional]

### Return type

[**PaymentClientPackagesPost201Response**](PaymentClientPackagesPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Package added to the client |  -  |
**422** | Failure |  -  |

<a name="paymentClientPackagesUpdateUsagePost"></a>
# **paymentClientPackagesUpdateUsagePost**
> PaymentClientPackagesUpdateUsagePost200Response paymentClientPackagesUpdateUsagePost(authorization, body2)

Use Client Package Credit [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientPackagesApi apiInstance = new ClientPackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Body2 body2 = new Body2(); // Body2 | 
    try {
      PaymentClientPackagesUpdateUsagePost200Response result = apiInstance.paymentClientPackagesUpdateUsagePost(authorization, body2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientPackagesApi#paymentClientPackagesUpdateUsagePost");
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
 **body2** | [**Body2**](Body2.md)|  | [optional]

### Return type

[**PaymentClientPackagesUpdateUsagePost200Response**](PaymentClientPackagesUpdateUsagePost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Client package credit updated |  -  |
**422** | Failure |  -  |

