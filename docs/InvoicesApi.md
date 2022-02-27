# InvoicesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsClientIdInvoicesGet**](InvoicesApi.md#clientsClientIdInvoicesGet) | **GET** /clients/{client_id}/invoices | Get Invoices Of Client
[**invoicesGet**](InvoicesApi.md#invoicesGet) | **GET** /invoices | Get Invoices List
[**invoicesInvoiceIdGet**](InvoicesApi.md#invoicesInvoiceIdGet) | **GET** /invoices/{invoice_id} | Get Invoice By ID
[**invoicesPost**](InvoicesApi.md#invoicesPost) | **POST** /invoices | Create New Invoice


<a name="clientsClientIdInvoicesGet"></a>
# **clientsClientIdInvoicesGet**
> ClientsClientIdInvoicesGet201Response clientsClientIdInvoicesGet(authorization, clientId, filter, sort, page, perPage)

Get Invoices Of Client

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String clientId = "clientId_example"; // String | client's id
    String filter = "filter_example"; // String | Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]=2019-01-01, filter[state][in]=issued,draft
    String sort = "sort_example"; // String | Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort=created_at:asc,updated_at:desc
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size
    try {
      ClientsClientIdInvoicesGet201Response result = apiInstance.clientsClientIdInvoicesGet(authorization, clientId, filter, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#clientsClientIdInvoicesGet");
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
 **clientId** | **String**| client&#39;s id |
 **filter** | **String**| Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft | [optional]
 **sort** | **String**| Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc | [optional]
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size | [optional]

### Return type

[**ClientsClientIdInvoicesGet201Response**](ClientsClientIdInvoicesGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Invoices Returned |  -  |

<a name="invoicesGet"></a>
# **invoicesGet**
> InvoicesGet201Response invoicesGet(authorization, filter, sort, page, perPage)

Get Invoices List

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String filter = "filter_example"; // String | Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]=2019-01-01, filter[state][in]=issued,draft
    String sort = "sort_example"; // String | Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort=created_at:asc,updated_at:desc
    String page = "page_example"; // String | Page offset
    String perPage = "perPage_example"; // String | Page size
    try {
      InvoicesGet201Response result = apiInstance.invoicesGet(authorization, filter, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#invoicesGet");
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
 **filter** | **String**| Filter by created_at, updated_at, state. state values: issued, draft, declined. available operators for created_at and updated_at: gt, gte, lt, lte, eq. available operators for state: in. example: filter[created_at][gt]&#x3D;2019-01-01, filter[state][in]&#x3D;issued,draft | [optional]
 **sort** | **String**| Sort by one of the following: created_at, updated_at, state. available operators: asc, desc. example: sort&#x3D;created_at:asc,updated_at:desc | [optional]
 **page** | **String**| Page offset | [optional]
 **perPage** | **String**| Page size | [optional]

### Return type

[**InvoicesGet201Response**](InvoicesGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Invoices Returned |  -  |

<a name="invoicesInvoiceIdGet"></a>
# **invoicesInvoiceIdGet**
> InvoicesInvoiceIdGet201Response invoicesInvoiceIdGet(authorization, invoiceId)

Get Invoice By ID

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String invoiceId = "invoiceId_example"; // String | Invoice ID
    try {
      InvoicesInvoiceIdGet201Response result = apiInstance.invoicesInvoiceIdGet(authorization, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#invoicesInvoiceIdGet");
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
 **invoiceId** | **String**| Invoice ID |

### Return type

[**InvoicesInvoiceIdGet201Response**](InvoicesInvoiceIdGet201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Invoices Returned |  -  |

<a name="invoicesPost"></a>
# **invoicesPost**
> InvoicesPost201Response invoicesPost(authorization, inlineObject14)

Create New Invoice

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject14 inlineObject14 = new InlineObject14(); // InlineObject14 | 
    try {
      InvoicesPost201Response result = apiInstance.invoicesPost(authorization, inlineObject14);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#invoicesPost");
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
 **inlineObject14** | [**InlineObject14**](InlineObject14.md)|  | [optional]

### Return type

[**InvoicesPost201Response**](InvoicesPost201Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Invoice Created |  -  |

