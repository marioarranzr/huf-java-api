package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CreateDraftItem extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(355));

        JsonObject body = new JsonObject();

        Item draftItem = new Item();
        draftItem.setDescription("Test");
        draftItem.setQuantity("1.0");
        draftItem.setOrder("1");
        draftItem.setPrice("1.0");
        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(draftItem, Item.class)).getAsJsonObject();

        try {
            DraftItemResponse draftItemResponse = service.createDraftItem(body, new Long(40561));

            if (draftItemResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new draftItem has the following id: " + draftItemResponse.getData().getId());

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
