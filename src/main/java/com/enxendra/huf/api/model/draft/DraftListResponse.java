package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;

public class DraftListResponse extends HUFResponse {

    public DraftList data;

    public DraftList getData() {
        return data;
    }

    public void setData(DraftList data) {
        this.data = data;
    }

}
