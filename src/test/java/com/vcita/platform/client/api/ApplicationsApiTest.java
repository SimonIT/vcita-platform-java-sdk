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
import com.vcita.platform.client.model.AppsGet201Response;
import com.vcita.platform.client.model.AppsIdAssignPost201Response;
import com.vcita.platform.client.model.AppsIdGet200Response;
import com.vcita.platform.client.model.AppsIdInstallAppPost201Response;
import com.vcita.platform.client.model.AppsIdInstallAppPost422Response;
import com.vcita.platform.client.model.AppsIdPut200Response;
import com.vcita.platform.client.model.AppsIdUnassignPost201Response;
import com.vcita.platform.client.model.AppsIdUninstallAppPost201Response;
import com.vcita.platform.client.model.AppsIdUninstallAppPost422Response;
import com.vcita.platform.client.model.AppsPost201Response;
import com.vcita.platform.client.model.InlineObject;
import com.vcita.platform.client.model.InlineObject1;
import com.vcita.platform.client.model.InlineObject2;
import com.vcita.platform.client.model.InlineObject3;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
@Ignore
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    
    /**
     * List of apps
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsGetTest() throws ApiException {
        String authorization = null;
                AppsGet201Response response = api.appsGet(authorization);
        // TODO: test validations
    }
    
    /**
     * Assign an app on directory or a business [Internal]
     *
     * Assign an application to business or directory so that it can be viewed in the App Market
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdAssignPostTest() throws ApiException {
        String id = null;
        String authorization = null;
        InlineObject2 inlineObject2 = null;
                AppsIdAssignPost201Response response = api.appsIdAssignPost(id, authorization, inlineObject2);
        // TODO: test validations
    }
    
    /**
     * Read an app
     *
     * Returns an app its by code name, if it is associated with the token&#39;s directory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdGetTest() throws ApiException {
        String id = null;
        String authorization = null;
                AppsIdGet200Response response = api.appsIdGet(id, authorization);
        // TODO: test validations
    }
    
    /**
     * Install an app [Internal]
     *
     * Installs an app for the business whose token was used for authorization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdInstallAppPostTest() throws ApiException {
        String id = null;
        String authorization = null;
        Object body = null;
                AppsIdInstallAppPost201Response response = api.appsIdInstallAppPost(id, authorization, body);
        // TODO: test validations
    }
    
    /**
     * Updates an app
     *
     * Updates an app by the code name specified in the path
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdPutTest() throws ApiException {
        String id = null;
        String authorization = null;
        InlineObject1 inlineObject1 = null;
                AppsIdPut200Response response = api.appsIdPut(id, authorization, inlineObject1);
        // TODO: test validations
    }
    
    /**
     * Unassign an app on directory or a business [Internal]
     *
     * Unassign an application from business or directory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdUnassignPostTest() throws ApiException {
        String id = null;
        String authorization = null;
        InlineObject3 inlineObject3 = null;
                AppsIdUnassignPost201Response response = api.appsIdUnassignPost(id, authorization, inlineObject3);
        // TODO: test validations
    }
    
    /**
     * Uninstall an app [Internal]
     *
     * Uninstalls an app for the business whose token was used for authorization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsIdUninstallAppPostTest() throws ApiException {
        String id = null;
        String authorization = null;
        Object body = null;
                AppsIdUninstallAppPost201Response response = api.appsIdUninstallAppPost(id, authorization, body);
        // TODO: test validations
    }
    
    /**
     * Creates an app
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appsPostTest() throws ApiException {
        String authorization = null;
        InlineObject inlineObject = null;
                AppsPost201Response response = api.appsPost(authorization, inlineObject);
        // TODO: test validations
    }
    
}
