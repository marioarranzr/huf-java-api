package com.enxendra.huf.api;

public class RequestOptions {

    private String clientVersion = Constants.VERSION;

    private String apiKey;
    private String apiBase;
    private String userToken;

    public RequestOptions() {}

    public RequestOptions(String apiKey, String apiBase, String userToken) {
        super();
        this.apiKey = apiKey;
        this.apiBase = apiBase;
        this.userToken = userToken;
    }

    public RequestOptions(String apiKey, String apiBase) {
        super();
        this.apiKey = apiKey;
        this.apiBase = apiBase;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiBase() {
        return apiBase;
    }

    public void setApiBase(String apiBase) {
        this.apiBase = apiBase;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

}
