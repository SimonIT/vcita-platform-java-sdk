

# InlineObject23


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **BigDecimal** | amount | 
**clientId** | **String** | client ID | 
**currency** | **String** | USD, ILS etc. | 
**otherPaymentMethod** | **String** | Max 24 chars |  [optional]
**paidAt** | **String** | default is now |  [optional]
**paymentMethod** | **String** | &#39;PayPal&#39;, &#39;Other&#39;, &#39;Cash&#39;, &#39;Credit Card&#39;, &#39;Bank Transfer&#39;, &#39;Cheque&#39; | 
**paymentSubjectId** | **String** | The ID of the entity for which the payment has been made |  [optional]
**paymentSubjectType** | **String** | The type of entity for which the payment has been made. Available types: &#39;Meeting&#39;, &#39;EventAttendance&#39;, &#39;Invoice&#39;, &#39;ClientBookingPackage&#39;, &#39;ProductOrder&#39;. |  [optional]
**reference** | **String** | Max 24 chars |  [optional]
**sendReceipt** | **Boolean** | true, false. default true |  [optional]
**staffId** | **String** | Default is set to the staff that performed the API call. Business owner is allowed to send staff_id |  [optional]
**title** | **String** | paid for service or product | 



