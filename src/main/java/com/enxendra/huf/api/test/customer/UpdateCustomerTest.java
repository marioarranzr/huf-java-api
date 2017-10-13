package com.enxendra.huf.api.test.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateCustomerTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        JsonObject body = new JsonObject();

        body.addProperty("poblation", "Madrid");
        body.addProperty("phone", "666666666");
        body.addProperty("post_code", "15009");
        body.addProperty("web_url", "www.test.com");
        body.addProperty("country_code", "ESP");
        body.addProperty("email", "test@test.com");
        body.addProperty("address", "Padre Pita, 10");
        body.addProperty("tax_number", "000000078S");
        body.addProperty("name", "Juan");
        body.addProperty("province", "A Coruña");

        try {
            CustomerResponse customerResponse = service.updateCustomer(new Long(1145), body);

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Customer updated");

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
