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
import com.vcita.platform.client.model.ClientsMergesMergeClientsPut200Response;
import com.vcita.platform.client.model.ClientsMergesPossibleMergeMasterGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MattersApi
 */
@Ignore
public class MattersApiTest {

    private final MattersApi api = new MattersApi();

    
    /**
     * Merge duplicate clients into a primary client.
     *
     * Merge two or more duplicate clients into one primary client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsMergesMergeClientsPutTest() throws ApiException {
        String toClientUid = null;
        String fromClientUids = null;
        String authorization = null;
                ClientsMergesMergeClientsPut200Response response = api.clientsMergesMergeClientsPut(toClientUid, fromClientUids, authorization);
        // TODO: test validations
    }
    
    /**
     * List of clients that can be used as primary for merge.
     *
     * Returns a list of client UIDs that can be used as a primary client for the merge.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsMergesPossibleMergeMasterGetTest() throws ApiException {
        String clientIds = null;
        String authorization = null;
                ClientsMergesPossibleMergeMasterGet200Response response = api.clientsMergesPossibleMergeMasterGet(clientIds, authorization);
        // TODO: test validations
    }
    
}
