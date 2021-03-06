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
import com.vcita.platform.client.model.PaymentCardsSyncCardDatails;
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
 * InlineObject17
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject17 {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_DATAILS = "datails";
  @SerializedName(SERIALIZED_NAME_DATAILS)
  private List<PaymentCardsSyncCardDatails> datails = null;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_EXTERNAL_CARD_ID = "external_card_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CARD_ID)
  private String externalCardId;

  public InlineObject17() { 
  }

  public InlineObject17 clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * client_uid
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client_uid")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InlineObject17 customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The customer ID at the payment gateway
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer ID at the payment gateway")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public InlineObject17 datails(List<PaymentCardsSyncCardDatails> datails) {
    
    this.datails = datails;
    return this;
  }

  public InlineObject17 addDatailsItem(PaymentCardsSyncCardDatails datailsItem) {
    if (this.datails == null) {
      this.datails = new ArrayList<>();
    }
    this.datails.add(datailsItem);
    return this;
  }

   /**
   * Get datails
   * @return datails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentCardsSyncCardDatails> getDatails() {
    return datails;
  }


  public void setDatails(List<PaymentCardsSyncCardDatails> datails) {
    this.datails = datails;
  }


  public InlineObject17 _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * true/false. default: false (will be set to true if it is the client&#39;s first card)
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true/false. default: false (will be set to true if it is the client's first card)")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public InlineObject17 externalCardId(String externalCardId) {
    
    this.externalCardId = externalCardId;
    return this;
  }

   /**
   * card id
   * @return externalCardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "card id")

  public String getExternalCardId() {
    return externalCardId;
  }


  public void setExternalCardId(String externalCardId) {
    this.externalCardId = externalCardId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject17 inlineObject17 = (InlineObject17) o;
    return Objects.equals(this.clientId, inlineObject17.clientId) &&
        Objects.equals(this.customerId, inlineObject17.customerId) &&
        Objects.equals(this.datails, inlineObject17.datails) &&
        Objects.equals(this._default, inlineObject17._default) &&
        Objects.equals(this.externalCardId, inlineObject17.externalCardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, customerId, datails, _default, externalCardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject17 {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    datails: ").append(toIndentedString(datails)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    externalCardId: ").append(toIndentedString(externalCardId)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("customer_id");
    openapiFields.add("datails");
    openapiFields.add("default");
    openapiFields.add("external_card_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject17
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject17.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject17 is not found in the empty JSON string", InlineObject17.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject17.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject17` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydatails = jsonObj.getAsJsonArray("datails");
      // validate the optional field `datails` (array)
      if (jsonArraydatails != null) {
        for (int i = 0; i < jsonArraydatails.size(); i++) {
          PaymentCardsSyncCardDatails.validateJsonObject(jsonArraydatails.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject17.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject17' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject17> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject17.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject17>() {
           @Override
           public void write(JsonWriter out, InlineObject17 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject17 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject17 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject17
  * @throws IOException if the JSON string is invalid with respect to InlineObject17
  */
  public static InlineObject17 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject17.class);
  }

 /**
  * Convert an instance of InlineObject17 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

