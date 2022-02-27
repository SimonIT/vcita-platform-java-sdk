

# InlineObject10


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Business address | 
**clientAddress** | **String** | Client&#39;s address |  [optional]
**clientId** | **String** | Client ID | 
**clientName** | **String** | Client&#39;s name |  [optional]
**conversationId** | **String** | Conversation ID |  [optional]
**currency** | **String** | Estimate currency: USD, ILS etc. | 
**dueDate** | **String** | Estimate due date, must be later than estimate_date (ISO 8601 format) | 
**estimateDate** | **String** | Estimate date (ISO 8601 format) | 
**estimateNumber** | **BigDecimal** | Estimate number |  [optional]
**items** | [**List&lt;EstimatesItems&gt;**](EstimatesItems.md) |  | 
**note** | **String** | Estimate note |  [optional]
**sendEmail** | **Boolean** | Set to true in order to send the estimate to the client (for issued estimate). Default: false |  [optional]
**sourceCampaign** | **String** | Source campaign |  [optional]
**sourceChannel** | **String** | Source channel |  [optional]
**sourceName** | **String** | Source name |  [optional]
**sourceUrl** | **String** | Source URL |  [optional]
**status** | **String** | Possible values: draft, issued, approved, rejected, invoiced. Default: issued |  [optional]
**title** | **String** | Estimate title | 



