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
import com.vcita.platform.client.model.Service;
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
 * Item1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Item1 {
  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<Service> services = null;

  public static final String SERIALIZED_NAME_TOTAL_BOOKINGS = "total_bookings";
  @SerializedName(SERIALIZED_NAME_TOTAL_BOOKINGS)
  private String totalBookings;

  public Item1() { 
  }

  public Item1 services(List<Service> services) {
    
    this.services = services;
    return this;
  }

  public Item1 addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Service> getServices() {
    return services;
  }


  public void setServices(List<Service> services) {
    this.services = services;
  }


  public Item1 totalBookings(String totalBookings) {
    
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
    Item1 item1 = (Item1) o;
    return Objects.equals(this.services, item1.services) &&
        Objects.equals(this.totalBookings, item1.totalBookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, totalBookings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item1 {\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
    openapiFields.add("services");
    openapiFields.add("total_bookings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Item1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Item1.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Item1 is not found in the empty JSON string", Item1.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Item1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Item1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayservices = jsonObj.getAsJsonArray("services");
      // validate the optional field `services` (array)
      if (jsonArrayservices != null) {
        for (int i = 0; i < jsonArrayservices.size(); i++) {
          Service.validateJsonObject(jsonArrayservices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Item1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Item1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Item1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Item1.class));

       return (TypeAdapter<T>) new TypeAdapter<Item1>() {
           @Override
           public void write(JsonWriter out, Item1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Item1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Item1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Item1
  * @throws IOException if the JSON string is invalid with respect to Item1
  */
  public static Item1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Item1.class);
  }

 /**
  * Convert an instance of Item1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

