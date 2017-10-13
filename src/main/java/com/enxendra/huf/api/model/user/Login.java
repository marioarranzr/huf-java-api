package com.enxendra.huf.api.model.user;

public class Login {

    private String user_name;
    private String user_token;

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserToken() {
        return user_token;
    }

    public void setUserToken(String user_token) {
        this.user_token = user_token;
    }
}
