# LeadGenApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadgenPost**](LeadGenApi.md#leadgenPost) | **POST** /leadgen | Creates a lead


<a name="leadgenPost"></a>
# **leadgenPost**
> LeadgenPost201Response leadgenPost(authorization, xOnBehalfOf, inlineObject15)

Creates a lead

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.LeadGenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    LeadGenApi apiInstance = new LeadGenApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String xOnBehalfOf = "xOnBehalfOf_example"; // String | A unique identifer of the business. Can be the Business UID or nickname\\external ID
    InlineObject15 inlineObject15 = new InlineObject15(); // InlineObject15 | 
    try {
      LeadgenPost201Response result = apiInstance.leadgenPost(authorization, xOnBehalfOf, inlineObject15);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LeadGenApi#leadgenPost");
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
 **xOnBehalfOf** | **String**| A unique identifer of the business. Can be the Business UID or nickname\\external ID | [optional]
 **inlineObject15** | [**InlineObject15**](InlineObject15.md)|  | [optional]

### Return type

[**LeadgenPost201Response**](LeadgenPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |

