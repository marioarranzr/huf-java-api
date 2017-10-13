package com.enxendra.huf.api.test.organization;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.organization.Organization;
import com.enxendra.huf.api.model.organization.OrganizationListResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListOrganizationsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            OrganizationListResponse organizationListResponse = service.listOrganizations();

            if (organizationListResponse.getResponseCode().equals(Constants.OK)) {
                if (organizationListResponse.getData() != null
                        && organizationListResponse.getData().getOrganizations() != null
                        && organizationListResponse.getData().getOrganizations().size() > 0) {
                    for (Organization organization : organizationListResponse.getData().getOrganizations()) {
                        System.out.println(organization.getId() + ". " + organization.getName() + " - "
                                + organization.getEmail());
                    }
                } else {
                    System.out.println("Organizations not found");
                }

            } else {
                System.out.println("ERROR " + organizationListResponse.getErrorCode() + ": "
                        + organizationListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
