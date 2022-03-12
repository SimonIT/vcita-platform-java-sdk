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
 * InlineObject30
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject30 {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private String businessId;

  public static final String SERIALIZED_NAME_DIRECTORY_ID = "directory_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_ID)
  private String directoryId;

  public InlineObject30() { 
  }

  public InlineObject30 appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * A unique identifier for a 3rd party application. 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for a 3rd party application. ")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public InlineObject30 businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * A unique identifier for a business.
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for a business.")

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public InlineObject30 directoryId(String directoryId) {
    
    this.directoryId = directoryId;
    return this;
  }

   /**
   * A unique identifier for a partner.
   * @return directoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for a partner.")

  public String getDirectoryId() {
    return directoryId;
  }


  public void setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject30 inlineObject30 = (InlineObject30) o;
    return Objects.equals(this.appId, inlineObject30.appId) &&
        Objects.equals(this.businessId, inlineObject30.businessId) &&
        Objects.equals(this.directoryId, inlineObject30.directoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, businessId, directoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject30 {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("business_id");
    openapiFields.add("directory_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject30
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject30.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject30 is not found in the empty JSON string", InlineObject30.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!InlineObject30.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject30` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject30.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject30' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject30> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject30.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject30>() {
           @Override
           public void write(JsonWriter out, InlineObject30 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject30 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject30 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject30
  * @throws IOException if the JSON string is invalid with respect to InlineObject30
  */
  public static InlineObject30 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject30.class);
  }

 /**
  * Convert an instance of InlineObject30 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

