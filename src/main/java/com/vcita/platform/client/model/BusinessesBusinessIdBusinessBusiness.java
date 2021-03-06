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
 * BusinessesBusinessIdBusinessBusiness
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessesBusinessIdBusinessBusiness {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BUSINESS_CATEGORY = "business_category";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CATEGORY)
  private String businessCategory;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_HIDE_ADDRESS = "hide_address";
  @SerializedName(SERIALIZED_NAME_HIDE_ADDRESS)
  private Boolean hideAddress = true;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "short_description";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone = "Mountain Time (US & Canada)";

  public static final String SERIALIZED_NAME_WEBSITE_URL = "website_url";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public BusinessesBusinessIdBusinessBusiness() { 
  }

  public BusinessesBusinessIdBusinessBusiness address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * My Home Bellevue washington
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "My Home Bellevue washington")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public BusinessesBusinessIdBusinessBusiness businessCategory(String businessCategory) {
    
    this.businessCategory = businessCategory;
    return this;
  }

   /**
   * aeroclub
   * @return businessCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "aeroclub")

  public String getBusinessCategory() {
    return businessCategory;
  }


  public void setBusinessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
  }


  public BusinessesBusinessIdBusinessBusiness countryName(String countryName) {
    
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


  public BusinessesBusinessIdBusinessBusiness hideAddress(Boolean hideAddress) {
    
    this.hideAddress = hideAddress;
    return this;
  }

   /**
   * true
   * @return hideAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true")

  public Boolean getHideAddress() {
    return hideAddress;
  }


  public void setHideAddress(Boolean hideAddress) {
    this.hideAddress = hideAddress;
  }


  public BusinessesBusinessIdBusinessBusiness logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * https://c15101458.ssl.cf2.rackcdn.com/avatar/image/46/cay8ek2xzufnr39cbrc0nebw1tmy4v2z.png
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "https://c15101458.ssl.cf2.rackcdn.com/avatar/image/46/cay8ek2xzufnr39cbrc0nebw1tmy4v2z.png")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public BusinessesBusinessIdBusinessBusiness name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Business name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Business name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BusinessesBusinessIdBusinessBusiness phone(String phone) {
    
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


  public BusinessesBusinessIdBusinessBusiness shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * My business description
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "My business description")

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public BusinessesBusinessIdBusinessBusiness timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone name from https://api.rubyonrails.org/v4.2.3/classes/ActiveSupport/TimeZone.html, Default value is determined by the Directory
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time zone name from https://api.rubyonrails.org/v4.2.3/classes/ActiveSupport/TimeZone.html, Default value is determined by the Directory")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public BusinessesBusinessIdBusinessBusiness websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * www.mysite.com
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "www.mysite.com")

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessesBusinessIdBusinessBusiness businessesBusinessIdBusinessBusiness = (BusinessesBusinessIdBusinessBusiness) o;
    return Objects.equals(this.address, businessesBusinessIdBusinessBusiness.address) &&
        Objects.equals(this.businessCategory, businessesBusinessIdBusinessBusiness.businessCategory) &&
        Objects.equals(this.countryName, businessesBusinessIdBusinessBusiness.countryName) &&
        Objects.equals(this.hideAddress, businessesBusinessIdBusinessBusiness.hideAddress) &&
        Objects.equals(this.logoUrl, businessesBusinessIdBusinessBusiness.logoUrl) &&
        Objects.equals(this.name, businessesBusinessIdBusinessBusiness.name) &&
        Objects.equals(this.phone, businessesBusinessIdBusinessBusiness.phone) &&
        Objects.equals(this.shortDescription, businessesBusinessIdBusinessBusiness.shortDescription) &&
        Objects.equals(this.timeZone, businessesBusinessIdBusinessBusiness.timeZone) &&
        Objects.equals(this.websiteUrl, businessesBusinessIdBusinessBusiness.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, businessCategory, countryName, hideAddress, logoUrl, name, phone, shortDescription, timeZone, websiteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessesBusinessIdBusinessBusiness {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessCategory: ").append(toIndentedString(businessCategory)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    hideAddress: ").append(toIndentedString(hideAddress)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("business_category");
    openapiFields.add("country_name");
    openapiFields.add("hide_address");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("phone");
    openapiFields.add("short_description");
    openapiFields.add("time_zone");
    openapiFields.add("website_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessesBusinessIdBusinessBusiness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessesBusinessIdBusinessBusiness.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessesBusinessIdBusinessBusiness is not found in the empty JSON string", BusinessesBusinessIdBusinessBusiness.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessesBusinessIdBusinessBusiness.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessesBusinessIdBusinessBusiness` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessesBusinessIdBusinessBusiness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessesBusinessIdBusinessBusiness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessesBusinessIdBusinessBusiness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessesBusinessIdBusinessBusiness.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessesBusinessIdBusinessBusiness>() {
           @Override
           public void write(JsonWriter out, BusinessesBusinessIdBusinessBusiness value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessesBusinessIdBusinessBusiness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessesBusinessIdBusinessBusiness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessesBusinessIdBusinessBusiness
  * @throws IOException if the JSON string is invalid with respect to BusinessesBusinessIdBusinessBusiness
  */
  public static BusinessesBusinessIdBusinessBusiness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessesBusinessIdBusinessBusiness.class);
  }

 /**
  * Convert an instance of BusinessesBusinessIdBusinessBusiness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

