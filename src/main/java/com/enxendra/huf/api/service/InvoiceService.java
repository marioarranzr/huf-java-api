package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.invoice.ExportResponse;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentListResponse;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentResponse;
import com.enxendra.huf.api.model.invoice.InvoiceListResponse;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.model.invoice.StatisticsResponse;
import com.enxendra.huf.api.model.invoice.TotalResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class InvoiceService extends HUFService {

    public InvoiceResponse getInvoice(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse updateInvoiceState(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse acceptInvoice(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/accept", RequestMethod.PUT);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse rejectInvoice(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/reject", RequestMethod.PUT, body);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse deleteInvoice(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceListResponse listInvoices(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET, params);
        InvoiceListResponse response = (new Gson()).fromJson(jsonResponse, InvoiceListResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse exportInvoices(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/export", RequestMethod.GET, params);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse getOriginal(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/original", RequestMethod.GET);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceResponse getPdf(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/pdf", RequestMethod.GET);
        InvoiceResponse response = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        response.check();
        return response;
    }

    public InvoiceAttachmentListResponse listInvoiceAttachments(Long invoiceId) throws HUFException {
        JsonObject jsonResponse = callService("/" + invoiceId + "/attachments", RequestMethod.GET);
        InvoiceAttachmentListResponse response = (new Gson()).fromJson(jsonResponse,
                InvoiceAttachmentListResponse.class);
        response.check();
        return response;
    }

    public InvoiceAttachmentResponse getInvoiceAttachment(Long invoiceId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + invoiceId + "/attachments/" + id, RequestMethod.GET);
        InvoiceAttachmentResponse response = (new Gson()).fromJson(jsonResponse, InvoiceAttachmentResponse.class);
        response.check();
        return response;
    }

    public StatisticsResponse statistics(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/statistics", RequestMethod.GET, params);
        StatisticsResponse response = (new Gson()).fromJson(jsonResponse, StatisticsResponse.class);
        response.check();
        return response;
    }

    public ExportResponse export(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/export", RequestMethod.GET, params);
        ExportResponse response = (new Gson()).fromJson(jsonResponse, ExportResponse.class);
        response.check();
        return response;
    }

    public TotalResponse totalInvoiced(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/total_invoiced", RequestMethod.GET, params);
        TotalResponse response = (new Gson()).fromJson(jsonResponse, TotalResponse.class);
        response.check();
        return response;
    }

    public TotalResponse totalExpected(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/total_expected", RequestMethod.GET, params);
        TotalResponse response = (new Gson()).fromJson(jsonResponse, TotalResponse.class);
        response.check();
        return response;
    }

    public TotalResponse totalPaid(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/total_paid", RequestMethod.GET, params);
        TotalResponse response = (new Gson()).fromJson(jsonResponse, TotalResponse.class);
        response.check();
        return response;
    }

    public TotalResponse totalFaulty(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/total_faulty", RequestMethod.GET, params);
        TotalResponse response = (new Gson()).fromJson(jsonResponse, TotalResponse.class);
        response.check();
        return response;
    }

    public TotalResponse totalUnpaid(Map<String, Object> params) throws HUFException {
        JsonObject jsonResponse = callService("/total_unpaid", RequestMethod.GET, params);
        TotalResponse response = (new Gson()).fromJson(jsonResponse, TotalResponse.class);
        response.check();
        return response;
    }
}
