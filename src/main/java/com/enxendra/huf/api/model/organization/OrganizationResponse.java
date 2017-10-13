package com.enxendra.huf.api.model.organization;

import com.enxendra.huf.api.model.HUFResponse;

public class OrganizationResponse extends HUFResponse {

    public Organization data;

    public Organization getData() {
        return data;
    }

    public void setData(Organization data) {
        this.data = data;
    }

}
