# WizardApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessesBusinessIdWizardsGet**](WizardApi.md#businessesBusinessIdWizardsGet) | **GET** /businesses/{business_id}/wizards | Gets a list of wizards
[**businessesBusinessIdWizardsWizardNameGet**](WizardApi.md#businessesBusinessIdWizardsWizardNameGet) | **GET** /businesses/{business_id}/wizards/{wizard_name} | Gets a wizard by name
[**businessesBusinessIdWizardsWizardNamePut**](WizardApi.md#businessesBusinessIdWizardsWizardNamePut) | **PUT** /businesses/{business_id}/wizards/{wizard_name} | Update a wizard


<a name="businessesBusinessIdWizardsGet"></a>
# **businessesBusinessIdWizardsGet**
> BusinessesBusinessIdWizardsGet200Response businessesBusinessIdWizardsGet(businessId, authorization)

Gets a list of wizards

Gets a list of available wizards

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WizardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WizardApi apiInstance = new WizardApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      BusinessesBusinessIdWizardsGet200Response result = apiInstance.businessesBusinessIdWizardsGet(businessId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WizardApi#businessesBusinessIdWizardsGet");
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
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**BusinessesBusinessIdWizardsGet200Response**](BusinessesBusinessIdWizardsGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="businessesBusinessIdWizardsWizardNameGet"></a>
# **businessesBusinessIdWizardsWizardNameGet**
> BusinessesBusinessIdWizardsWizardNameGet200Response businessesBusinessIdWizardsWizardNameGet(businessId, wizardName, authorization)

Gets a wizard by name

Gets a wizard by given name

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WizardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WizardApi apiInstance = new WizardApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String wizardName = "wizardName_example"; // String | Wizard's name (e.g. register_wizard)
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      BusinessesBusinessIdWizardsWizardNameGet200Response result = apiInstance.businessesBusinessIdWizardsWizardNameGet(businessId, wizardName, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WizardApi#businessesBusinessIdWizardsWizardNameGet");
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
 **wizardName** | **String**| Wizard&#39;s name (e.g. register_wizard) |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**BusinessesBusinessIdWizardsWizardNameGet200Response**](BusinessesBusinessIdWizardsWizardNameGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="businessesBusinessIdWizardsWizardNamePut"></a>
# **businessesBusinessIdWizardsWizardNamePut**
> BusinessesBusinessIdWizardsWizardNamePut200Response businessesBusinessIdWizardsWizardNamePut(businessId, wizardName, authorization, inlineObject7)

Update a wizard

Update a wizard with given name

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.WizardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    WizardApi apiInstance = new WizardApi(defaultClient);
    String businessId = "businessId_example"; // String | Business ID
    String wizardName = "wizardName_example"; // String | Wizard's name (e.g. register_wizard)
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject7 inlineObject7 = new InlineObject7(); // InlineObject7 | 
    try {
      BusinessesBusinessIdWizardsWizardNamePut200Response result = apiInstance.businessesBusinessIdWizardsWizardNamePut(businessId, wizardName, authorization, inlineObject7);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WizardApi#businessesBusinessIdWizardsWizardNamePut");
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
 **wizardName** | **String**| Wizard&#39;s name (e.g. register_wizard) |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**BusinessesBusinessIdWizardsWizardNamePut200Response**](BusinessesBusinessIdWizardsWizardNamePut200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

