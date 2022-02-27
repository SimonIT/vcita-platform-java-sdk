# PaymentStatusesApi

All URIs are relative to *http://api.vcita.biz/platform/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentStatusesIdApplyCouponPut**](PaymentStatusesApi.md#paymentStatusesIdApplyCouponPut) | **PUT** /payment_statuses/{id}/apply_coupon | Apply Coupon
[**paymentStatusesIdValidateCouponGet**](PaymentStatusesApi.md#paymentStatusesIdValidateCouponGet) | **GET** /payment_statuses/{id}/validate_coupon | Validate Coupon


<a name="paymentStatusesIdApplyCouponPut"></a>
# **paymentStatusesIdApplyCouponPut**
> PaymentStatusesIdApplyCouponPut200Response paymentStatusesIdApplyCouponPut(id, couponCode)

Apply Coupon

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentStatusesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");

    PaymentStatusesApi apiInstance = new PaymentStatusesApi(defaultClient);
    String id = "id_example"; // String | payment status id
    String couponCode = "couponCode_example"; // String | Coupon code
    try {
      PaymentStatusesIdApplyCouponPut200Response result = apiInstance.paymentStatusesIdApplyCouponPut(id, couponCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentStatusesApi#paymentStatusesIdApplyCouponPut");
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
 **id** | **String**| payment status id |
 **couponCode** | **String**| Coupon code |

### Return type

[**PaymentStatusesIdApplyCouponPut200Response**](PaymentStatusesIdApplyCouponPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Coupon Applied |  -  |
**422** | Invalid Coupon |  -  |

<a name="paymentStatusesIdValidateCouponGet"></a>
# **paymentStatusesIdValidateCouponGet**
> PaymentStatusesIdValidateCouponGet200Response paymentStatusesIdValidateCouponGet(id, couponCode)

Validate Coupon

### Example
```java
// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.PaymentStatusesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    PaymentStatusesApi apiInstance = new PaymentStatusesApi(defaultClient);
    String id = "id_example"; // String | payment status id
    String couponCode = "couponCode_example"; // String | Coupon code
    try {
      PaymentStatusesIdValidateCouponGet200Response result = apiInstance.paymentStatusesIdValidateCouponGet(id, couponCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentStatusesApi#paymentStatusesIdValidateCouponGet");
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
 **id** | **String**| payment status id |
 **couponCode** | **String**| Coupon code |

### Return type

[**PaymentStatusesIdValidateCouponGet200Response**](PaymentStatusesIdValidateCouponGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Valid Coupon |  -  |
**422** | Invalid Coupon |  -  |

