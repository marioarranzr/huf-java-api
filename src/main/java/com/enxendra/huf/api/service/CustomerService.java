package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerConfigurationResponse;
import com.enxendra.huf.api.model.customer.CustomerListResponse;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CustomerService extends HUFService {

    private static final String SERVICE_PATH = "customers";

    public CustomerService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

    public CustomerResponse getCustomer(Long customerId) throws HUFException {
        JsonObject jsonResponse = callService("/" + customerId, RequestMethod.GET);
        CustomerResponse response = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        response.check();
        return response;
    }

    public CustomerResponse createCustomer(JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        CustomerResponse response = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        response.check();
        return response;
    }

    public CustomerResponse updateCustomer(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        CustomerResponse response = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        response.check();
        return response;
    }

    public CustomerResponse deleteCustomer(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        CustomerResponse response = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        response.check();
        return response;
    }

    public CustomerListResponse listCustomers(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET, params);
        CustomerListResponse response = (new Gson()).fromJson(jsonResponse, CustomerListResponse.class);
        response.check();
        return response;
    }

    public CustomerResponse exportCustomers(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/export", RequestMethod.GET, params);
        CustomerResponse response = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        response.check();
        return response;
    }

    public CustomerListResponse topCustomers(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/top", RequestMethod.GET, params);
        CustomerListResponse response = (new Gson()).fromJson(jsonResponse, CustomerListResponse.class);
        response.check();
        return response;
    }

    public CustomerConfigurationResponse getCustomerConfiguration(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.GET);
        CustomerConfigurationResponse response = (new Gson()).fromJson(jsonResponse,
                CustomerConfigurationResponse.class);
        response.check();
        return response;
    }

    public CustomerConfigurationResponse updateCustomerConfiguration(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.PUT, body);
        CustomerConfigurationResponse response = (new Gson()).fromJson(jsonResponse,
                CustomerConfigurationResponse.class);
        response.check();
        return response;
    }

}
