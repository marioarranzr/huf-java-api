package com.enxendra.huf.api.model.shared;

public class Tax {

    private String tax_base;
    private String tax_rate;
    private String tax_amount;
    private String tax_type;

    public String getTaxBase() {
        return tax_base;
    }

    public String getTaxRate() {
        return tax_rate;
    }

    public String getTaxAmount() {
        return tax_amount;
    }

    public String getTaxType() {
        return tax_type;
    }

    public void setTaxBase(String tax_base) {
        this.tax_base = tax_base;
    }

    public void setTaxRate(String tax_rate) {
        this.tax_rate = tax_rate;
    }

    public void setTaxAmount(String tax_amount) {
        this.tax_amount = tax_amount;
    }

    public void setTaxType(String tax_type) {
        this.tax_type = tax_type;
    }

}
