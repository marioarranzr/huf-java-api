package com.enxendra.huf.api.model.organization;

public class OrganizationConfiguration {

    private String currency;
    private String language;
    private String invoice_format;
    private String channel;
    private String bank_account;
    private Integer payment_deadline;
    private String pdf_template;
    private String primary_color;
    private String secondary_color;
    private Boolean signature_delegate;
    private String footer_texts;

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

    public Integer getPaymentDeadline() {
        return payment_deadline;
    }

    public String getPdfTemplate() {
        return pdf_template;
    }

    public String getPrimaryColor() {
        return primary_color;
    }

    public String getSecondaryColor() {
        return secondary_color;
    }

    public Boolean getSignatureDelegate() {
        return signature_delegate;
    }

    public String getFooterTexts() {
        return footer_texts;
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

    public void setPaymentDeadline(Integer payment_deadline) {
        this.payment_deadline = payment_deadline;
    }

    public void setPdfTemplate(String pdf_template) {
        this.pdf_template = pdf_template;
    }

    public void setPrimaryColor(String primary_color) {
        this.primary_color = primary_color;
    }

    public void setSecondaryColor(String secondary_color) {
        this.secondary_color = secondary_color;
    }

    public void setSignatureDelegate(Boolean signature_delegate) {
        this.signature_delegate = signature_delegate;
    }

    public void setFooterTexts(String footer_texts) {
        this.footer_texts = footer_texts;
    }

}
