package starter.stepsdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class UpdateProductSteps extends BaseTest {

    @When("I am click button more info the product for update product")
    public void iAmClickButtonMoreInfoTheProductForUpdateProduct() {
        updateproduct.clickButtonMoreInfo();
        updateproduct.scrollatas();
    }

    @And("I am click icon button update product")
    public void iAmClickIconButtonUpdateProduct() {
        updateproduct.clickButtonIconUpdateProduct();
    }

    @And("I am enter in field product name {string} for update")
    public void iAmEnterInFieldProductNameForUpdate(String productname) {
        updateproduct.InputProductName(productname);
    }

    @And("I am enter in field detail product {string} for update")
    public void iAmEnterInFieldDetailProductForUpdate(String detailproduct) {
        updateproduct.InputDetailPoduct(detailproduct);
    }

    @And("I am enter in field capacity {int} orang for update")
    public void iAmEnterInFieldCapacityOrangForUpdate(int capacity) {
        updateproduct.InputCapacity(capacity);
    }

    @And("I am enter in field price product {int} for update")
    public void iAmEnterInFieldPriceProductForUpdate(int price) {
        updateproduct.InputPrice(price);
    }

    @And("I am upload a image product {string} for update")
    public void iAmUploadAImageProductForUpdate(String filename) {
        updateproduct.uploadFoto(filename);
    }

    @And("I am click button save changes")
    public void iAmClickButtonSaveChanges() {
        updateproduct.clickButtonSaveChanges();
    }

    @And("I am click button YES")
    public void iAmClickButtonYES() {
        updateproduct.clickButtonYES();
    }

    @Then("I am success update product")
    public void iAmSuccessUpdateProduct() {
    }

    @And("Show success message {string} for update product")
    public void showSuccessMessageForUpdateProduct(String message) {
        updateproduct.validateUpdateSuccess(message);
    }
}
