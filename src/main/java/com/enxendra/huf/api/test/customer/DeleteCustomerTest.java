package com.enxendra.huf.api.test.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteCustomerTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        try {
            service.deleteCustomer(new Long(1145));
            System.out.println("Deleted!");
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
