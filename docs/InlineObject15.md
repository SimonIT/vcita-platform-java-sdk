

# InlineObject15


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Lead&#39;s address |  [optional]
**businessId** | **String** | A unique identifier of the business. Can be the Business UID or nickname\\external ID. |  [optional]
**email** | **String** | Lead email address. Unique per business. |  [optional]
**firstName** | **String** | Lead first name. Mandatory for a new lead. | 
**identifierType** | **String** | Defines which unique identifier will be used to search for an existing lead or create a new one. Possible values: \&quot;email\&quot; or \&quot;unique_id\&quot; | 
**lastName** | **String** | Lead last name. |  [optional]
**messageData** | **Map&lt;String, String&gt;** | Key and value that will appear in message |  [optional]
**notifications** | **String** | A list of notifications to send after processing of the lead. Possible values: \&quot;auto-reply\&quot; (thank you email to the end user), \&quot;email\&quot; (notify the business owner) or \&quot;sms\&quot; (text notification to the business owner). None if empty. |  [optional]
**optIn** | **String** | Send \&quot;true\&quot; if lead opted in for promotions. Make sure the \&quot;opt-in\&quot; client card field is added to the client card under Settings&gt;Client card. |  [optional]
**phone** | **String** | Lead phone number. |  [optional]
**requestData** | **Map&lt;String, String&gt;** | Key and value properties that will update new lead and appear in message |  [optional]
**requestTitle** | **String** | Request title. Will also be the created conversation title. | 
**source** | **String** | Will be displayed to the business owner as the lead source |  [optional]
**sourceUrl** | **String** | The URL of the page where the lead was created. |  [optional]
**status** | **String** | Use a client status to categorize clients according to their relationship with your business |  [optional]
**systemMessage** | **String** | A message displayed to the business owner to introduce the lead. May contain links. |  [optional]
**tags** | **String** | Customized labels that enbale you to sort your data using personalized words, phrases or themes that are meaningful to you and your business |  [optional]
**uniqueId** | **String** | Lead unique id. Unique per business. |  [optional]



