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
import com.vcita.platform.client.model.PaymentStatus;
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
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * Data34
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Data34 {
  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private PaymentStatus paymentStatus;

  public Data34() { 
  }

  public Data34 paymentStatus(PaymentStatus paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data34 data34 = (Data34) o;
    return Objects.equals(this.paymentStatus, data34.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data34 {\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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
    openapiFields.add("payment_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Data34
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Data34.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Data34 is not found in the empty JSON string", Data34.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!Data34.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Data34` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `payment_status`
      if (jsonObj.getAsJsonObject("payment_status") != null) {
        PaymentStatus.validateJsonObject(jsonObj.getAsJsonObject("payment_status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Data34.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Data34' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Data34> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Data34.class));

       return (TypeAdapter<T>) new TypeAdapter<Data34>() {
           @Override
           public void write(JsonWriter out, Data34 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Data34 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Data34 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Data34
  * @throws IOException if the JSON string is invalid with respect to Data34
  */
  public static Data34 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Data34.class);
  }

 /**
  * Convert an instance of Data34 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

