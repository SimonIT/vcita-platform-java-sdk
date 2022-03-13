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
import com.vcita.platform.client.model.Data9;
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
 * BusinessesBusinessIdWizardsWizardNamePut200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessesBusinessIdWizardsWizardNamePut200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Data9 data;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public BusinessesBusinessIdWizardsWizardNamePut200Response() { 
  }

  public BusinessesBusinessIdWizardsWizardNamePut200Response data(Data9 data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Data9 getData() {
    return data;
  }


  public void setData(Data9 data) {
    this.data = data;
  }


  public BusinessesBusinessIdWizardsWizardNamePut200Response success(Boolean success) {
    
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
    BusinessesBusinessIdWizardsWizardNamePut200Response businessesBusinessIdWizardsWizardNamePut200Response = (BusinessesBusinessIdWizardsWizardNamePut200Response) o;
    return Objects.equals(this.data, businessesBusinessIdWizardsWizardNamePut200Response.data) &&
        Objects.equals(this.success, businessesBusinessIdWizardsWizardNamePut200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessesBusinessIdWizardsWizardNamePut200Response {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to BusinessesBusinessIdWizardsWizardNamePut200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessesBusinessIdWizardsWizardNamePut200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessesBusinessIdWizardsWizardNamePut200Response is not found in the empty JSON string", BusinessesBusinessIdWizardsWizardNamePut200Response.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessesBusinessIdWizardsWizardNamePut200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessesBusinessIdWizardsWizardNamePut200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        Data9.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessesBusinessIdWizardsWizardNamePut200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessesBusinessIdWizardsWizardNamePut200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessesBusinessIdWizardsWizardNamePut200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessesBusinessIdWizardsWizardNamePut200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessesBusinessIdWizardsWizardNamePut200Response>() {
           @Override
           public void write(JsonWriter out, BusinessesBusinessIdWizardsWizardNamePut200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessesBusinessIdWizardsWizardNamePut200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessesBusinessIdWizardsWizardNamePut200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessesBusinessIdWizardsWizardNamePut200Response
  * @throws IOException if the JSON string is invalid with respect to BusinessesBusinessIdWizardsWizardNamePut200Response
  */
  public static BusinessesBusinessIdWizardsWizardNamePut200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessesBusinessIdWizardsWizardNamePut200Response.class);
  }

 /**
  * Convert an instance of BusinessesBusinessIdWizardsWizardNamePut200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

