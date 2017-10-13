package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.Draft;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UpdateDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(355));

        JsonObject body = new JsonObject();

        Draft draft = new Draft();
        draft.setNumber("111111");
        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(draft, Draft.class)).getAsJsonObject();

        try {
            DraftResponse customerResponse = service.updateDraft(new Long(40561), body);

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Draft updated");

            } else {
                System.out.println(
                        "ERROR " + customerResponse.getErrorCode() + ": " + customerResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
