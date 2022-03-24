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
import com.vcita.platform.client.model.ClientsClientIdDelete200Response;
import com.vcita.platform.client.model.ClientsClientIdGet200Response;
import com.vcita.platform.client.model.ClientsClientIdPut200Response;
import com.vcita.platform.client.model.ClientsGet200Response;
import com.vcita.platform.client.model.ClientsPost201Response;
import com.vcita.platform.client.model.GlobalClientsGet200Response;
import com.vcita.platform.client.model.InlineObject8;
import com.vcita.platform.client.model.InlineObject9;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsApi
 */
@Disabled
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();

    /**
     * Deletes a Client by Id
     *
     * Deletes a Client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientsClientIdDeleteTest() throws ApiException {
        String clientId = null;
        String authorization = null;
        ClientsClientIdDelete200Response response = api.clientsClientIdDelete(clientId, authorization);
        // TODO: test validations
    }

    /**
     * Retrieves a Client by Id
     *
     * Retrieves a Client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientsClientIdGetTest() throws ApiException {
        String clientId = null;
        String authorization = null;
        ClientsClientIdGet200Response response = api.clientsClientIdGet(clientId, authorization);
        // TODO: test validations
    }

    /**
     * Updates a Client
     *
     * Update a Client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientsClientIdPutTest() throws ApiException {
        String clientId = null;
        String authorization = null;
        InlineObject9 inlineObject9 = null;
        ClientsClientIdPut200Response response = api.clientsClientIdPut(clientId, authorization, inlineObject9);
        // TODO: test validations
    }

    /**
     * Get Clients
     *
     * Gets a list of clients or search by client attributes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientsGetTest() throws ApiException {
        String authorization = null;
        String searchTerm = null;
        String searchBy = null;
        Integer page = null;
        Integer perPage = null;
        ClientsGet200Response response = api.clientsGet(authorization, searchTerm, searchBy, page, perPage);
        // TODO: test validations
    }

    /**
     * Create a Client
     *
     * Creates a Client and returns the new client&#39;s data and the client&#39;s JWT token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientsPostTest() throws ApiException {
        String authorization = null;
        InlineObject8 inlineObject8 = null;
        ClientsPost201Response response = api.clientsPost(authorization, inlineObject8);
        // TODO: test validations
    }

    /**
     * Gets a list of clients
     *
     * Gets a list of clients
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalClientsGetTest() throws ApiException {
        String date = null;
        String authorization = null;
        Integer page = null;
        GlobalClientsGet200Response response = api.globalClientsGet(date, authorization, page);
        // TODO: test validations
    }

}
