package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class CustomerResponse extends HUFResponse {

    private Customer data;

    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }

}
