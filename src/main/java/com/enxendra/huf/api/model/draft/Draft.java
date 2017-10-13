package com.enxendra.huf.api.model.draft;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.enxendra.huf.api.model.shared.Charge;
import com.enxendra.huf.api.model.shared.Discount;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.model.shared.Payment;
import com.enxendra.huf.api.model.shared.Receiver;
import com.enxendra.huf.api.model.shared.Sender;
import com.enxendra.huf.api.model.shared.Tax;

public class Draft {

    public Long id;
    public String number;
    public String series;
    public String date;
    public String state;
    public String total_cost;
    public String series_id;
    public String gross_amount;
    public String total_to_pay;
    public String dir3_code_1;
    public String dir3_code_2;
    public String dir3_code_3;
    public String dir3_code_4;
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
    public Date corrective_start_date;
    public Date corrective_end_date;
    private String preview;
    private String is_valid;
    private Map<String, String> invoice_errors;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    public String getDate() {
        return date;
    }

    public String getState() {
        return state;
    }

    public String getTotal_cost() {
        return total_cost;
    }

    public String getGross_amount() {
        return gross_amount;
    }

    public String getTotal_to_pay() {
        return total_to_pay;
    }

    public String getCurrency() {
        return currency;
    }

    public String getComments() {
        return comments;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public String getExchange_rate() {
        return exchange_rate;
    }

    public String getInvoice_type() {
        return invoice_type;
    }

    public String getCorrective_inv_number() {
        return corrective_inv_number;
    }

    public String getCorrective_inv_series() {
        return corrective_inv_series;
    }

    public String getCorrective_reason_code() {
        return corrective_reason_code;
    }

    public String getCorrective_reason_method() {
        return corrective_reason_method;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTotal_cost(String total_cost) {
        this.total_cost = total_cost;
    }

    public void setGross_amount(String gross_amount) {
        this.gross_amount = gross_amount;
    }

    public void setTotal_to_pay(String total_to_pay) {
        this.total_to_pay = total_to_pay;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public void setExchange_rate(String exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public void setInvoice_type(String invoice_type) {
        this.invoice_type = invoice_type;
    }

    public void setCorrective_inv_number(String corrective_inv_number) {
        this.corrective_inv_number = corrective_inv_number;
    }

    public void setCorrective_inv_series(String corrective_inv_series) {
        this.corrective_inv_series = corrective_inv_series;
    }

    public void setCorrective_reason_code(String corrective_reason_code) {
        this.corrective_reason_code = corrective_reason_code;
    }

    public void setCorrective_reason_method(String corrective_reason_method) {
        this.corrective_reason_method = corrective_reason_method;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getIsValid() {
        return this.is_valid;
    }

    public Map<String, String> getInvoiceErrors() {
        return this.invoice_errors;
    }

    public void setSeriesId(String series_id) {
        this.series_id = series_id;
    }

    public String getSeriesId() {
        return series_id;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setIsValid(String is_valid) {
        this.is_valid = is_valid;
    }

    public void setInvoiceErrors(Map<String, String> invoice_errors) {
        this.invoice_errors = invoice_errors;
    }

    public String getDir3_code_1() {
        return dir3_code_1;
    }

    public void setDir3_code_1(String dir3_code_1) {
        this.dir3_code_1 = dir3_code_1;
    }

    public String getDir3_code_2() {
        return dir3_code_2;
    }

    public void setDir3_code_2(String dir3_code_2) {
        this.dir3_code_2 = dir3_code_2;
    }

    public String getDir3_code_3() {
        return dir3_code_3;
    }

    public void setDir3_code_3(String dir3_code_3) {
        this.dir3_code_3 = dir3_code_3;
    }

    public String getDir3_code_4() {
        return dir3_code_4;
    }

    public void setDir3_code_4(String dir3_code_4) {
        this.dir3_code_4 = dir3_code_4;
    }

	public Date getCorrective_start_date() {
		return corrective_start_date;
	}

	public void setCorrective_start_date(Date corrective_start_date) {
		this.corrective_start_date = corrective_start_date;
	}

	public Date getCorrective_end_date() {
		return corrective_end_date;
	}

	public void setCorrective_end_date(Date corrective_end_date) {
		this.corrective_end_date = corrective_end_date;
	}
    
}
