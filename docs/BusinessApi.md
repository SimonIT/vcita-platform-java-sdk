# BusinessApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessesBusinessIdFeaturesGet**](BusinessApi.md#businessesBusinessIdFeaturesGet) | **GET** /businesses/{business_id}/features | Get Business Features
[**businessesBusinessIdGet**](BusinessApi.md#businessesBusinessIdGet) | **GET** /businesses/{business_id} | Get Business
[**businessesBusinessIdPost**](BusinessApi.md#businessesBusinessIdPost) | **POST** /businesses/{business_id} | Update Business
[**businessesGet**](BusinessApi.md#businessesGet) | **GET** /businesses | Get Business filtered by email or external_id
[**businessesPost**](BusinessApi.md#businessesPost) | **POST** /businesses | Create a Business
[**businessesValidateLoginGet**](BusinessApi.md#businessesValidateLoginGet) | **GET** /businesses/validate_login | Validate Login
[**globalBusinessesGet**](BusinessApi.md#globalBusinessesGet) | **GET** /global/businesses | Gets a list of businesses


<a name="businessesBusinessIdFeaturesGet"></a>
# **businessesBusinessIdFeaturesGet**
> BusinessesBusinessIdFeaturesGet200Response businessesBusinessIdFeaturesGet(authorization, businessId)

Get Business Features

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    try {
      BusinessesBusinessIdFeaturesGet200Response result = apiInstance.businessesBusinessIdFeaturesGet(authorization, businessId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesBusinessIdFeaturesGet");
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
 **businessId** | **String**| Business ID |

### Return type

[**BusinessesBusinessIdFeaturesGet200Response**](BusinessesBusinessIdFeaturesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Features Retrieved |  -  |

<a name="businessesBusinessIdGet"></a>
# **businessesBusinessIdGet**
> BusinessesBusinessIdGet200Response businessesBusinessIdGet(authorization, businessId)

Get Business

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    try {
      BusinessesBusinessIdGet200Response result = apiInstance.businessesBusinessIdGet(authorization, businessId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesBusinessIdGet");
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
 **businessId** | **String**| Business ID |

### Return type

[**BusinessesBusinessIdGet200Response**](BusinessesBusinessIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Business Retrieved |  -  |

<a name="businessesBusinessIdPost"></a>
# **businessesBusinessIdPost**
> BusinessesBusinessIdPost200Response businessesBusinessIdPost(authorization, businessId, inlineObject5)

Update Business

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessId = "businessId_example"; // String | Business ID
    InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
    try {
      BusinessesBusinessIdPost200Response result = apiInstance.businessesBusinessIdPost(authorization, businessId, inlineObject5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesBusinessIdPost");
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
 **businessId** | **String**| Business ID |
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**BusinessesBusinessIdPost200Response**](BusinessesBusinessIdPost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Business Updated |  -  |
**400** | Business Updated |  -  |

<a name="businessesGet"></a>
# **businessesGet**
> BusinessesGet200Response businessesGet(authorization, email, externalId)

Get Business filtered by email or external_id

Retrieves a business by email or external_id. One of email or external ID is required.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String email = "email_example"; // String | Filter by email specified
    String externalId = "externalId_example"; // String | Filter by \"external_id\" specified
    try {
      BusinessesGet200Response result = apiInstance.businessesGet(authorization, email, externalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesGet");
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
 **email** | **String**| Filter by email specified | [optional]
 **externalId** | **String**| Filter by \&quot;external_id\&quot; specified | [optional]

### Return type

[**BusinessesGet200Response**](BusinessesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Business ID Retrieved |  -  |

<a name="businessesPost"></a>
# **businessesPost**
> BusinessesPost200Response businessesPost(authorization, inlineObject4)

Create a Business

Creates a Business.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      BusinessesPost200Response result = apiInstance.businessesPost(authorization, inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesPost");
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**BusinessesPost200Response**](BusinessesPost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Business Created |  -  |

<a name="businessesValidateLoginGet"></a>
# **businessesValidateLoginGet**
> BusinessesValidateLoginGet200Response businessesValidateLoginGet(authorization, username, password)

Validate Login

Validates username/password credentials for login. The API will be blocked for the username after 5 failed attempts.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String username = "username_example"; // String | Email
    String password = "password_example"; // String | Password
    try {
      BusinessesValidateLoginGet200Response result = apiInstance.businessesValidateLoginGet(authorization, username, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessesValidateLoginGet");
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
 **username** | **String**| Email |
 **password** | **String**| Password |

### Return type

[**BusinessesValidateLoginGet200Response**](BusinessesValidateLoginGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Login Validated |  -  |

<a name="globalBusinessesGet"></a>
# **globalBusinessesGet**
> GlobalBusinessesGet200Response globalBusinessesGet(date, authorization, page)

Gets a list of businesses

Gets a list of businesses

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    BusinessApi apiInstance = new BusinessApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalBusinessesGet200Response result = apiInstance.globalBusinessesGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#globalBusinessesGet");
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
 **date** | **String**| Date timestamp to start iteration. Default interval: 1 hour |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **page** | **Integer**| Page number of results. Default: 1 | [optional]

### Return type

[**GlobalBusinessesGet200Response**](GlobalBusinessesGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

