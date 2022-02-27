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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * CreditItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditItem {
  public static final String SERIALIZED_NAME_BOOKINGS_USAGE = "bookings_usage";
  @SerializedName(SERIALIZED_NAME_BOOKINGS_USAGE)
  private Integer bookingsUsage;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public CreditItem() { 
  }

  public CreditItem bookingsUsage(Integer bookingsUsage) {
    
    this.bookingsUsage = bookingsUsage;
    return this;
  }

   /**
   * Get bookingsUsage
   * @return bookingsUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBookingsUsage() {
    return bookingsUsage;
  }


  public void setBookingsUsage(Integer bookingsUsage) {
    this.bookingsUsage = bookingsUsage;
  }


  public CreditItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditItem itemType(String itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditItem creditItem = (CreditItem) o;
    return Objects.equals(this.bookingsUsage, creditItem.bookingsUsage) &&
        Objects.equals(this.itemId, creditItem.itemId) &&
        Objects.equals(this.itemType, creditItem.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingsUsage, itemId, itemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditItem {\n");
    sb.append("    bookingsUsage: ").append(toIndentedString(bookingsUsage)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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
    openapiFields.add("bookings_usage");
    openapiFields.add("item_id");
    openapiFields.add("item_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreditItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditItem is not found in the empty JSON string", CreditItem.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditItem>() {
           @Override
           public void write(JsonWriter out, CreditItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditItem
  * @throws IOException if the JSON string is invalid with respect to CreditItem
  */
  public static CreditItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditItem.class);
  }

 /**
  * Convert an instance of CreditItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

