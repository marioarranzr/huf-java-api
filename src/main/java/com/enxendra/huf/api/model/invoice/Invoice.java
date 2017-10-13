package com.enxendra.huf.api.model.invoice;

import java.util.List;

import com.enxendra.huf.api.model.shared.Charge;
import com.enxendra.huf.api.model.shared.Discount;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.model.shared.Payment;
import com.enxendra.huf.api.model.shared.Receiver;
import com.enxendra.huf.api.model.shared.Sender;
import com.enxendra.huf.api.model.shared.Tax;

public class Invoice {

    public String id;
    public String delivery_code;
    public String number;
    public String series;
    public String date;
    public String state;
    public String total_cost;
    public String gross_amount;
    public String total_to_pay;
    public String currency;
    public String comments;
    public Sender sender;
    public Receiver receiver;
    public List<Item> items;
    public List<Payment> payments;
    public List<Discount> discounts;
    public List<Charge> charges;
    public List<Tax> taxes;
    public String exchange_rate;
    public String invoice_type;
    public String corrective_inv_number;
    public String corrective_inv_series;
    public String corrective_reason_code;
    public String corrective_reason_method;
    public String original;
    public String pdf;
    public String export;
    public String reason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeliveryCode() {
        return delivery_code;
    }

    public void setDeliveryCode(String delivery_code) {
        this.delivery_code = delivery_code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTotalCost() {
        return total_cost;
    }

    public void setTotalCost(String total_cost) {
        this.total_cost = total_cost;
    }

    public String getGrossAmount() {
        return gross_amount;
    }

    public void setGrossAmount(String gross_amount) {
        this.gross_amount = gross_amount;
    }

    public String getTotalToPay() {
        return total_to_pay;
    }

    public void setTotalToPay(String total_to_pay) {
        this.total_to_pay = total_to_pay;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public String getExchangeRate() {
        return exchange_rate;
    }

    public void setExchangeRate(String exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public String getInvoiceType() {
        return invoice_type;
    }

    public void setInvoiceType(String invoice_type) {
        this.invoice_type = invoice_type;
    }

    public String getCorrectiveInvNumber() {
        return corrective_inv_number;
    }

    public void setCorrectiveInvNumber(String corrective_inv_number) {
        this.corrective_inv_number = corrective_inv_number;
    }

    public String getCorrectiveInvSeries() {
        return corrective_inv_series;
    }

    public void setCorrectiveInvSeries(String corrective_inv_series) {
        this.corrective_inv_series = corrective_inv_series;
    }

    public String getCorrectiveReasonCode() {
        return corrective_reason_code;
    }

    public void setCorrectiveReasonCode(String corrective_reason_code) {
        this.corrective_reason_code = corrective_reason_code;
    }

    public String getCorrectiveReasonMethod() {
        return corrective_reason_method;
    }

    public void setCorrectiveReasonMethod(String corrective_reason_method) {
        this.corrective_reason_method = corrective_reason_method;
    }

    public String getOriginal() {
        return original;
    }

    public String getPdf() {
        return pdf;
    }

    public String getExport() {
        return export;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
