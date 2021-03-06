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
import com.vcita.platform.client.model.AppsMenuItemsSubitems;
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
 * Configuration for the left sidebar menu
 */
@ApiModel(description = "Configuration for the left sidebar menu")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppsMenuItems {
  public static final String SERIALIZED_NAME_SUBITEMS = "subitems";
  @SerializedName(SERIALIZED_NAME_SUBITEMS)
  private List<AppsMenuItemsSubitems> subitems = null;

  public AppsMenuItems() { 
  }

  public AppsMenuItems subitems(List<AppsMenuItemsSubitems> subitems) {
    
    this.subitems = subitems;
    return this;
  }

  public AppsMenuItems addSubitemsItem(AppsMenuItemsSubitems subitemsItem) {
    if (this.subitems == null) {
      this.subitems = new ArrayList<>();
    }
    this.subitems.add(subitemsItem);
    return this;
  }

   /**
   * Items array
   * @return subitems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items array")

  public List<AppsMenuItemsSubitems> getSubitems() {
    return subitems;
  }


  public void setSubitems(List<AppsMenuItemsSubitems> subitems) {
    this.subitems = subitems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsMenuItems appsMenuItems = (AppsMenuItems) o;
    return Objects.equals(this.subitems, appsMenuItems.subitems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subitems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsMenuItems {\n");
    sb.append("    subitems: ").append(toIndentedString(subitems)).append("\n");
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
    openapiFields.add("subitems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppsMenuItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppsMenuItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppsMenuItems is not found in the empty JSON string", AppsMenuItems.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppsMenuItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppsMenuItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysubitems = jsonObj.getAsJsonArray("subitems");
      // validate the optional field `subitems` (array)
      if (jsonArraysubitems != null) {
        for (int i = 0; i < jsonArraysubitems.size(); i++) {
          AppsMenuItemsSubitems.validateJsonObject(jsonArraysubitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppsMenuItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppsMenuItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppsMenuItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppsMenuItems.class));

       return (TypeAdapter<T>) new TypeAdapter<AppsMenuItems>() {
           @Override
           public void write(JsonWriter out, AppsMenuItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppsMenuItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppsMenuItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppsMenuItems
  * @throws IOException if the JSON string is invalid with respect to AppsMenuItems
  */
  public static AppsMenuItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppsMenuItems.class);
  }

 /**
  * Convert an instance of AppsMenuItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

