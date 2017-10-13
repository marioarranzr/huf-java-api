package com.enxendra.huf.api.model.user;

import com.enxendra.huf.api.model.HUFResponse;

public class UserListResponse extends HUFResponse {

    public UserList data;

    public UserList getData() {
        return data;
    }

    public void setData(UserList data) {
        this.data = data;
    }
}
