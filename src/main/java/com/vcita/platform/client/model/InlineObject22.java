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
import com.vcita.platform.client.model.PaymentSettingsPaymentSettings;
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
 * InlineObject22
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject22 {
  public static final String SERIALIZED_NAME_PAYMENT_SETTINGS = "payment_settings";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SETTINGS)
  private PaymentSettingsPaymentSettings paymentSettings;

  public InlineObject22() { 
  }

  public InlineObject22 paymentSettings(PaymentSettingsPaymentSettings paymentSettings) {
    
    this.paymentSettings = paymentSettings;
    return this;
  }

   /**
   * Get paymentSettings
   * @return paymentSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentSettingsPaymentSettings getPaymentSettings() {
    return paymentSettings;
  }


  public void setPaymentSettings(PaymentSettingsPaymentSettings paymentSettings) {
    this.paymentSettings = paymentSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject22 inlineObject22 = (InlineObject22) o;
    return Objects.equals(this.paymentSettings, inlineObject22.paymentSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject22 {\n");
    sb.append("    paymentSettings: ").append(toIndentedString(paymentSettings)).append("\n");
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
    openapiFields.add("payment_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject22
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject22.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject22 is not found in the empty JSON string", InlineObject22.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!InlineObject22.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject22` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `payment_settings`
      if (jsonObj.getAsJsonObject("payment_settings") != null) {
        PaymentSettingsPaymentSettings.validateJsonObject(jsonObj.getAsJsonObject("payment_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject22.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject22' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject22> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject22.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject22>() {
           @Override
           public void write(JsonWriter out, InlineObject22 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject22 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject22 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject22
  * @throws IOException if the JSON string is invalid with respect to InlineObject22
  */
  public static InlineObject22 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject22.class);
  }

 /**
  * Convert an instance of InlineObject22 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

