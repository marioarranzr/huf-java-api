package com.enxendra.huf.api.exception;

@SuppressWarnings("serial")
public class APIConnectionException extends HUFException {

    public APIConnectionException(String message) {
        super("SN", message);
    }

    public APIConnectionException(String message, Throwable e) {
        super(message, "SN", e);
    }

}
