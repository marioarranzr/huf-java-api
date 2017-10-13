package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class InvoiceListResponse extends HUFResponse {

    public InvoiceList data;

    public InvoiceList getData() {
        return data;
    }

    public void setData(InvoiceList data) {
        this.data = data;
    }

}
