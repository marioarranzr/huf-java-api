package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class CustomerListResponse extends HUFResponse {

    public CustomerList data;

    public CustomerList getData() {
        return data;
    }

    public void setData(CustomerList data) {
        this.data = data;
    }
}
