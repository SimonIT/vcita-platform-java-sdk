# vcita-platform-java-sdk

Platform API
- API version: v2.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.vcita.platform</groupId>
  <artifactId>vcita-platform-java-sdk</artifactId>
  <version>v2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'vcita-platform-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'vcita-platform-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.vcita.platform:vcita-platform-java-sdk:v2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/vcita-platform-java-sdk-v2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.vcita.platform.client.ApiClient;
import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.Configuration;
import com.vcita.platform.client.auth.*;
import com.vcita.platform.client.models.*;
import com.vcita.platform.client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/platform/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      AppsGet201Response result = apiInstance.appsGet(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#appsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.vcita.biz/platform/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationsApi* | [**appsGet**](docs/ApplicationsApi.md#appsGet) | **GET** /apps | List of apps
*ApplicationsApi* | [**appsIdAssignPost**](docs/ApplicationsApi.md#appsIdAssignPost) | **POST** /apps/{id}/assign | Assign an app on directory or a business [Internal]
*ApplicationsApi* | [**appsIdGet**](docs/ApplicationsApi.md#appsIdGet) | **GET** /apps/{id} | Read an app
*ApplicationsApi* | [**appsIdInstallAppPost**](docs/ApplicationsApi.md#appsIdInstallAppPost) | **POST** /apps/{id}/install_app | Install an app [Internal]
*ApplicationsApi* | [**appsIdPut**](docs/ApplicationsApi.md#appsIdPut) | **PUT** /apps/{id} | Updates an app
*ApplicationsApi* | [**appsIdUnassignPost**](docs/ApplicationsApi.md#appsIdUnassignPost) | **POST** /apps/{id}/unassign | Unassign an app on directory or a business [Internal]
*ApplicationsApi* | [**appsIdUninstallAppPost**](docs/ApplicationsApi.md#appsIdUninstallAppPost) | **POST** /apps/{id}/uninstall_app | Uninstall an app [Internal]
*ApplicationsApi* | [**appsPost**](docs/ApplicationsApi.md#appsPost) | **POST** /apps | Creates an app
*AppointmentsApi* | [**globalAppointmentsGet**](docs/AppointmentsApi.md#globalAppointmentsGet) | **GET** /global/appointments | Get appointments list
*AppointmentsApi* | [**schedulingAppointmentsAppointmentIdGet**](docs/AppointmentsApi.md#schedulingAppointmentsAppointmentIdGet) | **GET** /scheduling/appointments/{appointment_id} | Get Appointment
*AppointmentsApi* | [**schedulingAppointmentsGet**](docs/AppointmentsApi.md#schedulingAppointmentsGet) | **GET** /scheduling/appointments | Get Appointments List
*AvailabilityApi* | [**servicesServiceIdAvailabilityGet**](docs/AvailabilityApi.md#servicesServiceIdAvailabilityGet) | **GET** /services/{service_id}/availability | Get Service availability By ID [Alpha]
*BookingsApi* | [**schedulingBookingsBookingUidUpdateRsvpStatePut**](docs/BookingsApi.md#schedulingBookingsBookingUidUpdateRsvpStatePut) | **PUT** /scheduling/bookings/{booking_uid}/update_rsvp_state | Update RSVP state
*BookingsApi* | [**schedulingBookingsCancelPost**](docs/BookingsApi.md#schedulingBookingsCancelPost) | **POST** /scheduling/bookings/cancel | Cancel a Booking [Alpha]
*BookingsApi* | [**schedulingBookingsGet**](docs/BookingsApi.md#schedulingBookingsGet) | **GET** /scheduling/bookings | Get Bookings [Alpha] 
*BookingsApi* | [**schedulingBookingsPost**](docs/BookingsApi.md#schedulingBookingsPost) | **POST** /scheduling/bookings | Create New Booking [Alpha]
*BookingsApi* | [**schedulingWaitlistCancelPut**](docs/BookingsApi.md#schedulingWaitlistCancelPut) | **PUT** /scheduling/waitlist/cancel | Cancel a Waitlist registration
*BookingsApi* | [**schedulingWaitlistPost**](docs/BookingsApi.md#schedulingWaitlistPost) | **POST** /scheduling/waitlist | Create event Waitlist
*BusinessApi* | [**businessesBusinessIdFeaturesGet**](docs/BusinessApi.md#businessesBusinessIdFeaturesGet) | **GET** /businesses/{business_id}/features | Get Business Features
*BusinessApi* | [**businessesBusinessIdGet**](docs/BusinessApi.md#businessesBusinessIdGet) | **GET** /businesses/{business_id} | Get Business
*BusinessApi* | [**businessesBusinessIdPost**](docs/BusinessApi.md#businessesBusinessIdPost) | **POST** /businesses/{business_id} | Update Business
*BusinessApi* | [**businessesGet**](docs/BusinessApi.md#businessesGet) | **GET** /businesses | Get Business filtered by email or external_id
*BusinessApi* | [**businessesPost**](docs/BusinessApi.md#businessesPost) | **POST** /businesses | Create a Business
*BusinessApi* | [**businessesValidateLoginGet**](docs/BusinessApi.md#businessesValidateLoginGet) | **GET** /businesses/validate_login | Validate Login
*BusinessApi* | [**globalBusinessesGet**](docs/BusinessApi.md#globalBusinessesGet) | **GET** /global/businesses | Gets a list of businesses
*CardApi* | [**paymentCardsSyncCardPost**](docs/CardApi.md#paymentCardsSyncCardPost) | **POST** /payment/cards/sync_card | Create sync card
*CategoriesApi* | [**categoriesGet**](docs/CategoriesApi.md#categoriesGet) | **GET** /categories | Get Categories [Alpha]
*ClientPackagesApi* | [**clientsClientIdPaymentClientPackagesGet**](docs/ClientPackagesApi.md#clientsClientIdPaymentClientPackagesGet) | **GET** /clients/{client_id}/payment/client_packages | Get Client Packages List Of Client [Alpha]
*ClientPackagesApi* | [**clientsPaymentClientPackagesUpdateUsagePost**](docs/ClientPackagesApi.md#clientsPaymentClientPackagesUpdateUsagePost) | **POST** /clients/payment/client_packages/update_usage | Use Client Package Credit [Alpha]
*ClientPackagesApi* | [**clientsPaymentClientPackagesValidateGet**](docs/ClientPackagesApi.md#clientsPaymentClientPackagesValidateGet) | **GET** /clients/payment/client_packages/validate | Validate Client Package has redemption [Alpha]
*ClientPackagesApi* | [**paymentClientPackagesPost**](docs/ClientPackagesApi.md#paymentClientPackagesPost) | **POST** /payment/client_packages | Add package to client [Alpha]
*ClientPackagesApi* | [**paymentClientPackagesUpdateUsagePost**](docs/ClientPackagesApi.md#paymentClientPackagesUpdateUsagePost) | **POST** /payment/client_packages/update_usage | Use Client Package Credit [Alpha]
*ClientsApi* | [**clientsClientIdDelete**](docs/ClientsApi.md#clientsClientIdDelete) | **DELETE** /clients/{client_id} | Deletes a Client by Id
*ClientsApi* | [**clientsClientIdGet**](docs/ClientsApi.md#clientsClientIdGet) | **GET** /clients/{client_id} | Retrieves a Client by Id
*ClientsApi* | [**clientsClientIdPut**](docs/ClientsApi.md#clientsClientIdPut) | **PUT** /clients/{client_id} | Updates a Client
*ClientsApi* | [**clientsGet**](docs/ClientsApi.md#clientsGet) | **GET** /clients | Get Clients
*ClientsApi* | [**clientsPost**](docs/ClientsApi.md#clientsPost) | **POST** /clients | Create a Client
*ClientsApi* | [**globalClientsGet**](docs/ClientsApi.md#globalClientsGet) | **GET** /global/clients | Gets a list of clients
*ConversationsApi* | [**clientsClientIdConversationsGet**](docs/ConversationsApi.md#clientsClientIdConversationsGet) | **GET** /clients/{client_id}/conversations | Get Conversations For A Client
*ConversationsApi* | [**conversationsGet**](docs/ConversationsApi.md#conversationsGet) | **GET** /conversations | Get Conversations
*DocumentsApi* | [**clientsClientIdDocumentsGet**](docs/DocumentsApi.md#clientsClientIdDocumentsGet) | **GET** /clients/{client_id}/documents | Get Documents For A Client
*EstimatesApi* | [**clientsClientIdEstimatesGet**](docs/EstimatesApi.md#clientsClientIdEstimatesGet) | **GET** /clients/{client_id}/estimates | Get Estimates Of Client
*EstimatesApi* | [**estimatesGet**](docs/EstimatesApi.md#estimatesGet) | **GET** /estimates | Get Estimates List
*EstimatesApi* | [**estimatesPost**](docs/EstimatesApi.md#estimatesPost) | **POST** /estimates | Create New Estimate
*EventAttendanceApi* | [**globalEventAttendancesGet**](docs/EventAttendanceApi.md#globalEventAttendancesGet) | **GET** /global/event_attendances | Gets a list of event attendances
*EventInstanceApi* | [**globalEventInstancesGet**](docs/EventInstanceApi.md#globalEventInstancesGet) | **GET** /global/event_instances | Gets a list of event instances
*EventInstanceApi* | [**schedulingEventInstanceEventInstanceIdGet**](docs/EventInstanceApi.md#schedulingEventInstanceEventInstanceIdGet) | **GET** /scheduling/event_instance/{event_instance_id} | Get Event Instance
*FieldsApi* | [**fieldsFieldIdDelete**](docs/FieldsApi.md#fieldsFieldIdDelete) | **DELETE** /fields/{field_id} | Deletes a Field
*FieldsApi* | [**fieldsFieldIdGet**](docs/FieldsApi.md#fieldsFieldIdGet) | **GET** /fields/{field_id} | Get Field
*FieldsApi* | [**fieldsFieldIdPut**](docs/FieldsApi.md#fieldsFieldIdPut) | **PUT** /fields/{field_id} | Updates a Field
*FieldsApi* | [**fieldsGet**](docs/FieldsApi.md#fieldsGet) | **GET** /fields | Get all Fields
*FieldsApi* | [**fieldsPost**](docs/FieldsApi.md#fieldsPost) | **POST** /fields | Create a New Field
*FormsApi* | [**formsGet**](docs/FormsApi.md#formsGet) | **GET** /forms | Get Forms
*FormsApi* | [**formsPut**](docs/FormsApi.md#formsPut) | **PUT** /forms | Updates a Form
*GlobalApi* | [**globalClientPackagesGet**](docs/GlobalApi.md#globalClientPackagesGet) | **GET** /global/client_packages | Gets a list of client packages
*GlobalApi* | [**globalConversationsGet**](docs/GlobalApi.md#globalConversationsGet) | **GET** /global/conversations | Gets a list of conversations
*GlobalApi* | [**globalEstimatesGet**](docs/GlobalApi.md#globalEstimatesGet) | **GET** /global/estimates | Gets a list of estimates
*GlobalApi* | [**globalInvoicesGet**](docs/GlobalApi.md#globalInvoicesGet) | **GET** /global/invoices | Gets a list of invoices
*GlobalApi* | [**globalMattersGet**](docs/GlobalApi.md#globalMattersGet) | **GET** /global/matters | Gets a list of matters
*GlobalApi* | [**globalPackagesGet**](docs/GlobalApi.md#globalPackagesGet) | **GET** /global/packages | Gets a list of packages
*GlobalApi* | [**globalProductsGet**](docs/GlobalApi.md#globalProductsGet) | **GET** /global/products | Gets a list of products
*InvoicesApi* | [**clientsClientIdInvoicesGet**](docs/InvoicesApi.md#clientsClientIdInvoicesGet) | **GET** /clients/{client_id}/invoices | Get Invoices Of Client
*InvoicesApi* | [**invoicesGet**](docs/InvoicesApi.md#invoicesGet) | **GET** /invoices | Get Invoices List
*InvoicesApi* | [**invoicesInvoiceIdGet**](docs/InvoicesApi.md#invoicesInvoiceIdGet) | **GET** /invoices/{invoice_id} | Get Invoice By ID
*InvoicesApi* | [**invoicesPost**](docs/InvoicesApi.md#invoicesPost) | **POST** /invoices | Create New Invoice
*LeadGenApi* | [**leadgenPost**](docs/LeadGenApi.md#leadgenPost) | **POST** /leadgen | Creates a lead
*MarketingApi* | [**globalCampaignRecipientsGet**](docs/MarketingApi.md#globalCampaignRecipientsGet) | **GET** /global/campaign_recipients | Gets a list of campaign recipients
*MarketingApi* | [**globalCampaignsGet**](docs/MarketingApi.md#globalCampaignsGet) | **GET** /global/campaigns | Gets a list of campaigns
*MarketingApi* | [**globalScheduledCampaignsGet**](docs/MarketingApi.md#globalScheduledCampaignsGet) | **GET** /global/scheduled_campaigns | Gets a list of scheduled campaigns
*MattersApi* | [**clientsMergesMergeClientsPut**](docs/MattersApi.md#clientsMergesMergeClientsPut) | **PUT** /clients/merges/merge_clients | Merge duplicate clients into a primary client.
*MattersApi* | [**clientsMergesPossibleMergeMasterGet**](docs/MattersApi.md#clientsMergesPossibleMergeMasterGet) | **GET** /clients/merges/possible_merge_master | List of clients that can be used as primary for merge.
*MessagesApi* | [**messagesPost**](docs/MessagesApi.md#messagesPost) | **POST** /messages | Create a Message
*PackagesApi* | [**paymentPackagesGet**](docs/PackagesApi.md#paymentPackagesGet) | **GET** /payment/packages | Get all package of business
*PackagesApi* | [**paymentPackagesPackageIdGet**](docs/PackagesApi.md#paymentPackagesPackageIdGet) | **GET** /payment/packages/{package_id} | Show package info
*PackagesApi* | [**paymentPackagesPackageIdPut**](docs/PackagesApi.md#paymentPackagesPackageIdPut) | **PUT** /payment/packages/{package_id} | Update package [Alpha]
*PackagesApi* | [**paymentPackagesPost**](docs/PackagesApi.md#paymentPackagesPost) | **POST** /payment/packages | Create Package 
*PaymentCheckoutApi* | [**paymentCheckoutPut**](docs/PaymentCheckoutApi.md#paymentCheckoutPut) | **PUT** /payment/checkout/ | Send checkout update by webhook 
*PaymentCheckoutApi* | [**paymentCheckoutUrlKeyGet**](docs/PaymentCheckoutApi.md#paymentCheckoutUrlKeyGet) | **GET** /payment/checkout/{url_key} | Get Open Checkout For Specific url_key
*PaymentSettingsApi* | [**paymentSettingsGet**](docs/PaymentSettingsApi.md#paymentSettingsGet) | **GET** /payment/settings | Get Current Payment Settings
*PaymentSettingsApi* | [**paymentSettingsPost**](docs/PaymentSettingsApi.md#paymentSettingsPost) | **POST** /payment/settings | Update Payment Settings
*PaymentStatusesApi* | [**paymentStatusesIdApplyCouponPut**](docs/PaymentStatusesApi.md#paymentStatusesIdApplyCouponPut) | **PUT** /payment_statuses/{id}/apply_coupon | Apply Coupon
*PaymentStatusesApi* | [**paymentStatusesIdValidateCouponGet**](docs/PaymentStatusesApi.md#paymentStatusesIdValidateCouponGet) | **GET** /payment_statuses/{id}/validate_coupon | Validate Coupon
*PaymentsApi* | [**clientsClientIdPaymentsGet**](docs/PaymentsApi.md#clientsClientIdPaymentsGet) | **GET** /clients/{client_id}/payments | Get Payments of Client
*PaymentsApi* | [**globalPaymentsGet**](docs/PaymentsApi.md#globalPaymentsGet) | **GET** /global/payments | Gets a list of payments
*PaymentsApi* | [**paymentsGet**](docs/PaymentsApi.md#paymentsGet) | **GET** /payments | Get Payments List
*PaymentsApi* | [**paymentsPaymentUidMatchPost**](docs/PaymentsApi.md#paymentsPaymentUidMatchPost) | **POST** /payments/{payment_uid}/match | Match Payment
*PaymentsApi* | [**paymentsPost**](docs/PaymentsApi.md#paymentsPost) | **POST** /payments | Create New Payment
*SchedulingFormsApi* | [**schedulingSchedulingFormsGetFormGet**](docs/SchedulingFormsApi.md#schedulingSchedulingFormsGetFormGet) | **GET** /scheduling/scheduling_forms/get_form | 
*ServicesApi* | [**categoriesCategoryIdServicesGet**](docs/ServicesApi.md#categoriesCategoryIdServicesGet) | **GET** /categories/{category_id}/services | Get Services List by category [Alpha]
*ServicesApi* | [**globalServicesGet**](docs/ServicesApi.md#globalServicesGet) | **GET** /global/services | Gets a list of services
*ServicesApi* | [**servicesGet**](docs/ServicesApi.md#servicesGet) | **GET** /services | Get Services List [Alpha]
*ServicesApi* | [**servicesServiceIdGet**](docs/ServicesApi.md#servicesServiceIdGet) | **GET** /services/{service_id} | Get Service By ID [Alpha]
*StaffApi* | [**businessesBusinessIdStaffsGet**](docs/StaffApi.md#businessesBusinessIdStaffsGet) | **GET** /businesses/{business_id}/staffs | Get Staff Members
*StaffApi* | [**businessesBusinessIdStaffsPost**](docs/StaffApi.md#businessesBusinessIdStaffsPost) | **POST** /businesses/{business_id}/staffs | Create Staff Member
*StaffApi* | [**businessesBusinessIdStaffsStaffIdDelete**](docs/StaffApi.md#businessesBusinessIdStaffsStaffIdDelete) | **DELETE** /businesses/{business_id}/staffs/{staff_id} | Delete Staff Member
*StaffApi* | [**businessesBusinessIdStaffsStaffIdGet**](docs/StaffApi.md#businessesBusinessIdStaffsStaffIdGet) | **GET** /businesses/{business_id}/staffs/{staff_id} | Get Staff Member Details
*StaffApi* | [**globalStaffsGet**](docs/StaffApi.md#globalStaffsGet) | **GET** /global/staffs | Gets a list of staffs
*StaffApi* | [**schedulingStaffGet**](docs/StaffApi.md#schedulingStaffGet) | **GET** /scheduling/staff | Get Staff List [Alpha]
*StaffApi* | [**schedulingStaffStaffIdGet**](docs/StaffApi.md#schedulingStaffStaffIdGet) | **GET** /scheduling/staff/{staff_id} | Get Staff By ID [Alpha]
*TokenManagementApi* | [**tokensGet**](docs/TokenManagementApi.md#tokensGet) | **GET** /tokens | Get tokens
*TokenManagementApi* | [**tokensPost**](docs/TokenManagementApi.md#tokensPost) | **POST** /tokens | Creates a token
*TokenManagementApi* | [**tokensRevokePost**](docs/TokenManagementApi.md#tokensRevokePost) | **POST** /tokens/revoke | Revokes a token
*WebhooksApi* | [**webhookSubscribePost**](docs/WebhooksApi.md#webhookSubscribePost) | **POST** /webhook/subscribe | Subscribe To Webhook
*WebhooksApi* | [**webhookUnsubscribePost**](docs/WebhooksApi.md#webhookUnsubscribePost) | **POST** /webhook/unsubscribe | Unsubscribe from Webhook
*WebhooksApi* | [**webhooksGet**](docs/WebhooksApi.md#webhooksGet) | **GET** /webhooks | Get Webhooks List
*WizardApi* | [**businessesBusinessIdWizardsGet**](docs/WizardApi.md#businessesBusinessIdWizardsGet) | **GET** /businesses/{business_id}/wizards | Gets a list of wizards
*WizardApi* | [**businessesBusinessIdWizardsWizardNameGet**](docs/WizardApi.md#businessesBusinessIdWizardsWizardNameGet) | **GET** /businesses/{business_id}/wizards/{wizard_name} | Gets a wizard by name
*WizardApi* | [**businessesBusinessIdWizardsWizardNamePut**](docs/WizardApi.md#businessesBusinessIdWizardsWizardNamePut) | **PUT** /businesses/{business_id}/wizards/{wizard_name} | Update a wizard


## Documentation for Models

 - [ActionData](docs/ActionData.md)
 - [AdminAccount](docs/AdminAccount.md)
 - [App](docs/App.md)
 - [AppData](docs/AppData.md)
 - [AppData1](docs/AppData1.md)
 - [Application](docs/Application.md)
 - [Appointment](docs/Appointment.md)
 - [AppsDeepLink](docs/AppsDeepLink.md)
 - [AppsDescription](docs/AppsDescription.md)
 - [AppsGet201Response](docs/AppsGet201Response.md)
 - [AppsIdAssignPost201Response](docs/AppsIdAssignPost201Response.md)
 - [AppsIdGet200Response](docs/AppsIdGet200Response.md)
 - [AppsIdInstallAppPost201Response](docs/AppsIdInstallAppPost201Response.md)
 - [AppsIdInstallAppPost422Response](docs/AppsIdInstallAppPost422Response.md)
 - [AppsIdMenuItems](docs/AppsIdMenuItems.md)
 - [AppsIdMenuItemsSubitems](docs/AppsIdMenuItemsSubitems.md)
 - [AppsIdPut200Response](docs/AppsIdPut200Response.md)
 - [AppsIdUnassignPost201Response](docs/AppsIdUnassignPost201Response.md)
 - [AppsIdUninstallAppPost201Response](docs/AppsIdUninstallAppPost201Response.md)
 - [AppsIdUninstallAppPost422Response](docs/AppsIdUninstallAppPost422Response.md)
 - [AppsMenuItems](docs/AppsMenuItems.md)
 - [AppsMenuItemsItemName](docs/AppsMenuItemsItemName.md)
 - [AppsMenuItemsSubitems](docs/AppsMenuItemsSubitems.md)
 - [AppsPost201Response](docs/AppsPost201Response.md)
 - [Assignment](docs/Assignment.md)
 - [Availability](docs/Availability.md)
 - [Body2](docs/Body2.md)
 - [Booking](docs/Booking.md)
 - [Booking1](docs/Booking1.md)
 - [BookingCredit](docs/BookingCredit.md)
 - [BookingRestriction](docs/BookingRestriction.md)
 - [Branding](docs/Branding.md)
 - [Business](docs/Business.md)
 - [Business1](docs/Business1.md)
 - [BusinessesAdminAccount](docs/BusinessesAdminAccount.md)
 - [BusinessesBusiness](docs/BusinessesBusiness.md)
 - [BusinessesBusinessIdBusiness](docs/BusinessesBusinessIdBusiness.md)
 - [BusinessesBusinessIdBusinessAdminAccount](docs/BusinessesBusinessIdBusinessAdminAccount.md)
 - [BusinessesBusinessIdBusinessBusiness](docs/BusinessesBusinessIdBusinessBusiness.md)
 - [BusinessesBusinessIdBusinessIntegrations](docs/BusinessesBusinessIdBusinessIntegrations.md)
 - [BusinessesBusinessIdBusinessIntegrationsPlugins](docs/BusinessesBusinessIdBusinessIntegrationsPlugins.md)
 - [BusinessesBusinessIdBusinessMeta](docs/BusinessesBusinessIdBusinessMeta.md)
 - [BusinessesBusinessIdBusinessMetaPlan](docs/BusinessesBusinessIdBusinessMetaPlan.md)
 - [BusinessesBusinessIdFeaturesGet200Response](docs/BusinessesBusinessIdFeaturesGet200Response.md)
 - [BusinessesBusinessIdGet200Response](docs/BusinessesBusinessIdGet200Response.md)
 - [BusinessesBusinessIdPost200Response](docs/BusinessesBusinessIdPost200Response.md)
 - [BusinessesBusinessIdPost400Response](docs/BusinessesBusinessIdPost400Response.md)
 - [BusinessesBusinessIdStaffsGet200Response](docs/BusinessesBusinessIdStaffsGet200Response.md)
 - [BusinessesBusinessIdStaffsMeta](docs/BusinessesBusinessIdStaffsMeta.md)
 - [BusinessesBusinessIdStaffsPost200Response](docs/BusinessesBusinessIdStaffsPost200Response.md)
 - [BusinessesBusinessIdStaffsStaff](docs/BusinessesBusinessIdStaffsStaff.md)
 - [BusinessesBusinessIdStaffsStaffIdDelete200Response](docs/BusinessesBusinessIdStaffsStaffIdDelete200Response.md)
 - [BusinessesBusinessIdStaffsStaffIdGet200Response](docs/BusinessesBusinessIdStaffsStaffIdGet200Response.md)
 - [BusinessesBusinessIdWizardsGet200Response](docs/BusinessesBusinessIdWizardsGet200Response.md)
 - [BusinessesBusinessIdWizardsWizardNameGet200Response](docs/BusinessesBusinessIdWizardsWizardNameGet200Response.md)
 - [BusinessesBusinessIdWizardsWizardNamePut200Response](docs/BusinessesBusinessIdWizardsWizardNamePut200Response.md)
 - [BusinessesGet200Response](docs/BusinessesGet200Response.md)
 - [BusinessesMeta](docs/BusinessesMeta.md)
 - [BusinessesMetaAnalytics](docs/BusinessesMetaAnalytics.md)
 - [BusinessesPost200Response](docs/BusinessesPost200Response.md)
 - [BusinessesValidateLoginGet200Response](docs/BusinessesValidateLoginGet200Response.md)
 - [Cancellation](docs/Cancellation.md)
 - [Card](docs/Card.md)
 - [CategoriesCategoryIdServicesGet200Response](docs/CategoriesCategoryIdServicesGet200Response.md)
 - [CategoriesGet200Response](docs/CategoriesGet200Response.md)
 - [Category](docs/Category.md)
 - [Client](docs/Client.md)
 - [ClientPackage](docs/ClientPackage.md)
 - [ClientsClientIdConversationsGet200Response](docs/ClientsClientIdConversationsGet200Response.md)
 - [ClientsClientIdDelete200Response](docs/ClientsClientIdDelete200Response.md)
 - [ClientsClientIdDocumentsGet200Response](docs/ClientsClientIdDocumentsGet200Response.md)
 - [ClientsClientIdEstimatesGet200Response](docs/ClientsClientIdEstimatesGet200Response.md)
 - [ClientsClientIdGet200Response](docs/ClientsClientIdGet200Response.md)
 - [ClientsClientIdInvoicesGet201Response](docs/ClientsClientIdInvoicesGet201Response.md)
 - [ClientsClientIdPaymentClientPackagesGet200Response](docs/ClientsClientIdPaymentClientPackagesGet200Response.md)
 - [ClientsClientIdPaymentClientPackagesGet422Response](docs/ClientsClientIdPaymentClientPackagesGet422Response.md)
 - [ClientsClientIdPaymentsGet201Response](docs/ClientsClientIdPaymentsGet201Response.md)
 - [ClientsClientIdPut200Response](docs/ClientsClientIdPut200Response.md)
 - [ClientsGet200Response](docs/ClientsGet200Response.md)
 - [ClientsMergesMergeClientsPut200Response](docs/ClientsMergesMergeClientsPut200Response.md)
 - [ClientsMergesPossibleMergeMasterGet200Response](docs/ClientsMergesPossibleMergeMasterGet200Response.md)
 - [ClientsPaymentClientPackagesUpdateUsagePost200Response](docs/ClientsPaymentClientPackagesUpdateUsagePost200Response.md)
 - [ClientsPaymentClientPackagesUpdateUsagePost422Response](docs/ClientsPaymentClientPackagesUpdateUsagePost422Response.md)
 - [ClientsPaymentClientPackagesValidateGet200Response](docs/ClientsPaymentClientPackagesValidateGet200Response.md)
 - [ClientsPaymentClientPackagesValidateGet422Response](docs/ClientsPaymentClientPackagesValidateGet422Response.md)
 - [ClientsPost201Response](docs/ClientsPost201Response.md)
 - [Contact](docs/Contact.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationsGet200Response](docs/ConversationsGet200Response.md)
 - [CreditItem](docs/CreditItem.md)
 - [Data](docs/Data.md)
 - [Data1](docs/Data1.md)
 - [Data10](docs/Data10.md)
 - [Data11](docs/Data11.md)
 - [Data12](docs/Data12.md)
 - [Data13](docs/Data13.md)
 - [Data14](docs/Data14.md)
 - [Data15](docs/Data15.md)
 - [Data16](docs/Data16.md)
 - [Data17](docs/Data17.md)
 - [Data18](docs/Data18.md)
 - [Data19](docs/Data19.md)
 - [Data2](docs/Data2.md)
 - [Data20](docs/Data20.md)
 - [Data21](docs/Data21.md)
 - [Data22](docs/Data22.md)
 - [Data23](docs/Data23.md)
 - [Data24](docs/Data24.md)
 - [Data25](docs/Data25.md)
 - [Data26](docs/Data26.md)
 - [Data27](docs/Data27.md)
 - [Data28](docs/Data28.md)
 - [Data29](docs/Data29.md)
 - [Data3](docs/Data3.md)
 - [Data30](docs/Data30.md)
 - [Data31](docs/Data31.md)
 - [Data32](docs/Data32.md)
 - [Data33](docs/Data33.md)
 - [Data34](docs/Data34.md)
 - [Data35](docs/Data35.md)
 - [Data36](docs/Data36.md)
 - [Data37](docs/Data37.md)
 - [Data38](docs/Data38.md)
 - [Data4](docs/Data4.md)
 - [Data40](docs/Data40.md)
 - [Data41](docs/Data41.md)
 - [Data42](docs/Data42.md)
 - [Data43](docs/Data43.md)
 - [Data44](docs/Data44.md)
 - [Data45](docs/Data45.md)
 - [Data46](docs/Data46.md)
 - [Data47](docs/Data47.md)
 - [Data48](docs/Data48.md)
 - [Data49](docs/Data49.md)
 - [Data5](docs/Data5.md)
 - [Data6](docs/Data6.md)
 - [Data7](docs/Data7.md)
 - [Data8](docs/Data8.md)
 - [Data9](docs/Data9.md)
 - [Datum](docs/Datum.md)
 - [Datum1](docs/Datum1.md)
 - [Datum10](docs/Datum10.md)
 - [Datum11](docs/Datum11.md)
 - [Datum12](docs/Datum12.md)
 - [Datum13](docs/Datum13.md)
 - [Datum14](docs/Datum14.md)
 - [Datum15](docs/Datum15.md)
 - [Datum16](docs/Datum16.md)
 - [Datum17](docs/Datum17.md)
 - [Datum18](docs/Datum18.md)
 - [Datum19](docs/Datum19.md)
 - [Datum20](docs/Datum20.md)
 - [Datum3](docs/Datum3.md)
 - [Datum4](docs/Datum4.md)
 - [Datum5](docs/Datum5.md)
 - [Datum6](docs/Datum6.md)
 - [Datum7](docs/Datum7.md)
 - [Datum8](docs/Datum8.md)
 - [Datum9](docs/Datum9.md)
 - [DeepLink](docs/DeepLink.md)
 - [Description](docs/Description.md)
 - [Error](docs/Error.md)
 - [Estimate](docs/Estimate.md)
 - [EstimatesGet200Response](docs/EstimatesGet200Response.md)
 - [EstimatesItems](docs/EstimatesItems.md)
 - [EstimatesPost201Response](docs/EstimatesPost201Response.md)
 - [EstimatesTaxes](docs/EstimatesTaxes.md)
 - [EventInstance](docs/EventInstance.md)
 - [FieldItem](docs/FieldItem.md)
 - [FieldsFieldIdDelete200Response](docs/FieldsFieldIdDelete200Response.md)
 - [FieldsFieldIdGet200Response](docs/FieldsFieldIdGet200Response.md)
 - [FieldsFieldIdPut200Response](docs/FieldsFieldIdPut200Response.md)
 - [FieldsGet200Response](docs/FieldsGet200Response.md)
 - [FieldsPost201Response](docs/FieldsPost201Response.md)
 - [FormData](docs/FormData.md)
 - [FormsFields](docs/FormsFields.md)
 - [FormsGet200Response](docs/FormsGet200Response.md)
 - [FormsPut200Response](docs/FormsPut200Response.md)
 - [FormsSections](docs/FormsSections.md)
 - [GlobalAppointmentsGet200Response](docs/GlobalAppointmentsGet200Response.md)
 - [GlobalBusinessesGet200Response](docs/GlobalBusinessesGet200Response.md)
 - [GlobalCampaignRecipientsGet200Response](docs/GlobalCampaignRecipientsGet200Response.md)
 - [GlobalCampaignsGet200Response](docs/GlobalCampaignsGet200Response.md)
 - [GlobalClientPackagesGet200Response](docs/GlobalClientPackagesGet200Response.md)
 - [GlobalClientsGet200Response](docs/GlobalClientsGet200Response.md)
 - [GlobalConversationsGet200Response](docs/GlobalConversationsGet200Response.md)
 - [GlobalEstimatesGet200Response](docs/GlobalEstimatesGet200Response.md)
 - [GlobalEventAttendancesGet200Response](docs/GlobalEventAttendancesGet200Response.md)
 - [GlobalEventInstancesGet200Response](docs/GlobalEventInstancesGet200Response.md)
 - [GlobalInvoicesGet200Response](docs/GlobalInvoicesGet200Response.md)
 - [GlobalMattersGet200Response](docs/GlobalMattersGet200Response.md)
 - [GlobalPackagesGet200Response](docs/GlobalPackagesGet200Response.md)
 - [GlobalPaymentsGet200Response](docs/GlobalPaymentsGet200Response.md)
 - [GlobalProductsGet200Response](docs/GlobalProductsGet200Response.md)
 - [GlobalScheduledCampaignsGet200Response](docs/GlobalScheduledCampaignsGet200Response.md)
 - [GlobalServicesGet200Response](docs/GlobalServicesGet200Response.md)
 - [GlobalStaffsGet200Response](docs/GlobalStaffsGet200Response.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject10](docs/InlineObject10.md)
 - [InlineObject11](docs/InlineObject11.md)
 - [InlineObject12](docs/InlineObject12.md)
 - [InlineObject13](docs/InlineObject13.md)
 - [InlineObject14](docs/InlineObject14.md)
 - [InlineObject15](docs/InlineObject15.md)
 - [InlineObject16](docs/InlineObject16.md)
 - [InlineObject17](docs/InlineObject17.md)
 - [InlineObject18](docs/InlineObject18.md)
 - [InlineObject19](docs/InlineObject19.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject20](docs/InlineObject20.md)
 - [InlineObject21](docs/InlineObject21.md)
 - [InlineObject22](docs/InlineObject22.md)
 - [InlineObject23](docs/InlineObject23.md)
 - [InlineObject24](docs/InlineObject24.md)
 - [InlineObject25](docs/InlineObject25.md)
 - [InlineObject26](docs/InlineObject26.md)
 - [InlineObject27](docs/InlineObject27.md)
 - [InlineObject28](docs/InlineObject28.md)
 - [InlineObject29](docs/InlineObject29.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [InlineObject30](docs/InlineObject30.md)
 - [InlineObject31](docs/InlineObject31.md)
 - [InlineObject32](docs/InlineObject32.md)
 - [InlineObject33](docs/InlineObject33.md)
 - [InlineObject4](docs/InlineObject4.md)
 - [InlineObject5](docs/InlineObject5.md)
 - [InlineObject6](docs/InlineObject6.md)
 - [InlineObject7](docs/InlineObject7.md)
 - [InlineObject8](docs/InlineObject8.md)
 - [InlineObject9](docs/InlineObject9.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse200Subscriptions](docs/InlineResponse200Subscriptions.md)
 - [Integrations](docs/Integrations.md)
 - [Invoice](docs/Invoice.md)
 - [InvoicesGet201Response](docs/InvoicesGet201Response.md)
 - [InvoicesInvoiceIdGet201Response](docs/InvoicesInvoiceIdGet201Response.md)
 - [InvoicesItems](docs/InvoicesItems.md)
 - [InvoicesPost201Response](docs/InvoicesPost201Response.md)
 - [InvoicesTaxes](docs/InvoicesTaxes.md)
 - [Item](docs/Item.md)
 - [Item1](docs/Item1.md)
 - [LeadgenPost201Response](docs/LeadgenPost201Response.md)
 - [Matter](docs/Matter.md)
 - [Meetings](docs/Meetings.md)
 - [MenuItems](docs/MenuItems.md)
 - [MessagesMessage](docs/MessagesMessage.md)
 - [MessagesPost201Response](docs/MessagesPost201Response.md)
 - [Meta](docs/Meta.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [Others](docs/Others.md)
 - [PathParams](docs/PathParams.md)
 - [Payment](docs/Payment.md)
 - [PaymentCardsSyncCardDatails](docs/PaymentCardsSyncCardDatails.md)
 - [PaymentCardsSyncCardPost201Response](docs/PaymentCardsSyncCardPost201Response.md)
 - [PaymentCheckoutCard](docs/PaymentCheckoutCard.md)
 - [PaymentCheckoutCardCardInfo](docs/PaymentCheckoutCardCardInfo.md)
 - [PaymentCheckoutPut201Response](docs/PaymentCheckoutPut201Response.md)
 - [PaymentCheckoutUrlKeyGet201Response](docs/PaymentCheckoutUrlKeyGet201Response.md)
 - [PaymentClientPackagesPost201Response](docs/PaymentClientPackagesPost201Response.md)
 - [PaymentClientPackagesPost422Response](docs/PaymentClientPackagesPost422Response.md)
 - [PaymentClientPackagesUpdateUsagePost200Response](docs/PaymentClientPackagesUpdateUsagePost200Response.md)
 - [PaymentClientPackagesUpdateUsagePost422Response](docs/PaymentClientPackagesUpdateUsagePost422Response.md)
 - [PaymentPackagesGet200Response](docs/PaymentPackagesGet200Response.md)
 - [PaymentPackagesGet422Response](docs/PaymentPackagesGet422Response.md)
 - [PaymentPackagesItems](docs/PaymentPackagesItems.md)
 - [PaymentPackagesPackageIdGet200Response](docs/PaymentPackagesPackageIdGet200Response.md)
 - [PaymentPackagesPackageIdGet422Response](docs/PaymentPackagesPackageIdGet422Response.md)
 - [PaymentPackagesPackageIdPackage](docs/PaymentPackagesPackageIdPackage.md)
 - [PaymentPackagesPackageIdPackageProducts](docs/PaymentPackagesPackageIdPackageProducts.md)
 - [PaymentPackagesPackageIdPut200Response](docs/PaymentPackagesPackageIdPut200Response.md)
 - [PaymentPackagesPackageIdPut422Response](docs/PaymentPackagesPackageIdPut422Response.md)
 - [PaymentPackagesPost201Response](docs/PaymentPackagesPost201Response.md)
 - [PaymentPackagesPost422Response](docs/PaymentPackagesPost422Response.md)
 - [PaymentPackagesProducts](docs/PaymentPackagesProducts.md)
 - [PaymentPackagesServices](docs/PaymentPackagesServices.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentSettings](docs/PaymentSettings.md)
 - [PaymentSettingsGet201Response](docs/PaymentSettingsGet201Response.md)
 - [PaymentSettingsPaymentSettings](docs/PaymentSettingsPaymentSettings.md)
 - [PaymentSettingsPost201Response](docs/PaymentSettingsPost201Response.md)
 - [PaymentStatus](docs/PaymentStatus.md)
 - [PaymentStatusesIdApplyCouponPut200Response](docs/PaymentStatusesIdApplyCouponPut200Response.md)
 - [PaymentStatusesIdApplyCouponPut422Response](docs/PaymentStatusesIdApplyCouponPut422Response.md)
 - [PaymentStatusesIdValidateCouponGet200Response](docs/PaymentStatusesIdValidateCouponGet200Response.md)
 - [PaymentStatusesIdValidateCouponGet422Response](docs/PaymentStatusesIdValidateCouponGet422Response.md)
 - [PaymentsGet201Response](docs/PaymentsGet201Response.md)
 - [PaymentsPaymentUidMatchPost201Response](docs/PaymentsPaymentUidMatchPost201Response.md)
 - [PaymentsPost201Response](docs/PaymentsPost201Response.md)
 - [Plan](docs/Plan.md)
 - [Plugin](docs/Plugin.md)
 - [Policies](docs/Policies.md)
 - [Product](docs/Product.md)
 - [Rescheduling](docs/Rescheduling.md)
 - [SchedulingAppointmentsAppointmentIdGet200Response](docs/SchedulingAppointmentsAppointmentIdGet200Response.md)
 - [SchedulingAppointmentsGet200Response](docs/SchedulingAppointmentsGet200Response.md)
 - [SchedulingBookingsBookingUidUpdateRsvpStatePut200Response](docs/SchedulingBookingsBookingUidUpdateRsvpStatePut200Response.md)
 - [SchedulingBookingsPost201Response](docs/SchedulingBookingsPost201Response.md)
 - [SchedulingBookingsPost422Response](docs/SchedulingBookingsPost422Response.md)
 - [SchedulingEventInstanceEventInstanceIdGet200Response](docs/SchedulingEventInstanceEventInstanceIdGet200Response.md)
 - [SchedulingSchedulingFormsGetFormGet200Response](docs/SchedulingSchedulingFormsGetFormGet200Response.md)
 - [SchedulingStaffGet200Response](docs/SchedulingStaffGet200Response.md)
 - [SchedulingStaffStaffIdGet200Response](docs/SchedulingStaffStaffIdGet200Response.md)
 - [SchedulingWaitlistCancelPut200Response](docs/SchedulingWaitlistCancelPut200Response.md)
 - [SchedulingWaitlistPost201Response](docs/SchedulingWaitlistPost201Response.md)
 - [SchedulingWaitlistPost422Response](docs/SchedulingWaitlistPost422Response.md)
 - [Section](docs/Section.md)
 - [Service](docs/Service.md)
 - [ServicesGet200Response](docs/ServicesGet200Response.md)
 - [ServicesServiceIdAvailabilityGet200Response](docs/ServicesServiceIdAvailabilityGet200Response.md)
 - [ServicesServiceIdGet200Response](docs/ServicesServiceIdGet200Response.md)
 - [SourceData](docs/SourceData.md)
 - [Staff](docs/Staff.md)
 - [Staff1](docs/Staff1.md)
 - [StaffSettings](docs/StaffSettings.md)
 - [StateSummary](docs/StateSummary.md)
 - [Subitem](docs/Subitem.md)
 - [Tax](docs/Tax.md)
 - [Token](docs/Token.md)
 - [TokensGet201Response](docs/TokensGet201Response.md)
 - [TokensPost201Response](docs/TokensPost201Response.md)
 - [TokensRevokePost201Response](docs/TokensRevokePost201Response.md)
 - [Waitlist](docs/Waitlist.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### default

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://ignore.myclients.io
- **Scopes**: 
  - platform: All platform related operations
  - platform_create: platform create scope
  - platform_delete: platform delete scope
  - platform_read: platform read scope
  - platform_update: platform update scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



