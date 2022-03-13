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
import com.vcita.platform.client.model.Booking;
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
 * Data39
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Data39 {
  public static final String SERIALIZED_NAME_BOOKINGS = "bookings";
  @SerializedName(SERIALIZED_NAME_BOOKINGS)
  private List<Booking> bookings = null;

  public Data39() { 
  }

  public Data39 bookings(List<Booking> bookings) {
    
    this.bookings = bookings;
    return this;
  }

  public Data39 addBookingsItem(Booking bookingsItem) {
    if (this.bookings == null) {
      this.bookings = new ArrayList<>();
    }
    this.bookings.add(bookingsItem);
    return this;
  }

   /**
   * Get bookings
   * @return bookings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Booking> getBookings() {
    return bookings;
  }


  public void setBookings(List<Booking> bookings) {
    this.bookings = bookings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data39 data39 = (Data39) o;
    return Objects.equals(this.bookings, data39.bookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data39 {\n");
    sb.append("    bookings: ").append(toIndentedString(bookings)).append("\n");
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
    openapiFields.add("bookings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Data39
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Data39.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Data39 is not found in the empty JSON string", Data39.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Data39.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Data39` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraybookings = jsonObj.getAsJsonArray("bookings");
      // validate the optional field `bookings` (array)
      if (jsonArraybookings != null) {
        for (int i = 0; i < jsonArraybookings.size(); i++) {
          Booking.validateJsonObject(jsonArraybookings.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Data39.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Data39' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Data39> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Data39.class));

       return (TypeAdapter<T>) new TypeAdapter<Data39>() {
           @Override
           public void write(JsonWriter out, Data39 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Data39 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Data39 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Data39
  * @throws IOException if the JSON string is invalid with respect to Data39
  */
  public static Data39 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Data39.class);
  }

 /**
  * Convert an instance of Data39 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

