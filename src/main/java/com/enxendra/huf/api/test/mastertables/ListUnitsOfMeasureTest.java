package com.enxendra.huf.api.test.mastertables;

import java.util.Map.Entry;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.UnitsOfMeasureResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListUnitsOfMeasureTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            UnitsOfMeasureResponse unitsOfMeasureResponse = service.listUnitsOfMeasure();

            if (unitsOfMeasureResponse.getResponseCode().equals(Constants.OK)) {
                if (unitsOfMeasureResponse.getData() != null
                        && unitsOfMeasureResponse.getData().getUnitsOfMeasure() != null
                        && unitsOfMeasureResponse.getData().getUnitsOfMeasure().size() != 0) {
                    System.out.println(unitsOfMeasureResponse.getData().getUnitsOfMeasure().size()
                            + " unitsOfMeasure encontrados:");
                    for (Entry<String, String> entry : unitsOfMeasureResponse.getData().getUnitsOfMeasure().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + unitsOfMeasureResponse.getErrorCode() + ": "
                        + unitsOfMeasureResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
