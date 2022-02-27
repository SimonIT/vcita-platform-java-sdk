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
import com.vcita.platform.client.model.InlineObject16;
import com.vcita.platform.client.model.MessagesPost201Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
@Ignore
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();

    
    /**
     * Create a Message
     *
     * Creates a Message.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void messagesPostTest() throws ApiException {
        String authorization = null;
        InlineObject16 inlineObject16 = null;
                MessagesPost201Response response = api.messagesPost(authorization, inlineObject16);
        // TODO: test validations
    }
    
}
