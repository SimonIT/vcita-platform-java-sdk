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
import com.vcita.platform.client.model.Data14;
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
 * ClientsPaymentClientPackagesUpdateUsagePost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClientsPaymentClientPackagesUpdateUsagePost200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Data14 data;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ClientsPaymentClientPackagesUpdateUsagePost200Response() { 
  }

  public ClientsPaymentClientPackagesUpdateUsagePost200Response data(Data14 data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Data14 getData() {
    return data;
  }


  public void setData(Data14 data) {
    this.data = data;
  }


  public ClientsPaymentClientPackagesUpdateUsagePost200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientsPaymentClientPackagesUpdateUsagePost200Response clientsPaymentClientPackagesUpdateUsagePost200Response = (ClientsPaymentClientPackagesUpdateUsagePost200Response) o;
    return Objects.equals(this.data, clientsPaymentClientPackagesUpdateUsagePost200Response.data) &&
        Objects.equals(this.status, clientsPaymentClientPackagesUpdateUsagePost200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientsPaymentClientPackagesUpdateUsagePost200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientsPaymentClientPackagesUpdateUsagePost200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ClientsPaymentClientPackagesUpdateUsagePost200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientsPaymentClientPackagesUpdateUsagePost200Response is not found in the empty JSON string", ClientsPaymentClientPackagesUpdateUsagePost200Response.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClientsPaymentClientPackagesUpdateUsagePost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientsPaymentClientPackagesUpdateUsagePost200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        Data14.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientsPaymentClientPackagesUpdateUsagePost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientsPaymentClientPackagesUpdateUsagePost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientsPaymentClientPackagesUpdateUsagePost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientsPaymentClientPackagesUpdateUsagePost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientsPaymentClientPackagesUpdateUsagePost200Response>() {
           @Override
           public void write(JsonWriter out, ClientsPaymentClientPackagesUpdateUsagePost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientsPaymentClientPackagesUpdateUsagePost200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientsPaymentClientPackagesUpdateUsagePost200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientsPaymentClientPackagesUpdateUsagePost200Response
  * @throws IOException if the JSON string is invalid with respect to ClientsPaymentClientPackagesUpdateUsagePost200Response
  */
  public static ClientsPaymentClientPackagesUpdateUsagePost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientsPaymentClientPackagesUpdateUsagePost200Response.class);
  }

 /**
  * Convert an instance of ClientsPaymentClientPackagesUpdateUsagePost200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

