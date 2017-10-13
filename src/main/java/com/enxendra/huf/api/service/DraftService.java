package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.draft.DraftAttachmentListResponse;
import com.enxendra.huf.api.model.draft.DraftAttachmentResponse;
import com.enxendra.huf.api.model.draft.DraftItemListResponse;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.model.draft.DraftListResponse;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DraftService extends HUFService {

    private static final String SERVICE_PATH = "drafts";

    public DraftService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

    public DraftResponse getDraft(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse sendDraft(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/send", RequestMethod.GET);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse previewDraft(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/preview", RequestMethod.GET);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse validateDraft(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id + "/validate", RequestMethod.GET);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse createDraft(JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse updateDraft(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftResponse deleteDraft(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        DraftResponse response = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        response.check();
        return response;
    }

    public DraftListResponse listDrafts() throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        DraftListResponse response = (new Gson()).fromJson(jsonResponse, DraftListResponse.class);
        response.check();
        return response;
    }

    public DraftAttachmentResponse uploadDraftAttachment(JsonObject body, Long draftId) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/attachments", RequestMethod.POST, body);
        DraftAttachmentResponse response = (new Gson()).fromJson(jsonResponse, DraftAttachmentResponse.class);
        response.check();
        return response;
    }

    public DraftAttachmentListResponse listDraftAttachments(Long draftId) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/attachments", RequestMethod.GET);
        DraftAttachmentListResponse response = (new Gson()).fromJson(jsonResponse, DraftAttachmentListResponse.class);
        response.check();
        return response;
    }

    public DraftAttachmentResponse getDraftAttachment(Long draftId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/attachments/" + id, RequestMethod.GET);
        DraftAttachmentResponse response = (new Gson()).fromJson(jsonResponse, DraftAttachmentResponse.class);
        response.check();
        return response;
    }

    public DraftAttachmentResponse deleteDraftAttachment(Long draftId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/attachments/" + id, RequestMethod.DELETE);
        DraftAttachmentResponse response = (new Gson()).fromJson(jsonResponse, DraftAttachmentResponse.class);
        response.check();
        return response;
    }

    public DraftItemResponse createDraftItem(JsonObject body, Long draftId) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/items", RequestMethod.POST, body);
        DraftItemResponse response = (new Gson()).fromJson(jsonResponse, DraftItemResponse.class);
        response.check();
        return response;
    }

    public DraftItemResponse getDraftItem(Long draftId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/items/" + id, RequestMethod.GET);
        DraftItemResponse response = (new Gson()).fromJson(jsonResponse, DraftItemResponse.class);
        response.check();
        return response;
    }

    public DraftItemListResponse listDraftItems(Long draftId) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/items", RequestMethod.GET);
        DraftItemListResponse response = (new Gson()).fromJson(jsonResponse, DraftItemListResponse.class);
        response.check();
        return response;
    }

    public DraftItemResponse updateDraftItem(JsonObject body, Long draftId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/items/" + id, RequestMethod.PUT, body);
        DraftItemResponse response = (new Gson()).fromJson(jsonResponse, DraftItemResponse.class);
        response.check();
        return response;
    }

    public DraftItemResponse deleteDraftItem(Long draftId, Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + draftId + "/items/" + id, RequestMethod.DELETE);
        DraftItemResponse response = (new Gson()).fromJson(jsonResponse, DraftItemResponse.class);
        response.check();
        return response;
    }
}
