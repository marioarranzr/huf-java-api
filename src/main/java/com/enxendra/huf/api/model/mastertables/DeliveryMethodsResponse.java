package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class DeliveryMethodsResponse extends HUFResponse {

    public DeliveryMethodsMap data;

    public DeliveryMethodsMap getData() {
        return data;
    }

    public void setData(DeliveryMethodsMap data) {
        this.data = data;
    }

}
