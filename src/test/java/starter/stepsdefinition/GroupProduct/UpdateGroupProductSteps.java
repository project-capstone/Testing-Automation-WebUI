package starter.stepsdefinition.GroupProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class UpdateGroupProductSteps extends BaseTest {

    @When("I am click button more info the product for update group product")
    public void iAmClickButtonMoreInfoTheProductForUpdateGroupProduct() {
        updategroupproduct.clickButtonMoreInfoUpdateGroupProduct();
    }

    @And("I am click button info")
    public void iAmClickButtonInfo() {
        updategroupproduct.clickButtonInfoGroupProduct();
    }

    @And("I am click icon button update group product")
    public void iAmClickIconButtonUpdateGroupProduct() {
        updategroupproduct.clickIconButtonUpdate();
    }

    @And("I am fill email {string}")
    public void iAmFillEmail(String email) {
        updategroupproduct.InputFieldEmailAccount(email);
    }

    @And("I am fill password {string}")
    public void iAmFillPassword(String password) {
        updategroupproduct.InputFieldPasswordAccount(password);
    }

    @And("I am click button update group product")
    public void iAmClickButtonUpdateGroupProduct() {
        updategroupproduct.clickButtonUpdate();
    }

    @Then("I am success update group product")
    public void iAmSuccessUpdateGroupProduct() {
    }

    @And("Show message success {string} for update group product")
    public void showMessageSuccessForUpdateGroupProduct(String message) {
        updategroupproduct.validateUpdateSuccess(message);
        updategroupproduct.clickButtonOkUpdateGroupProduct();
    }

    //************** NEGATIVE CASE ****************//

    @When("I am click button more info the products for update group product")
    public void iAmClickButtonMoreInfoTheProductsForUpdateGroupProduct() {
        updategroupproduct.clickButtonMoreInfoUpdateGroupProductFailed();
    }

    @And("I am clicks button info")
    public void iAmClicksButtonInfo() {
        updategroupproduct.clickButtonInfoGroupProductFailed();
    }

    @And("I am clicks button icon button update group product")
    public void iAmClicksButtonIconButtonUpdateGroupProduct() {
        updategroupproduct.clickIconButtonUpdate();
    }

    @Then("I am failed update group product")
    public void iAmFailedUpdateGroupProduct() {

    }

    @And("Show message failed {string} for update group product")
    public void showMessageFailedForUpdateGroupProduct(String message) {
        updategroupproduct.validateUpdateFailed(message);
    }
}
