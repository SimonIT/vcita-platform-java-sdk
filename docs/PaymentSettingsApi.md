# PaymentSettingsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentSettingsGet**](PaymentSettingsApi.md#paymentSettingsGet) | **GET** /payment/settings | Get Current Payment Settings
[**paymentSettingsPost**](PaymentSettingsApi.md#paymentSettingsPost) | **POST** /payment/settings | Update Payment Settings


<a name="paymentSettingsGet"></a>
# **paymentSettingsGet**
> PaymentSettingsGet201Response paymentSettingsGet(authorization)

Get Current Payment Settings

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentSettingsApi apiInstance = new PaymentSettingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      PaymentSettingsGet201Response result = apiInstance.paymentSettingsGet(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSettingsApi#paymentSettingsGet");
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

### Return type

[**PaymentSettingsGet201Response**](PaymentSettingsGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Settings Retrieved |  -  |

<a name="paymentSettingsPost"></a>
# **paymentSettingsPost**
> PaymentSettingsPost201Response paymentSettingsPost(authorization, inlineObject22)

Update Payment Settings

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentSettingsApi apiInstance = new PaymentSettingsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject22 inlineObject22 = new InlineObject22(); // InlineObject22 | 
    try {
      PaymentSettingsPost201Response result = apiInstance.paymentSettingsPost(authorization, inlineObject22);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSettingsApi#paymentSettingsPost");
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
 **inlineObject22** | [**InlineObject22**](InlineObject22.md)|  | [optional]

### Return type

[**PaymentSettingsPost201Response**](PaymentSettingsPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Settings Updated |  -  |

