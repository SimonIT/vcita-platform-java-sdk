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
 * Datum9
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Datum9 {
  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private String businessId;

  public static final String SERIALIZED_NAME_BUSINESS_UNREAD = "business_unread";
  @SerializedName(SERIALIZED_NAME_BUSINESS_UNREAD)
  private Boolean businessUnread;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_UNREAD = "client_unread";
  @SerializedName(SERIALIZED_NAME_CLIENT_UNREAD)
  private Boolean clientUnread;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DEEP_LINK = "deep_link";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK)
  private String deepLink;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_BUSINESS_ACTION = "last_business_action";
  @SerializedName(SERIALIZED_NAME_LAST_BUSINESS_ACTION)
  private String lastBusinessAction;

  public static final String SERIALIZED_NAME_LAST_CLIENT_ACTION = "last_client_action";
  @SerializedName(SERIALIZED_NAME_LAST_CLIENT_ACTION)
  private Object lastClientAction = null;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private Object title = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Datum9() { 
  }

  public Datum9 businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public Datum9 businessUnread(Boolean businessUnread) {
    
    this.businessUnread = businessUnread;
    return this;
  }

   /**
   * Get businessUnread
   * @return businessUnread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBusinessUnread() {
    return businessUnread;
  }


  public void setBusinessUnread(Boolean businessUnread) {
    this.businessUnread = businessUnread;
  }


  public Datum9 clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Datum9 clientUnread(Boolean clientUnread) {
    
    this.clientUnread = clientUnread;
    return this;
  }

   /**
   * Get clientUnread
   * @return clientUnread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClientUnread() {
    return clientUnread;
  }


  public void setClientUnread(Boolean clientUnread) {
    this.clientUnread = clientUnread;
  }


  public Datum9 createdAt(OffsetDateTime createdAt) {
    
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


  public Datum9 deepLink(String deepLink) {
    
    this.deepLink = deepLink;
    return this;
  }

   /**
   * Get deepLink
   * @return deepLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeepLink() {
    return deepLink;
  }


  public void setDeepLink(String deepLink) {
    this.deepLink = deepLink;
  }


  public Datum9 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Datum9 lastBusinessAction(String lastBusinessAction) {
    
    this.lastBusinessAction = lastBusinessAction;
    return this;
  }

   /**
   * Get lastBusinessAction
   * @return lastBusinessAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastBusinessAction() {
    return lastBusinessAction;
  }


  public void setLastBusinessAction(String lastBusinessAction) {
    this.lastBusinessAction = lastBusinessAction;
  }


  public Datum9 lastClientAction(Object lastClientAction) {
    
    this.lastClientAction = lastClientAction;
    return this;
  }

   /**
   * Get lastClientAction
   * @return lastClientAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLastClientAction() {
    return lastClientAction;
  }


  public void setLastClientAction(Object lastClientAction) {
    this.lastClientAction = lastClientAction;
  }


  public Datum9 staffId(String staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStaffId() {
    return staffId;
  }


  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }


  public Datum9 title(Object title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTitle() {
    return title;
  }


  public void setTitle(Object title) {
    this.title = title;
  }


  public Datum9 updatedAt(OffsetDateTime updatedAt) {
    
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
    Datum9 datum9 = (Datum9) o;
    return Objects.equals(this.businessId, datum9.businessId) &&
        Objects.equals(this.businessUnread, datum9.businessUnread) &&
        Objects.equals(this.clientId, datum9.clientId) &&
        Objects.equals(this.clientUnread, datum9.clientUnread) &&
        Objects.equals(this.createdAt, datum9.createdAt) &&
        Objects.equals(this.deepLink, datum9.deepLink) &&
        Objects.equals(this.id, datum9.id) &&
        Objects.equals(this.lastBusinessAction, datum9.lastBusinessAction) &&
        Objects.equals(this.lastClientAction, datum9.lastClientAction) &&
        Objects.equals(this.staffId, datum9.staffId) &&
        Objects.equals(this.title, datum9.title) &&
        Objects.equals(this.updatedAt, datum9.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, businessUnread, clientId, clientUnread, createdAt, deepLink, id, lastBusinessAction, lastClientAction, staffId, title, updatedAt);
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
    sb.append("class Datum9 {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    businessUnread: ").append(toIndentedString(businessUnread)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientUnread: ").append(toIndentedString(clientUnread)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastBusinessAction: ").append(toIndentedString(lastBusinessAction)).append("\n");
    sb.append("    lastClientAction: ").append(toIndentedString(lastClientAction)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("business_id");
    openapiFields.add("business_unread");
    openapiFields.add("client_id");
    openapiFields.add("client_unread");
    openapiFields.add("created_at");
    openapiFields.add("deep_link");
    openapiFields.add("id");
    openapiFields.add("last_business_action");
    openapiFields.add("last_client_action");
    openapiFields.add("staff_id");
    openapiFields.add("title");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Datum9
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Datum9.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datum9 is not found in the empty JSON string", Datum9.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Datum9.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datum9` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Datum9.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datum9' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datum9> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datum9.class));

       return (TypeAdapter<T>) new TypeAdapter<Datum9>() {
           @Override
           public void write(JsonWriter out, Datum9 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datum9 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datum9 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datum9
  * @throws IOException if the JSON string is invalid with respect to Datum9
  */
  public static Datum9 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datum9.class);
  }

 /**
  * Convert an instance of Datum9 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

