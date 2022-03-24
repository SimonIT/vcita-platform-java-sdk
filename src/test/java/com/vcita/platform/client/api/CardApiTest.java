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
import com.vcita.platform.client.model.InlineObject17;
import com.vcita.platform.client.model.PaymentCardsSyncCardPost201Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardApi
 */
@Disabled
public class CardApiTest {

    private final CardApi api = new CardApi();

    /**
     * Create sync card
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentCardsSyncCardPostTest() throws ApiException {
        String authorization = null;
        InlineObject17 inlineObject17 = null;
        PaymentCardsSyncCardPost201Response response = api.paymentCardsSyncCardPost(authorization, inlineObject17);
        // TODO: test validations
    }

}
