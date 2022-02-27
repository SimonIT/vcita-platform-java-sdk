# EstimatesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsClientIdEstimatesGet**](EstimatesApi.md#clientsClientIdEstimatesGet) | **GET** /clients/{client_id}/estimates | Get Estimates Of Client
[**estimatesGet**](EstimatesApi.md#estimatesGet) | **GET** /estimates | Get Estimates List
[**estimatesPost**](EstimatesApi.md#estimatesPost) | **POST** /estimates | Create New Estimate


<a name="clientsClientIdEstimatesGet"></a>
# **clientsClientIdEstimatesGet**
> ClientsClientIdEstimatesGet200Response clientsClientIdEstimatesGet(clientId, authorization, filter, sort)

Get Estimates Of Client

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EstimatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EstimatesApi apiInstance = new EstimatesApi(defaultClient);
    String clientId = "clientId_example"; // String | client's id
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String filter = "filter_example"; // String | Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]=2019-01-01, filter[state][in]=issued,rejected
    String sort = "sort_example"; // String | Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort=created_at:asc,updated_at:desc
    try {
      ClientsClientIdEstimatesGet200Response result = apiInstance.clientsClientIdEstimatesGet(clientId, authorization, filter, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EstimatesApi#clientsClientIdEstimatesGet");
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
 **clientId** | **String**| client&#39;s id |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **filter** | **String**| Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected | [optional]
 **sort** | **String**| Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc | [optional]

### Return type

[**ClientsClientIdEstimatesGet200Response**](ClientsClientIdEstimatesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimates Returned |  -  |

<a name="estimatesGet"></a>
# **estimatesGet**
> EstimatesGet200Response estimatesGet(authorization, filter, sort, page, perPage)

Get Estimates List

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EstimatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EstimatesApi apiInstance = new EstimatesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String filter = "filter_example"; // String | Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]=2019-01-01, filter[state][in]=issued,rejected
    String sort = "sort_example"; // String | Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort=created_at:asc,updated_at:desc
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size (default: 25)
    try {
      EstimatesGet200Response result = apiInstance.estimatesGet(authorization, filter, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EstimatesApi#estimatesGet");
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
 **filter** | **String**| Filter by created_at, updated_at, state. state values: issued, approved, draft, invoiced, rejected. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,rejected | [optional]
 **sort** | **String**| Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc | [optional]
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size (default: 25) | [optional]

### Return type

[**EstimatesGet200Response**](EstimatesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimates Returned |  -  |

<a name="estimatesPost"></a>
# **estimatesPost**
> EstimatesPost201Response estimatesPost(authorization, inlineObject10)

Create New Estimate

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.EstimatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    EstimatesApi apiInstance = new EstimatesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject10 inlineObject10 = new InlineObject10(); // InlineObject10 | 
    try {
      EstimatesPost201Response result = apiInstance.estimatesPost(authorization, inlineObject10);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EstimatesApi#estimatesPost");
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**EstimatesPost201Response**](EstimatesPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Estimate Created |  -  |

