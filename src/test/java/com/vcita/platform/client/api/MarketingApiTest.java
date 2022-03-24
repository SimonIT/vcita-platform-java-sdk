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
import com.vcita.platform.client.model.GlobalCampaignRecipientsGet200Response;
import com.vcita.platform.client.model.GlobalCampaignsGet200Response;
import com.vcita.platform.client.model.GlobalScheduledCampaignsGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketingApi
 */
@Disabled
public class MarketingApiTest {

    private final MarketingApi api = new MarketingApi();

    /**
     * Gets a list of campaign recipients
     *
     * Gets a list of campaign recipients
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalCampaignRecipientsGetTest() throws ApiException {
        String date = null;
        String authorization = null;
        Integer page = null;
        GlobalCampaignRecipientsGet200Response response = api.globalCampaignRecipientsGet(date, authorization, page);
        // TODO: test validations
    }

    /**
     * Gets a list of campaigns
     *
     * Gets a list of campaigns
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalCampaignsGetTest() throws ApiException {
        String date = null;
        String authorization = null;
        Integer page = null;
        GlobalCampaignsGet200Response response = api.globalCampaignsGet(date, authorization, page);
        // TODO: test validations
    }

    /**
     * Gets a list of scheduled campaigns
     *
     * Gets a list of scheduled campaigns
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalScheduledCampaignsGetTest() throws ApiException {
        String date = null;
        String authorization = null;
        Integer page = null;
        GlobalScheduledCampaignsGet200Response response = api.globalScheduledCampaignsGet(date, authorization, page);
        // TODO: test validations
    }

}
