package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class ExportResponse extends HUFResponse {

    public ExportContainer data;

    public ExportContainer getData() {
        return data;
    }

    public void setData(ExportContainer data) {
        this.data = data;
    }
}
