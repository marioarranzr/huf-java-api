package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestOptions;

public class ReceivedInvoiceService extends InvoiceService {

    private static final String SERVICE_PATH = "received_invoices";

    public ReceivedInvoiceService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

}
