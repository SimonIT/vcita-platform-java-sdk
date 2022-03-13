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
 * BusinessesBusinessIdBusinessAdminAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessesBusinessIdBusinessAdminAccount {
  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language = "en";

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public BusinessesBusinessIdBusinessAdminAccount() { 
  }

  public BusinessesBusinessIdBusinessAdminAccount countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * United States
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "United States")

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public BusinessesBusinessIdBusinessAdminAccount displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Admin display name
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin display name")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BusinessesBusinessIdBusinessAdminAccount email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email Address
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email Address")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public BusinessesBusinessIdBusinessAdminAccount firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * FName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FName")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public BusinessesBusinessIdBusinessAdminAccount language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * one of en,es,fr,it,pt,de,pl,nl,en-GB,he,keys,pseudo  - Default value is determined by the Directory
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "one of en,es,fr,it,pt,de,pl,nl,en-GB,he,keys,pseudo  - Default value is determined by the Directory")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public BusinessesBusinessIdBusinessAdminAccount lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * LName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LName")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public BusinessesBusinessIdBusinessAdminAccount phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 52525252
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "52525252")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessesBusinessIdBusinessAdminAccount businessesBusinessIdBusinessAdminAccount = (BusinessesBusinessIdBusinessAdminAccount) o;
    return Objects.equals(this.countryName, businessesBusinessIdBusinessAdminAccount.countryName) &&
        Objects.equals(this.displayName, businessesBusinessIdBusinessAdminAccount.displayName) &&
        Objects.equals(this.email, businessesBusinessIdBusinessAdminAccount.email) &&
        Objects.equals(this.firstName, businessesBusinessIdBusinessAdminAccount.firstName) &&
        Objects.equals(this.language, businessesBusinessIdBusinessAdminAccount.language) &&
        Objects.equals(this.lastName, businessesBusinessIdBusinessAdminAccount.lastName) &&
        Objects.equals(this.phone, businessesBusinessIdBusinessAdminAccount.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, displayName, email, firstName, language, lastName, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessesBusinessIdBusinessAdminAccount {\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("country_name");
    openapiFields.add("display_name");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("language");
    openapiFields.add("last_name");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessesBusinessIdBusinessAdminAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessesBusinessIdBusinessAdminAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessesBusinessIdBusinessAdminAccount is not found in the empty JSON string", BusinessesBusinessIdBusinessAdminAccount.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessesBusinessIdBusinessAdminAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessesBusinessIdBusinessAdminAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessesBusinessIdBusinessAdminAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessesBusinessIdBusinessAdminAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessesBusinessIdBusinessAdminAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessesBusinessIdBusinessAdminAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessesBusinessIdBusinessAdminAccount>() {
           @Override
           public void write(JsonWriter out, BusinessesBusinessIdBusinessAdminAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessesBusinessIdBusinessAdminAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessesBusinessIdBusinessAdminAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessesBusinessIdBusinessAdminAccount
  * @throws IOException if the JSON string is invalid with respect to BusinessesBusinessIdBusinessAdminAccount
  */
  public static BusinessesBusinessIdBusinessAdminAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessesBusinessIdBusinessAdminAccount.class);
  }

 /**
  * Convert an instance of BusinessesBusinessIdBusinessAdminAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

