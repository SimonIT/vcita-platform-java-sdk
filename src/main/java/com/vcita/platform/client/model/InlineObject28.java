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
import java.util.Map.Entry;
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * InlineObject28
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject28 {
  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private String businessId;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_EVENT_INSTANCE_ID = "event_instance_id";
  @SerializedName(SERIALIZED_NAME_EVENT_INSTANCE_ID)
  private String eventInstanceId;

  public static final String SERIALIZED_NAME_MATTER_UID = "matter_uid";
  @SerializedName(SERIALIZED_NAME_MATTER_UID)
  private String matterUid;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "source_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public InlineObject28() { 
  }

  public InlineObject28 businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Business Uid
   * @return businessId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Business Uid")

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public InlineObject28 channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Source Channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source Channel")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public InlineObject28 clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Client Uid
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client Uid")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InlineObject28 eventInstanceId(String eventInstanceId) {
    
    this.eventInstanceId = eventInstanceId;
    return this;
  }

   /**
   * Event instance uid. Required for event.
   * @return eventInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event instance uid. Required for event.")

  public String getEventInstanceId() {
    return eventInstanceId;
  }


  public void setEventInstanceId(String eventInstanceId) {
    this.eventInstanceId = eventInstanceId;
  }


  public InlineObject28 matterUid(String matterUid) {
    
    this.matterUid = matterUid;
    return this;
  }

   /**
   * Matter Uid
   * @return matterUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Matter Uid")

  public String getMatterUid() {
    return matterUid;
  }


  public void setMatterUid(String matterUid) {
    this.matterUid = matterUid;
  }


  public InlineObject28 sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Source Name
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source Name")

  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public InlineObject28 sourceUrl(String sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Source URL
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source URL")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public InlineObject28 timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * translation missing: en.waitlist-controller.parameters.time_zone.description
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "translation missing: en.waitlist-controller.parameters.time_zone.description")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject28 inlineObject28 = (InlineObject28) o;
    return Objects.equals(this.businessId, inlineObject28.businessId) &&
        Objects.equals(this.channel, inlineObject28.channel) &&
        Objects.equals(this.clientId, inlineObject28.clientId) &&
        Objects.equals(this.eventInstanceId, inlineObject28.eventInstanceId) &&
        Objects.equals(this.matterUid, inlineObject28.matterUid) &&
        Objects.equals(this.sourceName, inlineObject28.sourceName) &&
        Objects.equals(this.sourceUrl, inlineObject28.sourceUrl) &&
        Objects.equals(this.timeZone, inlineObject28.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, channel, clientId, eventInstanceId, matterUid, sourceName, sourceUrl, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject28 {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    eventInstanceId: ").append(toIndentedString(eventInstanceId)).append("\n");
    sb.append("    matterUid: ").append(toIndentedString(matterUid)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("business_id");
    openapiFields.add("channel");
    openapiFields.add("client_id");
    openapiFields.add("event_instance_id");
    openapiFields.add("matter_uid");
    openapiFields.add("source_name");
    openapiFields.add("source_url");
    openapiFields.add("time_zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("business_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject28
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject28.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject28 is not found in the empty JSON string", InlineObject28.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject28.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject28` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InlineObject28.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject28.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject28' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject28> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject28.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject28>() {
           @Override
           public void write(JsonWriter out, InlineObject28 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject28 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject28 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject28
  * @throws IOException if the JSON string is invalid with respect to InlineObject28
  */
  public static InlineObject28 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject28.class);
  }

 /**
  * Convert an instance of InlineObject28 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

