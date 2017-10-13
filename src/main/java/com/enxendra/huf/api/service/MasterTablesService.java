package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.mastertables.DeliveryMethodsResponse;
import com.enxendra.huf.api.model.mastertables.InvoiceFormatsResponse;
import com.enxendra.huf.api.model.mastertables.InvoiceStatesResponse;
import com.enxendra.huf.api.model.mastertables.PaymentMeansResponse;
import com.enxendra.huf.api.model.mastertables.RolesResponse;
import com.enxendra.huf.api.model.mastertables.TaxesResponse;
import com.enxendra.huf.api.model.mastertables.UnitsOfMeasureResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class MasterTablesService extends HUFService {

    private static final String SERVICE_PATH = "tables";

    public MasterTablesService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public RolesResponse listRoles() throws HUFException {
        JsonObject jsonResponse = callService("/roles", RequestMethod.GET);
        RolesResponse response = (new Gson()).fromJson(jsonResponse, RolesResponse.class);
        response.check();
        return response;
    }

    public DeliveryMethodsResponse listDeliveryMethods() throws HUFException {
        JsonObject jsonResponse = callService("/deliverymethods", RequestMethod.GET);
        DeliveryMethodsResponse response = (new Gson()).fromJson(jsonResponse, DeliveryMethodsResponse.class);
        response.check();
        return response;
    }

    public InvoiceStatesResponse listInvoiceStates() throws HUFException {
        JsonObject jsonResponse = callService("/invoicestates", RequestMethod.GET);
        InvoiceStatesResponse response = (new Gson()).fromJson(jsonResponse, InvoiceStatesResponse.class);
        response.check();
        return response;
    }

    public PaymentMeansResponse listPaymentMeans() throws HUFException {
        JsonObject jsonResponse = callService("/paymentmeans", RequestMethod.GET);
        PaymentMeansResponse response = (new Gson()).fromJson(jsonResponse, PaymentMeansResponse.class);
        response.check();
        return response;
    }

    public TaxesResponse listTaxes() throws HUFException {
        JsonObject jsonResponse = callService("/taxes", RequestMethod.GET);
        TaxesResponse response = (new Gson()).fromJson(jsonResponse, TaxesResponse.class);
        response.check();
        return response;
    }

    public UnitsOfMeasureResponse listUnitsOfMeasure() throws HUFException {
        JsonObject jsonResponse = callService("/unitsofmeasure", RequestMethod.GET);
        UnitsOfMeasureResponse response = (new Gson()).fromJson(jsonResponse, UnitsOfMeasureResponse.class);
        response.check();
        return response;
    }

    public InvoiceFormatsResponse listInvoiceFormats() {
        JsonObject jsonResponse = callService("/invoiceformats", RequestMethod.GET);
        InvoiceFormatsResponse response = (new Gson()).fromJson(jsonResponse, InvoiceFormatsResponse.class);
        response.check();
        return response;
    }

}
