package com.enxendra.huf.api.test.invoice.received;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentListResponse;
import com.enxendra.huf.api.model.shared.Attachment;
import com.enxendra.huf.api.service.ReceivedInvoiceService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListInvoiceAttachmentsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        ReceivedInvoiceService service = new ReceivedInvoiceService(requestOptions, new Long(27));

        try {

            InvoiceAttachmentListResponse invoiceAttachmentListResponse = service.listInvoiceAttachments(new Long(484));

            if (invoiceAttachmentListResponse.getResponseCode().equals(Constants.OK)) {
                if (invoiceAttachmentListResponse.getData() != null
                        && invoiceAttachmentListResponse.getData().getAttachments() != null
                        && invoiceAttachmentListResponse.getData().getAttachments().size() > 0) {
                    for (Attachment invoiceAttachment : invoiceAttachmentListResponse.getData().getAttachments()) {
                        System.out.println(invoiceAttachment.getId() + ". " + invoiceAttachment.getName() + " - "
                                + invoiceAttachment.getMime());
                    }
                } else {
                    System.out.println("Attachments not found");
                }

            } else {
                System.out.println("ERROR " + invoiceAttachmentListResponse.getErrorCode() + ": "
                        + invoiceAttachmentListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
