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
 * ClientsMergesPossibleMergeMasterGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClientsMergesPossibleMergeMasterGet200Response {
  public static final String SERIALIZED_NAME_MASTER_IDS = "master_ids";
  @SerializedName(SERIALIZED_NAME_MASTER_IDS)
  private List<String> masterIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ClientsMergesPossibleMergeMasterGet200Response() { 
  }

  public ClientsMergesPossibleMergeMasterGet200Response masterIds(List<String> masterIds) {
    
    this.masterIds = masterIds;
    return this;
  }

  public ClientsMergesPossibleMergeMasterGet200Response addMasterIdsItem(String masterIdsItem) {
    if (this.masterIds == null) {
      this.masterIds = new ArrayList<>();
    }
    this.masterIds.add(masterIdsItem);
    return this;
  }

   /**
   * Get masterIds
   * @return masterIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMasterIds() {
    return masterIds;
  }


  public void setMasterIds(List<String> masterIds) {
    this.masterIds = masterIds;
  }


  public ClientsMergesPossibleMergeMasterGet200Response status(String status) {
    
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
    ClientsMergesPossibleMergeMasterGet200Response clientsMergesPossibleMergeMasterGet200Response = (ClientsMergesPossibleMergeMasterGet200Response) o;
    return Objects.equals(this.masterIds, clientsMergesPossibleMergeMasterGet200Response.masterIds) &&
        Objects.equals(this.status, clientsMergesPossibleMergeMasterGet200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientsMergesPossibleMergeMasterGet200Response {\n");
    sb.append("    masterIds: ").append(toIndentedString(masterIds)).append("\n");
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
    openapiFields.add("master_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientsMergesPossibleMergeMasterGet200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ClientsMergesPossibleMergeMasterGet200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientsMergesPossibleMergeMasterGet200Response is not found in the empty JSON string", ClientsMergesPossibleMergeMasterGet200Response.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClientsMergesPossibleMergeMasterGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientsMergesPossibleMergeMasterGet200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientsMergesPossibleMergeMasterGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientsMergesPossibleMergeMasterGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientsMergesPossibleMergeMasterGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientsMergesPossibleMergeMasterGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientsMergesPossibleMergeMasterGet200Response>() {
           @Override
           public void write(JsonWriter out, ClientsMergesPossibleMergeMasterGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientsMergesPossibleMergeMasterGet200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientsMergesPossibleMergeMasterGet200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientsMergesPossibleMergeMasterGet200Response
  * @throws IOException if the JSON string is invalid with respect to ClientsMergesPossibleMergeMasterGet200Response
  */
  public static ClientsMergesPossibleMergeMasterGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientsMergesPossibleMergeMasterGet200Response.class);
  }

 /**
  * Convert an instance of ClientsMergesPossibleMergeMasterGet200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

