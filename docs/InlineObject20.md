

# InlineObject20


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The items currency | 
**description** | **String** | The package description |  [optional]
**discountAmount** | **BigDecimal** | Package discount amount (Only for view purposes) |  [optional]
**discountUnit** | **String** | Package discount unit [F-Fixed, P-Percentage] (Only for view purposes) |  [optional]
**expiration** | **BigDecimal** | Once package is instanced for a client, it will be valid for expiration number X expiration unit    | 
**expirationUnit** | **String** | The expiration unit (M-Month, D-Day, W-Week, Y-Year) | 
**imagePath** | **String** | The package&#39;s image path |  [optional]
**items** | [**List&lt;PaymentPackagesItems&gt;**](PaymentPackagesItems.md) |  | 
**name** | **String** | The name of the package | 
**onlinePaymentEnabled** | **Boolean** | Online payments enabled? |  [optional]
**price** | **BigDecimal** | The price of the package | 
**products** | [**List&lt;PaymentPackagesProducts&gt;**](PaymentPackagesProducts.md) | Products included in the package. Up to 3 different products allowed. |  [optional]



