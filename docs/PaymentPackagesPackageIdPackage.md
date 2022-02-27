

# PaymentPackagesPackageIdPackage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The items currency |  [optional]
**description** | **String** | The package description |  [optional]
**discountAmount** | **BigDecimal** | Package discount amount (Only for view purposes) |  [optional]
**discountUnit** | **String** | Package discount unit [F-Fixed, P-Percentage] (Only for view purposes) |  [optional]
**expiration** | **BigDecimal** | Once package is instanced for a client, it will be valid for expiration number X expiration unit |  [optional]
**expirationUnit** | **String** | The expiration unit (M-Month, D-Day, W-Week, Y-Year) |  [optional]
**imagePath** | **String** | The package&#39;s image path |  [optional]
**items** | [**List&lt;PaymentPackagesItems&gt;**](PaymentPackagesItems.md) |  |  [optional]
**name** | **String** | The name of the package |  [optional]
**onlinePaymentEnabled** | **Boolean** | Online payments enabled? |  [optional]
**price** | **BigDecimal** | The price of the package |  [optional]
**products** | [**List&lt;PaymentPackagesPackageIdPackageProducts&gt;**](PaymentPackagesPackageIdPackageProducts.md) | Package&#39;s products. [] will remove the package&#39;s products |  [optional]



