package com.enxendra.huf.api.model.invoice;

import com.enxendra.huf.api.model.HUFResponse;

public class StatisticsResponse extends HUFResponse {

    public StatisticsList data;

    public StatisticsList getData() {
        return data;
    }

    public void setData(StatisticsList data) {
        this.data = data;
    }
}
