package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class PaymentMeansResponse extends HUFResponse {

    public PaymentMeansMap data;

    public PaymentMeansMap getData() {
        return data;
    }

    public void setData(PaymentMeansMap data) {
        this.data = data;
    }

}
