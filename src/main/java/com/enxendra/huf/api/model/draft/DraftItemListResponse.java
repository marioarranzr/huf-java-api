package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;

public class DraftItemListResponse extends HUFResponse {

    public DraftItemList data;

    public DraftItemList getData() {
        return data;
    }

    public void setData(DraftItemList data) {
        this.data = data;
    }
}
