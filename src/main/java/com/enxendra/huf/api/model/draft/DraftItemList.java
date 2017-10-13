package com.enxendra.huf.api.model.draft;

import java.util.List;

import com.enxendra.huf.api.model.shared.Item;

public class DraftItemList {

    private List<Item> draft_items;

    public List<Item> getDraftItems() {
        return draft_items;
    }

    public void setDraftItems(List<Item> draft_items) {
        this.draft_items = draft_items;
    }
}
