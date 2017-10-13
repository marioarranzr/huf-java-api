package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class InvoiceResponse extends HUFResponse {

    public Invoice data;

    public Invoice getData() {
        return data;
    }

    public void setData(Invoice data) {
        this.data = data;
    }

}
