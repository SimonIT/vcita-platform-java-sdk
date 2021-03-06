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
import com.vcita.platform.client.model.AppData1;
import com.vcita.platform.client.model.Error;
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
 * AppsIdInstallAppPost422Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppsIdInstallAppPost422Response {
  public static final String SERIALIZED_NAME_APP_DATA = "app_data";
  @SerializedName(SERIALIZED_NAME_APP_DATA)
  private AppData1 appData;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public AppsIdInstallAppPost422Response() { 
  }

  public AppsIdInstallAppPost422Response appData(AppData1 appData) {
    
    this.appData = appData;
    return this;
  }

   /**
   * Get appData
   * @return appData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppData1 getAppData() {
    return appData;
  }


  public void setAppData(AppData1 appData) {
    this.appData = appData;
  }


  public AppsIdInstallAppPost422Response errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AppsIdInstallAppPost422Response addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public AppsIdInstallAppPost422Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsIdInstallAppPost422Response appsIdInstallAppPost422Response = (AppsIdInstallAppPost422Response) o;
    return Objects.equals(this.appData, appsIdInstallAppPost422Response.appData) &&
        Objects.equals(this.errors, appsIdInstallAppPost422Response.errors) &&
        Objects.equals(this.success, appsIdInstallAppPost422Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appData, errors, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsIdInstallAppPost422Response {\n");
    sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("app_data");
    openapiFields.add("errors");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppsIdInstallAppPost422Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppsIdInstallAppPost422Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppsIdInstallAppPost422Response is not found in the empty JSON string", AppsIdInstallAppPost422Response.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppsIdInstallAppPost422Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppsIdInstallAppPost422Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `app_data`
      if (jsonObj.getAsJsonObject("app_data") != null) {
        AppData1.validateJsonObject(jsonObj.getAsJsonObject("app_data"));
      }
      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the optional field `errors` (array)
      if (jsonArrayerrors != null) {
        for (int i = 0; i < jsonArrayerrors.size(); i++) {
          Error.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppsIdInstallAppPost422Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppsIdInstallAppPost422Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppsIdInstallAppPost422Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppsIdInstallAppPost422Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AppsIdInstallAppPost422Response>() {
           @Override
           public void write(JsonWriter out, AppsIdInstallAppPost422Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppsIdInstallAppPost422Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppsIdInstallAppPost422Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppsIdInstallAppPost422Response
  * @throws IOException if the JSON string is invalid with respect to AppsIdInstallAppPost422Response
  */
  public static AppsIdInstallAppPost422Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppsIdInstallAppPost422Response.class);
  }

 /**
  * Convert an instance of AppsIdInstallAppPost422Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

