# PackagesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentPackagesGet**](PackagesApi.md#paymentPackagesGet) | **GET** /payment/packages | Get all package of business
[**paymentPackagesPackageIdGet**](PackagesApi.md#paymentPackagesPackageIdGet) | **GET** /payment/packages/{package_id} | Show package info
[**paymentPackagesPackageIdPut**](PackagesApi.md#paymentPackagesPackageIdPut) | **PUT** /payment/packages/{package_id} | Update package [Alpha]
[**paymentPackagesPost**](PackagesApi.md#paymentPackagesPost) | **POST** /payment/packages | Create Package 


<a name="paymentPackagesGet"></a>
# **paymentPackagesGet**
> PaymentPackagesGet200Response paymentPackagesGet(authorization, includeItems)

Get all package of business

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String includeItems = "includeItems_example"; // String | if exists the packages returns with their items
    try {
      PaymentPackagesGet200Response result = apiInstance.paymentPackagesGet(authorization, includeItems);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#paymentPackagesGet");
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
 **includeItems** | **String**| if exists the packages returns with their items | [optional]

### Return type

[**PaymentPackagesGet200Response**](PaymentPackagesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Packages Info Retrieved |  -  |
**422** | Failure |  -  |

<a name="paymentPackagesPackageIdGet"></a>
# **paymentPackagesPackageIdGet**
> PaymentPackagesPackageIdGet200Response paymentPackagesPackageIdGet(authorization, packageId)

Show package info

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String packageId = "packageId_example"; // String | 
    try {
      PaymentPackagesPackageIdGet200Response result = apiInstance.paymentPackagesPackageIdGet(authorization, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#paymentPackagesPackageIdGet");
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
 **packageId** | **String**|  |

### Return type

[**PaymentPackagesPackageIdGet200Response**](PaymentPackagesPackageIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Package Info Retrieved |  -  |
**422** | Failure |  -  |

<a name="paymentPackagesPackageIdPut"></a>
# **paymentPackagesPackageIdPut**
> PaymentPackagesPackageIdPut200Response paymentPackagesPackageIdPut(authorization, packageId, inlineObject21)

Update package [Alpha]

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String packageId = "packageId_example"; // String | 
    InlineObject21 inlineObject21 = new InlineObject21(); // InlineObject21 | 
    try {
      PaymentPackagesPackageIdPut200Response result = apiInstance.paymentPackagesPackageIdPut(authorization, packageId, inlineObject21);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#paymentPackagesPackageIdPut");
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
 **packageId** | **String**|  |
 **inlineObject21** | [**InlineObject21**](InlineObject21.md)|  | [optional]

### Return type

[**PaymentPackagesPackageIdPut200Response**](PaymentPackagesPackageIdPut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Package Updated |  -  |
**422** | Failure |  -  |

<a name="paymentPackagesPost"></a>
# **paymentPackagesPost**
> PaymentPackagesPost201Response paymentPackagesPost(authorization, inlineObject20)

Create Package 

Create a package and its corresponding items

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject20 inlineObject20 = new InlineObject20(); // InlineObject20 | 
    try {
      PaymentPackagesPost201Response result = apiInstance.paymentPackagesPost(authorization, inlineObject20);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#paymentPackagesPost");
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
 **inlineObject20** | [**InlineObject20**](InlineObject20.md)|  | [optional]

### Return type

[**PaymentPackagesPost201Response**](PaymentPackagesPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Package Created |  -  |
**422** | Failure |  -  |

