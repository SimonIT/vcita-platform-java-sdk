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
 * InlineObject9
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject9 {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD1 = "custom_field1";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD1)
  private String customField1;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD2 = "custom_field2";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD2)
  private String customField2;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD3 = "custom_field3";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD3)
  private String customField3;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public InlineObject9() { 
  }

  public InlineObject9 address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public InlineObject9 customField1(String customField1) {
    
    this.customField1 = customField1;
    return this;
  }

   /**
   * Custom Field 1
   * @return customField1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom Field 1")

  public String getCustomField1() {
    return customField1;
  }


  public void setCustomField1(String customField1) {
    this.customField1 = customField1;
  }


  public InlineObject9 customField2(String customField2) {
    
    this.customField2 = customField2;
    return this;
  }

   /**
   * Custom Field 2
   * @return customField2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom Field 2")

  public String getCustomField2() {
    return customField2;
  }


  public void setCustomField2(String customField2) {
    this.customField2 = customField2;
  }


  public InlineObject9 customField3(String customField3) {
    
    this.customField3 = customField3;
    return this;
  }

   /**
   * Custom Field 3
   * @return customField3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom Field 3")

  public String getCustomField3() {
    return customField3;
  }


  public void setCustomField3(String customField3) {
    this.customField3 = customField3;
  }


  public InlineObject9 email(String email) {
    
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


  public InlineObject9 firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First Name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public InlineObject9 lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public InlineObject9 phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone Number
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone Number")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InlineObject9 staffId(String staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Staff ID
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Staff ID")

  public String getStaffId() {
    return staffId;
  }


  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }


  public InlineObject9 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Use a client status to categorize clients according to their relationship with your business
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use a client status to categorize clients according to their relationship with your business")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public InlineObject9 tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * The tag system is based on customized labels that you create, so you can sort your data using personalized words, phrases or themes that are meaningful to you and your business
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tag system is based on customized labels that you create, so you can sort your data using personalized words, phrases or themes that are meaningful to you and your business")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject9 inlineObject9 = (InlineObject9) o;
    return Objects.equals(this.address, inlineObject9.address) &&
        Objects.equals(this.customField1, inlineObject9.customField1) &&
        Objects.equals(this.customField2, inlineObject9.customField2) &&
        Objects.equals(this.customField3, inlineObject9.customField3) &&
        Objects.equals(this.email, inlineObject9.email) &&
        Objects.equals(this.firstName, inlineObject9.firstName) &&
        Objects.equals(this.lastName, inlineObject9.lastName) &&
        Objects.equals(this.phone, inlineObject9.phone) &&
        Objects.equals(this.staffId, inlineObject9.staffId) &&
        Objects.equals(this.status, inlineObject9.status) &&
        Objects.equals(this.tags, inlineObject9.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, customField1, customField2, customField3, email, firstName, lastName, phone, staffId, status, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject9 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("custom_field1");
    openapiFields.add("custom_field2");
    openapiFields.add("custom_field3");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("phone");
    openapiFields.add("staff_id");
    openapiFields.add("status");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject9
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject9.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject9 is not found in the empty JSON string", InlineObject9.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject9.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject9` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject9.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject9' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject9> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject9.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject9>() {
           @Override
           public void write(JsonWriter out, InlineObject9 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject9 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject9 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject9
  * @throws IOException if the JSON string is invalid with respect to InlineObject9
  */
  public static InlineObject9 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject9.class);
  }

 /**
  * Convert an instance of InlineObject9 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

