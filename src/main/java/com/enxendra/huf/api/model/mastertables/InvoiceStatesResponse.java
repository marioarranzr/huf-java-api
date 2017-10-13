package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class InvoiceStatesResponse extends HUFResponse {

    public InvoiceStatesMap data;

    public InvoiceStatesMap getData() {
        return data;
    }

    public void setData(InvoiceStatesMap data) {
        this.data = data;
    }

}
