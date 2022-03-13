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
import com.vcita.platform.client.model.AdminAccount;
import com.vcita.platform.client.model.Business;
import com.vcita.platform.client.model.Integrations;
import com.vcita.platform.client.model.Meta;
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
 * Business1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Business1 {
  public static final String SERIALIZED_NAME_ADMIN_ACCOUNT = "admin_account";
  @SerializedName(SERIALIZED_NAME_ADMIN_ACCOUNT)
  private AdminAccount adminAccount;

  public static final String SERIALIZED_NAME_BUSINESS = "business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private Business business;

  public static final String SERIALIZED_NAME_INTEGRATIONS = "integrations";
  @SerializedName(SERIALIZED_NAME_INTEGRATIONS)
  private Integrations integrations;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta;

  public Business1() { 
  }

  public Business1 adminAccount(AdminAccount adminAccount) {
    
    this.adminAccount = adminAccount;
    return this;
  }

   /**
   * Get adminAccount
   * @return adminAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminAccount getAdminAccount() {
    return adminAccount;
  }


  public void setAdminAccount(AdminAccount adminAccount) {
    this.adminAccount = adminAccount;
  }


  public Business1 business(Business business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Business getBusiness() {
    return business;
  }


  public void setBusiness(Business business) {
    this.business = business;
  }


  public Business1 integrations(Integrations integrations) {
    
    this.integrations = integrations;
    return this;
  }

   /**
   * Get integrations
   * @return integrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integrations getIntegrations() {
    return integrations;
  }


  public void setIntegrations(Integrations integrations) {
    this.integrations = integrations;
  }


  public Business1 meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Business1 business1 = (Business1) o;
    return Objects.equals(this.adminAccount, business1.adminAccount) &&
        Objects.equals(this.business, business1.business) &&
        Objects.equals(this.integrations, business1.integrations) &&
        Objects.equals(this.meta, business1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccount, business, integrations, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business1 {\n");
    sb.append("    adminAccount: ").append(toIndentedString(adminAccount)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("admin_account");
    openapiFields.add("business");
    openapiFields.add("integrations");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Business1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Business1.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Business1 is not found in the empty JSON string", Business1.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Business1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Business1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `admin_account`
      if (jsonObj.getAsJsonObject("admin_account") != null) {
        AdminAccount.validateJsonObject(jsonObj.getAsJsonObject("admin_account"));
      }
      // validate the optional field `business`
      if (jsonObj.getAsJsonObject("business") != null) {
        Business.validateJsonObject(jsonObj.getAsJsonObject("business"));
      }
      // validate the optional field `integrations`
      if (jsonObj.getAsJsonObject("integrations") != null) {
        Integrations.validateJsonObject(jsonObj.getAsJsonObject("integrations"));
      }
      // validate the optional field `meta`
      if (jsonObj.getAsJsonObject("meta") != null) {
        Meta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Business1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Business1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Business1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Business1.class));

       return (TypeAdapter<T>) new TypeAdapter<Business1>() {
           @Override
           public void write(JsonWriter out, Business1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Business1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Business1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Business1
  * @throws IOException if the JSON string is invalid with respect to Business1
  */
  public static Business1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Business1.class);
  }

 /**
  * Convert an instance of Business1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

