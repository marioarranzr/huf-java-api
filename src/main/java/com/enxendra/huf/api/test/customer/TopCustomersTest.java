package com.enxendra.huf.api.test.customer;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.Customer;
import com.enxendra.huf.api.model.customer.CustomerListResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;

public class TopCustomersTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("order", "ASC");
        params.put("sort_by", "customer_id");
        params.put("number", 100);

        try {

            CustomerListResponse customerListResponse = service.topCustomers(params);

            if (customerListResponse.getResponseCode().equals(Constants.OK)) {
                if (customerListResponse.getData() != null && customerListResponse.getData().getCustomers() != null
                        && customerListResponse.getData().getCustomers().size() > 0) {
                    for (Customer customer : customerListResponse.getData().getCustomers()) {
                        System.out.println(customer.getId() + ". " + customer.getName() + " - "
                                + customer.getTaxNumber());
                    }
                } else {
                    System.out.println("Customers not found");
                }

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
