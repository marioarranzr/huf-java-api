package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class InvoiceFormatsResponse extends HUFResponse {

    public InvoiceFormatsMap data;

    public InvoiceFormatsMap getData() {
        return data;
    }

    public void setData(InvoiceFormatsMap data) {
        this.data = data;
    }

}
