package com.enxendra.huf.api.exception;

@SuppressWarnings("serial")
public class APIException extends HUFException {

    public APIException(String message, String requestId, Integer code, Throwable e) {
        super(message, code + "", e);
    }

}
