package com.enxendra.huf.api.model.organization;

public class Activity {

    public Long id;
    public String date;
    public String action;
    public String initial_state;
    public String end_state;
    public String user;
    public String message;
    public String ip;
    public String browser;
    public String user_agent;
    public String invoice_id;
    public String invoice_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getInitialState() {
        return initial_state;
    }

    public void setInitialState(String initial_state) {
        this.initial_state = initial_state;
    }

    public String getEndState() {
        return end_state;
    }

    public void setEndState(String end_state) {
        this.end_state = end_state;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getUserAgent() {
        return user_agent;
    }

    public void setUserAgent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getInvoiceId() {
        return invoice_id;
    }

    public void setInvoiceId(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getInvoiceNumber() {
        return invoice_number;
    }

    public void setInvoiceNumber(String invoice_number) {
        this.invoice_number = invoice_number;
    }

}
