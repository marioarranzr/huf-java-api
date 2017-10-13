package com.enxendra.huf.api.test.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerConfigurationResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetCustomerConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        try {
            CustomerConfigurationResponse customerConfigurationResponse = service.getCustomerConfiguration(new Long(
                    1148));

            if (customerConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerConfigurationResponse.getData().getInvoiceFormat());
                System.out.println(customerConfigurationResponse.getData().getCurrency());

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
