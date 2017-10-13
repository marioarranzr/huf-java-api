package com.enxendra.huf.api.test.invoice.sent;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.invoice.Statistics;
import com.enxendra.huf.api.model.invoice.StatisticsResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetStatisticsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(27));

        try {
            Map<String, Object> params = new HashMap<String, Object>(0);
            params.put("num_months", "1");

            StatisticsResponse statisticsResponse = service.statistics(params);

            if (statisticsResponse.getResponseCode().equals(Constants.OK)
                    && statisticsResponse.getData().getStatistics() != null) {
                System.out.println("Se han encontrado " + statisticsResponse.getData().getStatistics().size()
                        + " filas de estadísticas");

                for (Statistics invoiceStatistics : statisticsResponse.getData().getStatistics()) {
                    System.out.println(invoiceStatistics.getMonth() + ": " + invoiceStatistics.getTotalInvoiced()
                            + " - " + invoiceStatistics.getTotalPaid() + " - " + invoiceStatistics.getTotalUnpaid());
                }
            } else {
                System.out.println("No hay información estadística");
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
