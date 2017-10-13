package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;

public class DraftResponse extends HUFResponse {

    public Draft data;

    public Draft getData() {
        return data;
    }

    public void setData(Draft data) {
        this.data = data;
    }

}
