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
import com.vcita.platform.client.model.InvoicesTaxes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * InvoicesItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoicesItems {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private BigDecimal discount;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<InvoicesTaxes> taxes = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public InvoicesItems() { 
  }

  public InvoicesItems amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * invoice item amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "invoice item amount")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InvoicesItems description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * invoice item description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "invoice item description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InvoicesItems discount(BigDecimal discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * invoice item discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "invoice item discount")

  public BigDecimal getDiscount() {
    return discount;
  }


  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }


  public InvoicesItems quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * invoice item quantity
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "invoice item quantity")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public InvoicesItems taxes(List<InvoicesTaxes> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public InvoicesItems addTaxesItem(InvoicesTaxes taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InvoicesTaxes> getTaxes() {
    return taxes;
  }


  public void setTaxes(List<InvoicesTaxes> taxes) {
    this.taxes = taxes;
  }


  public InvoicesItems title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * invoice item title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "invoice item title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesItems invoicesItems = (InvoicesItems) o;
    return Objects.equals(this.amount, invoicesItems.amount) &&
        Objects.equals(this.description, invoicesItems.description) &&
        Objects.equals(this.discount, invoicesItems.discount) &&
        Objects.equals(this.quantity, invoicesItems.quantity) &&
        Objects.equals(this.taxes, invoicesItems.taxes) &&
        Objects.equals(this.title, invoicesItems.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, discount, quantity, taxes, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesItems {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("discount");
    openapiFields.add("quantity");
    openapiFields.add("taxes");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoicesItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoicesItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoicesItems is not found in the empty JSON string", InvoicesItems.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoicesItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoicesItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoicesItems.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
      // validate the optional field `taxes` (array)
      if (jsonArraytaxes != null) {
        for (int i = 0; i < jsonArraytaxes.size(); i++) {
          InvoicesTaxes.validateJsonObject(jsonArraytaxes.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoicesItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoicesItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoicesItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoicesItems.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoicesItems>() {
           @Override
           public void write(JsonWriter out, InvoicesItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoicesItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoicesItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoicesItems
  * @throws IOException if the JSON string is invalid with respect to InvoicesItems
  */
  public static InvoicesItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoicesItems.class);
  }

 /**
  * Convert an instance of InvoicesItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

