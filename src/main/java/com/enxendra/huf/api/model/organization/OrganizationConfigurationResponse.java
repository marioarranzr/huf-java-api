package com.enxendra.huf.api.model.organization;

import com.enxendra.huf.api.model.HUFResponse;

public class OrganizationConfigurationResponse extends HUFResponse {

    private OrganizationConfiguration data;

    public OrganizationConfiguration getData() {
        return data;
    }

    public void setData(OrganizationConfiguration data) {
        this.data = data;
    }

}
