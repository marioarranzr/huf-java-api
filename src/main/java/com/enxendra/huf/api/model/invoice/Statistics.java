package com.enxendra.huf.api.model.invoice;

public class Statistics {

    public String month;
    public String total_invoiced;
    public String total_paid;
    public String total_unpaid;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTotalInvoiced() {
        return total_invoiced;
    }

    public void setTotalInvoiced(String total_invoiced) {
        this.total_invoiced = total_invoiced;
    }

    public String getTotalPaid() {
        return total_paid;
    }

    public void setTotalPaid(String total_paid) {
        this.total_paid = total_paid;
    }

    public String getTotalUnpaid() {
        return total_unpaid;
    }

    public void setTotalUnpaid(String total_unpaid) {
        this.total_unpaid = total_unpaid;
    }

}
