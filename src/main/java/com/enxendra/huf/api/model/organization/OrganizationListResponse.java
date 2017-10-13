package com.enxendra.huf.api.model.organization;

import com.enxendra.huf.api.model.HUFResponse;

public class OrganizationListResponse extends HUFResponse {

    public OrganizationList data;

    public OrganizationList getData() {
        return data;
    }

    public void setData(OrganizationList data) {
        this.data = data;
    }
}
