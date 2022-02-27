# CategoriesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesGet**](CategoriesApi.md#categoriesGet) | **GET** /categories | Get Categories [Alpha]


<a name="categoriesGet"></a>
# **categoriesGet**
> CategoriesGet200Response categoriesGet(businessId, onlyVisibleServices, hasFutureInstance, categoriesArray)

Get Categories [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String onlyVisibleServices = "onlyVisibleServices_example"; // String | show only categories with valid services
    String hasFutureInstance = "hasFutureInstance_example"; // String | return only categories that have events with future instances or valid services
    List<String> categoriesArray = Arrays.asList(); // List<String> | Categories ids array
    try {
      CategoriesGet200Response result = apiInstance.categoriesGet(businessId, onlyVisibleServices, hasFutureInstance, categoriesArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#categoriesGet");
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
 **businessId** | **String**| Business ID |
 **onlyVisibleServices** | **String**| show only categories with valid services | [optional]
 **hasFutureInstance** | **String**| return only categories that have events with future instances or valid services | [optional]
 **categoriesArray** | [**List&lt;String&gt;**](String.md)| Categories ids array | [optional]

### Return type

[**CategoriesGet200Response**](CategoriesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Categories Returned |  -  |

