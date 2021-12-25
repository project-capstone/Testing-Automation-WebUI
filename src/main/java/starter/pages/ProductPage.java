package starter.pages;

import gherkin.lexer.Fi;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.*;

public class ProductPage extends PageObject {

    //Click Icon Account
    @FindBy(id = "collasible-nav-dropdown")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Button SignIn
    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement TextButtonSignIn;
    public void clickTextButtonSignIn() {
        TextButtonSignIn.click();
    }

    //Input Email in Field Email
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement FieldEmail;
    //Input Password in Field Password
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement FieldPassword;
    //input user admin
    public void InputAccountAdmin(){
        FieldEmail.sendKeys("admin@admin.com");
        FieldPassword.sendKeys("admin123");
    }
    //input user customer
    public void InputAccountCustomer(){
        FieldEmail.sendKeys("wahyu@gmail.com");
        FieldPassword.sendKeys("wahyu123");
    }
    //*************************//

    //Click Button SignIn
    @FindBy(xpath = "//button[normalize-space()='SignIn']")
    WebElement ButtonSignIn;
    public void clickButtonSignIn(){
        ButtonSignIn.click();
    }

    //click button OK
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ButtonOK;
    public void clickButtonOK(){
        ButtonOK.click();
    }
    //********************************//

    //menu header Product
    @FindBy(xpath = "//a[normalize-space()='Product']")
    WebElement MenuProduct;
    public void clickMenuProduct(){
        MenuProduct.click();
    }

    //validate get all product displayed
    @FindBy(xpath = "//div[contains(@class,'CardContainer')]//div//div[1]//div[1]//img[1]")
    WebElement GetAllProduct;
    public void validateAllProduct(){
        Assert.assertEquals(true,GetAllProduct.isDisplayed());
    }

    //********************************//

    //menu add new product
    @FindBy(xpath = "//a[@href='/addproduct']")
    WebElementFacade TextButtonAddProduct;
    public void clickTextButtonAddProduct(){
        TextButtonAddProduct.click();
    }
    //validasi element ini tidak ada
    public void validateTextButtonAddProduct(){
        TextButtonAddProduct.shouldNotBePresent();
    }
    //validasi page add new product
    @FindBy(xpath = "//h3[normalize-space()='Add New Product']")
    WebElement AddNewProductPage;
    public void validateAddNewProductPage(){
        Assert.assertEquals(true,AddNewProductPage.isDisplayed());
    }

    //******FORM ADD NEW PRODUCT********//

    //Input nama product
    @FindBy(id = "floatingProductName")
    WebElement FieldProductName;
    public void InputProductName(String nameproduct){
        FieldProductName.sendKeys(nameproduct);
    }

    //Input detail product
    @FindBy(id = "floatingInput")
    WebElement FieldDetailProduct;
    public void InputDetailPoduct(String detailproduct){
        FieldDetailProduct.sendKeys(Keys.PAGE_DOWN);
        FieldDetailProduct.sendKeys(detailproduct);
    }

    //Input limit orang bergabung
    @FindBy(id = "floatingLimit")
    WebElement FieldLimit;
    public void InputLimit(int limitproduct){
        FieldLimit.sendKeys(String.valueOf(limitproduct));

    }

    //Input harga product
    @FindBy(xpath = "//input[@placeholder='Price']")
    WebElement FieldPrice;
    public void InputPrice(int priceproduct){
        element(FieldPrice).waitUntilVisible();
        FieldPrice.sendKeys(String.valueOf(priceproduct));
    }

    //upload file
    @FindBy(xpath = "//input[@id='photo ']")
    WebElement FieldFoto;
    public void uploadFoto(String filename){
        upload(filename).to(FieldFoto);
    }

    //click button add product
    @FindBy(xpath = "//button[normalize-space()='Add Product']")
    WebElement buttonAddProduct;
    public void clickButtonAddProduct(){
        buttonAddProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonAddProduct).waitUntilVisible();
        buttonAddProduct.click();
    }

    //Validate add new product
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageAddNewProduct;
    //validate message add new product success
    public void validateAddNewProductSuccess(String message){
        element(PopUpMessageAddNewProduct).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageAddNewProduct.getText());
    }
    //click button OK SETELAH POP UP add new product SUCCESS MUNCUL
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ButtonOKAddNewProduct;
    public void clickButtonOKAddNewProduct(){
        ButtonOKAddNewProduct.click();
    }
    //validate field product name cannot be empty
    @FindBy(xpath = "//div[@class='col-md-12']//div[@class='form-floating']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldProductNameEmpty;
    public void validateAlertFieldProductNameEmpty(String message){
        element(AlertFieldProductNameEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldProductNameEmpty.getText());
    }
    //validate field product details cannot be empty
    @FindBy(xpath = "//div[@class='mb-3 mt-3 form-floating']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldProductDetailEmpty;
    public void validateAlertFieldProductDetailEmpty(String message){
        element(AlertFieldProductDetailEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldProductDetailEmpty.getText());
    }
    //validate field limit cannot be empty
    @FindBy(xpath = "//div[@class='col-12']//div[@class='form-floating']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldLimitEmpty;
    public void validateAlertFieldLimitEmpty(String message){
        element(AlertFieldLimitEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldLimitEmpty.getText());
    }
    //validate field price cannot be empty
    @FindBy(xpath = "//div[@class='mb-3 mt-3 input-group has-validation']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldPriceEmpty;
    public void validateAlertFieldPriceEmpty(String message){
        element(AlertFieldPriceEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPriceEmpty.getText());
    }
    //validate field photo cannot be empty
    @FindBy(xpath = "//div[@class='mb-3']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldFotoEmpty;
    public void validateAlertFieldFotoEmpty(String message){
        element(AlertFieldFotoEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldFotoEmpty.getText());
    }


    //***********DELETE PRODUCT**************//

    @FindBy(xpath = "//div[9]//div[1]//div[1]//button[1]") //bisa berubah-ubah sesuai dengan product yang ingin dihapus
    WebElementFacade buttonMoreInfo;
    public void clickButtonMoreInfo(){
       buttonMoreInfo.sendKeys(Keys.PAGE_DOWN);
       element(buttonMoreInfo).waitUntilVisible();
       buttonMoreInfo.click();
    }

    //click button delete
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    WebElement buttonDelete;
    public void clickButtonDelete(){
        buttonDelete.sendKeys(Keys.PAGE_DOWN);
        element(buttonDelete).waitUntilVisible();
        buttonDelete.click();
    }

    //konfirmasi delete product
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement buttonOKDeleteProduct;
    public void clickButtonOKDeleteProduct(){
        buttonOKDeleteProduct.click();
    }

    //Validate Delete Success
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageDelete;
    //validate message delete success
    public void validateDeleteSuccess(String message){
        element(PopUpMessageDelete).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageDelete.getText());
    }



}