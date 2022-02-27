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
import com.vcita.platform.client.model.ClientsClientIdConversationsGet200Response;
import com.vcita.platform.client.model.ConversationsGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
@Ignore
public class ConversationsApiTest {

    private final ConversationsApi api = new ConversationsApi();

    
    /**
     * Get Conversations For A Client
     *
     * Gets a list of conversations for a client
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientsClientIdConversationsGetTest() throws ApiException {
        String clientId = null;
        String authorization = null;
                ClientsClientIdConversationsGet200Response response = api.clientsClientIdConversationsGet(clientId, authorization);
        // TODO: test validations
    }
    
    /**
     * Get Conversations
     *
     * Gets a list of conversations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsGetTest() throws ApiException {
        String authorization = null;
        Integer page = null;
        Integer perPage = null;
        String folder = null;
                ConversationsGet200Response response = api.conversationsGet(authorization, page, perPage, folder);
        // TODO: test validations
    }
    
}
