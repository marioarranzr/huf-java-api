package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class CustomerConfigurationResponse extends HUFResponse {

    private CustomerConfiguration data;

    public CustomerConfiguration getData() {
        return data;
    }

    public void setData(CustomerConfiguration data) {
        this.data = data;
    }

}
