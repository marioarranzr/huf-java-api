package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class InvoiceAttachmentListResponse extends HUFResponse {

    public InvoiceAttachmentList data;

    public InvoiceAttachmentList getData() {
        return data;
    }

    public void setData(InvoiceAttachmentList data) {
        this.data = data;
    }
}
