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
import com.vcita.platform.client.model.Cancellation;
import com.vcita.platform.client.model.Meetings;
import com.vcita.platform.client.model.Rescheduling;
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
 * Policies
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Policies {
  public static final String SERIALIZED_NAME_CANCELLATION = "cancellation";
  @SerializedName(SERIALIZED_NAME_CANCELLATION)
  private Cancellation cancellation;

  public static final String SERIALIZED_NAME_MEETINGS = "meetings";
  @SerializedName(SERIALIZED_NAME_MEETINGS)
  private Meetings meetings;

  public static final String SERIALIZED_NAME_RESCHEDULING = "rescheduling";
  @SerializedName(SERIALIZED_NAME_RESCHEDULING)
  private Rescheduling rescheduling;

  public Policies() { 
  }

  public Policies cancellation(Cancellation cancellation) {
    
    this.cancellation = cancellation;
    return this;
  }

   /**
   * Get cancellation
   * @return cancellation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cancellation getCancellation() {
    return cancellation;
  }


  public void setCancellation(Cancellation cancellation) {
    this.cancellation = cancellation;
  }


  public Policies meetings(Meetings meetings) {
    
    this.meetings = meetings;
    return this;
  }

   /**
   * Get meetings
   * @return meetings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Meetings getMeetings() {
    return meetings;
  }


  public void setMeetings(Meetings meetings) {
    this.meetings = meetings;
  }


  public Policies rescheduling(Rescheduling rescheduling) {
    
    this.rescheduling = rescheduling;
    return this;
  }

   /**
   * Get rescheduling
   * @return rescheduling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Rescheduling getRescheduling() {
    return rescheduling;
  }


  public void setRescheduling(Rescheduling rescheduling) {
    this.rescheduling = rescheduling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policies policies = (Policies) o;
    return Objects.equals(this.cancellation, policies.cancellation) &&
        Objects.equals(this.meetings, policies.meetings) &&
        Objects.equals(this.rescheduling, policies.rescheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellation, meetings, rescheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policies {\n");
    sb.append("    cancellation: ").append(toIndentedString(cancellation)).append("\n");
    sb.append("    meetings: ").append(toIndentedString(meetings)).append("\n");
    sb.append("    rescheduling: ").append(toIndentedString(rescheduling)).append("\n");
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
    openapiFields.add("cancellation");
    openapiFields.add("meetings");
    openapiFields.add("rescheduling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Policies
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Policies.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policies is not found in the empty JSON string", Policies.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Policies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policies` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cancellation`
      if (jsonObj.getAsJsonObject("cancellation") != null) {
        Cancellation.validateJsonObject(jsonObj.getAsJsonObject("cancellation"));
      }
      // validate the optional field `meetings`
      if (jsonObj.getAsJsonObject("meetings") != null) {
        Meetings.validateJsonObject(jsonObj.getAsJsonObject("meetings"));
      }
      // validate the optional field `rescheduling`
      if (jsonObj.getAsJsonObject("rescheduling") != null) {
        Rescheduling.validateJsonObject(jsonObj.getAsJsonObject("rescheduling"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policies.class));

       return (TypeAdapter<T>) new TypeAdapter<Policies>() {
           @Override
           public void write(JsonWriter out, Policies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policies read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policies given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policies
  * @throws IOException if the JSON string is invalid with respect to Policies
  */
  public static Policies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policies.class);
  }

 /**
  * Convert an instance of Policies to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

