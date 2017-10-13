package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftAttachmentListResponse;
import com.enxendra.huf.api.model.shared.Attachment;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListDraftAttachmentsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        try {

            DraftAttachmentListResponse draftAttachmentListResponse = service.listDraftAttachments(new Long(17028));

            if (draftAttachmentListResponse.getResponseCode().equals(Constants.OK)) {
                if (draftAttachmentListResponse.getData() != null
                        && draftAttachmentListResponse.getData().getAttachments() != null
                        && draftAttachmentListResponse.getData().getAttachments().size() > 0) {
                    for (Attachment draftAttachment : draftAttachmentListResponse.getData().getAttachments()) {
                        System.out.println(draftAttachment.getId() + ". " + draftAttachment.getName() + " - "
                                + draftAttachment.getMime());
                    }
                } else {
                    System.out.println("Attachments not found");
                }

            } else {
                System.out.println("ERROR " + draftAttachmentListResponse.getErrorCode() + ": "
                        + draftAttachmentListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
