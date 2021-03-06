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
import com.vcita.platform.client.model.Item1;
import com.vcita.platform.client.model.Product;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ModelPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelPackage {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_UNIT = "discount_unit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_UNIT)
  private String discountUnit;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Integer expiration;

  public static final String SERIALIZED_NAME_EXPIRATION_UNIT = "expiration_unit";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_UNIT)
  private String expirationUnit;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_PATH = "image_path";
  @SerializedName(SERIALIZED_NAME_IMAGE_PATH)
  private Object imagePath = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item1> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONLINE_PAYMENT_ENABLED = "online_payment_enabled";
  @SerializedName(SERIALIZED_NAME_ONLINE_PAYMENT_ENABLED)
  private Boolean onlinePaymentEnabled;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Product> products = null;

  public static final String SERIALIZED_NAME_TOTAL_BOOKINGS = "total_bookings";
  @SerializedName(SERIALIZED_NAME_TOTAL_BOOKINGS)
  private Integer totalBookings;

  public ModelPackage() { 
  }

  public ModelPackage active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ModelPackage currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ModelPackage description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ModelPackage discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public ModelPackage discountUnit(String discountUnit) {
    
    this.discountUnit = discountUnit;
    return this;
  }

   /**
   * Get discountUnit
   * @return discountUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiscountUnit() {
    return discountUnit;
  }


  public void setDiscountUnit(String discountUnit) {
    this.discountUnit = discountUnit;
  }


  public ModelPackage expiration(Integer expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpiration() {
    return expiration;
  }


  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  public ModelPackage expirationUnit(String expirationUnit) {
    
    this.expirationUnit = expirationUnit;
    return this;
  }

   /**
   * Get expirationUnit
   * @return expirationUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpirationUnit() {
    return expirationUnit;
  }


  public void setExpirationUnit(String expirationUnit) {
    this.expirationUnit = expirationUnit;
  }


  public ModelPackage id(String id) {
    
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


  public ModelPackage imagePath(Object imagePath) {
    
    this.imagePath = imagePath;
    return this;
  }

   /**
   * Get imagePath
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getImagePath() {
    return imagePath;
  }


  public void setImagePath(Object imagePath) {
    this.imagePath = imagePath;
  }


  public ModelPackage items(List<Item1> items) {
    
    this.items = items;
    return this;
  }

  public ModelPackage addItemsItem(Item1 itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Item1> getItems() {
    return items;
  }


  public void setItems(List<Item1> items) {
    this.items = items;
  }


  public ModelPackage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModelPackage onlinePaymentEnabled(Boolean onlinePaymentEnabled) {
    
    this.onlinePaymentEnabled = onlinePaymentEnabled;
    return this;
  }

   /**
   * Get onlinePaymentEnabled
   * @return onlinePaymentEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOnlinePaymentEnabled() {
    return onlinePaymentEnabled;
  }


  public void setOnlinePaymentEnabled(Boolean onlinePaymentEnabled) {
    this.onlinePaymentEnabled = onlinePaymentEnabled;
  }


  public ModelPackage price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public ModelPackage products(List<Product> products) {
    
    this.products = products;
    return this;
  }

  public ModelPackage addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Product> getProducts() {
    return products;
  }


  public void setProducts(List<Product> products) {
    this.products = products;
  }


  public ModelPackage totalBookings(Integer totalBookings) {
    
    this.totalBookings = totalBookings;
    return this;
  }

   /**
   * Get totalBookings
   * @return totalBookings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalBookings() {
    return totalBookings;
  }


  public void setTotalBookings(Integer totalBookings) {
    this.totalBookings = totalBookings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.active, _package.active) &&
        Objects.equals(this.currency, _package.currency) &&
        Objects.equals(this.description, _package.description) &&
        Objects.equals(this.discountAmount, _package.discountAmount) &&
        Objects.equals(this.discountUnit, _package.discountUnit) &&
        Objects.equals(this.expiration, _package.expiration) &&
        Objects.equals(this.expirationUnit, _package.expirationUnit) &&
        Objects.equals(this.id, _package.id) &&
        Objects.equals(this.imagePath, _package.imagePath) &&
        Objects.equals(this.items, _package.items) &&
        Objects.equals(this.name, _package.name) &&
        Objects.equals(this.onlinePaymentEnabled, _package.onlinePaymentEnabled) &&
        Objects.equals(this.price, _package.price) &&
        Objects.equals(this.products, _package.products) &&
        Objects.equals(this.totalBookings, _package.totalBookings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, currency, description, discountAmount, discountUnit, expiration, expirationUnit, id, imagePath, items, name, onlinePaymentEnabled, price, products, totalBookings);
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
    sb.append("class ModelPackage {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountUnit: ").append(toIndentedString(discountUnit)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expirationUnit: ").append(toIndentedString(expirationUnit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlinePaymentEnabled: ").append(toIndentedString(onlinePaymentEnabled)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    totalBookings: ").append(toIndentedString(totalBookings)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("discount_amount");
    openapiFields.add("discount_unit");
    openapiFields.add("expiration");
    openapiFields.add("expiration_unit");
    openapiFields.add("id");
    openapiFields.add("image_path");
    openapiFields.add("items");
    openapiFields.add("name");
    openapiFields.add("online_payment_enabled");
    openapiFields.add("price");
    openapiFields.add("products");
    openapiFields.add("total_bookings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelPackage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelPackage is not found in the empty JSON string", ModelPackage.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelPackage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the optional field `items` (array)
      if (jsonArrayitems != null) {
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Item1.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
      // validate the optional field `products` (array)
      if (jsonArrayproducts != null) {
        for (int i = 0; i < jsonArrayproducts.size(); i++) {
          Product.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelPackage>() {
           @Override
           public void write(JsonWriter out, ModelPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelPackage
  * @throws IOException if the JSON string is invalid with respect to ModelPackage
  */
  public static ModelPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelPackage.class);
  }

 /**
  * Convert an instance of ModelPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

