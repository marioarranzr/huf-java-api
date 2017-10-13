package com.enxendra.huf.api.test.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.Serie;
import com.enxendra.huf.api.model.serie.SerieListResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListSeriesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            SerieListResponse serieListResponse = service.listSeries(new Long(359));

            if (serieListResponse.getResponseCode().equals(Constants.OK)) {
                if (serieListResponse.getData() != null && serieListResponse.getData().getSeries() != null
                        && serieListResponse.getData().getSeries().size() > 0) {
                    for (Serie serie : serieListResponse.getData().getSeries()) {
                        System.out.println(serie.getId() + ". " + serie.getName() + " - " + serie.getCode());
                    }
                } else {
                    System.out.println("Series not found");
                }

            } else {
                System.out.println("ERROR " + serieListResponse.getErrorCode() + ": "
                        + serieListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
