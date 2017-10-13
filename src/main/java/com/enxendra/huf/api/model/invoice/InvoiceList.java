package com.enxendra.huf.api.model.invoice;

import java.util.List;

public class InvoiceList {

    private List<Invoice> invoices;

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
