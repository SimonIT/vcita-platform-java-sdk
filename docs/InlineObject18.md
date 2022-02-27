

# InlineObject18


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Boolean** | The charged amount  (You should send this only if you are in sync_flow) |  [optional]
**card** | [**PaymentCheckoutCard**](PaymentCheckoutCard.md) |  |  [optional]
**created** | **String** | the date of the payment |  [optional]
**customerId** | **String** | The customer unique id (You should send this only if client want to save the card) |  [optional]
**psId** | **String** | The payment status uid (You should send this only if you are in sync_flow) |  [optional]
**syncFlow** | **Boolean** | You should send true in case it is a post checkout flow  |  [optional]
**transactionId** | **String** | The external payment gateway transaction id |  [optional]
**type** | **String** | checkout.session.completed |  [optional]
**urlKey** | **String** | The url_key |  [optional]



