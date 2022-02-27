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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * StaffSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StaffSettings {
  public static final String SERIALIZED_NAME_RANDOM_SELECTION = "random_selection";
  @SerializedName(SERIALIZED_NAME_RANDOM_SELECTION)
  private Boolean randomSelection;

  public static final String SERIALIZED_NAME_JOINT_AVAILABILITY = "joint_availability";
  @SerializedName(SERIALIZED_NAME_JOINT_AVAILABILITY)
  private Object jointAvailability = null;

  public StaffSettings() { 
  }

  public StaffSettings randomSelection(Boolean randomSelection) {
    
    this.randomSelection = randomSelection;
    return this;
  }

   /**
   * Get randomSelection
   * @return randomSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRandomSelection() {
    return randomSelection;
  }


  public void setRandomSelection(Boolean randomSelection) {
    this.randomSelection = randomSelection;
  }


  public StaffSettings jointAvailability(Object jointAvailability) {
    
    this.jointAvailability = jointAvailability;
    return this;
  }

   /**
   * Get jointAvailability
   * @return jointAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getJointAvailability() {
    return jointAvailability;
  }


  public void setJointAvailability(Object jointAvailability) {
    this.jointAvailability = jointAvailability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffSettings staffSettings = (StaffSettings) o;
    return Objects.equals(this.randomSelection, staffSettings.randomSelection) &&
        Objects.equals(this.jointAvailability, staffSettings.jointAvailability);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(randomSelection, jointAvailability);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffSettings {\n");
    sb.append("    randomSelection: ").append(toIndentedString(randomSelection)).append("\n");
    sb.append("    jointAvailability: ").append(toIndentedString(jointAvailability)).append("\n");
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
    openapiFields.add("random_selection");
    openapiFields.add("joint_availability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StaffSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StaffSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StaffSettings is not found in the empty JSON string", StaffSettings.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StaffSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StaffSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaffSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaffSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaffSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaffSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<StaffSettings>() {
           @Override
           public void write(JsonWriter out, StaffSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaffSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaffSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaffSettings
  * @throws IOException if the JSON string is invalid with respect to StaffSettings
  */
  public static StaffSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaffSettings.class);
  }

 /**
  * Convert an instance of StaffSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

