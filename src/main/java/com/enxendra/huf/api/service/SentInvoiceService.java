package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestOptions;

public class SentInvoiceService extends InvoiceService {

    private static final String SERVICE_PATH = "invoices";

    public SentInvoiceService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

}
