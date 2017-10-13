package com.enxendra.huf.api.model.organization;

import com.enxendra.huf.api.model.HUFResponse;

public class ActivityResponse extends HUFResponse {

    private ActivityList data;

    public ActivityList getData() {
        return data;
    }

    public void setData(ActivityList data) {
        this.data = data;
    }

}
