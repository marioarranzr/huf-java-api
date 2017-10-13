package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;
import com.enxendra.huf.api.model.shared.Attachment;

public class InvoiceAttachmentResponse extends HUFResponse {

    public Attachment data;

    public Attachment getData() {
        return data;
    }

    public void setData(Attachment data) {
        this.data = data;
    }

}
