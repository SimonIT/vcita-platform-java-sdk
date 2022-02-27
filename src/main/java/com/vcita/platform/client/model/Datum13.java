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
import com.vcita.platform.client.model.Item;
import com.vcita.platform.client.model.SourceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * Datum13
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Datum13 {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALLOW_ONLINE_PAYMENT = "allow_online_payment";
  @SerializedName(SERIALIZED_NAME_ALLOW_ONLINE_PAYMENT)
  private Boolean allowOnlinePayment;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private String businessId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contact_details";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private Object contactDetails = null;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private Integer invoiceNumber;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private LocalDate issuedAt;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public static final String SERIALIZED_NAME_MATTER_DETAILS = "matter_details";
  @SerializedName(SERIALIZED_NAME_MATTER_DETAILS)
  private Object matterDetails = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PAYMENT_BALANCE = "payment_balance";
  @SerializedName(SERIALIZED_NAME_PAYMENT_BALANCE)
  private Float paymentBalance;

  public static final String SERIALIZED_NAME_PAYMENT_STATE = "payment_state";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATE)
  private String paymentState;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "source_data";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private SourceData sourceData;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Datum13() { 
  }

  public Datum13 address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public Datum13 allowOnlinePayment(Boolean allowOnlinePayment) {
    
    this.allowOnlinePayment = allowOnlinePayment;
    return this;
  }

   /**
   * Get allowOnlinePayment
   * @return allowOnlinePayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowOnlinePayment() {
    return allowOnlinePayment;
  }


  public void setAllowOnlinePayment(Boolean allowOnlinePayment) {
    this.allowOnlinePayment = allowOnlinePayment;
  }


  public Datum13 amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public Datum13 businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public Datum13 clientId(String clientId) {
    
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


  public Datum13 contactDetails(Object contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(Object contactDetails) {
    this.contactDetails = contactDetails;
  }


  public Datum13 conversationId(String conversationId) {
    
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


  public Datum13 createdAt(OffsetDateTime createdAt) {
    
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


  public Datum13 currency(String currency) {
    
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


  public Datum13 dueDate(LocalDate dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }


  public Datum13 id(String id) {
    
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


  public Datum13 invoiceNumber(Integer invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public Datum13 issuedAt(LocalDate issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * Get issuedAt
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(LocalDate issuedAt) {
    this.issuedAt = issuedAt;
  }


  public Datum13 items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public Datum13 addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    this.items = items;
  }


  public Datum13 matterDetails(Object matterDetails) {
    
    this.matterDetails = matterDetails;
    return this;
  }

   /**
   * Get matterDetails
   * @return matterDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMatterDetails() {
    return matterDetails;
  }


  public void setMatterDetails(Object matterDetails) {
    this.matterDetails = matterDetails;
  }


  public Datum13 note(String note) {
    
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


  public Datum13 paymentBalance(Float paymentBalance) {
    
    this.paymentBalance = paymentBalance;
    return this;
  }

   /**
   * Get paymentBalance
   * @return paymentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getPaymentBalance() {
    return paymentBalance;
  }


  public void setPaymentBalance(Float paymentBalance) {
    this.paymentBalance = paymentBalance;
  }


  public Datum13 paymentState(String paymentState) {
    
    this.paymentState = paymentState;
    return this;
  }

   /**
   * Get paymentState
   * @return paymentState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentState() {
    return paymentState;
  }


  public void setPaymentState(String paymentState) {
    this.paymentState = paymentState;
  }


  public Datum13 sourceData(SourceData sourceData) {
    
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


  public Datum13 staffId(String staffId) {
    
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


  public Datum13 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Datum13 title(String title) {
    
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


  public Datum13 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datum13 datum13 = (Datum13) o;
    return Objects.equals(this.address, datum13.address) &&
        Objects.equals(this.allowOnlinePayment, datum13.allowOnlinePayment) &&
        Objects.equals(this.amount, datum13.amount) &&
        Objects.equals(this.businessId, datum13.businessId) &&
        Objects.equals(this.clientId, datum13.clientId) &&
        Objects.equals(this.contactDetails, datum13.contactDetails) &&
        Objects.equals(this.conversationId, datum13.conversationId) &&
        Objects.equals(this.createdAt, datum13.createdAt) &&
        Objects.equals(this.currency, datum13.currency) &&
        Objects.equals(this.dueDate, datum13.dueDate) &&
        Objects.equals(this.id, datum13.id) &&
        Objects.equals(this.invoiceNumber, datum13.invoiceNumber) &&
        Objects.equals(this.issuedAt, datum13.issuedAt) &&
        Objects.equals(this.items, datum13.items) &&
        Objects.equals(this.matterDetails, datum13.matterDetails) &&
        Objects.equals(this.note, datum13.note) &&
        Objects.equals(this.paymentBalance, datum13.paymentBalance) &&
        Objects.equals(this.paymentState, datum13.paymentState) &&
        Objects.equals(this.sourceData, datum13.sourceData) &&
        Objects.equals(this.staffId, datum13.staffId) &&
        Objects.equals(this.status, datum13.status) &&
        Objects.equals(this.title, datum13.title) &&
        Objects.equals(this.updatedAt, datum13.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, allowOnlinePayment, amount, businessId, clientId, contactDetails, conversationId, createdAt, currency, dueDate, id, invoiceNumber, issuedAt, items, matterDetails, note, paymentBalance, paymentState, sourceData, staffId, status, title, updatedAt);
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
    sb.append("class Datum13 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    allowOnlinePayment: ").append(toIndentedString(allowOnlinePayment)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    matterDetails: ").append(toIndentedString(matterDetails)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    paymentBalance: ").append(toIndentedString(paymentBalance)).append("\n");
    sb.append("    paymentState: ").append(toIndentedString(paymentState)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("business_id");
    openapiFields.add("client_id");
    openapiFields.add("contact_details");
    openapiFields.add("conversation_id");
    openapiFields.add("created_at");
    openapiFields.add("currency");
    openapiFields.add("due_date");
    openapiFields.add("id");
    openapiFields.add("invoice_number");
    openapiFields.add("issued_at");
    openapiFields.add("items");
    openapiFields.add("matter_details");
    openapiFields.add("note");
    openapiFields.add("payment_balance");
    openapiFields.add("payment_state");
    openapiFields.add("source_data");
    openapiFields.add("staff_id");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Datum13
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Datum13.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datum13 is not found in the empty JSON string", Datum13.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Datum13.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datum13` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the optional field `items` (array)
      if (jsonArrayitems != null) {
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Item.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
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
       if (!Datum13.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datum13' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datum13> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datum13.class));

       return (TypeAdapter<T>) new TypeAdapter<Datum13>() {
           @Override
           public void write(JsonWriter out, Datum13 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datum13 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datum13 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datum13
  * @throws IOException if the JSON string is invalid with respect to Datum13
  */
  public static Datum13 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datum13.class);
  }

 /**
  * Convert an instance of Datum13 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

