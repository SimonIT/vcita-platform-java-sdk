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
import com.vcita.platform.client.model.Policies;
import com.vcita.platform.client.model.SourceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * Booking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Booking {
  public static final String SERIALIZED_NAME_APPROVAL_MODE = "approval_mode";
  @SerializedName(SERIALIZED_NAME_APPROVAL_MODE)
  private String approvalMode;

  public static final String SERIALIZED_NAME_CALENDAR_START_TIME = "calendar_start_time";
  @SerializedName(SERIALIZED_NAME_CALENDAR_START_TIME)
  private OffsetDateTime calendarStartTime;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private Object categoryName = null;

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "charge_type";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private String depth;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private URI imageUrl;

  public static final String SERIALIZED_NAME_INTERACTION_DETAILS = "interaction_details";
  @SerializedName(SERIALIZED_NAME_INTERACTION_DETAILS)
  private String interactionDetails;

  public static final String SERIALIZED_NAME_INTERACTION_TYPE = "interaction_type";
  @SerializedName(SERIALIZED_NAME_INTERACTION_TYPE)
  private String interactionType;

  public static final String SERIALIZED_NAME_INVOICE_PAYMENT_STATUS_UID = "invoice_payment_status_uid";
  @SerializedName(SERIALIZED_NAME_INVOICE_PAYMENT_STATUS_UID)
  private Object invoicePaymentStatusUid = null;

  public static final String SERIALIZED_NAME_INVOICES = "invoices";
  @SerializedName(SERIALIZED_NAME_INVOICES)
  private List<Object> invoices = null;

  public static final String SERIALIZED_NAME_IS_RECURRING = "is_recurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_NO_SHOW = "no_show";
  @SerializedName(SERIALIZED_NAME_NO_SHOW)
  private Boolean noShow;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PAYABLE = "payable";
  @SerializedName(SERIALIZED_NAME_PAYABLE)
  private Boolean payable;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private Object payment = null;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private Object paymentId = null;

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private Object paymentStatus = null;

  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private Policies policies;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_RECURRENCE_DESCRIPTION = "recurrence_description";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_DESCRIPTION)
  private String recurrenceDescription;

  public static final String SERIALIZED_NAME_RSVP_REQUIRED = "rsvp_required";
  @SerializedName(SERIALIZED_NAME_RSVP_REQUIRED)
  private Boolean rsvpRequired;

  public static final String SERIALIZED_NAME_RSVP_STATE = "rsvp_state";
  @SerializedName(SERIALIZED_NAME_RSVP_STATE)
  private String rsvpState;

  public static final String SERIALIZED_NAME_SERIES_ID = "series_id";
  @SerializedName(SERIALIZED_NAME_SERIES_ID)
  private String seriesId;

  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "source_data";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private SourceData sourceData;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private String staffId;

  public static final String SERIALIZED_NAME_STAFF_NAME = "staff_name";
  @SerializedName(SERIALIZED_NAME_STAFF_NAME)
  private String staffName;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SUGGESTED_TIMES = "suggested_times";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_TIMES)
  private List<Object> suggestedTimes = null;

  public static final String SERIALIZED_NAME_SUGGESTED_TIMES_END = "suggested_times_end";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_TIMES_END)
  private List<Object> suggestedTimesEnd = null;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public Booking() { 
  }

  public Booking approvalMode(String approvalMode) {
    
    this.approvalMode = approvalMode;
    return this;
  }

   /**
   * Get approvalMode
   * @return approvalMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApprovalMode() {
    return approvalMode;
  }


  public void setApprovalMode(String approvalMode) {
    this.approvalMode = approvalMode;
  }


  public Booking calendarStartTime(OffsetDateTime calendarStartTime) {
    
    this.calendarStartTime = calendarStartTime;
    return this;
  }

   /**
   * Get calendarStartTime
   * @return calendarStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCalendarStartTime() {
    return calendarStartTime;
  }


  public void setCalendarStartTime(OffsetDateTime calendarStartTime) {
    this.calendarStartTime = calendarStartTime;
  }


  public Booking categoryName(Object categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(Object categoryName) {
    this.categoryName = categoryName;
  }


  public Booking chargeType(String chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChargeType() {
    return chargeType;
  }


  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  public Booking clientId(String clientId) {
    
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


  public Booking conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Get conversationId
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public Booking currency(String currency) {
    
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


  public Booking depth(String depth) {
    
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDepth() {
    return depth;
  }


  public void setDepth(String depth) {
    this.depth = depth;
  }


  public Booking description(Object description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    this.description = description;
  }


  public Booking duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public Booking endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Booking imageUrl(URI imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(URI imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Booking interactionDetails(String interactionDetails) {
    
    this.interactionDetails = interactionDetails;
    return this;
  }

   /**
   * Get interactionDetails
   * @return interactionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInteractionDetails() {
    return interactionDetails;
  }


  public void setInteractionDetails(String interactionDetails) {
    this.interactionDetails = interactionDetails;
  }


  public Booking interactionType(String interactionType) {
    
    this.interactionType = interactionType;
    return this;
  }

   /**
   * Get interactionType
   * @return interactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInteractionType() {
    return interactionType;
  }


  public void setInteractionType(String interactionType) {
    this.interactionType = interactionType;
  }


  public Booking invoicePaymentStatusUid(Object invoicePaymentStatusUid) {
    
    this.invoicePaymentStatusUid = invoicePaymentStatusUid;
    return this;
  }

   /**
   * Get invoicePaymentStatusUid
   * @return invoicePaymentStatusUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getInvoicePaymentStatusUid() {
    return invoicePaymentStatusUid;
  }


  public void setInvoicePaymentStatusUid(Object invoicePaymentStatusUid) {
    this.invoicePaymentStatusUid = invoicePaymentStatusUid;
  }


  public Booking invoices(List<Object> invoices) {
    
    this.invoices = invoices;
    return this;
  }

  public Booking addInvoicesItem(Object invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getInvoices() {
    return invoices;
  }


  public void setInvoices(List<Object> invoices) {
    this.invoices = invoices;
  }


  public Booking isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * Get isRecurring
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public Booking noShow(Boolean noShow) {
    
    this.noShow = noShow;
    return this;
  }

   /**
   * Get noShow
   * @return noShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoShow() {
    return noShow;
  }


  public void setNoShow(Boolean noShow) {
    this.noShow = noShow;
  }


  public Booking notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public Booking payable(Boolean payable) {
    
    this.payable = payable;
    return this;
  }

   /**
   * Get payable
   * @return payable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPayable() {
    return payable;
  }


  public void setPayable(Boolean payable) {
    this.payable = payable;
  }


  public Booking payment(Object payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayment() {
    return payment;
  }


  public void setPayment(Object payment) {
    this.payment = payment;
  }


  public Booking paymentId(Object paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(Object paymentId) {
    this.paymentId = paymentId;
  }


  public Booking paymentStatus(Object paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(Object paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public Booking policies(Policies policies) {
    
    this.policies = policies;
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Policies getPolicies() {
    return policies;
  }


  public void setPolicies(Policies policies) {
    this.policies = policies;
  }


  public Booking policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public Booking price(String price) {
    
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


  public Booking recurrenceDescription(String recurrenceDescription) {
    
    this.recurrenceDescription = recurrenceDescription;
    return this;
  }

   /**
   * Get recurrenceDescription
   * @return recurrenceDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecurrenceDescription() {
    return recurrenceDescription;
  }


  public void setRecurrenceDescription(String recurrenceDescription) {
    this.recurrenceDescription = recurrenceDescription;
  }


  public Booking rsvpRequired(Boolean rsvpRequired) {
    
    this.rsvpRequired = rsvpRequired;
    return this;
  }

   /**
   * Get rsvpRequired
   * @return rsvpRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRsvpRequired() {
    return rsvpRequired;
  }


  public void setRsvpRequired(Boolean rsvpRequired) {
    this.rsvpRequired = rsvpRequired;
  }


  public Booking rsvpState(String rsvpState) {
    
    this.rsvpState = rsvpState;
    return this;
  }

   /**
   * Get rsvpState
   * @return rsvpState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRsvpState() {
    return rsvpState;
  }


  public void setRsvpState(String rsvpState) {
    this.rsvpState = rsvpState;
  }


  public Booking seriesId(String seriesId) {
    
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeriesId() {
    return seriesId;
  }


  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }


  public Booking serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public Booking sourceData(SourceData sourceData) {
    
    this.sourceData = sourceData;
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceData getSourceData() {
    return sourceData;
  }


  public void setSourceData(SourceData sourceData) {
    this.sourceData = sourceData;
  }


  public Booking staffId(String staffId) {
    
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


  public Booking staffName(String staffName) {
    
    this.staffName = staffName;
    return this;
  }

   /**
   * Get staffName
   * @return staffName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStaffName() {
    return staffName;
  }


  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }


  public Booking startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Booking state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Booking suggestedTimes(List<Object> suggestedTimes) {
    
    this.suggestedTimes = suggestedTimes;
    return this;
  }

  public Booking addSuggestedTimesItem(Object suggestedTimesItem) {
    if (this.suggestedTimes == null) {
      this.suggestedTimes = new ArrayList<>();
    }
    this.suggestedTimes.add(suggestedTimesItem);
    return this;
  }

   /**
   * Get suggestedTimes
   * @return suggestedTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getSuggestedTimes() {
    return suggestedTimes;
  }


  public void setSuggestedTimes(List<Object> suggestedTimes) {
    this.suggestedTimes = suggestedTimes;
  }


  public Booking suggestedTimesEnd(List<Object> suggestedTimesEnd) {
    
    this.suggestedTimesEnd = suggestedTimesEnd;
    return this;
  }

  public Booking addSuggestedTimesEndItem(Object suggestedTimesEndItem) {
    if (this.suggestedTimesEnd == null) {
      this.suggestedTimesEnd = new ArrayList<>();
    }
    this.suggestedTimesEnd.add(suggestedTimesEndItem);
    return this;
  }

   /**
   * Get suggestedTimesEnd
   * @return suggestedTimesEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getSuggestedTimesEnd() {
    return suggestedTimesEnd;
  }


  public void setSuggestedTimesEnd(List<Object> suggestedTimesEnd) {
    this.suggestedTimesEnd = suggestedTimesEnd;
  }


  public Booking timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public Booking title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Booking type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Booking uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.approvalMode, booking.approvalMode) &&
        Objects.equals(this.calendarStartTime, booking.calendarStartTime) &&
        Objects.equals(this.categoryName, booking.categoryName) &&
        Objects.equals(this.chargeType, booking.chargeType) &&
        Objects.equals(this.clientId, booking.clientId) &&
        Objects.equals(this.conversationId, booking.conversationId) &&
        Objects.equals(this.currency, booking.currency) &&
        Objects.equals(this.depth, booking.depth) &&
        Objects.equals(this.description, booking.description) &&
        Objects.equals(this.duration, booking.duration) &&
        Objects.equals(this.endTime, booking.endTime) &&
        Objects.equals(this.imageUrl, booking.imageUrl) &&
        Objects.equals(this.interactionDetails, booking.interactionDetails) &&
        Objects.equals(this.interactionType, booking.interactionType) &&
        Objects.equals(this.invoicePaymentStatusUid, booking.invoicePaymentStatusUid) &&
        Objects.equals(this.invoices, booking.invoices) &&
        Objects.equals(this.isRecurring, booking.isRecurring) &&
        Objects.equals(this.noShow, booking.noShow) &&
        Objects.equals(this.notes, booking.notes) &&
        Objects.equals(this.payable, booking.payable) &&
        Objects.equals(this.payment, booking.payment) &&
        Objects.equals(this.paymentId, booking.paymentId) &&
        Objects.equals(this.paymentStatus, booking.paymentStatus) &&
        Objects.equals(this.policies, booking.policies) &&
        Objects.equals(this.policy, booking.policy) &&
        Objects.equals(this.price, booking.price) &&
        Objects.equals(this.recurrenceDescription, booking.recurrenceDescription) &&
        Objects.equals(this.rsvpRequired, booking.rsvpRequired) &&
        Objects.equals(this.rsvpState, booking.rsvpState) &&
        Objects.equals(this.seriesId, booking.seriesId) &&
        Objects.equals(this.serviceId, booking.serviceId) &&
        Objects.equals(this.sourceData, booking.sourceData) &&
        Objects.equals(this.staffId, booking.staffId) &&
        Objects.equals(this.staffName, booking.staffName) &&
        Objects.equals(this.startTime, booking.startTime) &&
        Objects.equals(this.state, booking.state) &&
        Objects.equals(this.suggestedTimes, booking.suggestedTimes) &&
        Objects.equals(this.suggestedTimesEnd, booking.suggestedTimesEnd) &&
        Objects.equals(this.timeZone, booking.timeZone) &&
        Objects.equals(this.title, booking.title) &&
        Objects.equals(this.type, booking.type) &&
        Objects.equals(this.uid, booking.uid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalMode, calendarStartTime, categoryName, chargeType, clientId, conversationId, currency, depth, description, duration, endTime, imageUrl, interactionDetails, interactionType, invoicePaymentStatusUid, invoices, isRecurring, noShow, notes, payable, payment, paymentId, paymentStatus, policies, policy, price, recurrenceDescription, rsvpRequired, rsvpState, seriesId, serviceId, sourceData, staffId, staffName, startTime, state, suggestedTimes, suggestedTimesEnd, timeZone, title, type, uid);
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
    sb.append("class Booking {\n");
    sb.append("    approvalMode: ").append(toIndentedString(approvalMode)).append("\n");
    sb.append("    calendarStartTime: ").append(toIndentedString(calendarStartTime)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    interactionDetails: ").append(toIndentedString(interactionDetails)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    invoicePaymentStatusUid: ").append(toIndentedString(invoicePaymentStatusUid)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    noShow: ").append(toIndentedString(noShow)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    payable: ").append(toIndentedString(payable)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    recurrenceDescription: ").append(toIndentedString(recurrenceDescription)).append("\n");
    sb.append("    rsvpRequired: ").append(toIndentedString(rsvpRequired)).append("\n");
    sb.append("    rsvpState: ").append(toIndentedString(rsvpState)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    suggestedTimes: ").append(toIndentedString(suggestedTimes)).append("\n");
    sb.append("    suggestedTimesEnd: ").append(toIndentedString(suggestedTimesEnd)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("approval_mode");
    openapiFields.add("calendar_start_time");
    openapiFields.add("category_name");
    openapiFields.add("charge_type");
    openapiFields.add("client_id");
    openapiFields.add("conversation_id");
    openapiFields.add("currency");
    openapiFields.add("depth");
    openapiFields.add("description");
    openapiFields.add("duration");
    openapiFields.add("end_time");
    openapiFields.add("image_url");
    openapiFields.add("interaction_details");
    openapiFields.add("interaction_type");
    openapiFields.add("invoice_payment_status_uid");
    openapiFields.add("invoices");
    openapiFields.add("is_recurring");
    openapiFields.add("no_show");
    openapiFields.add("notes");
    openapiFields.add("payable");
    openapiFields.add("payment");
    openapiFields.add("payment_id");
    openapiFields.add("payment_status");
    openapiFields.add("policies");
    openapiFields.add("policy");
    openapiFields.add("price");
    openapiFields.add("recurrence_description");
    openapiFields.add("rsvp_required");
    openapiFields.add("rsvp_state");
    openapiFields.add("series_id");
    openapiFields.add("service_id");
    openapiFields.add("source_data");
    openapiFields.add("staff_id");
    openapiFields.add("staff_name");
    openapiFields.add("start_time");
    openapiFields.add("state");
    openapiFields.add("suggested_times");
    openapiFields.add("suggested_times_end");
    openapiFields.add("time_zone");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Booking
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Booking.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Booking is not found in the empty JSON string", Booking.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Booking.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Booking` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `policies`
      if (jsonObj.getAsJsonObject("policies") != null) {
        Policies.validateJsonObject(jsonObj.getAsJsonObject("policies"));
      }
      // validate the optional field `source_data`
      if (jsonObj.getAsJsonObject("source_data") != null) {
        SourceData.validateJsonObject(jsonObj.getAsJsonObject("source_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Booking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Booking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Booking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Booking.class));

       return (TypeAdapter<T>) new TypeAdapter<Booking>() {
           @Override
           public void write(JsonWriter out, Booking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Booking read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Booking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Booking
  * @throws IOException if the JSON string is invalid with respect to Booking
  */
  public static Booking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Booking.class);
  }

 /**
  * Convert an instance of Booking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

