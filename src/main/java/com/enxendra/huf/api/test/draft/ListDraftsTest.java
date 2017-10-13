package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.Draft;
import com.enxendra.huf.api.model.draft.DraftListResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListDraftsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(363));

        try {

            DraftListResponse draftListResponse = service.listDrafts();

            if (draftListResponse.getResponseCode().equals(Constants.OK)) {
                if (draftListResponse.getData() != null && draftListResponse.getData().getDrafts() != null
                        && draftListResponse.getData().getDrafts().size() > 0) {
                    for (Draft draft : draftListResponse.getData().getDrafts()) {
                        System.out.println(draft.getId() + ". " + draft.getNumber() + " - " + draft.getSeries());
                    }
                } else {
                    System.out.println("Drafts not found");
                }

            } else {
                System.out.println("ERROR " + draftListResponse.getErrorCode() + ": "
                        + draftListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
