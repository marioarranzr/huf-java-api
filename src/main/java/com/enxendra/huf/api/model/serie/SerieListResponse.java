package com.enxendra.huf.api.model.serie;

import com.enxendra.huf.api.model.HUFResponse;

public class SerieListResponse extends HUFResponse {

    public SerieList data;

    public SerieList getData() {
        return data;
    }

    public void setData(SerieList data) {
        this.data = data;
    }
}
