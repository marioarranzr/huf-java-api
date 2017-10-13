package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UpdateDraftItem extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        JsonObject body = new JsonObject();

        Item draftItem = new Item();
        draftItem.setDescription("Modified");
        draftItem.setQuantity("2.0");
        draftItem.setOrder("1");
        draftItem.setPrice("3.5");
        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(draftItem, Item.class)).getAsJsonObject();

        try {
            DraftItemResponse draftItemResponse = service.updateDraftItem(body, new Long(17028), new Long(1407));

            if (draftItemResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("The item has been updated");

            } else {
                System.out.println("ERROR " + draftItemResponse.getErrorCode() + ": "
                        + draftItemResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
