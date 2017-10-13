package com.enxendra.huf.api.test.customer;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.ExportFormat;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.test.ServiceTest;

public class ExportCustomersTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("customer_name", "Diego");
        params.put("customer_tax_number", "A000");
        params.put("sort_by", "customer_id");
        params.put("order", "DEST");
        params.put("export_format", ExportFormat.PDF);

        try {

            CustomerResponse customerResponse = service.exportCustomers(params);

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                if (customerResponse.getData() != null) {
                    System.out.println(customerResponse.getData().getExport());

                } else {
                    System.out.println("Customers not found");
                }
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
