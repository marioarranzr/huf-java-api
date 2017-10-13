package com.enxendra.huf.api.test.mastertables;

import java.util.Map.Entry;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.TaxesResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListTaxesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            TaxesResponse taxesResponse = service.listTaxes();

            if (taxesResponse.getResponseCode().equals(Constants.OK)) {
                if (taxesResponse.getData() != null && taxesResponse.getData().getTaxes() != null
                        && taxesResponse.getData().getTaxes().size() != 0) {
                    System.out.println(taxesResponse.getData().getTaxes().size() + " taxes encontrados:");
                    for (Entry<String, String> entry : taxesResponse.getData().getTaxes().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + taxesResponse.getErrorCode() + ": " + taxesResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
