package com.enxendra.huf.api.test.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class CreateCustomerTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        JsonObject body = new JsonObject();

        body.addProperty("poblation", "A Coruña");
        body.addProperty("phone", 692977695);
        body.addProperty("post_code", 15009);
        body.addProperty("contact_person", "");
        body.addProperty("country_code", "ESP");
        body.addProperty("email", "drom@test.com");
        body.addProperty("address", "Padre Pita, 110");
        body.addProperty("tax_number", "021038S");
        body.addProperty("name", "Pedro");
        body.addProperty("first_surname", "Gonzalez");
        body.addProperty("second_surname", "Rodriguez");
        body.addProperty("province", "A Coruña");

        try {
            CustomerResponse customerResponse = service.createCustomer(body);

            if (customerResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new customer has the following id: " + customerResponse.getData().getId());
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
