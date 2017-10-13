package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.organization.OrganizationConfigurationResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateOrganizationConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("payment_deadline", 0);
        body.addProperty("language", "en");
        body.addProperty("currency", "BTC");
        body.addProperty("primary_color", "#FFFFFF");
        body.addProperty("signature_delegated", true);
        body.addProperty("invoice_format", "Facturae32");
        body.addProperty("secondary_color", "#D4A190");
        body.addProperty("channel", "PLATFORM");
        body.addProperty("bank_account", "");
        body.addProperty("pdf_template", "");

        try {
            OrganizationConfigurationResponse organizationConfigurationResponse = service
                    .updateOrganizationConfiguration(new Long(363), body);

            if (organizationConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("OrganizationConfiguration updated");

            } else {
                System.out.println("ERROR " + organizationConfigurationResponse.getErrorCode() + ": "
                        + organizationConfigurationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
