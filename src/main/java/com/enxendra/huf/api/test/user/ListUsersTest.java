package com.enxendra.huf.api.test.user;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.user.User;
import com.enxendra.huf.api.model.user.UserListResponse;
import com.enxendra.huf.api.service.UserService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListUsersTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        UserService service = new UserService(requestOptions);

        try {
            UserListResponse userListResponse = service.listUsers();

            if (userListResponse.getResponseCode().equals(Constants.OK)) {
                if (userListResponse.getData() != null && userListResponse.getData().getUsers() != null
                        && userListResponse.getData().getUsers().size() > 0) {
                    for (User user : userListResponse.getData().getUsers()) {
                        System.out.println(user.getId() + ". " + user.getName() + " - " + user.getRoles());
                        if (user.getRoles() != null && user.getRoles().size() != 0) {
                            System.out.println("El usuario tiene " + user.getRoles().size() + " roles");
                            for (String role : user.getRoles()) {
                                System.out.print(" - " + role);
                            }
                        }

                    }
                } else {
                    System.out.println("Users not found");
                }

            } else {
                System.out.println("ERROR " + userListResponse.getErrorCode() + ": "
                        + userListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
