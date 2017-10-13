package com.enxendra.huf.api.test.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("name", "TEST-TRES");
        body.addProperty("code", "9999999");
        body.addProperty("prefix", "TEST-tres/");
        body.addProperty("suffix", "/3");
        body.addProperty("fill_left", "3");
        body.addProperty("numbering", "true");
        body.addProperty("default_series", "1");
        body.addProperty("reboot_year", "false");
        body.addProperty("next_number", "3");

        try {
            SerieResponse serieResponse = service.updateSerie(new Long(359), new Long(16), body);

            if (serieResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Serie updated");

            } else {
                System.out.println("ERROR " + serieResponse.getErrorCode() + ": " + serieResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
