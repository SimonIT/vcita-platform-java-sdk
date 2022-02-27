# PaymentCheckoutApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentCheckoutPut**](PaymentCheckoutApi.md#paymentCheckoutPut) | **PUT** /payment/checkout/ | Send checkout update by webhook 
[**paymentCheckoutUrlKeyGet**](PaymentCheckoutApi.md#paymentCheckoutUrlKeyGet) | **GET** /payment/checkout/{url_key} | Get Open Checkout For Specific url_key


<a name="paymentCheckoutPut"></a>
# **paymentCheckoutPut**
> PaymentCheckoutPut201Response paymentCheckoutPut(authorization, inlineObject18)

Send checkout update by webhook 

Update a checkout process from webhook

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentCheckoutApi apiInstance = new PaymentCheckoutApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject18 inlineObject18 = new InlineObject18(); // InlineObject18 | 
    try {
      PaymentCheckoutPut201Response result = apiInstance.paymentCheckoutPut(authorization, inlineObject18);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCheckoutApi#paymentCheckoutPut");
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
 **inlineObject18** | [**InlineObject18**](InlineObject18.md)|  | [optional]

### Return type

[**PaymentCheckoutPut201Response**](PaymentCheckoutPut201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Payed by checkout |  -  |

<a name="paymentCheckoutUrlKeyGet"></a>
# **paymentCheckoutUrlKeyGet**
> PaymentCheckoutUrlKeyGet201Response paymentCheckoutUrlKeyGet(authorization, urlKey)

Get Open Checkout For Specific url_key

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentCheckoutApi apiInstance = new PaymentCheckoutApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String urlKey = "urlKey_example"; // String | 
    try {
      PaymentCheckoutUrlKeyGet201Response result = apiInstance.paymentCheckoutUrlKeyGet(authorization, urlKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCheckoutApi#paymentCheckoutUrlKeyGet");
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
 **urlKey** | **String**|  |

### Return type

[**PaymentCheckoutUrlKeyGet201Response**](PaymentCheckoutUrlKeyGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Checkout Info Retrieved |  -  |

