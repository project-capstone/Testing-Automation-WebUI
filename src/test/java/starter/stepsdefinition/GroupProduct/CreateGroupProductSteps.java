package starter.stepsdefinition.GroupProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class CreateGroupProductSteps extends BaseTest {

    //********** GET GROUP PRODUCT *************//

    //click button more info untuk melihat group product
    @And("I am choose product with click button more info for get group product")
    public void iAmChooseProductWithClickButtonMoreInfoForGetGroupProduct() {
        creategroupproduct.clickButtonMoreInfoGroupProduct();
    }

    @Then("Show group product page")
    public void showGroupProductPage() {
        creategroupproduct.validateGroupProduct();
    }

    //*********** CREATE GROUP PRODUCT **************//

    @Given("I am not login")
    public void iAmNotLogin() {
        creategroupproduct.open();
    }

//    @When("I am click menu product to Product")
//    public void iAmClickMenuProductToProduct() {
//        creategroupproduct.clickCobaaja();
//    }

    //click button more info produk yang dipilih
    @And("I am choose product with click button more info for create group product")
    public void iAmChooseProductWithClickButtonMoreInfoForCreateGroupProduct() {
        creategroupproduct.clickButtonMoreInfoCreateGroupProduct();
    }
    //click button more info produk yang ada group belum full
    @And("I am choose product there are incomplete group product")
    public void iAmChooseProductThereAreIncompleteGroupProduct() {
        creategroupproduct.clickButtonMoreInfoCreateGroupProductFailed();
        creategroupproduct.scrollatas();
    }

    //click button create new group product
    @And("I am click button create new group")
    public void iAmClickButtonCreateNewGroup() {
        creategroupproduct.scrollatas();
        creategroupproduct.clickButtonCreateNewGroup();
    }


    @Then("I am success create group product")
    public void iAmSuccessCreateGroupProduct() {
    }

    @Then("I am failed create group product")
    public void iAmFailedCreateGroupProduct() {
    }

    //click button create new group is disable
    @Then("I am click button create new group is disable")
    public void iAmClickButtonCreateNewGroupIsDisable() {
        creategroupproduct.scrollatas();
        creategroupproduct.clickButtonCreateNewGroupDisable();
    }

    //validasi pop up message ketika create new group berhasil
    @And("Show success message {string} for create new group")
    public void showSuccessMessageForCreateNewGroup(String message) {
        creategroupproduct.validateCreateNewGroupSuccess(message);
        creategroupproduct.clickButtonOKCreateNewGroup();
    }

}
