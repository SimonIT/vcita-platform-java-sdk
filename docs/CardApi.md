# CardApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentCardsSyncCardPost**](CardApi.md#paymentCardsSyncCardPost) | **POST** /payment/cards/sync_card | Create sync card


<a name="paymentCardsSyncCardPost"></a>
# **paymentCardsSyncCardPost**
> PaymentCardsSyncCardPost201Response paymentCardsSyncCardPost(authorization, inlineObject17)

Create sync card

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.CardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CardApi apiInstance = new CardApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject17 inlineObject17 = new InlineObject17(); // InlineObject17 | 
    try {
      PaymentCardsSyncCardPost201Response result = apiInstance.paymentCardsSyncCardPost(authorization, inlineObject17);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#paymentCardsSyncCardPost");
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
 **inlineObject17** | [**InlineObject17**](InlineObject17.md)|  | [optional]

### Return type

[**PaymentCardsSyncCardPost201Response**](PaymentCardsSyncCardPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create sync card |  -  |

