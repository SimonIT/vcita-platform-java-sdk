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
import java.time.OffsetDateTime;
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
 * Assignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Assignment {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Integer appId;

  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private Integer businessId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DIRECTORY_ID = "directory_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_ID)
  private Integer directoryId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_INTERNAL = "is_internal";
  @SerializedName(SERIALIZED_NAME_IS_INTERNAL)
  private Boolean isInternal;

  public static final String SERIALIZED_NAME_PRE_INSTALLED = "pre_installed";
  @SerializedName(SERIALIZED_NAME_PRE_INSTALLED)
  private Boolean preInstalled;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Assignment() { 
  }

  public Assignment appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAppId() {
    return appId;
  }


  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public Assignment businessId(Integer businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBusinessId() {
    return businessId;
  }


  public void setBusinessId(Integer businessId) {
    this.businessId = businessId;
  }


  public Assignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Assignment directoryId(Integer directoryId) {
    
    this.directoryId = directoryId;
    return this;
  }

   /**
   * Get directoryId
   * @return directoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDirectoryId() {
    return directoryId;
  }


  public void setDirectoryId(Integer directoryId) {
    this.directoryId = directoryId;
  }


  public Assignment id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Assignment isInternal(Boolean isInternal) {
    
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInternal() {
    return isInternal;
  }


  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  public Assignment preInstalled(Boolean preInstalled) {
    
    this.preInstalled = preInstalled;
    return this;
  }

   /**
   * Get preInstalled
   * @return preInstalled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPreInstalled() {
    return preInstalled;
  }


  public void setPreInstalled(Boolean preInstalled) {
    this.preInstalled = preInstalled;
  }


  public Assignment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assignment assignment = (Assignment) o;
    return Objects.equals(this.appId, assignment.appId) &&
        Objects.equals(this.businessId, assignment.businessId) &&
        Objects.equals(this.createdAt, assignment.createdAt) &&
        Objects.equals(this.directoryId, assignment.directoryId) &&
        Objects.equals(this.id, assignment.id) &&
        Objects.equals(this.isInternal, assignment.isInternal) &&
        Objects.equals(this.preInstalled, assignment.preInstalled) &&
        Objects.equals(this.updatedAt, assignment.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, businessId, createdAt, directoryId, id, isInternal, preInstalled, updatedAt);
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
    sb.append("class Assignment {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    preInstalled: ").append(toIndentedString(preInstalled)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("business_id");
    openapiFields.add("created_at");
    openapiFields.add("directory_id");
    openapiFields.add("id");
    openapiFields.add("is_internal");
    openapiFields.add("pre_installed");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Assignment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Assignment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assignment is not found in the empty JSON string", Assignment.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Assignment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assignment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assignment.class));

       return (TypeAdapter<T>) new TypeAdapter<Assignment>() {
           @Override
           public void write(JsonWriter out, Assignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assignment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assignment
  * @throws IOException if the JSON string is invalid with respect to Assignment
  */
  public static Assignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assignment.class);
  }

 /**
  * Convert an instance of Assignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

