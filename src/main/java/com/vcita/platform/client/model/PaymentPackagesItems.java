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
import com.vcita.platform.client.model.PaymentPackagesServices;
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
 * PaymentPackagesItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentPackagesItems {
  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<PaymentPackagesServices> services = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_BOOKINGS = "total_bookings";
  @SerializedName(SERIALIZED_NAME_TOTAL_BOOKINGS)
  private BigDecimal totalBookings;

  public PaymentPackagesItems() { 
  }

  public PaymentPackagesItems services(List<PaymentPackagesServices> services) {
    
    this.services = services;
    return this;
  }

  public PaymentPackagesItems addServicesItem(PaymentPackagesServices servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PaymentPackagesServices> getServices() {
    return services;
  }


  public void setServices(List<PaymentPackagesServices> services) {
    this.services = services;
  }


  public PaymentPackagesItems totalBookings(BigDecimal totalBookings) {
    
    this.totalBookings = totalBookings;
    return this;
  }

   /**
   * Usage number allowed for specific item within the package
   * @return totalBookings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usage number allowed for specific item within the package")

  public BigDecimal getTotalBookings() {
    return totalBookings;
  }


  public void setTotalBookings(BigDecimal totalBookings) {
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
    PaymentPackagesItems paymentPackagesItems = (PaymentPackagesItems) o;
    return Objects.equals(this.services, paymentPackagesItems.services) &&
        Objects.equals(this.totalBookings, paymentPackagesItems.totalBookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, totalBookings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPackagesItems {\n");
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
    openapiRequiredFields.add("services");
    openapiRequiredFields.add("total_bookings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentPackagesItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentPackagesItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentPackagesItems is not found in the empty JSON string", PaymentPackagesItems.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentPackagesItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentPackagesItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentPackagesItems.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayservices = jsonObj.getAsJsonArray("services");
      // validate the optional field `services` (array)
      if (jsonArrayservices != null) {
        for (int i = 0; i < jsonArrayservices.size(); i++) {
          PaymentPackagesServices.validateJsonObject(jsonArrayservices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentPackagesItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentPackagesItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentPackagesItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentPackagesItems.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentPackagesItems>() {
           @Override
           public void write(JsonWriter out, PaymentPackagesItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentPackagesItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentPackagesItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentPackagesItems
  * @throws IOException if the JSON string is invalid with respect to PaymentPackagesItems
  */
  public static PaymentPackagesItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentPackagesItems.class);
  }

 /**
  * Convert an instance of PaymentPackagesItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

