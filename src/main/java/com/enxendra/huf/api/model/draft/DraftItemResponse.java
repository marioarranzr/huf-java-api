package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;
import com.enxendra.huf.api.model.shared.Item;

public class DraftItemResponse extends HUFResponse {

    public Item data;

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

}
