package com.enxendra.huf.api.test.draft;

import java.util.Map;
import java.util.Map.Entry;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class ValidateDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(363));

        try {
            DraftResponse draftResponse = service.validateDraft(new Long(29416));

            if (draftResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(draftResponse.getData().getIsValid());
                Map<String, String> errors = draftResponse.getData().getInvoiceErrors();
                if (draftResponse.getData().getInvoiceErrors() != null) {
                    System.out.println("Errores de validación:");
                    for (Entry<String, String> entry : draftResponse.getData().getInvoiceErrors().entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

                }
            } else {
                System.out.println("ERROR " + draftResponse.getErrorCode() + ": " + draftResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
