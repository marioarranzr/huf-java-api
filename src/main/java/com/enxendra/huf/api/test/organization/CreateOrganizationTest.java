package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.organization.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class CreateOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("poblation", "A Coruña");
        body.addProperty("phone", "692977695");
        body.addProperty("post_code", "15009");
        body.addProperty("web_url", "www.test.com");
        body.addProperty("country_code", "ESP");
        body.addProperty("email", "drom.gom@gmail.com");
        body.addProperty("address", "Padre Pita, 10");
        body.addProperty("tax_number", "011038778L");
        body.addProperty("name", "Sopo Technologies, S.L.");
        body.addProperty("province", "A Coruña");

        try {
            OrganizationResponse organizationResponse = service.createOrganization(body);

            if (organizationResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new organization has the following id: "
                        + organizationResponse.getData().getId());

            } else {
                System.out.println("ERROR " + organizationResponse.getErrorCode() + ": "
                        + organizationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
