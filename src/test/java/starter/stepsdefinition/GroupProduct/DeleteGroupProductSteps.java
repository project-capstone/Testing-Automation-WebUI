package starter.stepsdefinition.GroupProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class DeleteGroupProductSteps extends BaseTest {

    @When("I am click button more info the product for delete group product")
    public void iAmClickButtonMoreInfoTheProductForDeleteGroupProduct() {
        deletegroupproduct.clickButtonMoreInfoDeleteGroupProduct();
    }

    @And("I am click button delete")
    public void iAmClickButtonDelete() {
        deletegroupproduct.clickButtonDeleteGroupProduct();
    }

    @And("I am click button delete group product on member exist")
    public void iAmClickButtonDeleteGroupProductOnMemberExist() {
        deletegroupproduct.clickButtonDeleteGroupProductFailed();
    }

    @And("I am click button confirm delete")
    public void iAmClickButtonConfirmDelete() {
        deletegroupproduct.clickButtonConfirmDelete();
    }

    @Then("I am success delete group product")
    public void iAmSuccessDeleteGroupProduct() {

    }

    @And("Show success message {string} for delete group product")
    public void showSuccessMessageForDeleteGroupProduct(String message) {
        deletegroupproduct.validateDeleteSuccess(message);
        deletegroupproduct.clickButtonOkDeleteGroupProduct();
    }

    @And("Show failed message {string} for delete group product")
    public void showFailedMessageForDeleteGroupProduct(String message) {
        deletegroupproduct.validateDeleteFailed(message);
        deletegroupproduct.clickButtonOkDeleteGroupProduct();
    }
}
