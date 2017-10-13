package com.enxendra.huf.api.model.user;

import com.enxendra.huf.api.model.HUFResponse;

public class LoginResponse extends HUFResponse {

    private Login data;

    public Login getData() {
        return data;
    }

    public void setData(Login data) {
        this.data = data;
    }

}
