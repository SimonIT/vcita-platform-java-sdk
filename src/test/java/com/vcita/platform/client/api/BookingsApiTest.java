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


package com.vcita.platform.client.api;

import com.vcita.platform.client.ApiException;
import com.vcita.platform.client.model.Booking;
import com.vcita.platform.client.model.InlineObject25;
import com.vcita.platform.client.model.InlineObject26;
import com.vcita.platform.client.model.InlineObject27;
import com.vcita.platform.client.model.InlineObject28;
import com.vcita.platform.client.model.InlineObject29;
import com.vcita.platform.client.model.SchedulingBookingsBookingUidUpdateRsvpStatePut200Response;
import com.vcita.platform.client.model.SchedulingBookingsCancelPost200Response;
import com.vcita.platform.client.model.SchedulingBookingsPost201Response;
import com.vcita.platform.client.model.SchedulingBookingsPost422Response;
import com.vcita.platform.client.model.SchedulingWaitlistCancelPut200Response;
import com.vcita.platform.client.model.SchedulingWaitlistPost201Response;
import com.vcita.platform.client.model.SchedulingWaitlistPost422Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookingsApi
 */
@Ignore
public class BookingsApiTest {

    private final BookingsApi api = new BookingsApi();

    
    /**
     * Update RSVP state
     *
     * Update RSVP state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingBookingsBookingUidUpdateRsvpStatePutTest() throws ApiException {
        String bookingUid = null;
        String newRsvpState = null;
        String authorization = null;
        InlineObject27 inlineObject27 = null;
                SchedulingBookingsBookingUidUpdateRsvpStatePut200Response response = api.schedulingBookingsBookingUidUpdateRsvpStatePut(bookingUid, newRsvpState, authorization, inlineObject27);
        // TODO: test validations
    }
    
    /**
     * Cancel a Booking [Alpha]
     *
     * cancel booking
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingBookingsCancelPostTest() throws ApiException {
        String authorization = null;
        InlineObject26 inlineObject26 = null;
                SchedulingBookingsCancelPost200Response response = api.schedulingBookingsCancelPost(authorization, inlineObject26);
        // TODO: test validations
    }
    
    /**
     * Get Bookings [Alpha] 
     *
     * Get bookings of client
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingBookingsGetTest() throws ApiException {
        String perPage = null;
        String offset = null;
        String businessId = null;
        String authorization = null;
        String matterUid = null;
        String passed = null;
        String startTime = null;
        String endTime = null;
                List<Booking> response = api.schedulingBookingsGet(perPage, offset, businessId, authorization, matterUid, passed, startTime, endTime);
        // TODO: test validations
    }
    
    /**
     * Create New Booking [Alpha]
     *
     * Create Booking
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingBookingsPostTest() throws ApiException {
        String authorization = null;
        InlineObject25 inlineObject25 = null;
                SchedulingBookingsPost201Response response = api.schedulingBookingsPost(authorization, inlineObject25);
        // TODO: test validations
    }
    
    /**
     * Cancel a Waitlist registration
     *
     * Cancel a Waitlist registration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingWaitlistCancelPutTest() throws ApiException {
        String authorization = null;
        InlineObject29 inlineObject29 = null;
                SchedulingWaitlistCancelPut200Response response = api.schedulingWaitlistCancelPut(authorization, inlineObject29);
        // TODO: test validations
    }
    
    /**
     * Create event Waitlist
     *
     * Create event Waitlist
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schedulingWaitlistPostTest() throws ApiException {
        String authorization = null;
        InlineObject28 inlineObject28 = null;
                SchedulingWaitlistPost201Response response = api.schedulingWaitlistPost(authorization, inlineObject28);
        // TODO: test validations
    }
    
}
