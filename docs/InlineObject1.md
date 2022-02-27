

# InlineObject1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiUri** | **String** | Link to the application API |  [optional]
**appFeatures** | **List&lt;String&gt;** | A list of the app&#39;s features. Will be displayed to the user in the app info page. |  [optional]
**appLayer** | **String** | Layer of application. |  [optional]
**appMobileScreenshotUris** | **String** | Links to screenshots of the app. Will be displayed in the app info page on mobile display |  [optional]
**appScreenshotUris** | **String** | Links to screenshots of the app. Will be displayed in the app info page on desktop display |  [optional]
**appType** | **List&lt;String&gt;** | The app&#39;s type. Valid values are: payments, wallets, communication, menu_items, docuforms, import_clients, automated_flows |  [optional]
**contactSupportLink** | **String** | Link to the app&#39;s contact support page |  [optional]
**deepLink** | [**AppsDeepLink**](AppsDeepLink.md) |  |  [optional]
**demandScopes** | **List&lt;String&gt;** | Scopes the application must have in order to serve requests. |  [optional]
**description** | [**AppsDescription**](AppsDescription.md) |  |  [optional]
**installationEndpoint** | **String** | The endpoint with which the app will be notified it was installed |  [optional]
**locales** | **List&lt;String&gt;** | Locales supported by the app |  [optional]
**menuItems** | [**AppsIdMenuItems**](AppsIdMenuItems.md) |  |  [optional]
**name** | **String** | The app&#39;s name |  [optional]
**openInNewTab** | **Boolean** | Whether the app will be opened in a new tab or as an iframe |  [optional]
**personalConnection** | **Boolean** | Whether the app requires each user to connect separately |  [optional]
**privacyPolicyLink** | **String** | A link to the apps privacy policy |  [optional]
**redirectUri** | **String** | The link that the user will be redirected to when opening the app |  [optional]
**scopes** | **List&lt;String&gt;** | Scopes the application needs access to. |  [optional]
**supportedCountries** | **List&lt;String&gt;** | Countries in which the app will be available. Empty array for all countries. |  [optional]
**trusted** | **String** | Whether application can skip the authorization screen (true/false) |  [optional]
**uninstallationEndpoint** | **String** | The endpoint with which the app will be notified it was uninstalled |  [optional]
**urlParams** | **List&lt;String&gt;** | Parameters that will be passed to the app. Valid values are: impersonate, business_uid, staff_role, staff_uid, payment_permissions, language, package |  [optional]



