

# InlineObject14


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | business address | 
**allowOnlinePayment** | **Boolean** | true, false, default: true if the business is connected to payment provider |  [optional]
**clientId** | **String** | client_uid | 
**conversationId** | **String** | conversation_uid |  [optional]
**currency** | **String** | USD, ILS etc. | 
**dueDate** | **String** | invoice due ,must be later than issued_at | 
**invoiceNumber** | **BigDecimal** | invoice number |  [optional]
**issuedAt** | **String** | invoice issue date | 
**items** | [**List&lt;InvoicesItems&gt;**](InvoicesItems.md) |  | 
**note** | **String** | invoice note |  [optional]
**sendEmail** | **Boolean** | true, false, default false |  [optional]
**sourceCampaign** | **String** | Source campaign |  [optional]
**sourceChannel** | **String** | Source channel |  [optional]
**sourceName** | **String** | Source name |  [optional]
**sourceUrl** | **String** | Source URL |  [optional]
**staffId** | **String** | owner is the default |  [optional]
**status** | **String** | draft, issued, default issued |  [optional]
**title** | **String** | invoice title |  [optional]



