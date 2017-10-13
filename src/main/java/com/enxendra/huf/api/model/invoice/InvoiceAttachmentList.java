package com.enxendra.huf.api.model.invoice;

import java.util.List;

import com.enxendra.huf.api.model.shared.Attachment;

public class InvoiceAttachmentList {

    private List<Attachment> attachments;

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
