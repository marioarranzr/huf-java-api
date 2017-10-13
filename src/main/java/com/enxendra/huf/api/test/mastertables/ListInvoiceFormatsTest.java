package com.enxendra.huf.api.test.mastertables;

import java.util.Map.Entry;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.InvoiceFormatsResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListInvoiceFormatsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            InvoiceFormatsResponse invoiceFormatsResponse = service.listInvoiceFormats();

            if (invoiceFormatsResponse.getResponseCode().equals(Constants.OK)) {
                if (invoiceFormatsResponse.getData() != null
                        && invoiceFormatsResponse.getData().getInvoiceFormats() != null
                        && invoiceFormatsResponse.getData().getInvoiceFormats().size() != 0) {
                    System.out.println(invoiceFormatsResponse.getData().getInvoiceFormats().size()
                            + " invoiceFormats encontrados:");
                    for (Entry<String, String> entry : invoiceFormatsResponse.getData().getInvoiceFormats().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + invoiceFormatsResponse.getErrorCode() + ": "
                        + invoiceFormatsResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
