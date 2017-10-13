package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.user.UserListResponse;
import com.enxendra.huf.api.model.user.UserResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class UserService extends HUFService {

    private static final String SERVICE_PATH = "users";

    public UserService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public UserResponse getUser(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        UserResponse response = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        response.check();
        return response;
    }

    public UserResponse createUser(JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        UserResponse response = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        response.check();
        return response;
    }

    public UserResponse updateUser(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        UserResponse response = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        response.check();
        return response;
    }

    public UserResponse deleteUser(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        UserResponse response = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        response.check();
        return response;
    }

    public UserListResponse listUsers() throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        UserListResponse response = (new Gson()).fromJson(jsonResponse, UserListResponse.class);
        response.check();
        return response;
    }

}
