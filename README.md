# HUF Java API

**This Java library enables the use of the HUF (http://premium.hazteunafacturae.com) services by external applications.**

## Description

This library provides a Java API to connect with the Rest API of HazteUnaFacturae (http://premium.hazteunafacturae.com) and use all is services.

It requires a valid API Key and the endpoint of the instance which will be used by the client. To get your API Key and the proper URL contact to Enxendra Technologies.

## How to

To use properly this library, or to connect by using your own client, check the documentation of our REST API here: (http://docs.huf.apiary.io/)

The first step to use this library is to specify your API_KEY  and the endpoint of the service in the `RequestOptions` object. Additionaly, a USER_TOKEN can be specified in for some functions in which permissions control is required. To learn how to get the USER_TOKEN see the Login Service explanation bellow.

``` java

  static RequestOptions requestOptions = new RequestOptions(<API_KEY>, <ENDPOINT>, <USER_TOKEN>);

```

### User login

To get a USER_TOKEN you need to login with an existing user. This is an example of the login process:

```java

public class LoginTest extends ServiceTest {

// The login service does not need USER_TOKEN (because it provides it as a response)
static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

public static void main(String[] args) {
LoginService service = new LoginService(requestOptions);

Map<String, Object> params = new HashMap<String, Object>();

params.put("user_name", "diego.gonzalez@enxendra.com");
params.put("pass", "0000");

try {
LoginResponse loginResponse = service.login(params);

if (loginResponse.getResponseCode().equals(Constants.OK)) {
System.out.println(loginResponse.getData().getUserName());
System.out.println(loginResponse.getData().getUserToken());

}
} catch (HUFException e) {
System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
}
}


```

Once you have a USER_TOKEN and you can stablish your RequestOptions, you can create an instance of another service (`InvoiceService`,`DraftService`,`OrganizationService`,...) to invoke the operation you need.

### Available services


```

src/main/java/com/enxendra/huf/api/service/MasterTablesService.java
src/main/java/com/enxendra/huf/api/service/InvoiceService.java
src/main/java/com/enxendra/huf/api/service/UserService.java
src/main/java/com/enxendra/huf/api/service/DraftService.java
src/main/java/com/enxendra/huf/api/service/OrganizationService.java
src/main/java/com/enxendra/huf/api/service/CustomerService.java
src/main/java/com/enxendra/huf/api/service/SerieService.java
src/main/java/com/enxendra/huf/api/service/LoginService.java

```

## Service instance example

```java

// We create a new DraftService with the defined `requestOperations` and the `id` of the organization.
DraftService service = new DraftService(requestOptions, new Long(27));

// We call the `getDraftItem` service to retrieve a `DraftItem` with id **1407** from the Draft with id **17028**.
DraftItemResponse draftItemResponse = service.getDraftItem(new Long(17028), new Long(1407));

// We print the response data or errors

try{
                System.out.println(draftItemResponse.getData().getDescription());
                System.out.println(draftItemResponse.getData().getPrice());

} catch (HUFException e) {
    System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
}

```

Each service and method has its own characteristics. So additionaly to the Rest API documentation (see above), to learn how to call our API just by using this library, check the 42 examples (one for each posible operation) that we have already implemented  in the package `com.enxendra.huf.api.test`:

### Serie operations

```
/src/main/java/com/enxendra/huf/api/test/serie/CreateSerieTest.java
/src/main/java/com/enxendra/huf/api/test/serie/DeleteSerieTest.java
/src/main/java/com/enxendra/huf/api/test/serie/GetSerieTest.java
/src/main/java/com/enxendra/huf/api/test/serie/ListSeriesTest.java
/src/main/java/com/enxendra/huf/api/test/serie/UpdateSerieTest.java

```
### Organization operations

```
/src/main/java/com/enxendra/huf/api/test/organization/CreateOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/DeleteOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/ListOrganizationsTest.java
/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationTest.java

```

### Invoice operations

```
/src/main/java/com/enxendra/huf/api/test/invoice/DeleteInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ExportInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetOriginalInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetPdfInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoiceAttachmentsTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoicesTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/UpdateInvoiceStateTest.java

```

### Draft operations:

```

/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftItemTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftAttachmentsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftItemsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/PreviewDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/SendDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/UploadDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ValidateDraftTest.java

```

### Customer operations:

```
/src/main/java/com/enxendra/huf/api/test/customer/CreateCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/DeleteCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/ExportCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/ListCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/TopCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerTest.java

```




* More info: it (at) enxendra.com
