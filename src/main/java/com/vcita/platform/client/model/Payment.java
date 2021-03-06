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
import com.vcita.platform.client.model.PaymentRequest;
import com.vcita.platform.client.model.SourceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Payment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Payment {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CHARGED_AT = "charged_at";
  @SerializedName(SERIALIZED_NAME_CHARGED_AT)
  private String chargedAt;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_OFFLINE = "offline";
  @SerializedName(SERIALIZED_NAME_OFFLINE)
  private Boolean offline;

  public static final String SERIALIZED_NAME_OTHER_PAYMENT_METHOD = "other_payment_method";
  @SerializedName(SERIALIZED_NAME_OTHER_PAYMENT_METHOD)
  private String otherPaymentMethod;

  public static final String SERIALIZED_NAME_PAID_AT = "paid_at";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  private OffsetDateTime paidAt;

  public static final String SERIALIZED_NAME_PAID_OFFLINE = "paid_offline";
  @SerializedName(SERIALIZED_NAME_PAID_OFFLINE)
  private Boolean paidOffline;

  public static final String SERIALIZED_NAME_PAYMENT_ACTION = "payment_action";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACTION)
  private String paymentAction;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_REQUESTS = "payment_requests";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUESTS)
  private List<PaymentRequest> paymentRequests = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SEND_RECEIPT = "send_receipt";
  @SerializedName(SERIALIZED_NAME_SEND_RECEIPT)
  private Boolean sendReceipt;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "source_data";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private SourceData sourceData;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Payment() { 
  }

  public Payment amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Payment chargedAt(String chargedAt) {
    
    this.chargedAt = chargedAt;
    return this;
  }

   /**
   * Get chargedAt
   * @return chargedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChargedAt() {
    return chargedAt;
  }


  public void setChargedAt(String chargedAt) {
    this.chargedAt = chargedAt;
  }


  public Payment clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Payment conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Get conversationId
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public Payment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Payment currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Payment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Payment note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public Payment offline(Boolean offline) {
    
    this.offline = offline;
    return this;
  }

   /**
   * Get offline
   * @return offline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOffline() {
    return offline;
  }


  public void setOffline(Boolean offline) {
    this.offline = offline;
  }


  public Payment otherPaymentMethod(String otherPaymentMethod) {
    
    this.otherPaymentMethod = otherPaymentMethod;
    return this;
  }

   /**
   * Get otherPaymentMethod
   * @return otherPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOtherPaymentMethod() {
    return otherPaymentMethod;
  }


  public void setOtherPaymentMethod(String otherPaymentMethod) {
    this.otherPaymentMethod = otherPaymentMethod;
  }


  public Payment paidAt(OffsetDateTime paidAt) {
    
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Get paidAt
   * @return paidAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPaidAt() {
    return paidAt;
  }


  public void setPaidAt(OffsetDateTime paidAt) {
    this.paidAt = paidAt;
  }


  public Payment paidOffline(Boolean paidOffline) {
    
    this.paidOffline = paidOffline;
    return this;
  }

   /**
   * Get paidOffline
   * @return paidOffline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPaidOffline() {
    return paidOffline;
  }


  public void setPaidOffline(Boolean paidOffline) {
    this.paidOffline = paidOffline;
  }


  public Payment paymentAction(String paymentAction) {
    
    this.paymentAction = paymentAction;
    return this;
  }

   /**
   * Get paymentAction
   * @return paymentAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentAction() {
    return paymentAction;
  }


  public void setPaymentAction(String paymentAction) {
    this.paymentAction = paymentAction;
  }


  public Payment paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public Payment paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Payment paymentRequests(List<PaymentRequest> paymentRequests) {
    
    this.paymentRequests = paymentRequests;
    return this;
  }

  public Payment addPaymentRequestsItem(PaymentRequest paymentRequestsItem) {
    if (this.paymentRequests == null) {
      this.paymentRequests = new ArrayList<>();
    }
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }

   /**
   * Get paymentRequests
   * @return paymentRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentRequest> getPaymentRequests() {
    return paymentRequests;
  }


  public void setPaymentRequests(List<PaymentRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }


  public Payment reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Payment sendReceipt(Boolean sendReceipt) {
    
    this.sendReceipt = sendReceipt;
    return this;
  }

   /**
   * Get sendReceipt
   * @return sendReceipt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSendReceipt() {
    return sendReceipt;
  }


  public void setSendReceipt(Boolean sendReceipt) {
    this.sendReceipt = sendReceipt;
  }


  public Payment staffId(String staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStaffId() {
    return staffId;
  }


  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }


  public Payment state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Payment sourceData(SourceData sourceData) {
    
    this.sourceData = sourceData;
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceData getSourceData() {
    return sourceData;
  }


  public void setSourceData(SourceData sourceData) {
    this.sourceData = sourceData;
  }


  public Payment title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    Payment payment = (Payment) o;
    return Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.chargedAt, payment.chargedAt) &&
        Objects.equals(this.clientId, payment.clientId) &&
        Objects.equals(this.conversationId, payment.conversationId) &&
        Objects.equals(this.createdAt, payment.createdAt) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.id, payment.id) &&
        Objects.equals(this.note, payment.note) &&
        Objects.equals(this.offline, payment.offline) &&
        Objects.equals(this.otherPaymentMethod, payment.otherPaymentMethod) &&
        Objects.equals(this.paidAt, payment.paidAt) &&
        Objects.equals(this.paidOffline, payment.paidOffline) &&
        Objects.equals(this.paymentAction, payment.paymentAction) &&
        Objects.equals(this.paymentId, payment.paymentId) &&
        Objects.equals(this.paymentMethod, payment.paymentMethod) &&
        Objects.equals(this.paymentRequests, payment.paymentRequests) &&
        Objects.equals(this.reference, payment.reference) &&
        Objects.equals(this.sendReceipt, payment.sendReceipt) &&
        Objects.equals(this.staffId, payment.staffId) &&
        Objects.equals(this.state, payment.state) &&
        Objects.equals(this.sourceData, payment.sourceData) &&
        Objects.equals(this.title, payment.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chargedAt, clientId, conversationId, createdAt, currency, id, note, offline, otherPaymentMethod, paidAt, paidOffline, paymentAction, paymentId, paymentMethod, paymentRequests, reference, sendReceipt, staffId, state, sourceData, title);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargedAt: ").append(toIndentedString(chargedAt)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    otherPaymentMethod: ").append(toIndentedString(otherPaymentMethod)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    paidOffline: ").append(toIndentedString(paidOffline)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sendReceipt: ").append(toIndentedString(sendReceipt)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("charged_at");
    openapiFields.add("client_id");
    openapiFields.add("conversation_id");
    openapiFields.add("created_at");
    openapiFields.add("currency");
    openapiFields.add("id");
    openapiFields.add("note");
    openapiFields.add("offline");
    openapiFields.add("other_payment_method");
    openapiFields.add("paid_at");
    openapiFields.add("paid_offline");
    openapiFields.add("payment_action");
    openapiFields.add("payment_id");
    openapiFields.add("payment_method");
    openapiFields.add("payment_requests");
    openapiFields.add("reference");
    openapiFields.add("send_receipt");
    openapiFields.add("staff_id");
    openapiFields.add("state");
    openapiFields.add("source_data");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Payment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Payment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Payment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypaymentRequests = jsonObj.getAsJsonArray("payment_requests");
      // validate the optional field `payment_requests` (array)
      if (jsonArraypaymentRequests != null) {
        for (int i = 0; i < jsonArraypaymentRequests.size(); i++) {
          PaymentRequest.validateJsonObject(jsonArraypaymentRequests.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `source_data`
      if (jsonObj.getAsJsonObject("source_data") != null) {
        SourceData.validateJsonObject(jsonObj.getAsJsonObject("source_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Payment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Payment
  * @throws IOException if the JSON string is invalid with respect to Payment
  */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

 /**
  * Convert an instance of Payment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

