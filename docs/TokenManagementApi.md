# TokenManagementApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokensGet**](TokenManagementApi.md#tokensGet) | **GET** /tokens | Get tokens
[**tokensPost**](TokenManagementApi.md#tokensPost) | **POST** /tokens | Creates a token
[**tokensRevokePost**](TokenManagementApi.md#tokensRevokePost) | **POST** /tokens/revoke | Revokes a token


<a name="tokensGet"></a>
# **tokensGet**
> TokensGet201Response tokensGet(authorization, appId, userId)

Get tokens

Gets a list of tokens.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.TokenManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    TokenManagementApi apiInstance = new TokenManagementApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String appId = "appId_example"; // String | Application ID
    String userId = "userId_example"; // String | User ID
    try {
      TokensGet201Response result = apiInstance.tokensGet(authorization, appId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenManagementApi#tokensGet");
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
 **appId** | **String**| Application ID | [optional]
 **userId** | **String**| User ID | [optional]

### Return type

[**TokensGet201Response**](TokensGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Tokens Returned |  -  |

<a name="tokensPost"></a>
# **tokensPost**
> TokensPost201Response tokensPost(authorization, inlineObject30)

Creates a token

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.TokenManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    TokenManagementApi apiInstance = new TokenManagementApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject30 inlineObject30 = new InlineObject30(); // InlineObject30 | 
    try {
      TokensPost201Response result = apiInstance.tokensPost(authorization, inlineObject30);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenManagementApi#tokensPost");
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
 **inlineObject30** | [**InlineObject30**](InlineObject30.md)|  | [optional]

### Return type

[**TokensPost201Response**](TokensPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Token Created |  -  |

<a name="tokensRevokePost"></a>
# **tokensRevokePost**
> TokensRevokePost201Response tokensRevokePost(authorization, inlineObject31)

Revokes a token

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.TokenManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    TokenManagementApi apiInstance = new TokenManagementApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject31 inlineObject31 = new InlineObject31(); // InlineObject31 | 
    try {
      TokensRevokePost201Response result = apiInstance.tokensRevokePost(authorization, inlineObject31);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenManagementApi#tokensRevokePost");
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
 **inlineObject31** | [**InlineObject31**](InlineObject31.md)|  | [optional]

### Return type

[**TokensRevokePost201Response**](TokensRevokePost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Token Revoked |  -  |

