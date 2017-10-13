package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class RolesResponse extends HUFResponse {

    public RolesMap data;

    public RolesMap getData() {
        return data;
    }

    public void setData(RolesMap data) {
        this.data = data;
    }

}
