package com.enxendra.huf.api.model.shared;

public class Payment {

    private String payment_date;
    private String payment_method;
    private String amount;
    private String bank_account;

    public String getPaymentDate() {
        return payment_date;
    }

    public String getPaymentMethod() {
        return payment_method;
    }

    public String getAmount() {
        return amount;
    }

    public String getBankAccount() {
        return bank_account;
    }

    public void setPaymentDate(String payment_date) {
        this.payment_date = payment_date;
    }

    public void setPaymentMethod(String payment_method) {
        this.payment_method = payment_method;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setBankAccount(String bank_account) {
        this.bank_account = bank_account;
    }

}
