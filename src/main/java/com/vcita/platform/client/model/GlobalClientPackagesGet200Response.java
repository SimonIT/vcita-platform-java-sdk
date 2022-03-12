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
import com.vcita.platform.client.model.Datum7;
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
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * GlobalClientPackagesGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlobalClientPackagesGet200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Datum7> data = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public GlobalClientPackagesGet200Response() { 
  }

  public GlobalClientPackagesGet200Response data(List<Datum7> data) {
    
    this.data = data;
    return this;
  }

  public GlobalClientPackagesGet200Response addDataItem(Datum7 dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Datum7> getData() {
    return data;
  }


  public void setData(List<Datum7> data) {
    this.data = data;
  }


  public GlobalClientPackagesGet200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalClientPackagesGet200Response globalClientPackagesGet200Response = (GlobalClientPackagesGet200Response) o;
    return Objects.equals(this.data, globalClientPackagesGet200Response.data) &&
        Objects.equals(this.success, globalClientPackagesGet200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalClientPackagesGet200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GlobalClientPackagesGet200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GlobalClientPackagesGet200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalClientPackagesGet200Response is not found in the empty JSON string", GlobalClientPackagesGet200Response.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalClientPackagesGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalClientPackagesGet200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the optional field `data` (array)
      if (jsonArraydata != null) {
        for (int i = 0; i < jsonArraydata.size(); i++) {
          Datum7.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalClientPackagesGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalClientPackagesGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalClientPackagesGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalClientPackagesGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalClientPackagesGet200Response>() {
           @Override
           public void write(JsonWriter out, GlobalClientPackagesGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalClientPackagesGet200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GlobalClientPackagesGet200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GlobalClientPackagesGet200Response
  * @throws IOException if the JSON string is invalid with respect to GlobalClientPackagesGet200Response
  */
  public static GlobalClientPackagesGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalClientPackagesGet200Response.class);
  }

 /**
  * Convert an instance of GlobalClientPackagesGet200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

