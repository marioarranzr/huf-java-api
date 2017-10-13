package com.enxendra.huf.api.model.user;

import com.enxendra.huf.api.model.HUFResponse;

public class UserResponse extends HUFResponse {

    public User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

}
