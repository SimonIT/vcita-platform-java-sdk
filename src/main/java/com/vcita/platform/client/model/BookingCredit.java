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
import com.vcita.platform.client.model.CreditItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * BookingCredit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BookingCredit {
  public static final String SERIALIZED_NAME_BOOKINGS_USAGE = "bookings_usage";
  @SerializedName(SERIALIZED_NAME_BOOKINGS_USAGE)
  private String bookingsUsage;

  public static final String SERIALIZED_NAME_CREDIT_ITEMS = "credit_items";
  @SerializedName(SERIALIZED_NAME_CREDIT_ITEMS)
  private List<CreditItem> creditItems = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TOTAL_BOOKINGS = "total_bookings";
  @SerializedName(SERIALIZED_NAME_TOTAL_BOOKINGS)
  private String totalBookings;

  public BookingCredit() { 
  }

  public BookingCredit bookingsUsage(String bookingsUsage) {
    
    this.bookingsUsage = bookingsUsage;
    return this;
  }

   /**
   * Get bookingsUsage
   * @return bookingsUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBookingsUsage() {
    return bookingsUsage;
  }


  public void setBookingsUsage(String bookingsUsage) {
    this.bookingsUsage = bookingsUsage;
  }


  public BookingCredit creditItems(List<CreditItem> creditItems) {
    
    this.creditItems = creditItems;
    return this;
  }

  public BookingCredit addCreditItemsItem(CreditItem creditItemsItem) {
    if (this.creditItems == null) {
      this.creditItems = new ArrayList<>();
    }
    this.creditItems.add(creditItemsItem);
    return this;
  }

   /**
   * Get creditItems
   * @return creditItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CreditItem> getCreditItems() {
    return creditItems;
  }


  public void setCreditItems(List<CreditItem> creditItems) {
    this.creditItems = creditItems;
  }


  public BookingCredit id(String id) {
    
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


  public BookingCredit totalBookings(String totalBookings) {
    
    this.totalBookings = totalBookings;
    return this;
  }

   /**
   * Get totalBookings
   * @return totalBookings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalBookings() {
    return totalBookings;
  }


  public void setTotalBookings(String totalBookings) {
    this.totalBookings = totalBookings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingCredit bookingCredit = (BookingCredit) o;
    return Objects.equals(this.bookingsUsage, bookingCredit.bookingsUsage) &&
        Objects.equals(this.creditItems, bookingCredit.creditItems) &&
        Objects.equals(this.id, bookingCredit.id) &&
        Objects.equals(this.totalBookings, bookingCredit.totalBookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingsUsage, creditItems, id, totalBookings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCredit {\n");
    sb.append("    bookingsUsage: ").append(toIndentedString(bookingsUsage)).append("\n");
    sb.append("    creditItems: ").append(toIndentedString(creditItems)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    totalBookings: ").append(toIndentedString(totalBookings)).append("\n");
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
    openapiFields.add("credit_items");
    openapiFields.add("id");
    openapiFields.add("total_bookings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BookingCredit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BookingCredit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookingCredit is not found in the empty JSON string", BookingCredit.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BookingCredit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookingCredit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycreditItems = jsonObj.getAsJsonArray("credit_items");
      // validate the optional field `credit_items` (array)
      if (jsonArraycreditItems != null) {
        for (int i = 0; i < jsonArraycreditItems.size(); i++) {
          CreditItem.validateJsonObject(jsonArraycreditItems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookingCredit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookingCredit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookingCredit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookingCredit.class));

       return (TypeAdapter<T>) new TypeAdapter<BookingCredit>() {
           @Override
           public void write(JsonWriter out, BookingCredit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookingCredit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookingCredit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookingCredit
  * @throws IOException if the JSON string is invalid with respect to BookingCredit
  */
  public static BookingCredit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookingCredit.class);
  }

 /**
  * Convert an instance of BookingCredit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

