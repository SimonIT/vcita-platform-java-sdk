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
import com.vcita.platform.client.model.Availability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Data47
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Data47 {
  public static final String SERIALIZED_NAME_AVAILABILITIES = "availabilities";
  @SerializedName(SERIALIZED_NAME_AVAILABILITIES)
  private Map<String, List<Availability>> availabilities = null;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public Data47() { 
  }

  public Data47 availabilities(Map<String, List<Availability>> availabilities) {
    
    this.availabilities = availabilities;
    return this;
  }

  public Data47 putAvailabilitiesItem(String key, List<Availability> availabilitiesItem) {
    if (this.availabilities == null) {
      this.availabilities = new HashMap<>();
    }
    this.availabilities.put(key, availabilitiesItem);
    return this;
  }

   /**
   * Get availabilities
   * @return availabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<Availability>> getAvailabilities() {
    return availabilities;
  }


  public void setAvailabilities(Map<String, List<Availability>> availabilities) {
    this.availabilities = availabilities;
  }


  public Data47 timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    Data47 data47 = (Data47) o;
    return Objects.equals(this.availabilities, data47.availabilities) &&
        Objects.equals(this.timeZone, data47.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilities, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data47 {\n");
    sb.append("    availabilities: ").append(toIndentedString(availabilities)).append("\n");
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
    openapiFields.add("availabilities");
    openapiFields.add("time_zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Data47
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Data47.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Data47 is not found in the empty JSON string", Data47.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Data47.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Data47` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Data47.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Data47' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Data47> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Data47.class));

       return (TypeAdapter<T>) new TypeAdapter<Data47>() {
           @Override
           public void write(JsonWriter out, Data47 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Data47 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Data47 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Data47
  * @throws IOException if the JSON string is invalid with respect to Data47
  */
  public static Data47 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Data47.class);
  }

 /**
  * Convert an instance of Data47 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

