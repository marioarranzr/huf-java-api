package com.enxendra.huf.api.model.mastertables;

import com.enxendra.huf.api.model.HUFResponse;

public class UnitsOfMeasureResponse extends HUFResponse {

    public UnitsOfMeasureMap data;

    public UnitsOfMeasureMap getData() {
        return data;
    }

    public void setData(UnitsOfMeasureMap data) {
        this.data = data;
    }

}
