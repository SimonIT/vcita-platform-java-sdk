/*
 * Platform API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vcita.platform.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vcita.platform.client.model.InvoicesItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * InlineObject14
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject14 {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALLOW_ONLINE_PAYMENT = "allow_online_payment";
  @SerializedName(SERIALIZED_NAME_ALLOW_ONLINE_PAYMENT)
  private Boolean allowOnlinePayment;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private BigDecimal invoiceNumber;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private String issuedAt;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<InvoicesItems> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SEND_EMAIL = "send_email";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
  private Boolean sendEmail;

  public static final String SERIALIZED_NAME_SOURCE_CAMPAIGN = "source_campaign";
  @SerializedName(SERIALIZED_NAME_SOURCE_CAMPAIGN)
  private String sourceCampaign;

  public static final String SERIALIZED_NAME_SOURCE_CHANNEL = "source_channel";
  @SerializedName(SERIALIZED_NAME_SOURCE_CHANNEL)
  private String sourceChannel;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "source_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public InlineObject14() { 
  }

  public InlineObject14 address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * business address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "business address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public InlineObject14 allowOnlinePayment(Boolean allowOnlinePayment) {
    
    this.allowOnlinePayment = allowOnlinePayment;
    return this;
  }

   /**
   * true, false, default: true if the business is connected to payment provider
   * @return allowOnlinePayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true, false, default: true if the business is connected to payment provider")

  public Boolean getAllowOnlinePayment() {
    return allowOnlinePayment;
  }


  public void setAllowOnlinePayment(Boolean allowOnlinePayment) {
    this.allowOnlinePayment = allowOnlinePayment;
  }


  public InlineObject14 clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * client_uid
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "client_uid")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InlineObject14 conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * conversation_uid
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "conversation_uid")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public InlineObject14 currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * USD, ILS etc.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "USD, ILS etc.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InlineObject14 dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * invoice due ,must be later than issued_at
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "invoice due ,must be later than issued_at")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public InlineObject14 invoiceNumber(BigDecimal invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * invoice number
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "invoice number")

  public BigDecimal getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(BigDecimal invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public InlineObject14 issuedAt(String issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * invoice issue date
   * @return issuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "invoice issue date")

  public String getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }


  public InlineObject14 items(List<InvoicesItems> items) {
    
    this.items = items;
    return this;
  }

  public InlineObject14 addItemsItem(InvoicesItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<InvoicesItems> getItems() {
    return items;
  }


  public void setItems(List<InvoicesItems> items) {
    this.items = items;
  }


  public InlineObject14 note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * invoice note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "invoice note")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public InlineObject14 sendEmail(Boolean sendEmail) {
    
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * true, false, default false
   * @return sendEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true, false, default false")

  public Boolean getSendEmail() {
    return sendEmail;
  }


  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }


  public InlineObject14 sourceCampaign(String sourceCampaign) {
    
    this.sourceCampaign = sourceCampaign;
    return this;
  }

   /**
   * Source campaign
   * @return sourceCampaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source campaign")

  public String getSourceCampaign() {
    return sourceCampaign;
  }


  public void setSourceCampaign(String sourceCampaign) {
    this.sourceCampaign = sourceCampaign;
  }


  public InlineObject14 sourceChannel(String sourceChannel) {
    
    this.sourceChannel = sourceChannel;
    return this;
  }

   /**
   * Source channel
   * @return sourceChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source channel")

  public String getSourceChannel() {
    return sourceChannel;
  }


  public void setSourceChannel(String sourceChannel) {
    this.sourceChannel = sourceChannel;
  }


  public InlineObject14 sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Source name
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source name")

  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public InlineObject14 sourceUrl(String sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Source URL
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source URL")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public InlineObject14 staffId(String staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * owner is the default
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "owner is the default")

  public String getStaffId() {
    return staffId;
  }


  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }


  public InlineObject14 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * draft, issued, default issued
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "draft, issued, default issued")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public InlineObject14 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * invoice title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "invoice title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject14 inlineObject14 = (InlineObject14) o;
    return Objects.equals(this.address, inlineObject14.address) &&
        Objects.equals(this.allowOnlinePayment, inlineObject14.allowOnlinePayment) &&
        Objects.equals(this.clientId, inlineObject14.clientId) &&
        Objects.equals(this.conversationId, inlineObject14.conversationId) &&
        Objects.equals(this.currency, inlineObject14.currency) &&
        Objects.equals(this.dueDate, inlineObject14.dueDate) &&
        Objects.equals(this.invoiceNumber, inlineObject14.invoiceNumber) &&
        Objects.equals(this.issuedAt, inlineObject14.issuedAt) &&
        Objects.equals(this.items, inlineObject14.items) &&
        Objects.equals(this.note, inlineObject14.note) &&
        Objects.equals(this.sendEmail, inlineObject14.sendEmail) &&
        Objects.equals(this.sourceCampaign, inlineObject14.sourceCampaign) &&
        Objects.equals(this.sourceChannel, inlineObject14.sourceChannel) &&
        Objects.equals(this.sourceName, inlineObject14.sourceName) &&
        Objects.equals(this.sourceUrl, inlineObject14.sourceUrl) &&
        Objects.equals(this.staffId, inlineObject14.staffId) &&
        Objects.equals(this.status, inlineObject14.status) &&
        Objects.equals(this.title, inlineObject14.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, allowOnlinePayment, clientId, conversationId, currency, dueDate, invoiceNumber, issuedAt, items, note, sendEmail, sourceCampaign, sourceChannel, sourceName, sourceUrl, staffId, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject14 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    allowOnlinePayment: ").append(toIndentedString(allowOnlinePayment)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    sourceCampaign: ").append(toIndentedString(sourceCampaign)).append("\n");
    sb.append("    sourceChannel: ").append(toIndentedString(sourceChannel)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("address");
    openapiFields.add("allow_online_payment");
    openapiFields.add("client_id");
    openapiFields.add("conversation_id");
    openapiFields.add("currency");
    openapiFields.add("due_date");
    openapiFields.add("invoice_number");
    openapiFields.add("issued_at");
    openapiFields.add("items");
    openapiFields.add("note");
    openapiFields.add("send_email");
    openapiFields.add("source_campaign");
    openapiFields.add("source_channel");
    openapiFields.add("source_name");
    openapiFields.add("source_url");
    openapiFields.add("staff_id");
    openapiFields.add("status");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("due_date");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject14
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject14.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject14 is not found in the empty JSON string", InlineObject14.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject14.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject14` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InlineObject14.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the optional field `items` (array)
      if (jsonArrayitems != null) {
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          InvoicesItems.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject14.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject14' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject14> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject14.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject14>() {
           @Override
           public void write(JsonWriter out, InlineObject14 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject14 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject14 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject14
  * @throws IOException if the JSON string is invalid with respect to InlineObject14
  */
  public static InlineObject14 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject14.class);
  }

 /**
  * Convert an instance of InlineObject14 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

