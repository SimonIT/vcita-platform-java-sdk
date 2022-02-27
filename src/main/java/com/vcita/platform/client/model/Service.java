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
import com.vcita.platform.client.model.BookingRestriction;
import com.vcita.platform.client.model.StaffSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Service
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Service {
  public static final String SERIALIZED_NAME_AUTO_FOLLOW_UP_HOURS = "auto_follow_up_hours";
  @SerializedName(SERIALIZED_NAME_AUTO_FOLLOW_UP_HOURS)
  private Integer autoFollowUpHours;

  public static final String SERIALIZED_NAME_APPROVAL_MODE = "approval_mode";
  @SerializedName(SERIALIZED_NAME_APPROVAL_MODE)
  private String approvalMode;

  public static final String SERIALIZED_NAME_BOOKING_RESTRICTION = "booking_restriction";
  @SerializedName(SERIALIZED_NAME_BOOKING_RESTRICTION)
  private BookingRestriction bookingRestriction;

  public static final String SERIALIZED_NAME_BUSINESS_ENABLED = "business_enabled";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ENABLED)
  private Boolean businessEnabled;

  public static final String SERIALIZED_NAME_BUSINESS_UID = "business_uid";
  @SerializedName(SERIALIZED_NAME_BUSINESS_UID)
  private String businessUid;

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "charge_type";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_COLOR_ID = "color_id";
  @SerializedName(SERIALIZED_NAME_COLOR_ID)
  private Integer colorId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DEFAULT_STAFF = "default_staff";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STAFF)
  private Object defaultStaff = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private Boolean display;

  public static final String SERIALIZED_NAME_DISPLAY_MISSING_ERROR = "display_missing_error";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MISSING_ERROR)
  private Boolean displayMissingError;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_EVENT_DISPLAY_REMAINING_SPOTS = "event_display_remaining_spots";
  @SerializedName(SERIALIZED_NAME_EVENT_DISPLAY_REMAINING_SPOTS)
  private Boolean eventDisplayRemainingSpots;

  public static final String SERIALIZED_NAME_FUTURE_BOOKINGS_LIMIT = "future_bookings_limit";
  @SerializedName(SERIALIZED_NAME_FUTURE_BOOKINGS_LIMIT)
  private Integer futureBookingsLimit;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_PATH = "image_path";
  @SerializedName(SERIALIZED_NAME_IMAGE_PATH)
  private String imagePath;

  public static final String SERIALIZED_NAME_INTERACTION_TYPE = "interaction_type";
  @SerializedName(SERIALIZED_NAME_INTERACTION_TYPE)
  private String interactionType;

  public static final String SERIALIZED_NAME_MEETING_INTERACTION_DETAILS = "meeting_interaction_details";
  @SerializedName(SERIALIZED_NAME_MEETING_INTERACTION_DETAILS)
  private String meetingInteractionDetails;

  public static final String SERIALIZED_NAME_MEETING_REMINDER_SMS1 = "meeting_reminder_sms_1";
  @SerializedName(SERIALIZED_NAME_MEETING_REMINDER_SMS1)
  private Boolean meetingReminderSms1;

  public static final String SERIALIZED_NAME_MEETING_REMINDER_SMS2 = "meeting_reminder_sms_2";
  @SerializedName(SERIALIZED_NAME_MEETING_REMINDER_SMS2)
  private Boolean meetingReminderSms2;

  public static final String SERIALIZED_NAME_MIN_HOURS_BEFORE_MEETING = "min_hours_before_meeting";
  @SerializedName(SERIALIZED_NAME_MIN_HOURS_BEFORE_MEETING)
  private Integer minHoursBeforeMeeting;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAX_ATTENDANCE = "max_attendance";
  @SerializedName(SERIALIZED_NAME_MAX_ATTENDANCE)
  private Integer maxAttendance;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_PADDING = "padding";
  @SerializedName(SERIALIZED_NAME_PADDING)
  private Integer padding;

  public static final String SERIALIZED_NAME_PHOTO_PATH = "photo_path";
  @SerializedName(SERIALIZED_NAME_PHOTO_PATH)
  private String photoPath;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_REMIND_BEFORE_IN_HOURS1 = "remind_before_in_hours_1";
  @SerializedName(SERIALIZED_NAME_REMIND_BEFORE_IN_HOURS1)
  private Float remindBeforeInHours1;

  public static final String SERIALIZED_NAME_REMIND_BEFORE_IN_HOURS2 = "remind_before_in_hours_2";
  @SerializedName(SERIALIZED_NAME_REMIND_BEFORE_IN_HOURS2)
  private Integer remindBeforeInHours2;

  public static final String SERIALIZED_NAME_RWG_ELIGIBLE = "rwg_eligible";
  @SerializedName(SERIALIZED_NAME_RWG_ELIGIBLE)
  private Boolean rwgEligible;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_SMS_BOOKING_CONFIRMATION = "sms_booking_confirmation";
  @SerializedName(SERIALIZED_NAME_SMS_BOOKING_CONFIRMATION)
  private Boolean smsBookingConfirmation;

  public static final String SERIALIZED_NAME_STAFF_SETTINGS = "staff_settings";
  @SerializedName(SERIALIZED_NAME_STAFF_SETTINGS)
  private StaffSettings staffSettings;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Service() { 
  }

  public Service autoFollowUpHours(Integer autoFollowUpHours) {
    
    this.autoFollowUpHours = autoFollowUpHours;
    return this;
  }

   /**
   * Get autoFollowUpHours
   * @return autoFollowUpHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutoFollowUpHours() {
    return autoFollowUpHours;
  }


  public void setAutoFollowUpHours(Integer autoFollowUpHours) {
    this.autoFollowUpHours = autoFollowUpHours;
  }


  public Service approvalMode(String approvalMode) {
    
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


  public Service bookingRestriction(BookingRestriction bookingRestriction) {
    
    this.bookingRestriction = bookingRestriction;
    return this;
  }

   /**
   * Get bookingRestriction
   * @return bookingRestriction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BookingRestriction getBookingRestriction() {
    return bookingRestriction;
  }


  public void setBookingRestriction(BookingRestriction bookingRestriction) {
    this.bookingRestriction = bookingRestriction;
  }


  public Service businessEnabled(Boolean businessEnabled) {
    
    this.businessEnabled = businessEnabled;
    return this;
  }

   /**
   * Get businessEnabled
   * @return businessEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBusinessEnabled() {
    return businessEnabled;
  }


  public void setBusinessEnabled(Boolean businessEnabled) {
    this.businessEnabled = businessEnabled;
  }


  public Service businessUid(String businessUid) {
    
    this.businessUid = businessUid;
    return this;
  }

   /**
   * Get businessUid
   * @return businessUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessUid() {
    return businessUid;
  }


  public void setBusinessUid(String businessUid) {
    this.businessUid = businessUid;
  }


  public Service chargeType(String chargeType) {
    
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


  public Service colorId(Integer colorId) {
    
    this.colorId = colorId;
    return this;
  }

   /**
   * Get colorId
   * @return colorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getColorId() {
    return colorId;
  }


  public void setColorId(Integer colorId) {
    this.colorId = colorId;
  }


  public Service currency(String currency) {
    
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


  public Service createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Service defaultStaff(Object defaultStaff) {
    
    this.defaultStaff = defaultStaff;
    return this;
  }

   /**
   * Get defaultStaff
   * @return defaultStaff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDefaultStaff() {
    return defaultStaff;
  }


  public void setDefaultStaff(Object defaultStaff) {
    this.defaultStaff = defaultStaff;
  }


  public Service description(String description) {
    
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


  public Service display(Boolean display) {
    
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisplay() {
    return display;
  }


  public void setDisplay(Boolean display) {
    this.display = display;
  }


  public Service displayMissingError(Boolean displayMissingError) {
    
    this.displayMissingError = displayMissingError;
    return this;
  }

   /**
   * Get displayMissingError
   * @return displayMissingError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisplayMissingError() {
    return displayMissingError;
  }


  public void setDisplayMissingError(Boolean displayMissingError) {
    this.displayMissingError = displayMissingError;
  }


  public Service duration(Integer duration) {
    
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


  public Service eventDisplayRemainingSpots(Boolean eventDisplayRemainingSpots) {
    
    this.eventDisplayRemainingSpots = eventDisplayRemainingSpots;
    return this;
  }

   /**
   * Get eventDisplayRemainingSpots
   * @return eventDisplayRemainingSpots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEventDisplayRemainingSpots() {
    return eventDisplayRemainingSpots;
  }


  public void setEventDisplayRemainingSpots(Boolean eventDisplayRemainingSpots) {
    this.eventDisplayRemainingSpots = eventDisplayRemainingSpots;
  }


  public Service futureBookingsLimit(Integer futureBookingsLimit) {
    
    this.futureBookingsLimit = futureBookingsLimit;
    return this;
  }

   /**
   * Get futureBookingsLimit
   * @return futureBookingsLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFutureBookingsLimit() {
    return futureBookingsLimit;
  }


  public void setFutureBookingsLimit(Integer futureBookingsLimit) {
    this.futureBookingsLimit = futureBookingsLimit;
  }


  public Service id(String id) {
    
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


  public Service imagePath(String imagePath) {
    
    this.imagePath = imagePath;
    return this;
  }

   /**
   * Get imagePath
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImagePath() {
    return imagePath;
  }


  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }


  public Service interactionType(String interactionType) {
    
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


  public Service meetingInteractionDetails(String meetingInteractionDetails) {
    
    this.meetingInteractionDetails = meetingInteractionDetails;
    return this;
  }

   /**
   * Get meetingInteractionDetails
   * @return meetingInteractionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMeetingInteractionDetails() {
    return meetingInteractionDetails;
  }


  public void setMeetingInteractionDetails(String meetingInteractionDetails) {
    this.meetingInteractionDetails = meetingInteractionDetails;
  }


  public Service meetingReminderSms1(Boolean meetingReminderSms1) {
    
    this.meetingReminderSms1 = meetingReminderSms1;
    return this;
  }

   /**
   * Get meetingReminderSms1
   * @return meetingReminderSms1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMeetingReminderSms1() {
    return meetingReminderSms1;
  }


  public void setMeetingReminderSms1(Boolean meetingReminderSms1) {
    this.meetingReminderSms1 = meetingReminderSms1;
  }


  public Service meetingReminderSms2(Boolean meetingReminderSms2) {
    
    this.meetingReminderSms2 = meetingReminderSms2;
    return this;
  }

   /**
   * Get meetingReminderSms2
   * @return meetingReminderSms2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMeetingReminderSms2() {
    return meetingReminderSms2;
  }


  public void setMeetingReminderSms2(Boolean meetingReminderSms2) {
    this.meetingReminderSms2 = meetingReminderSms2;
  }


  public Service minHoursBeforeMeeting(Integer minHoursBeforeMeeting) {
    
    this.minHoursBeforeMeeting = minHoursBeforeMeeting;
    return this;
  }

   /**
   * Get minHoursBeforeMeeting
   * @return minHoursBeforeMeeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinHoursBeforeMeeting() {
    return minHoursBeforeMeeting;
  }


  public void setMinHoursBeforeMeeting(Integer minHoursBeforeMeeting) {
    this.minHoursBeforeMeeting = minHoursBeforeMeeting;
  }


  public Service name(String name) {
    
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


  public Service maxAttendance(Integer maxAttendance) {
    
    this.maxAttendance = maxAttendance;
    return this;
  }

   /**
   * Get maxAttendance
   * @return maxAttendance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxAttendance() {
    return maxAttendance;
  }


  public void setMaxAttendance(Integer maxAttendance) {
    this.maxAttendance = maxAttendance;
  }


  public Service order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public Service padding(Integer padding) {
    
    this.padding = padding;
    return this;
  }

   /**
   * Get padding
   * @return padding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPadding() {
    return padding;
  }


  public void setPadding(Integer padding) {
    this.padding = padding;
  }


  public Service photoPath(String photoPath) {
    
    this.photoPath = photoPath;
    return this;
  }

   /**
   * Get photoPath
   * @return photoPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhotoPath() {
    return photoPath;
  }


  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }


  public Service price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public Service remindBeforeInHours1(Float remindBeforeInHours1) {
    
    this.remindBeforeInHours1 = remindBeforeInHours1;
    return this;
  }

   /**
   * Get remindBeforeInHours1
   * @return remindBeforeInHours1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getRemindBeforeInHours1() {
    return remindBeforeInHours1;
  }


  public void setRemindBeforeInHours1(Float remindBeforeInHours1) {
    this.remindBeforeInHours1 = remindBeforeInHours1;
  }


  public Service remindBeforeInHours2(Integer remindBeforeInHours2) {
    
    this.remindBeforeInHours2 = remindBeforeInHours2;
    return this;
  }

   /**
   * Get remindBeforeInHours2
   * @return remindBeforeInHours2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRemindBeforeInHours2() {
    return remindBeforeInHours2;
  }


  public void setRemindBeforeInHours2(Integer remindBeforeInHours2) {
    this.remindBeforeInHours2 = remindBeforeInHours2;
  }


  public Service rwgEligible(Boolean rwgEligible) {
    
    this.rwgEligible = rwgEligible;
    return this;
  }

   /**
   * Get rwgEligible
   * @return rwgEligible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRwgEligible() {
    return rwgEligible;
  }


  public void setRwgEligible(Boolean rwgEligible) {
    this.rwgEligible = rwgEligible;
  }


  public Service serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public Service smsBookingConfirmation(Boolean smsBookingConfirmation) {
    
    this.smsBookingConfirmation = smsBookingConfirmation;
    return this;
  }

   /**
   * Get smsBookingConfirmation
   * @return smsBookingConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSmsBookingConfirmation() {
    return smsBookingConfirmation;
  }


  public void setSmsBookingConfirmation(Boolean smsBookingConfirmation) {
    this.smsBookingConfirmation = smsBookingConfirmation;
  }


  public Service staffSettings(StaffSettings staffSettings) {
    
    this.staffSettings = staffSettings;
    return this;
  }

   /**
   * Get staffSettings
   * @return staffSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StaffSettings getStaffSettings() {
    return staffSettings;
  }


  public void setStaffSettings(StaffSettings staffSettings) {
    this.staffSettings = staffSettings;
  }


  public Service type(String type) {
    
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


  public Service updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.autoFollowUpHours, service.autoFollowUpHours) &&
        Objects.equals(this.approvalMode, service.approvalMode) &&
        Objects.equals(this.bookingRestriction, service.bookingRestriction) &&
        Objects.equals(this.businessEnabled, service.businessEnabled) &&
        Objects.equals(this.businessUid, service.businessUid) &&
        Objects.equals(this.chargeType, service.chargeType) &&
        Objects.equals(this.colorId, service.colorId) &&
        Objects.equals(this.currency, service.currency) &&
        Objects.equals(this.createdAt, service.createdAt) &&
        Objects.equals(this.defaultStaff, service.defaultStaff) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.display, service.display) &&
        Objects.equals(this.displayMissingError, service.displayMissingError) &&
        Objects.equals(this.duration, service.duration) &&
        Objects.equals(this.eventDisplayRemainingSpots, service.eventDisplayRemainingSpots) &&
        Objects.equals(this.futureBookingsLimit, service.futureBookingsLimit) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.imagePath, service.imagePath) &&
        Objects.equals(this.interactionType, service.interactionType) &&
        Objects.equals(this.meetingInteractionDetails, service.meetingInteractionDetails) &&
        Objects.equals(this.meetingReminderSms1, service.meetingReminderSms1) &&
        Objects.equals(this.meetingReminderSms2, service.meetingReminderSms2) &&
        Objects.equals(this.minHoursBeforeMeeting, service.minHoursBeforeMeeting) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.maxAttendance, service.maxAttendance) &&
        Objects.equals(this.order, service.order) &&
        Objects.equals(this.padding, service.padding) &&
        Objects.equals(this.photoPath, service.photoPath) &&
        Objects.equals(this.price, service.price) &&
        Objects.equals(this.remindBeforeInHours1, service.remindBeforeInHours1) &&
        Objects.equals(this.remindBeforeInHours2, service.remindBeforeInHours2) &&
        Objects.equals(this.rwgEligible, service.rwgEligible) &&
        Objects.equals(this.serviceType, service.serviceType) &&
        Objects.equals(this.smsBookingConfirmation, service.smsBookingConfirmation) &&
        Objects.equals(this.staffSettings, service.staffSettings) &&
        Objects.equals(this.type, service.type) &&
        Objects.equals(this.updatedAt, service.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFollowUpHours, approvalMode, bookingRestriction, businessEnabled, businessUid, chargeType, colorId, currency, createdAt, defaultStaff, description, display, displayMissingError, duration, eventDisplayRemainingSpots, futureBookingsLimit, id, imagePath, interactionType, meetingInteractionDetails, meetingReminderSms1, meetingReminderSms2, minHoursBeforeMeeting, name, maxAttendance, order, padding, photoPath, price, remindBeforeInHours1, remindBeforeInHours2, rwgEligible, serviceType, smsBookingConfirmation, staffSettings, type, updatedAt);
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
    sb.append("class Service {\n");
    sb.append("    autoFollowUpHours: ").append(toIndentedString(autoFollowUpHours)).append("\n");
    sb.append("    approvalMode: ").append(toIndentedString(approvalMode)).append("\n");
    sb.append("    bookingRestriction: ").append(toIndentedString(bookingRestriction)).append("\n");
    sb.append("    businessEnabled: ").append(toIndentedString(businessEnabled)).append("\n");
    sb.append("    businessUid: ").append(toIndentedString(businessUid)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    colorId: ").append(toIndentedString(colorId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultStaff: ").append(toIndentedString(defaultStaff)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    displayMissingError: ").append(toIndentedString(displayMissingError)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eventDisplayRemainingSpots: ").append(toIndentedString(eventDisplayRemainingSpots)).append("\n");
    sb.append("    futureBookingsLimit: ").append(toIndentedString(futureBookingsLimit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    meetingInteractionDetails: ").append(toIndentedString(meetingInteractionDetails)).append("\n");
    sb.append("    meetingReminderSms1: ").append(toIndentedString(meetingReminderSms1)).append("\n");
    sb.append("    meetingReminderSms2: ").append(toIndentedString(meetingReminderSms2)).append("\n");
    sb.append("    minHoursBeforeMeeting: ").append(toIndentedString(minHoursBeforeMeeting)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxAttendance: ").append(toIndentedString(maxAttendance)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    photoPath: ").append(toIndentedString(photoPath)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    remindBeforeInHours1: ").append(toIndentedString(remindBeforeInHours1)).append("\n");
    sb.append("    remindBeforeInHours2: ").append(toIndentedString(remindBeforeInHours2)).append("\n");
    sb.append("    rwgEligible: ").append(toIndentedString(rwgEligible)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    smsBookingConfirmation: ").append(toIndentedString(smsBookingConfirmation)).append("\n");
    sb.append("    staffSettings: ").append(toIndentedString(staffSettings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("auto_follow_up_hours");
    openapiFields.add("approval_mode");
    openapiFields.add("booking_restriction");
    openapiFields.add("business_enabled");
    openapiFields.add("business_uid");
    openapiFields.add("charge_type");
    openapiFields.add("color_id");
    openapiFields.add("currency");
    openapiFields.add("created_at");
    openapiFields.add("default_staff");
    openapiFields.add("description");
    openapiFields.add("display");
    openapiFields.add("display_missing_error");
    openapiFields.add("duration");
    openapiFields.add("event_display_remaining_spots");
    openapiFields.add("future_bookings_limit");
    openapiFields.add("id");
    openapiFields.add("image_path");
    openapiFields.add("interaction_type");
    openapiFields.add("meeting_interaction_details");
    openapiFields.add("meeting_reminder_sms_1");
    openapiFields.add("meeting_reminder_sms_2");
    openapiFields.add("min_hours_before_meeting");
    openapiFields.add("name");
    openapiFields.add("max_attendance");
    openapiFields.add("order");
    openapiFields.add("padding");
    openapiFields.add("photo_path");
    openapiFields.add("price");
    openapiFields.add("remind_before_in_hours_1");
    openapiFields.add("remind_before_in_hours_2");
    openapiFields.add("rwg_eligible");
    openapiFields.add("service_type");
    openapiFields.add("sms_booking_confirmation");
    openapiFields.add("staff_settings");
    openapiFields.add("type");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Service
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Service.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Service is not found in the empty JSON string", Service.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Service.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Service` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `booking_restriction`
      if (jsonObj.getAsJsonObject("booking_restriction") != null) {
        BookingRestriction.validateJsonObject(jsonObj.getAsJsonObject("booking_restriction"));
      }
      // validate the optional field `staff_settings`
      if (jsonObj.getAsJsonObject("staff_settings") != null) {
        StaffSettings.validateJsonObject(jsonObj.getAsJsonObject("staff_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Service.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Service' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Service> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Service.class));

       return (TypeAdapter<T>) new TypeAdapter<Service>() {
           @Override
           public void write(JsonWriter out, Service value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Service read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Service given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Service
  * @throws IOException if the JSON string is invalid with respect to Service
  */
  public static Service fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Service.class);
  }

 /**
  * Convert an instance of Service to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

