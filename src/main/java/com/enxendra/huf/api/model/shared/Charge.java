package com.enxendra.huf.api.model.shared;

public class Charge {

    private String reason;
    private String rate;
    private String amount;

    public String getReason() {
        return reason;
    }

    public String getRate() {
        return rate;
    }

    public String getAmount() {
        return amount;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
