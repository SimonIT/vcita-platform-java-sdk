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
 * Datum10
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Datum10 {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_BUSINESS_UID = "business_uid";
  @SerializedName(SERIALIZED_NAME_BUSINESS_UID)
  private String businessUid;

  public static final String SERIALIZED_NAME_CLIENT_ADDRESS = "client_address";
  @SerializedName(SERIALIZED_NAME_CLIENT_ADDRESS)
  private String clientAddress;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

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

  public static final String SERIALIZED_NAME_ESTIMATE_DATE = "estimate_date";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_DATE)
  private LocalDate estimateDate;

  public static final String SERIALIZED_NAME_ESTIMATE_NUMBER = "estimate_number";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_NUMBER)
  private Integer estimateNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "source_data";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private Object sourceData = null;

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

  public Datum10() { 
  }

  public Datum10 address(String address) {
    
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


  public Datum10 amount(Float amount) {
    
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


  public Datum10 businessUid(String businessUid) {
    
    this.businessUid = businessUid;
    return this;
  }

   /**
   * Get businessUid
   * @return businessUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessUid() {
    return businessUid;
  }


  public void setBusinessUid(String businessUid) {
    this.businessUid = businessUid;
  }


  public Datum10 clientAddress(String clientAddress) {
    
    this.clientAddress = clientAddress;
    return this;
  }

   /**
   * Get clientAddress
   * @return clientAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientAddress() {
    return clientAddress;
  }


  public void setClientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
  }


  public Datum10 clientId(String clientId) {
    
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


  public Datum10 clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public Datum10 conversationId(String conversationId) {
    
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


  public Datum10 createdAt(OffsetDateTime createdAt) {
    
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


  public Datum10 currency(String currency) {
    
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


  public Datum10 dueDate(LocalDate dueDate) {
    
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


  public Datum10 estimateDate(LocalDate estimateDate) {
    
    this.estimateDate = estimateDate;
    return this;
  }

   /**
   * Get estimateDate
   * @return estimateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEstimateDate() {
    return estimateDate;
  }


  public void setEstimateDate(LocalDate estimateDate) {
    this.estimateDate = estimateDate;
  }


  public Datum10 estimateNumber(Integer estimateNumber) {
    
    this.estimateNumber = estimateNumber;
    return this;
  }

   /**
   * Get estimateNumber
   * @return estimateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEstimateNumber() {
    return estimateNumber;
  }


  public void setEstimateNumber(Integer estimateNumber) {
    this.estimateNumber = estimateNumber;
  }


  public Datum10 id(String id) {
    
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


  public Datum10 items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public Datum10 addItemsItem(Item itemsItem) {
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


  public Datum10 note(String note) {
    
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


  public Datum10 sourceData(Object sourceData) {
    
    this.sourceData = sourceData;
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSourceData() {
    return sourceData;
  }


  public void setSourceData(Object sourceData) {
    this.sourceData = sourceData;
  }


  public Datum10 staffId(String staffId) {
    
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


  public Datum10 status(String status) {
    
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


  public Datum10 title(String title) {
    
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


  public Datum10 updatedAt(OffsetDateTime updatedAt) {
    
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
    Datum10 datum10 = (Datum10) o;
    return Objects.equals(this.address, datum10.address) &&
        Objects.equals(this.amount, datum10.amount) &&
        Objects.equals(this.businessUid, datum10.businessUid) &&
        Objects.equals(this.clientAddress, datum10.clientAddress) &&
        Objects.equals(this.clientId, datum10.clientId) &&
        Objects.equals(this.clientName, datum10.clientName) &&
        Objects.equals(this.conversationId, datum10.conversationId) &&
        Objects.equals(this.createdAt, datum10.createdAt) &&
        Objects.equals(this.currency, datum10.currency) &&
        Objects.equals(this.dueDate, datum10.dueDate) &&
        Objects.equals(this.estimateDate, datum10.estimateDate) &&
        Objects.equals(this.estimateNumber, datum10.estimateNumber) &&
        Objects.equals(this.id, datum10.id) &&
        Objects.equals(this.items, datum10.items) &&
        Objects.equals(this.note, datum10.note) &&
        Objects.equals(this.sourceData, datum10.sourceData) &&
        Objects.equals(this.staffId, datum10.staffId) &&
        Objects.equals(this.status, datum10.status) &&
        Objects.equals(this.title, datum10.title) &&
        Objects.equals(this.updatedAt, datum10.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount, businessUid, clientAddress, clientId, clientName, conversationId, createdAt, currency, dueDate, estimateDate, estimateNumber, id, items, note, sourceData, staffId, status, title, updatedAt);
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
    sb.append("class Datum10 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    businessUid: ").append(toIndentedString(businessUid)).append("\n");
    sb.append("    clientAddress: ").append(toIndentedString(clientAddress)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    estimateDate: ").append(toIndentedString(estimateDate)).append("\n");
    sb.append("    estimateNumber: ").append(toIndentedString(estimateNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("business_uid");
    openapiFields.add("client_address");
    openapiFields.add("client_id");
    openapiFields.add("client_name");
    openapiFields.add("conversation_id");
    openapiFields.add("created_at");
    openapiFields.add("currency");
    openapiFields.add("due_date");
    openapiFields.add("estimate_date");
    openapiFields.add("estimate_number");
    openapiFields.add("id");
    openapiFields.add("items");
    openapiFields.add("note");
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
  * @throws IOException if the JSON Object is invalid with respect to Datum10
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Datum10.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datum10 is not found in the empty JSON string", Datum10.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Datum10.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datum10` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the optional field `items` (array)
      if (jsonArrayitems != null) {
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Item.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Datum10.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datum10' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datum10> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datum10.class));

       return (TypeAdapter<T>) new TypeAdapter<Datum10>() {
           @Override
           public void write(JsonWriter out, Datum10 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datum10 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datum10 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datum10
  * @throws IOException if the JSON string is invalid with respect to Datum10
  */
  public static Datum10 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datum10.class);
  }

 /**
  * Convert an instance of Datum10 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

