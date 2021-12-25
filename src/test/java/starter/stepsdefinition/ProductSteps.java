package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class ProductSteps extends BaseTest {

    @Given("I am login as admin")
    public void iAmLoginAsAdmin() {
        product.open();
        product.clickIconAccount();
        product.clickTextButtonSignIn();
        product.InputAccountAdmin();
        product.clickButtonSignIn();
        product.clickButtonOK();
    }

    @Given("I am login as customer")
    public void iAmLoginAsCustomer() {
        product.open();
        product.clickIconAccount();
        product.clickTextButtonSignIn();
        product.InputAccountCustomer();
        product.clickButtonSignIn();
        product.clickButtonOK();
    }

    @When("I am click menu product")
    public void iAmClickMenuProduct() {
        product.clickMenuProduct();
    }

    @Then("show product list")
    public void showProductList() {
        product.validateAllProduct();
    }

    //*******************//

    //click menu dropdown icon profile
    @When("I am click menu dropdown icon profile")
    public void iAmClickMenuDropdownIconProfile() {
        product.clickIconAccount();
    }

    //click text button menu add new product
    @When("I am click menu add product")
    public void iAmClickMenuAddProduct() {
        product.clickTextButtonAddProduct();
    }

    //validate admin in add new product page
    @Then("I am redirected to add new product page")
    public void iAmRedirectedToAddNewProductPage() {
        product.validateAddNewProductPage();
    }
    //customer tidak menemukan menu add product
    @Then("menu add product not exist")
    public void menuAddProductNotExist() {
        product.validateTextButtonAddProduct();
    }
    //sudah berada di page add new product
    @And("I am already in add new product page")
    public void iAmAlreadyInAddNewProductPage() {
        product.clickIconAccount();
        product.clickTextButtonAddProduct();
    }

    //****ADD NEW PRODUCT****//

    //input product name
    @When("I am enter product name {string}")
    public void iAmEnterProductName(String nameproduct) {
        product.InputProductName(nameproduct);
    }
    //input detail product
    @And("I am enter detail product {string}")
    public void iAmEnterDetailProduct(String detailproduct) {
        product.InputDetailPoduct(detailproduct);
    }
    //input limit product
    @And("I am enter limit {int} orang")
    public void iAmEnterLimitOrang(int limitproduct) {
        product.InputLimit(limitproduct);
    }
    //input price product
    @And("I am enter price product {int}")
    public void iAmEnterPriceProduct(int priceproduct) {
        product.InputPrice(priceproduct);
    }
    //upload image product
    @And("I am upload image product {string}")
    public void iAmUploadImageProduct(String filename) {
        product.uploadFoto(filename);
    }
    //click button add product
    @And("I am click button add product")
    public void iAmClickButtonAddProduct() {
        product.clickButtonAddProduct();
    }
    @Then("I am success add product")
    public void iAmSuccessAddProduct() {
    }

    @And("Show success message {string} for add new product")
    public void showSuccessMessageForAddNewProduct(String message) {
        product.validateAddNewProductSuccess(message);
        product.clickButtonOKAddNewProduct();
    }

    @And("Show error message in field product name {string}")
    public void showErrorMessageInFieldProductName(String message) {
        product.validateAlertFieldProductNameEmpty(message);
    }

    @And("Show error message in field product detail {string}")
    public void showErrorMessageInFieldProductDetail(String message) {
        product.validateAlertFieldProductDetailEmpty(message);
    }

    @And("Show error message in field limit {string}")
    public void showErrorMessageInFieldLimit(String message) {
        product.validateAlertFieldLimitEmpty(message);
    }

    @And("Show error message in field price detail {string}")
    public void showErrorMessageInFieldPriceDetail(String message) {
        product.validateAlertFieldPriceEmpty(message);
    }

    @And("Show error message in field product picture {string}")
    public void showErrorMessageInFieldProductPicture(String message) {
        product.validateAlertFieldFotoEmpty(message);
    }

    //********DELETE PRODUCT**********//

    //click button more info di product yang ingin dihapus
    @And("I am choose product with click button more info")
    public void iAmChooseProductWithClickButtonMoreInfo() {
        product.clickButtonMoreInfo();
    }

    //click button delete
    @And("I am click button delete product")
    public void iAmClickButtonDeleteProduct() {
        product.clickButtonDelete();
    }

    //click button OK for delete product
    @And("I am click button OK delete product")
    public void iAmClickButtonOKDeleteProduct() {
        product.clickButtonOKDeleteProduct();
    }

    @Then("I am success delete product")
    public void iAmSuccessDeleteProduct() {

    }
    //show pesan success operation ketika delete product
    @And("show success message {string} for delete product")
    public void showSuccessMessageForDeleteProduct(String message) {
        product.validateDeleteSuccess(message);
    }

}
