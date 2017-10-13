package com.enxendra.huf.api.test.organization;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.organization.Activity;
import com.enxendra.huf.api.model.organization.ActivityResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetActivityTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            Map<String, Object> params = new HashMap<String, Object>(0);
            params.put("num_results", "100");

            ActivityResponse activityResponse = service.activity(new Long(27), params);

            if (activityResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Se han encontrado " + activityResponse.getData().getActivity().size()
                        + " elementos de actividad");

                for (Activity activity : activityResponse.getData().getActivity()) {
                    System.out.println("Date: " + activity.getDate());
                    System.out.println("Action: " + activity.getAction());
                }
            } else {
                System.out.println("ERROR " + activityResponse.getErrorCode() + ": "
                        + activityResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
