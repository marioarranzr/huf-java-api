package com.enxendra.huf.api.test.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.Invoice;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UpdateInvoiceStateTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(27));

        JsonObject body = new JsonObject();

        Invoice invoice = new Invoice();
        invoice.setState("EN");
        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(invoice, Invoice.class)).getAsJsonObject();

        try {
            InvoiceResponse customerResponse = service.updateInvoiceState(new Long(4452), body);

            if (customerResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("Invoice updated");

            } else {
                System.out.println("ERROR " + customerResponse.getErrorCode() + ": "
                        + customerResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
