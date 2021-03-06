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
 * PaymentSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentSettings {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billing_address";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Object billingAddress = null;

  public static final String SERIALIZED_NAME_BRAINTREE_MERCHANT_ID = "braintree_merchant_id";
  @SerializedName(SERIALIZED_NAME_BRAINTREE_MERCHANT_ID)
  private Object braintreeMerchantId = null;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EWALLET_TYPE = "ewallet_type";
  @SerializedName(SERIALIZED_NAME_EWALLET_TYPE)
  private String ewalletType;

  public static final String SERIALIZED_NAME_PARTIAL_PAYMENTS_ENABLED = "partial_payments_enabled";
  @SerializedName(SERIALIZED_NAME_PARTIAL_PAYMENTS_ENABLED)
  private Boolean partialPaymentsEnabled;

  public static final String SERIALIZED_NAME_PAYMENTS_ENABLED = "payments_enabled";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_ENABLED)
  private Boolean paymentsEnabled;

  public static final String SERIALIZED_NAME_PAYMENTS_GATEWAY_TYPE = "payments_gateway_type";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_GATEWAY_TYPE)
  private String paymentsGatewayType;

  public static final String SERIALIZED_NAME_PAYPAL_EMAIL = "paypal_email";
  @SerializedName(SERIALIZED_NAME_PAYPAL_EMAIL)
  private String paypalEmail;

  public static final String SERIALIZED_NAME_SQUARE_LOCATION_CURRENCY = "square_location_currency";
  @SerializedName(SERIALIZED_NAME_SQUARE_LOCATION_CURRENCY)
  private Object squareLocationCurrency = null;

  public static final String SERIALIZED_NAME_SQUARE_LOCATION_ID = "square_location_id";
  @SerializedName(SERIALIZED_NAME_SQUARE_LOCATION_ID)
  private Object squareLocationId = null;

  public static final String SERIALIZED_NAME_SQUARE_LOCATION_NAME = "square_location_name";
  @SerializedName(SERIALIZED_NAME_SQUARE_LOCATION_NAME)
  private Object squareLocationName = null;

  public static final String SERIALIZED_NAME_STRIPE_ACCESS_TOKEN = "stripe_access_token";
  @SerializedName(SERIALIZED_NAME_STRIPE_ACCESS_TOKEN)
  private Object stripeAccessToken = null;

  public static final String SERIALIZED_NAME_STRIPE_USER_ID = "stripe_user_id";
  @SerializedName(SERIALIZED_NAME_STRIPE_USER_ID)
  private Object stripeUserId = null;

  public PaymentSettings() { 
  }

  public PaymentSettings billingAddress(Object billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Object billingAddress) {
    this.billingAddress = billingAddress;
  }


  public PaymentSettings braintreeMerchantId(Object braintreeMerchantId) {
    
    this.braintreeMerchantId = braintreeMerchantId;
    return this;
  }

   /**
   * Get braintreeMerchantId
   * @return braintreeMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBraintreeMerchantId() {
    return braintreeMerchantId;
  }


  public void setBraintreeMerchantId(Object braintreeMerchantId) {
    this.braintreeMerchantId = braintreeMerchantId;
  }


  public PaymentSettings currency(String currency) {
    
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


  public PaymentSettings ewalletType(String ewalletType) {
    
    this.ewalletType = ewalletType;
    return this;
  }

   /**
   * Get ewalletType
   * @return ewalletType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEwalletType() {
    return ewalletType;
  }


  public void setEwalletType(String ewalletType) {
    this.ewalletType = ewalletType;
  }


  public PaymentSettings partialPaymentsEnabled(Boolean partialPaymentsEnabled) {
    
    this.partialPaymentsEnabled = partialPaymentsEnabled;
    return this;
  }

   /**
   * Get partialPaymentsEnabled
   * @return partialPaymentsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPartialPaymentsEnabled() {
    return partialPaymentsEnabled;
  }


  public void setPartialPaymentsEnabled(Boolean partialPaymentsEnabled) {
    this.partialPaymentsEnabled = partialPaymentsEnabled;
  }


  public PaymentSettings paymentsEnabled(Boolean paymentsEnabled) {
    
    this.paymentsEnabled = paymentsEnabled;
    return this;
  }

   /**
   * Get paymentsEnabled
   * @return paymentsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPaymentsEnabled() {
    return paymentsEnabled;
  }


  public void setPaymentsEnabled(Boolean paymentsEnabled) {
    this.paymentsEnabled = paymentsEnabled;
  }


  public PaymentSettings paymentsGatewayType(String paymentsGatewayType) {
    
    this.paymentsGatewayType = paymentsGatewayType;
    return this;
  }

   /**
   * Get paymentsGatewayType
   * @return paymentsGatewayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentsGatewayType() {
    return paymentsGatewayType;
  }


  public void setPaymentsGatewayType(String paymentsGatewayType) {
    this.paymentsGatewayType = paymentsGatewayType;
  }


  public PaymentSettings paypalEmail(String paypalEmail) {
    
    this.paypalEmail = paypalEmail;
    return this;
  }

   /**
   * Get paypalEmail
   * @return paypalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaypalEmail() {
    return paypalEmail;
  }


  public void setPaypalEmail(String paypalEmail) {
    this.paypalEmail = paypalEmail;
  }


  public PaymentSettings squareLocationCurrency(Object squareLocationCurrency) {
    
    this.squareLocationCurrency = squareLocationCurrency;
    return this;
  }

   /**
   * Get squareLocationCurrency
   * @return squareLocationCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSquareLocationCurrency() {
    return squareLocationCurrency;
  }


  public void setSquareLocationCurrency(Object squareLocationCurrency) {
    this.squareLocationCurrency = squareLocationCurrency;
  }


  public PaymentSettings squareLocationId(Object squareLocationId) {
    
    this.squareLocationId = squareLocationId;
    return this;
  }

   /**
   * Get squareLocationId
   * @return squareLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSquareLocationId() {
    return squareLocationId;
  }


  public void setSquareLocationId(Object squareLocationId) {
    this.squareLocationId = squareLocationId;
  }


  public PaymentSettings squareLocationName(Object squareLocationName) {
    
    this.squareLocationName = squareLocationName;
    return this;
  }

   /**
   * Get squareLocationName
   * @return squareLocationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSquareLocationName() {
    return squareLocationName;
  }


  public void setSquareLocationName(Object squareLocationName) {
    this.squareLocationName = squareLocationName;
  }


  public PaymentSettings stripeAccessToken(Object stripeAccessToken) {
    
    this.stripeAccessToken = stripeAccessToken;
    return this;
  }

   /**
   * Get stripeAccessToken
   * @return stripeAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStripeAccessToken() {
    return stripeAccessToken;
  }


  public void setStripeAccessToken(Object stripeAccessToken) {
    this.stripeAccessToken = stripeAccessToken;
  }


  public PaymentSettings stripeUserId(Object stripeUserId) {
    
    this.stripeUserId = stripeUserId;
    return this;
  }

   /**
   * Get stripeUserId
   * @return stripeUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStripeUserId() {
    return stripeUserId;
  }


  public void setStripeUserId(Object stripeUserId) {
    this.stripeUserId = stripeUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettings paymentSettings = (PaymentSettings) o;
    return Objects.equals(this.billingAddress, paymentSettings.billingAddress) &&
        Objects.equals(this.braintreeMerchantId, paymentSettings.braintreeMerchantId) &&
        Objects.equals(this.currency, paymentSettings.currency) &&
        Objects.equals(this.ewalletType, paymentSettings.ewalletType) &&
        Objects.equals(this.partialPaymentsEnabled, paymentSettings.partialPaymentsEnabled) &&
        Objects.equals(this.paymentsEnabled, paymentSettings.paymentsEnabled) &&
        Objects.equals(this.paymentsGatewayType, paymentSettings.paymentsGatewayType) &&
        Objects.equals(this.paypalEmail, paymentSettings.paypalEmail) &&
        Objects.equals(this.squareLocationCurrency, paymentSettings.squareLocationCurrency) &&
        Objects.equals(this.squareLocationId, paymentSettings.squareLocationId) &&
        Objects.equals(this.squareLocationName, paymentSettings.squareLocationName) &&
        Objects.equals(this.stripeAccessToken, paymentSettings.stripeAccessToken) &&
        Objects.equals(this.stripeUserId, paymentSettings.stripeUserId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, braintreeMerchantId, currency, ewalletType, partialPaymentsEnabled, paymentsEnabled, paymentsGatewayType, paypalEmail, squareLocationCurrency, squareLocationId, squareLocationName, stripeAccessToken, stripeUserId);
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
    sb.append("class PaymentSettings {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    braintreeMerchantId: ").append(toIndentedString(braintreeMerchantId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ewalletType: ").append(toIndentedString(ewalletType)).append("\n");
    sb.append("    partialPaymentsEnabled: ").append(toIndentedString(partialPaymentsEnabled)).append("\n");
    sb.append("    paymentsEnabled: ").append(toIndentedString(paymentsEnabled)).append("\n");
    sb.append("    paymentsGatewayType: ").append(toIndentedString(paymentsGatewayType)).append("\n");
    sb.append("    paypalEmail: ").append(toIndentedString(paypalEmail)).append("\n");
    sb.append("    squareLocationCurrency: ").append(toIndentedString(squareLocationCurrency)).append("\n");
    sb.append("    squareLocationId: ").append(toIndentedString(squareLocationId)).append("\n");
    sb.append("    squareLocationName: ").append(toIndentedString(squareLocationName)).append("\n");
    sb.append("    stripeAccessToken: ").append(toIndentedString(stripeAccessToken)).append("\n");
    sb.append("    stripeUserId: ").append(toIndentedString(stripeUserId)).append("\n");
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
    openapiFields.add("billing_address");
    openapiFields.add("braintree_merchant_id");
    openapiFields.add("currency");
    openapiFields.add("ewallet_type");
    openapiFields.add("partial_payments_enabled");
    openapiFields.add("payments_enabled");
    openapiFields.add("payments_gateway_type");
    openapiFields.add("paypal_email");
    openapiFields.add("square_location_currency");
    openapiFields.add("square_location_id");
    openapiFields.add("square_location_name");
    openapiFields.add("stripe_access_token");
    openapiFields.add("stripe_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSettings is not found in the empty JSON string", PaymentSettings.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSettings>() {
           @Override
           public void write(JsonWriter out, PaymentSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSettings
  * @throws IOException if the JSON string is invalid with respect to PaymentSettings
  */
  public static PaymentSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSettings.class);
  }

 /**
  * Convert an instance of PaymentSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

