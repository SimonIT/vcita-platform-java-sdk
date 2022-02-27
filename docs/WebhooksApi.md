# WebhooksApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookSubscribePost**](WebhooksApi.md#webhookSubscribePost) | **POST** /webhook/subscribe | Subscribe To Webhook
[**webhookUnsubscribePost**](WebhooksApi.md#webhookUnsubscribePost) | **POST** /webhook/unsubscribe | Unsubscribe from Webhook
[**webhooksGet**](WebhooksApi.md#webhooksGet) | **GET** /webhooks | Get Webhooks List


<a name="webhookSubscribePost"></a>
# **webhookSubscribePost**
> webhookSubscribePost(authorization, inlineObject32)

Subscribe To Webhook

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject32 inlineObject32 = new InlineObject32(); // InlineObject32 | 
    try {
      apiInstance.webhookSubscribePost(authorization, inlineObject32);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookSubscribePost");
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
 **inlineObject32** | [**InlineObject32**](InlineObject32.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Subscribed |  -  |

<a name="webhookUnsubscribePost"></a>
# **webhookUnsubscribePost**
> webhookUnsubscribePost(authorization, inlineObject33)

Unsubscribe from Webhook

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject33 inlineObject33 = new InlineObject33(); // InlineObject33 | 
    try {
      apiInstance.webhookUnsubscribePost(authorization, inlineObject33);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookUnsubscribePost");
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
 **inlineObject33** | [**InlineObject33**](InlineObject33.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Unsubscribed |  -  |

<a name="webhooksGet"></a>
# **webhooksGet**
> InlineResponse200 webhooksGet(authorization, filter)

Get Webhooks List

Get appointment

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String filter = "filter_example"; // String | Filtering the list of webhooks. Filter is a 'deepObject' works with:   1. 'entity' - object which listen to event (example: client)   2. 'event_type' - type of event to triger hoom (example: created)  Example:   <url>?filter[entity]=client&filter[event_type]=created 
    try {
      InlineResponse200 result = apiInstance.webhooksGet(authorization, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksGet");
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
 **filter** | **String**| Filtering the list of webhooks. Filter is a &#39;deepObject&#39; works with:   1. &#39;entity&#39; - object which listen to event (example: client)   2. &#39;event_type&#39; - type of event to triger hoom (example: created)  Example:   &lt;url&gt;?filter[entity]&#x3D;client&amp;filter[event_type]&#x3D;created  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List webhooks |  -  |

