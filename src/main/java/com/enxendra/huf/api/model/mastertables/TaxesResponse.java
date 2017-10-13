package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class TaxesResponse extends HUFResponse {

    public TaxesMap data;

    public TaxesMap getData() {
        return data;
    }

    public void setData(TaxesMap data) {
        this.data = data;
    }

}
