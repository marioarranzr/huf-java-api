package com.enxendra.huf.api.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class HUFService {

    protected RequestOptions requestOptions;
    protected String urlBase;
    protected Integer connectTimeOut;
    protected Integer readTimeOut;

    public RequestOptions getRequestOptions() {
        return requestOptions;
    }

    public void setRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    protected JsonObject callService(String path, RequestMethod requestMethod) throws HUFException {
        return callService(path, requestMethod, null, null);
    }

    protected JsonObject callService(String path, RequestMethod requestMethod, Map<String, Object> queryParams)
            throws HUFException {
        return callService(path, requestMethod, queryParams, null);
    }

    protected JsonObject callService(String path, RequestMethod requestMethod, JsonObject body) throws HUFException {
        return callService(path, requestMethod, null, body);
    }

    protected JsonObject callService(String path, RequestMethod requestMethod, Map<String, Object> queryParams,
            JsonObject body) throws HUFException {

        JsonReader reader;
        JsonParser parser = new JsonParser();
        String endpoint = this.urlBase + path;

        try {

            // If there are queryParams and it is a GET request
            if (queryParams != null && queryParams.size() > 0 && requestMethod.equals(RequestMethod.GET))
                endpoint = this.urlBase + path + getQuery(queryParams);

            System.out.println(requestMethod.name() + " request to: " + endpoint);
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(endpoint).openConnection();

            // Add header
            System.out.println(Constants.CLIENT_VERSION + ": " + requestOptions.getClientVersion());

            if (requestOptions.getUserToken() != null)
                System.out.println(Constants.USER_TOKEN + ": " + requestOptions.getUserToken());

            System.out.println(Constants.CONTENT_TYPE + ": " + Constants.APP_JSON);
            System.out.println(Constants.AUTH + ": " + Constants.BASIC + " " + requestOptions.getApiKey());

            urlConnection.setRequestProperty(Constants.CONTENT_TYPE, Constants.APP_JSON);

            if (requestOptions.getUserToken() != null)
                urlConnection.setRequestProperty(Constants.USER_TOKEN, requestOptions.getUserToken());

            urlConnection.setRequestProperty(Constants.CLIENT_VERSION, requestOptions.getClientVersion());
            urlConnection.setRequestProperty(Constants.AUTH, Constants.BASIC + " " + requestOptions.getApiKey());
            urlConnection.setRequestMethod(requestMethod.name());

            if (getConnectTimeOut() != null)
                urlConnection.setConnectTimeout(getConnectTimeOut());

            if (getReadTimeOut() != null)
                urlConnection.setReadTimeout(getReadTimeOut());

            // Add body (only if there is a body JsonObject and it is not a GET request)
            if (body != null && !requestMethod.equals(RequestMethod.GET)) {
                urlConnection.setDoOutput(true);
                System.out.println("Body: " + body.toString());
                OutputStream os = urlConnection.getOutputStream();
                os.write(body.toString().getBytes());
                os.flush();
            }

            urlConnection.connect();

            try {
                reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));
            } catch (IOException e) {
                reader = new JsonReader(new InputStreamReader(urlConnection.getErrorStream()));
            }

            JsonElement rootElement = parser.parse(reader);

            // Add response code and message to the json object
            JsonObject jsonObject = rootElement.getAsJsonObject();
            jsonObject.addProperty("responseCode", urlConnection.getResponseCode());
            String responseMessage = urlConnection.getResponseMessage();
            jsonObject.addProperty("responseMessage", responseMessage.equals("Creado") ? "CREATED" : responseMessage);

            return jsonObject;

        } catch (Exception e) {
            throw new HUFException(e.getMessage(), "S/N", e);
        }

    }

    private String getQuery(Map<String, Object> params) throws UnsupportedEncodingException {

        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8")); // TODO: Review encoding
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
        }

        return "?" + result.toString();

    }

    public Integer getConnectTimeOut() {
        return connectTimeOut;
    }

    public void setConnectTimeOut(Integer connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
    }

    public Integer getReadTimeOut() {
        return readTimeOut;
    }

    public void setReadTimeOut(Integer readTimeOut) {
        this.readTimeOut = readTimeOut;
    }

}
