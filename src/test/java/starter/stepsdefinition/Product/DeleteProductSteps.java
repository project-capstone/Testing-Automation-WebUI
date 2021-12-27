package starter.stepsdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class DeleteProductSteps extends BaseTest {

    @When("I am click button more info on product unexist group product")
    public void iAmClickButtonMoreInfoOnProductUnexistGroupProduct() {
        deleteProduct.clickButtonMoreInfoProduct();
    }

    @When("I am click button more info the product for delete product")
    public void iAmClickButtonMoreInfoTheProductForDeleteProduct() {
        deleteProduct.clickButtonMoreInfo();
    }

    @And("I am click button delete product")
    public void iAmClickButtonDeleteProduct() {
        deleteProduct.clickButtonDelete();
    }

    @And("I am click button OK delete product")
    public void iAmClickButtonOKDeleteProduct() {
        deleteProduct.clickButtonDeleteProduct();
    }

    @Then("I am success delete product")
    public void iAmSuccessDeleteProduct() {
    }

    @And("show success message {string} for delete product")
    public void showSuccessMessageForDeleteProduct(String message) {
        deleteProduct.validateDeleteSuccess(message);
        deleteProduct.clickButtonOkDeleteProduct();
    }

    @And("show failed message {string} for delete product")
    public void showFailedMessageForDeleteProduct(String message) {
        deleteProduct.validateDeleteFailed(message);
        deleteProduct.clickButtonOkDeleteProduct();
    }


}
