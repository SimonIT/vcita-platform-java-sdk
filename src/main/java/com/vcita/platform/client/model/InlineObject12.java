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
import java.util.Map.Entry;
import java.util.Set;

import com.vcita.platform.client.JSON;

/**
 * InlineObject12
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject12 {
  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Boolean defaultValue;

  public static final String SERIALIZED_NAME_FORMS = "forms";
  @SerializedName(SERIALIZED_NAME_FORMS)
  private List<String> forms = null;

  public static final String SERIALIZED_NAME_KEEP_ASKING = "keep_asking";
  @SerializedName(SERIALIZED_NAME_KEEP_ASKING)
  private Boolean keepAsking;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = null;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public InlineObject12() { 
  }

  public InlineObject12 defaultValue(Boolean defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value for checkbox/opt-in
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default value for checkbox/opt-in")

  public Boolean getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(Boolean defaultValue) {
    this.defaultValue = defaultValue;
  }


  public InlineObject12 forms(List<String> forms) {
    
    this.forms = forms;
    return this;
  }

  public InlineObject12 addFormsItem(String formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

   /**
   * A list of forms to include this field
   * @return forms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of forms to include this field")

  public List<String> getForms() {
    return forms;
  }


  public void setForms(List<String> forms) {
    this.forms = forms;
  }


  public InlineObject12 keepAsking(Boolean keepAsking) {
    
    this.keepAsking = keepAsking;
    return this;
  }

   /**
   * Indicates if to keep asking until filled
   * @return keepAsking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if to keep asking until filled")

  public Boolean getKeepAsking() {
    return keepAsking;
  }


  public void setKeepAsking(Boolean keepAsking) {
    this.keepAsking = keepAsking;
  }


  public InlineObject12 label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Field label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public InlineObject12 options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public InlineObject12 addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of options for dropdown field
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of options for dropdown field")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public InlineObject12 required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Indicates if the field is required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the field is required")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject12 inlineObject12 = (InlineObject12) o;
    return Objects.equals(this.defaultValue, inlineObject12.defaultValue) &&
        Objects.equals(this.forms, inlineObject12.forms) &&
        Objects.equals(this.keepAsking, inlineObject12.keepAsking) &&
        Objects.equals(this.label, inlineObject12.label) &&
        Objects.equals(this.options, inlineObject12.options) &&
        Objects.equals(this.required, inlineObject12.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, forms, keepAsking, label, options, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject12 {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    keepAsking: ").append(toIndentedString(keepAsking)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
    openapiFields.add("default_value");
    openapiFields.add("forms");
    openapiFields.add("keep_asking");
    openapiFields.add("label");
    openapiFields.add("options");
    openapiFields.add("required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject12
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject12.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject12 is not found in the empty JSON string", InlineObject12.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject12.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject12` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject12.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject12' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject12> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject12.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject12>() {
           @Override
           public void write(JsonWriter out, InlineObject12 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject12 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject12 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject12
  * @throws IOException if the JSON string is invalid with respect to InlineObject12
  */
  public static InlineObject12 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject12.class);
  }

 /**
  * Convert an instance of InlineObject12 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

