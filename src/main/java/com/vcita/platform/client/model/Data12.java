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
import com.vcita.platform.client.model.Client;
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
 * Data12
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Data12 {
  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private List<Client> clients = null;

  public Data12() { 
  }

  public Data12 clients(List<Client> clients) {
    
    this.clients = clients;
    return this;
  }

  public Data12 addClientsItem(Client clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Client> getClients() {
    return clients;
  }


  public void setClients(List<Client> clients) {
    this.clients = clients;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data12 data12 = (Data12) o;
    return Objects.equals(this.clients, data12.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data12 {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
    openapiFields.add("clients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Data12
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Data12.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Data12 is not found in the empty JSON string", Data12.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Data12.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Data12` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayclients = jsonObj.getAsJsonArray("clients");
      // validate the optional field `clients` (array)
      if (jsonArrayclients != null) {
        for (int i = 0; i < jsonArrayclients.size(); i++) {
          Client.validateJsonObject(jsonArrayclients.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Data12.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Data12' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Data12> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Data12.class));

       return (TypeAdapter<T>) new TypeAdapter<Data12>() {
           @Override
           public void write(JsonWriter out, Data12 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Data12 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Data12 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Data12
  * @throws IOException if the JSON string is invalid with respect to Data12
  */
  public static Data12 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Data12.class);
  }

 /**
  * Convert an instance of Data12 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

