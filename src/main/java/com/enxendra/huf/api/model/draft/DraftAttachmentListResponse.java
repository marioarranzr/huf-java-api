package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;

public class DraftAttachmentListResponse extends HUFResponse {

    public DraftAttachmentList data;

    public DraftAttachmentList getData() {
        return data;
    }

    public void setData(DraftAttachmentList data) {
        this.data = data;
    }

}
