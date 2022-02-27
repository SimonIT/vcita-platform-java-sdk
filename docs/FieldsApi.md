# FieldsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fieldsFieldIdDelete**](FieldsApi.md#fieldsFieldIdDelete) | **DELETE** /fields/{field_id} | Deletes a Field
[**fieldsFieldIdGet**](FieldsApi.md#fieldsFieldIdGet) | **GET** /fields/{field_id} | Get Field
[**fieldsFieldIdPut**](FieldsApi.md#fieldsFieldIdPut) | **PUT** /fields/{field_id} | Updates a Field
[**fieldsGet**](FieldsApi.md#fieldsGet) | **GET** /fields | Get all Fields
[**fieldsPost**](FieldsApi.md#fieldsPost) | **POST** /fields | Create a New Field


<a name="fieldsFieldIdDelete"></a>
# **fieldsFieldIdDelete**
> FieldsFieldIdDelete200Response fieldsFieldIdDelete(fieldId, authorization)

Deletes a Field

Deletes a Field

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    String fieldId = "fieldId_example"; // String | The id of the field
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      FieldsFieldIdDelete200Response result = apiInstance.fieldsFieldIdDelete(fieldId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#fieldsFieldIdDelete");
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
 **fieldId** | **String**| The id of the field |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**FieldsFieldIdDelete200Response**](FieldsFieldIdDelete200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="fieldsFieldIdGet"></a>
# **fieldsFieldIdGet**
> FieldsFieldIdGet200Response fieldsFieldIdGet(fieldId, authorization)

Get Field

Gets the field

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    String fieldId = "fieldId_example"; // String | The id of the field
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      FieldsFieldIdGet200Response result = apiInstance.fieldsFieldIdGet(fieldId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#fieldsFieldIdGet");
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
 **fieldId** | **String**| The id of the field |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**FieldsFieldIdGet200Response**](FieldsFieldIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="fieldsFieldIdPut"></a>
# **fieldsFieldIdPut**
> FieldsFieldIdPut200Response fieldsFieldIdPut(fieldId, authorization, inlineObject12)

Updates a Field

Updates a Field

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    String fieldId = "fieldId_example"; // String | The id of the field
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject12 inlineObject12 = new InlineObject12(); // InlineObject12 | 
    try {
      FieldsFieldIdPut200Response result = apiInstance.fieldsFieldIdPut(fieldId, authorization, inlineObject12);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#fieldsFieldIdPut");
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
 **fieldId** | **String**| The id of the field |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**FieldsFieldIdPut200Response**](FieldsFieldIdPut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="fieldsGet"></a>
# **fieldsGet**
> FieldsGet200Response fieldsGet(authorization)

Get all Fields

Get all Fields

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      FieldsGet200Response result = apiInstance.fieldsGet(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#fieldsGet");
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

[**FieldsGet200Response**](FieldsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="fieldsPost"></a>
# **fieldsPost**
> FieldsPost201Response fieldsPost(authorization, inlineObject11)

Create a New Field

Create a New Field

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject11 inlineObject11 = new InlineObject11(); // InlineObject11 | 
    try {
      FieldsPost201Response result = apiInstance.fieldsPost(authorization, inlineObject11);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#fieldsPost");
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
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**FieldsPost201Response**](FieldsPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |

