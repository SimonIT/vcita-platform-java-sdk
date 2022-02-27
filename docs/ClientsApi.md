# ClientsApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsClientIdDelete**](ClientsApi.md#clientsClientIdDelete) | **DELETE** /clients/{client_id} | Deletes a Client by Id
[**clientsClientIdGet**](ClientsApi.md#clientsClientIdGet) | **GET** /clients/{client_id} | Retrieves a Client by Id
[**clientsClientIdPut**](ClientsApi.md#clientsClientIdPut) | **PUT** /clients/{client_id} | Updates a Client
[**clientsGet**](ClientsApi.md#clientsGet) | **GET** /clients | Get Clients
[**clientsPost**](ClientsApi.md#clientsPost) | **POST** /clients | Create a Client
[**globalClientsGet**](ClientsApi.md#globalClientsGet) | **GET** /global/clients | Gets a list of clients


<a name="clientsClientIdDelete"></a>
# **clientsClientIdDelete**
> ClientsClientIdDelete200Response clientsClientIdDelete(clientId, authorization)

Deletes a Client by Id

Deletes a Client.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String clientId = "clientId_example"; // String | Client UID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      ClientsClientIdDelete200Response result = apiInstance.clientsClientIdDelete(clientId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsClientIdDelete");
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
 **clientId** | **String**| Client UID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**ClientsClientIdDelete200Response**](ClientsClientIdDelete200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clientsClientIdGet"></a>
# **clientsClientIdGet**
> ClientsClientIdGet200Response clientsClientIdGet(clientId, authorization)

Retrieves a Client by Id

Retrieves a Client.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String clientId = "clientId_example"; // String | Client UID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      ClientsClientIdGet200Response result = apiInstance.clientsClientIdGet(clientId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsClientIdGet");
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
 **clientId** | **String**| Client UID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**ClientsClientIdGet200Response**](ClientsClientIdGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clientsClientIdPut"></a>
# **clientsClientIdPut**
> ClientsClientIdPut200Response clientsClientIdPut(clientId, authorization, inlineObject9)

Updates a Client

Update a Client.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String clientId = "clientId_example"; // String | Client UID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject9 inlineObject9 = new InlineObject9(); // InlineObject9 | 
    try {
      ClientsClientIdPut200Response result = apiInstance.clientsClientIdPut(clientId, authorization, inlineObject9);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsClientIdPut");
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
 **clientId** | **String**| Client UID |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**ClientsClientIdPut200Response**](ClientsClientIdPut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clientsGet"></a>
# **clientsGet**
> ClientsGet200Response clientsGet(authorization, searchTerm, searchBy, page, perPage)

Get Clients

Gets a list of clients or search by client attributes.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String searchTerm = "searchTerm_example"; // String | Search Term
    String searchBy = "searchBy_example"; // String | Search By - email/uid
    Integer page = 56; // Integer | Page number of results. Default: 1
    Integer perPage = 56; // Integer | How many items to return per page. Default: 25. Max: 50
    try {
      ClientsGet200Response result = apiInstance.clientsGet(authorization, searchTerm, searchBy, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsGet");
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
 **searchTerm** | **String**| Search Term | [optional]
 **searchBy** | **String**| Search By - email/uid | [optional]
 **page** | **Integer**| Page number of results. Default: 1 | [optional]
 **perPage** | **Integer**| How many items to return per page. Default: 25. Max: 50 | [optional]

### Return type

[**ClientsGet200Response**](ClientsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clientsPost"></a>
# **clientsPost**
> ClientsPost201Response clientsPost(authorization, inlineObject8)

Create a Client

Creates a Client and returns the new client&#39;s data and the client&#39;s JWT token

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject8 inlineObject8 = new InlineObject8(); // InlineObject8 | 
    try {
      ClientsPost201Response result = apiInstance.clientsPost(authorization, inlineObject8);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientsPost");
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
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**ClientsPost201Response**](ClientsPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |

<a name="globalClientsGet"></a>
# **globalClientsGet**
> GlobalClientsGet200Response globalClientsGet(date, authorization, page)

Gets a list of clients

Gets a list of clients

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    String date = "date_example"; // String | Date timestamp to start iteration. Default interval: 1 hour
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    Integer page = 56; // Integer | Page number of results. Default: 1
    try {
      GlobalClientsGet200Response result = apiInstance.globalClientsGet(date, authorization, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#globalClientsGet");
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

[**GlobalClientsGet200Response**](GlobalClientsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

