package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class TotalResponse extends HUFResponse {

    public TotalContainer data;

    public TotalContainer getData() {
        return data;
    }

    public void setData(TotalContainer data) {
        this.data = data;
    }
}
