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
import com.vcita.platform.client.model.InlineObject20;
import com.vcita.platform.client.model.InlineObject21;
import com.vcita.platform.client.model.PaymentPackagesGet200Response;
import com.vcita.platform.client.model.PaymentPackagesGet422Response;
import com.vcita.platform.client.model.PaymentPackagesPackageIdGet200Response;
import com.vcita.platform.client.model.PaymentPackagesPackageIdGet422Response;
import com.vcita.platform.client.model.PaymentPackagesPackageIdPut200Response;
import com.vcita.platform.client.model.PaymentPackagesPackageIdPut422Response;
import com.vcita.platform.client.model.PaymentPackagesPost201Response;
import com.vcita.platform.client.model.PaymentPackagesPost422Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackagesApi
 */
@Disabled
public class PackagesApiTest {

    private final PackagesApi api = new PackagesApi();

    /**
     * Get all package of business
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentPackagesGetTest() throws ApiException {
        String authorization = null;
        String includeItems = null;
        PaymentPackagesGet200Response response = api.paymentPackagesGet(authorization, includeItems);
        // TODO: test validations
    }

    /**
     * Show package info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentPackagesPackageIdGetTest() throws ApiException {
        String authorization = null;
        String packageId = null;
        PaymentPackagesPackageIdGet200Response response = api.paymentPackagesPackageIdGet(authorization, packageId);
        // TODO: test validations
    }

    /**
     * Update package [Alpha]
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentPackagesPackageIdPutTest() throws ApiException {
        String authorization = null;
        String packageId = null;
        InlineObject21 inlineObject21 = null;
        PaymentPackagesPackageIdPut200Response response = api.paymentPackagesPackageIdPut(authorization, packageId, inlineObject21);
        // TODO: test validations
    }

    /**
     * Create Package 
     *
     * Create a package and its corresponding items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentPackagesPostTest() throws ApiException {
        String authorization = null;
        InlineObject20 inlineObject20 = null;
        PaymentPackagesPost201Response response = api.paymentPackagesPost(authorization, inlineObject20);
        // TODO: test validations
    }

}
