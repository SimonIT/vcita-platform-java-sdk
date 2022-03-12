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
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * PaymentSettingsPaymentSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentSettingsPaymentSettings {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EWALLET_TYPE = "ewallet_type";
  @SerializedName(SERIALIZED_NAME_EWALLET_TYPE)
  private String ewalletType;

  public static final String SERIALIZED_NAME_PAYPAL_EMAIL = "paypal_email";
  @SerializedName(SERIALIZED_NAME_PAYPAL_EMAIL)
  private String paypalEmail;

  public PaymentSettingsPaymentSettings() { 
  }

  public PaymentSettingsPaymentSettings currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * 3 Character Currency Code (PLN,GBP,EUR,USD,CSK,JPY,RUB)
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "3 Character Currency Code (PLN,GBP,EUR,USD,CSK,JPY,RUB)")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaymentSettingsPaymentSettings ewalletType(String ewalletType) {
    
    this.ewalletType = ewalletType;
    return this;
  }

   /**
   * eWallet Type (valid: \&quot;paypal\&quot;)
   * @return ewalletType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "eWallet Type (valid: \"paypal\")")

  public String getEwalletType() {
    return ewalletType;
  }


  public void setEwalletType(String ewalletType) {
    this.ewalletType = ewalletType;
  }


  public PaymentSettingsPaymentSettings paypalEmail(String paypalEmail) {
    
    this.paypalEmail = paypalEmail;
    return this;
  }

   /**
   * Paypal Payment Email
   * @return paypalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paypal Payment Email")

  public String getPaypalEmail() {
    return paypalEmail;
  }


  public void setPaypalEmail(String paypalEmail) {
    this.paypalEmail = paypalEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettingsPaymentSettings paymentSettingsPaymentSettings = (PaymentSettingsPaymentSettings) o;
    return Objects.equals(this.currency, paymentSettingsPaymentSettings.currency) &&
        Objects.equals(this.ewalletType, paymentSettingsPaymentSettings.ewalletType) &&
        Objects.equals(this.paypalEmail, paymentSettingsPaymentSettings.paypalEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, ewalletType, paypalEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettingsPaymentSettings {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ewalletType: ").append(toIndentedString(ewalletType)).append("\n");
    sb.append("    paypalEmail: ").append(toIndentedString(paypalEmail)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("ewallet_type");
    openapiFields.add("paypal_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentSettingsPaymentSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentSettingsPaymentSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSettingsPaymentSettings is not found in the empty JSON string", PaymentSettingsPaymentSettings.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentSettingsPaymentSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentSettingsPaymentSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSettingsPaymentSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSettingsPaymentSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSettingsPaymentSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSettingsPaymentSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSettingsPaymentSettings>() {
           @Override
           public void write(JsonWriter out, PaymentSettingsPaymentSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentSettingsPaymentSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentSettingsPaymentSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSettingsPaymentSettings
  * @throws IOException if the JSON string is invalid with respect to PaymentSettingsPaymentSettings
  */
  public static PaymentSettingsPaymentSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSettingsPaymentSettings.class);
  }

 /**
  * Convert an instance of PaymentSettingsPaymentSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

