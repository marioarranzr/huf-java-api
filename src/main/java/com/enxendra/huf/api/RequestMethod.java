package com.enxendra.huf.api;

public enum RequestMethod {
    POST("POST"), GET("GET"), DELETE("DELETE"), PUT("PUT");

    private final String text;

    private RequestMethod(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
