package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.organization.OrganizationConfigurationResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetOrganizationConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            OrganizationConfigurationResponse organizationConfigurationResponse = service
                    .getOrganizationConfiguration(new Long(363));

            if (organizationConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(organizationConfigurationResponse.getData().getInvoiceFormat());
                System.out.println(organizationConfigurationResponse.getData().getCurrency());

            } else {
                System.out.println("ERROR " + organizationConfigurationResponse.getErrorCode() + ": "
                        + organizationConfigurationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
