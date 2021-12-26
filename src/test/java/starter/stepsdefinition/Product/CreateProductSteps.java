package starter.stepsdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class CreateProductSteps extends BaseTest {

    @Given("I am logged as admin")
    public void iAmLoggedAsAdmin() {
        products.open();
        products.clickIconAccount();
        products.clickTextButtonSignIn();
        products.InputAccountAdmin();
        products.clickButtonSignIn();
        products.clickButtonOK();
    }

    @Given("I am logged as customer")
    public void iAmLoggedAsCustomer() {
        products.open();
        products.clickIconAccount();
        products.clickTextButtonSignIn();
        products.InputAccountCustomer();
        products.clickButtonSignIn();
        products.clickButtonOK();
    }

    //********* VALIDASI INGIN MENU ADD NEW PRODUCT ************//

    //click menu dropdown icon profile
    @When("I am click menu dropdown icon profile")
    public void iAmClickMenuDropdownIconProfile() {
        products.clickIconAccount();
    }

    //click text button menu add new product
    @When("I am click menu add product")
    public void iAmClickMenuAddProduct() {
        products.clickTextButtonAddProduct();
    }

    //validate admin in add new product page
    @Then("I am redirected to add new product page")
    public void iAmRedirectedToAddNewProductPage() {
        products.validateAddNewProductPage();
    }
    //customer tidak menemukan menu add product
    @Then("menu add product not exist")
    public void menuAddProductNotExist() {
        products.validateTextButtonAddProduct();
    }
    //sudah berada di page add new product
    @And("I am already in add new product page")
    public void iAmAlreadyInAddNewProductPage() {
        products.clickIconAccount();
        products.clickTextButtonAddProduct();
    }

    //************ FORM DATA NEW PRODUCT ***************//

    @When("I am enter in field product name {string}")
    public void iAmEnterInFieldProductName(String nameproduct) {
        products.InputProductName(nameproduct);
    }

    @And("I am enter in field detail product {string}")
    public void iAmEnterInFieldDetailProduct(String detailproduct) {
        products.InputDetailPoduct(detailproduct);
    }

    @And("I am enter in field capacity {int} orang")
    public void iAmEnterInFieldCapacityOrang(int capacity) {
        products.InputCapacity(capacity);
    }

    @And("I am enter in field price product {int}")
    public void iAmEnterInFieldPriceProduct(int priceproduct) {
        products.InputPrice(priceproduct);
    }

    @And("I am upload a image product {string}")
    public void iAmUploadAImageProduct(String filename) {
        products.uploadFoto(filename);
    }

    @And("I am click button add products")
    public void iAmClickButtonAddProducts() {
        products.clickButtonAddProduct();
    }

    @Then("I am success add products")
    public void iAmSuccessAddProducts() {

    }

    @And("Show success message {string} for add new products")
    public void showSuccessMessageForAddNewProducts(String message) {
        products.validateAddNewProductSuccess(message);
        products.clickButtonOKAddNewProduct();
    }

    @Then("I am failed add products")
    public void iAmFailedAddProducts() {
    }

    @And("Show error message in field product name {string}")
    public void showErrorMessageInFieldProductName(String message) {
        products.validateAlertFieldProductNameEmpty(message);

    }

    @And("Show error message in field product detail {string}")
    public void showErrorMessageInFieldProductDetail(String message) {
        products.validateAlertFieldProductDetailEmpty(message);
    }

    @And("Show error message in field limit {string}")
    public void showErrorMessageInFieldLimit(String message) {
        products.validateAlertFieldLimitEmpty(message);
    }

    @And("Show error message in field price detail {string}")
    public void showErrorMessageInFieldPriceDetail(String message) {
        products.validateAlertFieldPriceEmpty(message);
        products.scrollatas();
    }

    @And("Show error message in field product picture {string}")
    public void showErrorMessageInFieldProductPicture(String message) {
        products.validateAlertFieldFotoEmpty(message);
    }

}
