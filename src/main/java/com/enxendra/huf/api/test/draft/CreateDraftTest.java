package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class CreateDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(355));

        JsonObject body = new JsonObject();

        body.addProperty("cusId", "2230");

        try {
            DraftResponse draftResponse = service.createDraft(body);

            if (draftResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new draft has the following id: " + draftResponse.getData().getId());

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
