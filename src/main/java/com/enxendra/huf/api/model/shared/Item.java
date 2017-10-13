package com.enxendra.huf.api.model.shared;

import java.util.List;

public class Item {

    public String id;
    public String order;
    public String description;
    public String quantity;
    public String unit_of_measure;
    public String price;
    public String total_cost;
    public String gross_amount;
    public String comments;
    public String article_code;
    public String delivery_note_number;
    public String delivery_note_date;
    public String transaction_date;
    public String period_start_date;
    public String period_end_date;
    public String contract_reference;
    public String transaction_reference;
    public String file_reference;
    public List<Discount> discounts;
    public List<Charge> charges;
    public List<Tax> taxes;

    public String getOrder() {
        return order;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUnitOfMeasure() {
        return unit_of_measure;
    }

    public String getPrice() {
        return price;
    }

    public String getTotalCost() {
        return total_cost;
    }

    public String getGrossAmount() {
        return gross_amount;
    }

    public String getComments() {
        return comments;
    }

    public String getArticleCode() {
        return article_code;
    }

    public String getDeliveryNoteNumber() {
        return delivery_note_number;
    }

    public String getDeliveryNoteSate() {
        return delivery_note_date;
    }

    public String getTransactionDate() {
        return transaction_date;
    }

    public String getPeriodStartDate() {
        return period_start_date;
    }

    public String getPeriodEndDate() {
        return period_end_date;
    }

    public String getContractReference() {
        return contract_reference;
    }

    public String getTransactionReference() {
        return transaction_reference;
    }

    public String getFileReference() {
        return file_reference;
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

    public void setOrder(String order) {
        this.order = order;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setUnitOfMeasure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTotalCost(String total_cost) {
        this.total_cost = total_cost;
    }

    public void setGrossAmount(String gross_amount) {
        this.gross_amount = gross_amount;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setArticleCode(String article_code) {
        this.article_code = article_code;
    }

    public void setDeliveryNoteNumber(String delivery_note_number) {
        this.delivery_note_number = delivery_note_number;
    }

    public void setDeliveryNoteDate(String delivery_note_date) {
        this.delivery_note_date = delivery_note_date;
    }

    public void setTransactionDate(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public void setPeriodStartDate(String period_start_date) {
        this.period_start_date = period_start_date;
    }

    public void setPeriodEndDate(String period_end_date) {
        this.period_end_date = period_end_date;
    }

    public void setContractReference(String contract_reference) {
        this.contract_reference = contract_reference;
    }

    public void setTransactionReference(String transaction_reference) {
        this.transaction_reference = transaction_reference;
    }

    public void setFileReference(String file_reference) {
        this.file_reference = file_reference;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
