package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.organization.ActivityResponse;
import com.enxendra.huf.api.model.organization.OrganizationConfigurationResponse;
import com.enxendra.huf.api.model.organization.OrganizationListResponse;
import com.enxendra.huf.api.model.organization.OrganizationResponse;
import com.enxendra.huf.api.model.serie.SerieListResponse;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class OrganizationService extends HUFService {

    private static final String SERVICE_PATH = "organizations";

    public OrganizationService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public OrganizationResponse getOrganization(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        OrganizationResponse response = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        response.check();
        return response;
    }

    public OrganizationResponse createOrganization(JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        OrganizationResponse response = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        response.check();
        return response;
    }

    public OrganizationResponse updateOrganization(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        OrganizationResponse response = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        response.check();
        return response;
    }

    public OrganizationResponse deleteOrganization(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        OrganizationResponse response = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        response.check();
        return response;
    }

    public OrganizationListResponse listOrganizations() throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        OrganizationListResponse response = (new Gson()).fromJson(jsonResponse, OrganizationListResponse.class);
        response.check();
        return response;
    }

    public OrganizationConfigurationResponse getOrganizationConfiguration(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.GET);
        OrganizationConfigurationResponse response = (new Gson()).fromJson(jsonResponse,
                OrganizationConfigurationResponse.class);
        response.check();
        return response;
    }

    public OrganizationConfigurationResponse updateOrganizationConfiguration(Long id, JsonObject body)
            throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.PUT, body);
        OrganizationConfigurationResponse response = (new Gson()).fromJson(jsonResponse,
                OrganizationConfigurationResponse.class);
        response.check();
        return response;
    }

    public ActivityResponse activity(Long orgId, Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/activity", RequestMethod.GET, params);
        ActivityResponse response = (new Gson()).fromJson(jsonResponse, ActivityResponse.class);
        response.check();
        return response;
    }

    public OrganizationResponse deleteActivity(Long orgId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/activity/" + id, RequestMethod.DELETE);
        OrganizationResponse response = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        response.check();
        return response;
    }

    public SerieResponse getSerie(Long orgId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/series/" + id, RequestMethod.GET);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse createSerie(Long orgId, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/series/", RequestMethod.POST, body);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse updateSerie(Long orgId, Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/series/" + id, RequestMethod.PUT, body);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse deleteSerie(Long orgId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/series/" + id, RequestMethod.DELETE);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieListResponse listSeries(Long orgId) throws HUFException {
        JsonObject jsonResponse = callService("/" + orgId + "/series/", RequestMethod.GET);
        SerieListResponse response = (new Gson()).fromJson(jsonResponse, SerieListResponse.class);
        response.check();
        return response;
    }

}
