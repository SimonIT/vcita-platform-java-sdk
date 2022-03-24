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
import com.vcita.platform.client.model.BusinessesBusinessIdStaffsGet200Response;
import com.vcita.platform.client.model.BusinessesBusinessIdStaffsPost200Response;
import com.vcita.platform.client.model.BusinessesBusinessIdStaffsStaffIdDelete200Response;
import com.vcita.platform.client.model.BusinessesBusinessIdStaffsStaffIdGet200Response;
import com.vcita.platform.client.model.GlobalStaffsGet200Response;
import com.vcita.platform.client.model.InlineObject6;
import com.vcita.platform.client.model.SchedulingStaffGet200Response;
import com.vcita.platform.client.model.SchedulingStaffStaffIdGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaffApi
 */
@Disabled
public class StaffApiTest {

    private final StaffApi api = new StaffApi();

    /**
     * Get Staff Members
     *
     * Get Staff List and Details (ordered by position field).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void businessesBusinessIdStaffsGetTest() throws ApiException {
        String authorization = null;
        String businessId = null;
        String status = null;
        BusinessesBusinessIdStaffsGet200Response response = api.businessesBusinessIdStaffsGet(authorization, businessId, status);
        // TODO: test validations
    }

    /**
     * Create Staff Member
     *
     * Creates a Staff.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void businessesBusinessIdStaffsPostTest() throws ApiException {
        String businessId = null;
        String authorization = null;
        InlineObject6 inlineObject6 = null;
        BusinessesBusinessIdStaffsPost200Response response = api.businessesBusinessIdStaffsPost(businessId, authorization, inlineObject6);
        // TODO: test validations
    }

    /**
     * Delete Staff Member
     *
     * Delete Staff Member.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void businessesBusinessIdStaffsStaffIdDeleteTest() throws ApiException {
        String authorization = null;
        String businessId = null;
        String staffId = null;
        BusinessesBusinessIdStaffsStaffIdDelete200Response response = api.businessesBusinessIdStaffsStaffIdDelete(authorization, businessId, staffId);
        // TODO: test validations
    }

    /**
     * Get Staff Member Details
     *
     * Get Staff Details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void businessesBusinessIdStaffsStaffIdGetTest() throws ApiException {
        String authorization = null;
        String businessId = null;
        String staffId = null;
        BusinessesBusinessIdStaffsStaffIdGet200Response response = api.businessesBusinessIdStaffsStaffIdGet(authorization, businessId, staffId);
        // TODO: test validations
    }

    /**
     * Gets a list of staffs
     *
     * Gets a list of staffs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalStaffsGetTest() throws ApiException {
        String date = null;
        String authorization = null;
        Integer page = null;
        GlobalStaffsGet200Response response = api.globalStaffsGet(date, authorization, page);
        // TODO: test validations
    }

    /**
     * Get Staff List [Alpha]
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void schedulingStaffGetTest() throws ApiException {
        String businessId = null;
        String onlyActiveServices = null;
        String serviceId = null;
        String categoryId = null;
        SchedulingStaffGet200Response response = api.schedulingStaffGet(businessId, onlyActiveServices, serviceId, categoryId);
        // TODO: test validations
    }

    /**
     * Get Staff By ID [Alpha]
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void schedulingStaffStaffIdGetTest() throws ApiException {
        String staffId = null;
        String businessId = null;
        String onlyActiveServices = null;
        SchedulingStaffStaffIdGet200Response response = api.schedulingStaffStaffIdGet(staffId, businessId, onlyActiveServices);
        // TODO: test validations
    }

}
