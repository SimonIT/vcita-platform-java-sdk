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
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * BookingRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BookingRestriction {
  public static final String SERIALIZED_NAME_IS_CLIENT_RESTRICTED = "is_client_restricted";
  @SerializedName(SERIALIZED_NAME_IS_CLIENT_RESTRICTED)
  private Boolean isClientRestricted;

  public static final String SERIALIZED_NAME_RESTRICTED_CLIENT_STATUSES = "restricted_client_statuses";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_CLIENT_STATUSES)
  private List<String> restrictedClientStatuses = null;

  public static final String SERIALIZED_NAME_RESTRICTION_RULE_TEXT = "restriction_rule_text";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_RULE_TEXT)
  private String restrictionRuleText;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public BookingRestriction() { 
  }

  public BookingRestriction isClientRestricted(Boolean isClientRestricted) {
    
    this.isClientRestricted = isClientRestricted;
    return this;
  }

   /**
   * Get isClientRestricted
   * @return isClientRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsClientRestricted() {
    return isClientRestricted;
  }


  public void setIsClientRestricted(Boolean isClientRestricted) {
    this.isClientRestricted = isClientRestricted;
  }


  public BookingRestriction restrictedClientStatuses(List<String> restrictedClientStatuses) {
    
    this.restrictedClientStatuses = restrictedClientStatuses;
    return this;
  }

  public BookingRestriction addRestrictedClientStatusesItem(String restrictedClientStatusesItem) {
    if (this.restrictedClientStatuses == null) {
      this.restrictedClientStatuses = new ArrayList<>();
    }
    this.restrictedClientStatuses.add(restrictedClientStatusesItem);
    return this;
  }

   /**
   * Get restrictedClientStatuses
   * @return restrictedClientStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRestrictedClientStatuses() {
    return restrictedClientStatuses;
  }


  public void setRestrictedClientStatuses(List<String> restrictedClientStatuses) {
    this.restrictedClientStatuses = restrictedClientStatuses;
  }


  public BookingRestriction restrictionRuleText(String restrictionRuleText) {
    
    this.restrictionRuleText = restrictionRuleText;
    return this;
  }

   /**
   * Get restrictionRuleText
   * @return restrictionRuleText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRestrictionRuleText() {
    return restrictionRuleText;
  }


  public void setRestrictionRuleText(String restrictionRuleText) {
    this.restrictionRuleText = restrictionRuleText;
  }


  public BookingRestriction uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingRestriction bookingRestriction = (BookingRestriction) o;
    return Objects.equals(this.isClientRestricted, bookingRestriction.isClientRestricted) &&
        Objects.equals(this.restrictedClientStatuses, bookingRestriction.restrictedClientStatuses) &&
        Objects.equals(this.restrictionRuleText, bookingRestriction.restrictionRuleText) &&
        Objects.equals(this.uid, bookingRestriction.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isClientRestricted, restrictedClientStatuses, restrictionRuleText, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRestriction {\n");
    sb.append("    isClientRestricted: ").append(toIndentedString(isClientRestricted)).append("\n");
    sb.append("    restrictedClientStatuses: ").append(toIndentedString(restrictedClientStatuses)).append("\n");
    sb.append("    restrictionRuleText: ").append(toIndentedString(restrictionRuleText)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("is_client_restricted");
    openapiFields.add("restricted_client_statuses");
    openapiFields.add("restriction_rule_text");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BookingRestriction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BookingRestriction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookingRestriction is not found in the empty JSON string", BookingRestriction.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!BookingRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookingRestriction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookingRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookingRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookingRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookingRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<BookingRestriction>() {
           @Override
           public void write(JsonWriter out, BookingRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookingRestriction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookingRestriction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookingRestriction
  * @throws IOException if the JSON string is invalid with respect to BookingRestriction
  */
  public static BookingRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookingRestriction.class);
  }

 /**
  * Convert an instance of BookingRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

