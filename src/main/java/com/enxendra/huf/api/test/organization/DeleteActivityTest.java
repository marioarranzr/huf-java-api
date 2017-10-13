package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteActivityTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            service.deleteActivity(new Long(359), new Long(9999));
            System.out.println("Activity deleted!");

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
