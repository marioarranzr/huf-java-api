package com.enxendra.huf.api.model.customer;

public class CustomerConfiguration {

    private String currency;
    private String language;
    private String invoice_format;
    private String channel;
    private String bank_account;
    private String payment_deadline;
    private String pdf_template;

    public String getCurrency() {
        return currency;
    }

    public String getLanguage() {
        return language;
    }

    public String getInvoiceFormat() {
        return invoice_format;
    }

    public String getChannel() {
        return channel;
    }

    public String getBankAccount() {
        return bank_account;
    }

    public String getPaymentDeadline() {
        return payment_deadline;
    }

    public String getPdfTemplate() {
        return pdf_template;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setInvoiceFormat(String invoice_format) {
        this.invoice_format = invoice_format;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setBankAccount(String bank_account) {
        this.bank_account = bank_account;
    }

    public void setPaymentDeadline(String payment_deadline) {
        this.payment_deadline = payment_deadline;
    }

    public void setPdfTemplate(String pdf_template) {
        this.pdf_template = pdf_template;
    }

}
