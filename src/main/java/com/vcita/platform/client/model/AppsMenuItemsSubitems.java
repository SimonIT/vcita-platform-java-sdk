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
import com.vcita.platform.client.model.AppsMenuItemsItemName;
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
 * AppsMenuItemsSubitems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppsMenuItemsSubitems {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private AppsMenuItemsItemName itemName;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public AppsMenuItemsSubitems() { 
  }

  public AppsMenuItemsSubitems category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Section of the left menu in which the item will appear.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Section of the left menu in which the item will appear.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public AppsMenuItemsSubitems itemName(AppsMenuItemsItemName itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppsMenuItemsItemName getItemName() {
    return itemName;
  }


  public void setItemName(AppsMenuItemsItemName itemName) {
    this.itemName = itemName;
  }


  public AppsMenuItemsSubitems permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public AppsMenuItemsSubitems addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permissions to control who can view this menu item. Available permissions: [\&quot;can_access_listings_management\&quot;, \&quot;can_access_soci\&quot;, \&quot;can_access_online_presence\&quot;, \&quot;can_access_clients\&quot;, \&quot;can_use_reports\&quot;, \&quot;can_view_payments\&quot;, \&quot;can_view_documents\&quot;]
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permissions to control who can view this menu item. Available permissions: [\"can_access_listings_management\", \"can_access_soci\", \"can_access_online_presence\", \"can_access_clients\", \"can_use_reports\", \"can_view_payments\", \"can_view_documents\"]")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public AppsMenuItemsSubitems route(String route) {
    
    this.route = route;
    return this;
  }

   /**
   * Suffix route relative to the app domain.
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suffix route relative to the app domain.")

  public String getRoute() {
    return route;
  }


  public void setRoute(String route) {
    this.route = route;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsMenuItemsSubitems appsMenuItemsSubitems = (AppsMenuItemsSubitems) o;
    return Objects.equals(this.category, appsMenuItemsSubitems.category) &&
        Objects.equals(this.itemName, appsMenuItemsSubitems.itemName) &&
        Objects.equals(this.permissions, appsMenuItemsSubitems.permissions) &&
        Objects.equals(this.route, appsMenuItemsSubitems.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, itemName, permissions, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsMenuItemsSubitems {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("item_name");
    openapiFields.add("permissions");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppsMenuItemsSubitems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppsMenuItemsSubitems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppsMenuItemsSubitems is not found in the empty JSON string", AppsMenuItemsSubitems.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppsMenuItemsSubitems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppsMenuItemsSubitems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `item_name`
      if (jsonObj.getAsJsonObject("item_name") != null) {
        AppsMenuItemsItemName.validateJsonObject(jsonObj.getAsJsonObject("item_name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppsMenuItemsSubitems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppsMenuItemsSubitems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppsMenuItemsSubitems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppsMenuItemsSubitems.class));

       return (TypeAdapter<T>) new TypeAdapter<AppsMenuItemsSubitems>() {
           @Override
           public void write(JsonWriter out, AppsMenuItemsSubitems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppsMenuItemsSubitems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppsMenuItemsSubitems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppsMenuItemsSubitems
  * @throws IOException if the JSON string is invalid with respect to AppsMenuItemsSubitems
  */
  public static AppsMenuItemsSubitems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppsMenuItemsSubitems.class);
  }

 /**
  * Convert an instance of AppsMenuItemsSubitems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

