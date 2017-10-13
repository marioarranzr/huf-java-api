package com.enxendra.huf.api.model.serie;

import com.enxendra.huf.api.model.HUFResponse;

public class SerieResponse extends HUFResponse {

    public Serie data;

    public Serie getData() {
        return data;
    }

    public void setData(Serie data) {
        this.data = data;
    }
}
