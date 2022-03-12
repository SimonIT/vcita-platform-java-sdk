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
 * InlineResponse200Subscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Subscriptions {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl;

  public InlineResponse200Subscriptions() { 
  }

  public InlineResponse200Subscriptions entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public InlineResponse200Subscriptions eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public InlineResponse200Subscriptions id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public InlineResponse200Subscriptions targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Subscriptions inlineResponse200Subscriptions = (InlineResponse200Subscriptions) o;
    return Objects.equals(this.entity, inlineResponse200Subscriptions.entity) &&
        Objects.equals(this.eventType, inlineResponse200Subscriptions.eventType) &&
        Objects.equals(this.id, inlineResponse200Subscriptions.id) &&
        Objects.equals(this.targetUrl, inlineResponse200Subscriptions.targetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, eventType, id, targetUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Subscriptions {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("event_type");
    openapiFields.add("id");
    openapiFields.add("target_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineResponse200Subscriptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineResponse200Subscriptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineResponse200Subscriptions is not found in the empty JSON string", InlineResponse200Subscriptions.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!InlineResponse200Subscriptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineResponse200Subscriptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineResponse200Subscriptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineResponse200Subscriptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineResponse200Subscriptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineResponse200Subscriptions.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineResponse200Subscriptions>() {
           @Override
           public void write(JsonWriter out, InlineResponse200Subscriptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineResponse200Subscriptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineResponse200Subscriptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineResponse200Subscriptions
  * @throws IOException if the JSON string is invalid with respect to InlineResponse200Subscriptions
  */
  public static InlineResponse200Subscriptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineResponse200Subscriptions.class);
  }

 /**
  * Convert an instance of InlineResponse200Subscriptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

