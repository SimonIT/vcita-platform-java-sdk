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
import com.vcita.platform.client.model.PaymentPackagesItems;
import com.vcita.platform.client.model.PaymentPackagesProducts;
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
 * InlineObject20
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject20 {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private BigDecimal discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_UNIT = "discount_unit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_UNIT)
  private String discountUnit;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private BigDecimal expiration;

  public static final String SERIALIZED_NAME_EXPIRATION_UNIT = "expiration_unit";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_UNIT)
  private String expirationUnit;

  public static final String SERIALIZED_NAME_IMAGE_PATH = "image_path";
  @SerializedName(SERIALIZED_NAME_IMAGE_PATH)
  private String imagePath;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PaymentPackagesItems> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONLINE_PAYMENT_ENABLED = "online_payment_enabled";
  @SerializedName(SERIALIZED_NAME_ONLINE_PAYMENT_ENABLED)
  private Boolean onlinePaymentEnabled;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<PaymentPackagesProducts> products = null;

  public InlineObject20() { 
  }

  public InlineObject20 currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The items currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The items currency")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InlineObject20 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The package description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The package description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InlineObject20 discountAmount(BigDecimal discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Package discount amount (Only for view purposes)
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Package discount amount (Only for view purposes)")

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }


  public InlineObject20 discountUnit(String discountUnit) {
    
    this.discountUnit = discountUnit;
    return this;
  }

   /**
   * Package discount unit [F-Fixed, P-Percentage] (Only for view purposes)
   * @return discountUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Package discount unit [F-Fixed, P-Percentage] (Only for view purposes)")

  public String getDiscountUnit() {
    return discountUnit;
  }


  public void setDiscountUnit(String discountUnit) {
    this.discountUnit = discountUnit;
  }


  public InlineObject20 expiration(BigDecimal expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Once package is instanced for a client, it will be valid for expiration number X expiration unit   
   * @return expiration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Once package is instanced for a client, it will be valid for expiration number X expiration unit   ")

  public BigDecimal getExpiration() {
    return expiration;
  }


  public void setExpiration(BigDecimal expiration) {
    this.expiration = expiration;
  }


  public InlineObject20 expirationUnit(String expirationUnit) {
    
    this.expirationUnit = expirationUnit;
    return this;
  }

   /**
   * The expiration unit (M-Month, D-Day, W-Week, Y-Year)
   * @return expirationUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The expiration unit (M-Month, D-Day, W-Week, Y-Year)")

  public String getExpirationUnit() {
    return expirationUnit;
  }


  public void setExpirationUnit(String expirationUnit) {
    this.expirationUnit = expirationUnit;
  }


  public InlineObject20 imagePath(String imagePath) {
    
    this.imagePath = imagePath;
    return this;
  }

   /**
   * The package&#39;s image path
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The package's image path")

  public String getImagePath() {
    return imagePath;
  }


  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }


  public InlineObject20 items(List<PaymentPackagesItems> items) {
    
    this.items = items;
    return this;
  }

  public InlineObject20 addItemsItem(PaymentPackagesItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PaymentPackagesItems> getItems() {
    return items;
  }


  public void setItems(List<PaymentPackagesItems> items) {
    this.items = items;
  }


  public InlineObject20 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the package
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the package")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineObject20 onlinePaymentEnabled(Boolean onlinePaymentEnabled) {
    
    this.onlinePaymentEnabled = onlinePaymentEnabled;
    return this;
  }

   /**
   * Online payments enabled?
   * @return onlinePaymentEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Online payments enabled?")

  public Boolean getOnlinePaymentEnabled() {
    return onlinePaymentEnabled;
  }


  public void setOnlinePaymentEnabled(Boolean onlinePaymentEnabled) {
    this.onlinePaymentEnabled = onlinePaymentEnabled;
  }


  public InlineObject20 price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the package
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The price of the package")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public InlineObject20 products(List<PaymentPackagesProducts> products) {
    
    this.products = products;
    return this;
  }

  public InlineObject20 addProductsItem(PaymentPackagesProducts productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products included in the package. Up to 3 different products allowed.
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Products included in the package. Up to 3 different products allowed.")

  public List<PaymentPackagesProducts> getProducts() {
    return products;
  }


  public void setProducts(List<PaymentPackagesProducts> products) {
    this.products = products;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject20 inlineObject20 = (InlineObject20) o;
    return Objects.equals(this.currency, inlineObject20.currency) &&
        Objects.equals(this.description, inlineObject20.description) &&
        Objects.equals(this.discountAmount, inlineObject20.discountAmount) &&
        Objects.equals(this.discountUnit, inlineObject20.discountUnit) &&
        Objects.equals(this.expiration, inlineObject20.expiration) &&
        Objects.equals(this.expirationUnit, inlineObject20.expirationUnit) &&
        Objects.equals(this.imagePath, inlineObject20.imagePath) &&
        Objects.equals(this.items, inlineObject20.items) &&
        Objects.equals(this.name, inlineObject20.name) &&
        Objects.equals(this.onlinePaymentEnabled, inlineObject20.onlinePaymentEnabled) &&
        Objects.equals(this.price, inlineObject20.price) &&
        Objects.equals(this.products, inlineObject20.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, description, discountAmount, discountUnit, expiration, expirationUnit, imagePath, items, name, onlinePaymentEnabled, price, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject20 {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountUnit: ").append(toIndentedString(discountUnit)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expirationUnit: ").append(toIndentedString(expirationUnit)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlinePaymentEnabled: ").append(toIndentedString(onlinePaymentEnabled)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("discount_amount");
    openapiFields.add("discount_unit");
    openapiFields.add("expiration");
    openapiFields.add("expiration_unit");
    openapiFields.add("image_path");
    openapiFields.add("items");
    openapiFields.add("name");
    openapiFields.add("online_payment_enabled");
    openapiFields.add("price");
    openapiFields.add("products");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("expiration");
    openapiRequiredFields.add("expiration_unit");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("price");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject20
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject20.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject20 is not found in the empty JSON string", InlineObject20.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineObject20.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject20` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InlineObject20.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the optional field `items` (array)
      if (jsonArrayitems != null) {
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          PaymentPackagesItems.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
      // validate the optional field `products` (array)
      if (jsonArrayproducts != null) {
        for (int i = 0; i < jsonArrayproducts.size(); i++) {
          PaymentPackagesProducts.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject20.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject20' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject20> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject20.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject20>() {
           @Override
           public void write(JsonWriter out, InlineObject20 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject20 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject20 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject20
  * @throws IOException if the JSON string is invalid with respect to InlineObject20
  */
  public static InlineObject20 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject20.class);
  }

 /**
  * Convert an instance of InlineObject20 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

