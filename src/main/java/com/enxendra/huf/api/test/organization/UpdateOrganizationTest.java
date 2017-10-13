package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.organization.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("poblation", "Poblation");
        body.addProperty("logo", "TestLogo");
        body.addProperty("phone", "555-1234");
        body.addProperty("post_code", "999999");
        body.addProperty("web_url", "www.test organization.es");
        body.addProperty("fist_surname", "FirstSurname");
        body.addProperty("second_surname", "SecondSurname");
        body.addProperty("country_code", "ESP");
        body.addProperty("email", "test@test.com");
        body.addProperty("address", "Padre Pita, 10");
        body.addProperty("tax_number", "011038778L");
        body.addProperty("name", "Sopo Technologies, S.L.");
        body.addProperty("province", "A Coruña");
        body.addProperty("id", 364);

        try {
            OrganizationResponse organizationResponse = service.updateOrganization(new Long(507), body);
            System.out.println("Organization updated");

        } catch (HUFException e) {
            e.printStackTrace();
        }
    }
}
