package starter.stepsdefinition.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;
import starter.pages.Order.CreateOrder;

public class CreateOrderSteps extends BaseTest {

    @When("I am click button more info for order product")
    public void iAmClickButtonMoreInfoForOrderProduct() {
        createorder.clickButtonMoreInfoOrder();
    }

    @And("I am click button order group product available")
    public void iAmClickButtonOrderGroupProductAvailable() {
        createorder.clickButtonOrderDetails();
    }

    @And("I am enter valid phone number {string}")
    public void iAmEnterValidPhoneNumber(String phone) {
        createorder.InputFieldPhoneNumberOVO(phone);
    }

    @And("I am click button order payment")
    public void iAmClickButtonOrderPayment() {
        createorder.clickButtonOrderPayment();
    }

    @Then("I am success order product")
    public void iAmSuccessOrderProduct() {
    }

    @And("Show success message {string} for order product")
    public void showSuccessMessageForOrderProduct(String message) {
        createorder.validateOrderSuccess(message);
        createorder.clickButtonOKOrderProduct();
    }

    @And("Show failed message {string} for order product")
    public void showFailedMessageForOrderProduct(String message) {
        createorder.validateAlertPhoneNumberOVO(message);
    }
}
