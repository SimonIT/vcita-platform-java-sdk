# MattersApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsMergesMergeClientsPut**](MattersApi.md#clientsMergesMergeClientsPut) | **PUT** /clients/merges/merge_clients | Merge duplicate clients into a primary client.
[**clientsMergesPossibleMergeMasterGet**](MattersApi.md#clientsMergesPossibleMergeMasterGet) | **GET** /clients/merges/possible_merge_master | List of clients that can be used as primary for merge.


<a name="clientsMergesMergeClientsPut"></a>
# **clientsMergesMergeClientsPut**
> ClientsMergesMergeClientsPut200Response clientsMergesMergeClientsPut(toClientUid, fromClientUids, authorization)

Merge duplicate clients into a primary client.

Merge two or more duplicate clients into one primary client.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.MattersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    MattersApi apiInstance = new MattersApi(defaultClient);
    String toClientUid = "toClientUid_example"; // String | UID of the destination primary client.
    String fromClientUids = "fromClientUids_example"; // String | UIDs of all the clients to be merged into the to_client_uid, comma separated
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      ClientsMergesMergeClientsPut200Response result = apiInstance.clientsMergesMergeClientsPut(toClientUid, fromClientUids, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MattersApi#clientsMergesMergeClientsPut");
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
 **toClientUid** | **String**| UID of the destination primary client. |
 **fromClientUids** | **String**| UIDs of all the clients to be merged into the to_client_uid, comma separated |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**ClientsMergesMergeClientsPut200Response**](ClientsMergesMergeClientsPut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clientsMergesPossibleMergeMasterGet"></a>
# **clientsMergesPossibleMergeMasterGet**
> ClientsMergesPossibleMergeMasterGet200Response clientsMergesPossibleMergeMasterGet(clientIds, authorization)

List of clients that can be used as primary for merge.

Returns a list of client UIDs that can be used as a primary client for the merge.

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.MattersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    MattersApi apiInstance = new MattersApi(defaultClient);
    String clientIds = "clientIds_example"; // String | List of client uids, comma separated
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      ClientsMergesPossibleMergeMasterGet200Response result = apiInstance.clientsMergesPossibleMergeMasterGet(clientIds, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MattersApi#clientsMergesPossibleMergeMasterGet");
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
 **clientIds** | **String**| List of client uids, comma separated |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**ClientsMergesPossibleMergeMasterGet200Response**](ClientsMergesPossibleMergeMasterGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

