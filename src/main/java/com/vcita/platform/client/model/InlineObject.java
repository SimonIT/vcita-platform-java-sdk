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
import com.vcita.platform.client.model.AppsDeepLink;
import com.vcita.platform.client.model.AppsDescription;
import com.vcita.platform.client.model.AppsMenuItems;
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
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject {
  public static final String SERIALIZED_NAME_API_URI = "api_uri";
  @SerializedName(SERIALIZED_NAME_API_URI)
  private String apiUri;

  public static final String SERIALIZED_NAME_APP_CODE_NAME = "app_code_name";
  @SerializedName(SERIALIZED_NAME_APP_CODE_NAME)
  private String appCodeName;

  public static final String SERIALIZED_NAME_APP_FEATURES = "app_features";
  @SerializedName(SERIALIZED_NAME_APP_FEATURES)
  private List<String> appFeatures = null;

  public static final String SERIALIZED_NAME_APP_LAYER = "app_layer";
  @SerializedName(SERIALIZED_NAME_APP_LAYER)
  private String appLayer;

  public static final String SERIALIZED_NAME_APP_MOBILE_SCREENSHOT_URIS = "app_mobile_screenshot_uris";
  @SerializedName(SERIALIZED_NAME_APP_MOBILE_SCREENSHOT_URIS)
  private String appMobileScreenshotUris;

  public static final String SERIALIZED_NAME_APP_SCREENSHOT_URIS = "app_screenshot_uris";
  @SerializedName(SERIALIZED_NAME_APP_SCREENSHOT_URIS)
  private String appScreenshotUris;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private List<String> appType = null;

  public static final String SERIALIZED_NAME_CONTACT_SUPPORT_LINK = "contact_support_link";
  @SerializedName(SERIALIZED_NAME_CONTACT_SUPPORT_LINK)
  private String contactSupportLink;

  public static final String SERIALIZED_NAME_DEEP_LINK = "deep_link";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK)
  private AppsDeepLink deepLink;

  public static final String SERIALIZED_NAME_DEMAND_SCOPES = "demand_scopes";
  @SerializedName(SERIALIZED_NAME_DEMAND_SCOPES)
  private List<String> demandScopes = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private AppsDescription description;

  public static final String SERIALIZED_NAME_INSTALLATION_ENDPOINT = "installation_endpoint";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ENDPOINT)
  private String installationEndpoint;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<String> locales = null;

  public static final String SERIALIZED_NAME_MENU_ITEMS = "menu_items";
  @SerializedName(SERIALIZED_NAME_MENU_ITEMS)
  private AppsMenuItems menuItems;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPEN_IN_NEW_TAB = "open_in_new_tab";
  @SerializedName(SERIALIZED_NAME_OPEN_IN_NEW_TAB)
  private Boolean openInNewTab;

  public static final String SERIALIZED_NAME_PERSONAL_CONNECTION = "personal_connection";
  @SerializedName(SERIALIZED_NAME_PERSONAL_CONNECTION)
  private Boolean personalConnection;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY_LINK = "privacy_policy_link";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY_LINK)
  private String privacyPolicyLink;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public static final String SERIALIZED_NAME_SUPPORTED_COUNTRIES = "supported_countries";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_COUNTRIES)
  private List<String> supportedCountries = null;

  public static final String SERIALIZED_NAME_TRUSTED = "trusted";
  @SerializedName(SERIALIZED_NAME_TRUSTED)
  private String trusted;

  public static final String SERIALIZED_NAME_UNINSTALLATION_ENDPOINT = "uninstallation_endpoint";
  @SerializedName(SERIALIZED_NAME_UNINSTALLATION_ENDPOINT)
  private String uninstallationEndpoint;

  public static final String SERIALIZED_NAME_URL_PARAMS = "url_params";
  @SerializedName(SERIALIZED_NAME_URL_PARAMS)
  private List<String> urlParams = null;

  public InlineObject() { 
  }

  public InlineObject apiUri(String apiUri) {
    
    this.apiUri = apiUri;
    return this;
  }

   /**
   * Link to the application API
   * @return apiUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to the application API")

  public String getApiUri() {
    return apiUri;
  }


  public void setApiUri(String apiUri) {
    this.apiUri = apiUri;
  }


  public InlineObject appCodeName(String appCodeName) {
    
    this.appCodeName = appCodeName;
    return this;
  }

   /**
   * The app&#39;s code name. This will be used as the app&#39;s id for APIS
   * @return appCodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app's code name. This will be used as the app's id for APIS")

  public String getAppCodeName() {
    return appCodeName;
  }


  public void setAppCodeName(String appCodeName) {
    this.appCodeName = appCodeName;
  }


  public InlineObject appFeatures(List<String> appFeatures) {
    
    this.appFeatures = appFeatures;
    return this;
  }

  public InlineObject addAppFeaturesItem(String appFeaturesItem) {
    if (this.appFeatures == null) {
      this.appFeatures = new ArrayList<>();
    }
    this.appFeatures.add(appFeaturesItem);
    return this;
  }

   /**
   * A list of the app&#39;s features. Will be displayed to the user in the app info page.
   * @return appFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the app's features. Will be displayed to the user in the app info page.")

  public List<String> getAppFeatures() {
    return appFeatures;
  }


  public void setAppFeatures(List<String> appFeatures) {
    this.appFeatures = appFeatures;
  }


  public InlineObject appLayer(String appLayer) {
    
    this.appLayer = appLayer;
    return this;
  }

   /**
   * Layer of application.
   * @return appLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Layer of application.")

  public String getAppLayer() {
    return appLayer;
  }


  public void setAppLayer(String appLayer) {
    this.appLayer = appLayer;
  }


  public InlineObject appMobileScreenshotUris(String appMobileScreenshotUris) {
    
    this.appMobileScreenshotUris = appMobileScreenshotUris;
    return this;
  }

   /**
   * Links to screenshots of the app. Will be displayed in the app info page on mobile display
   * @return appMobileScreenshotUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Links to screenshots of the app. Will be displayed in the app info page on mobile display")

  public String getAppMobileScreenshotUris() {
    return appMobileScreenshotUris;
  }


  public void setAppMobileScreenshotUris(String appMobileScreenshotUris) {
    this.appMobileScreenshotUris = appMobileScreenshotUris;
  }


  public InlineObject appScreenshotUris(String appScreenshotUris) {
    
    this.appScreenshotUris = appScreenshotUris;
    return this;
  }

   /**
   * Links to screenshots of the app. Will be displayed in the app info page on desktop display
   * @return appScreenshotUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Links to screenshots of the app. Will be displayed in the app info page on desktop display")

  public String getAppScreenshotUris() {
    return appScreenshotUris;
  }


  public void setAppScreenshotUris(String appScreenshotUris) {
    this.appScreenshotUris = appScreenshotUris;
  }


  public InlineObject appType(List<String> appType) {
    
    this.appType = appType;
    return this;
  }

  public InlineObject addAppTypeItem(String appTypeItem) {
    if (this.appType == null) {
      this.appType = new ArrayList<>();
    }
    this.appType.add(appTypeItem);
    return this;
  }

   /**
   * The app&#39;s type. Valid values are: payments, wallets, communication, menu_items, docuforms, import_clients, automated_flows
   * @return appType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app's type. Valid values are: payments, wallets, communication, menu_items, docuforms, import_clients, automated_flows")

  public List<String> getAppType() {
    return appType;
  }


  public void setAppType(List<String> appType) {
    this.appType = appType;
  }


  public InlineObject contactSupportLink(String contactSupportLink) {
    
    this.contactSupportLink = contactSupportLink;
    return this;
  }

   /**
   * Link to the app&#39;s contact support page
   * @return contactSupportLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to the app's contact support page")

  public String getContactSupportLink() {
    return contactSupportLink;
  }


  public void setContactSupportLink(String contactSupportLink) {
    this.contactSupportLink = contactSupportLink;
  }


  public InlineObject deepLink(AppsDeepLink deepLink) {
    
    this.deepLink = deepLink;
    return this;
  }

   /**
   * Get deepLink
   * @return deepLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppsDeepLink getDeepLink() {
    return deepLink;
  }


  public void setDeepLink(AppsDeepLink deepLink) {
    this.deepLink = deepLink;
  }


  public InlineObject demandScopes(List<String> demandScopes) {
    
    this.demandScopes = demandScopes;
    return this;
  }

  public InlineObject addDemandScopesItem(String demandScopesItem) {
    if (this.demandScopes == null) {
      this.demandScopes = new ArrayList<>();
    }
    this.demandScopes.add(demandScopesItem);
    return this;
  }

   /**
   * Scopes the application must have in order to serve requests.
   * @return demandScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scopes the application must have in order to serve requests.")

  public List<String> getDemandScopes() {
    return demandScopes;
  }


  public void setDemandScopes(List<String> demandScopes) {
    this.demandScopes = demandScopes;
  }


  public InlineObject description(AppsDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppsDescription getDescription() {
    return description;
  }


  public void setDescription(AppsDescription description) {
    this.description = description;
  }


  public InlineObject installationEndpoint(String installationEndpoint) {
    
    this.installationEndpoint = installationEndpoint;
    return this;
  }

   /**
   * The endpoint with which the app will be notified it was installed
   * @return installationEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The endpoint with which the app will be notified it was installed")

  public String getInstallationEndpoint() {
    return installationEndpoint;
  }


  public void setInstallationEndpoint(String installationEndpoint) {
    this.installationEndpoint = installationEndpoint;
  }


  public InlineObject locales(List<String> locales) {
    
    this.locales = locales;
    return this;
  }

  public InlineObject addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Locales supported by the app
   * @return locales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locales supported by the app")

  public List<String> getLocales() {
    return locales;
  }


  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  public InlineObject menuItems(AppsMenuItems menuItems) {
    
    this.menuItems = menuItems;
    return this;
  }

   /**
   * Get menuItems
   * @return menuItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppsMenuItems getMenuItems() {
    return menuItems;
  }


  public void setMenuItems(AppsMenuItems menuItems) {
    this.menuItems = menuItems;
  }


  public InlineObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The app&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineObject openInNewTab(Boolean openInNewTab) {
    
    this.openInNewTab = openInNewTab;
    return this;
  }

   /**
   * Whether the app will be opened in a new tab or as an iframe
   * @return openInNewTab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the app will be opened in a new tab or as an iframe")

  public Boolean getOpenInNewTab() {
    return openInNewTab;
  }


  public void setOpenInNewTab(Boolean openInNewTab) {
    this.openInNewTab = openInNewTab;
  }


  public InlineObject personalConnection(Boolean personalConnection) {
    
    this.personalConnection = personalConnection;
    return this;
  }

   /**
   * Whether the app requires each user to connect separately
   * @return personalConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the app requires each user to connect separately")

  public Boolean getPersonalConnection() {
    return personalConnection;
  }


  public void setPersonalConnection(Boolean personalConnection) {
    this.personalConnection = personalConnection;
  }


  public InlineObject privacyPolicyLink(String privacyPolicyLink) {
    
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

   /**
   * A link to the apps privacy policy
   * @return privacyPolicyLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to the apps privacy policy")

  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }


  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }


  public InlineObject redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The link that the user will be redirected to when opening the app
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The link that the user will be redirected to when opening the app")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public InlineObject scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public InlineObject addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Scopes the application needs access to.
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scopes the application needs access to.")

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public InlineObject supportedCountries(List<String> supportedCountries) {
    
    this.supportedCountries = supportedCountries;
    return this;
  }

  public InlineObject addSupportedCountriesItem(String supportedCountriesItem) {
    if (this.supportedCountries == null) {
      this.supportedCountries = new ArrayList<>();
    }
    this.supportedCountries.add(supportedCountriesItem);
    return this;
  }

   /**
   * Countries in which the app will be available. Empty array for all countries.
   * @return supportedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Countries in which the app will be available. Empty array for all countries.")

  public List<String> getSupportedCountries() {
    return supportedCountries;
  }


  public void setSupportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
  }


  public InlineObject trusted(String trusted) {
    
    this.trusted = trusted;
    return this;
  }

   /**
   * Whether application can skip the authorization screen (true/false)
   * @return trusted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether application can skip the authorization screen (true/false)")

  public String getTrusted() {
    return trusted;
  }


  public void setTrusted(String trusted) {
    this.trusted = trusted;
  }


  public InlineObject uninstallationEndpoint(String uninstallationEndpoint) {
    
    this.uninstallationEndpoint = uninstallationEndpoint;
    return this;
  }

   /**
   * The endpoint with which the app will be notified it was uninstalled
   * @return uninstallationEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The endpoint with which the app will be notified it was uninstalled")

  public String getUninstallationEndpoint() {
    return uninstallationEndpoint;
  }


  public void setUninstallationEndpoint(String uninstallationEndpoint) {
    this.uninstallationEndpoint = uninstallationEndpoint;
  }


  public InlineObject urlParams(List<String> urlParams) {
    
    this.urlParams = urlParams;
    return this;
  }

  public InlineObject addUrlParamsItem(String urlParamsItem) {
    if (this.urlParams == null) {
      this.urlParams = new ArrayList<>();
    }
    this.urlParams.add(urlParamsItem);
    return this;
  }

   /**
   * Parameters that will be passed to the app.
   * @return urlParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters that will be passed to the app.")

  public List<String> getUrlParams() {
    return urlParams;
  }


  public void setUrlParams(List<String> urlParams) {
    this.urlParams = urlParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.apiUri, inlineObject.apiUri) &&
        Objects.equals(this.appCodeName, inlineObject.appCodeName) &&
        Objects.equals(this.appFeatures, inlineObject.appFeatures) &&
        Objects.equals(this.appLayer, inlineObject.appLayer) &&
        Objects.equals(this.appMobileScreenshotUris, inlineObject.appMobileScreenshotUris) &&
        Objects.equals(this.appScreenshotUris, inlineObject.appScreenshotUris) &&
        Objects.equals(this.appType, inlineObject.appType) &&
        Objects.equals(this.contactSupportLink, inlineObject.contactSupportLink) &&
        Objects.equals(this.deepLink, inlineObject.deepLink) &&
        Objects.equals(this.demandScopes, inlineObject.demandScopes) &&
        Objects.equals(this.description, inlineObject.description) &&
        Objects.equals(this.installationEndpoint, inlineObject.installationEndpoint) &&
        Objects.equals(this.locales, inlineObject.locales) &&
        Objects.equals(this.menuItems, inlineObject.menuItems) &&
        Objects.equals(this.name, inlineObject.name) &&
        Objects.equals(this.openInNewTab, inlineObject.openInNewTab) &&
        Objects.equals(this.personalConnection, inlineObject.personalConnection) &&
        Objects.equals(this.privacyPolicyLink, inlineObject.privacyPolicyLink) &&
        Objects.equals(this.redirectUri, inlineObject.redirectUri) &&
        Objects.equals(this.scopes, inlineObject.scopes) &&
        Objects.equals(this.supportedCountries, inlineObject.supportedCountries) &&
        Objects.equals(this.trusted, inlineObject.trusted) &&
        Objects.equals(this.uninstallationEndpoint, inlineObject.uninstallationEndpoint) &&
        Objects.equals(this.urlParams, inlineObject.urlParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUri, appCodeName, appFeatures, appLayer, appMobileScreenshotUris, appScreenshotUris, appType, contactSupportLink, deepLink, demandScopes, description, installationEndpoint, locales, menuItems, name, openInNewTab, personalConnection, privacyPolicyLink, redirectUri, scopes, supportedCountries, trusted, uninstallationEndpoint, urlParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    apiUri: ").append(toIndentedString(apiUri)).append("\n");
    sb.append("    appCodeName: ").append(toIndentedString(appCodeName)).append("\n");
    sb.append("    appFeatures: ").append(toIndentedString(appFeatures)).append("\n");
    sb.append("    appLayer: ").append(toIndentedString(appLayer)).append("\n");
    sb.append("    appMobileScreenshotUris: ").append(toIndentedString(appMobileScreenshotUris)).append("\n");
    sb.append("    appScreenshotUris: ").append(toIndentedString(appScreenshotUris)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    contactSupportLink: ").append(toIndentedString(contactSupportLink)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    demandScopes: ").append(toIndentedString(demandScopes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    installationEndpoint: ").append(toIndentedString(installationEndpoint)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openInNewTab: ").append(toIndentedString(openInNewTab)).append("\n");
    sb.append("    personalConnection: ").append(toIndentedString(personalConnection)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    uninstallationEndpoint: ").append(toIndentedString(uninstallationEndpoint)).append("\n");
    sb.append("    urlParams: ").append(toIndentedString(urlParams)).append("\n");
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
    openapiFields.add("api_uri");
    openapiFields.add("app_code_name");
    openapiFields.add("app_features");
    openapiFields.add("app_layer");
    openapiFields.add("app_mobile_screenshot_uris");
    openapiFields.add("app_screenshot_uris");
    openapiFields.add("app_type");
    openapiFields.add("contact_support_link");
    openapiFields.add("deep_link");
    openapiFields.add("demand_scopes");
    openapiFields.add("description");
    openapiFields.add("installation_endpoint");
    openapiFields.add("locales");
    openapiFields.add("menu_items");
    openapiFields.add("name");
    openapiFields.add("open_in_new_tab");
    openapiFields.add("personal_connection");
    openapiFields.add("privacy_policy_link");
    openapiFields.add("redirect_uri");
    openapiFields.add("scopes");
    openapiFields.add("supported_countries");
    openapiFields.add("trusted");
    openapiFields.add("uninstallation_endpoint");
    openapiFields.add("url_params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InlineObject.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineObject is not found in the empty JSON string", InlineObject.openapiRequiredFields.toString()));
        }
      }
      Set<java.util.Map.Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (java.util.Map.Entry<String, JsonElement> entry : entries) {
        if (!InlineObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `deep_link`
      if (jsonObj.getAsJsonObject("deep_link") != null) {
        AppsDeepLink.validateJsonObject(jsonObj.getAsJsonObject("deep_link"));
      }
      // validate the optional field `description`
      if (jsonObj.getAsJsonObject("description") != null) {
        AppsDescription.validateJsonObject(jsonObj.getAsJsonObject("description"));
      }
      // validate the optional field `menu_items`
      if (jsonObj.getAsJsonObject("menu_items") != null) {
        AppsMenuItems.validateJsonObject(jsonObj.getAsJsonObject("menu_items"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineObject.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineObject>() {
           @Override
           public void write(JsonWriter out, InlineObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineObject
  * @throws IOException if the JSON string is invalid with respect to InlineObject
  */
  public static InlineObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineObject.class);
  }

 /**
  * Convert an instance of InlineObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

