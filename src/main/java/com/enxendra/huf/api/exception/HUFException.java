package com.enxendra.huf.api.exception;

@SuppressWarnings("serial")
public class HUFException extends RuntimeException {

    Throwable e;
    String message;
    String code;

    public HUFException(Throwable e) {
        this.e = e;
    }

    public HUFException(String message) {
        this.message = message;
    }

    public HUFException(Throwable e, String code) {
        this.e = e;
        this.code = code;
    }

    public HUFException(String message, String code, Throwable e) {
        this.e = e;
        this.message = message;
        this.code = code;
    }

    public HUFException(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public Throwable getEx() {
        return e;
    }

    public void setE(Throwable e) {
        this.e = e;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
