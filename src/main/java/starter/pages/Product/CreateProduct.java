package starter.pages.Product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.*;

public class CreateProduct extends PageObject{

    //****** GIVEN *******//

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

    //********* CREATE NEW PRODUCT **********//

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

    //************* FORM DATA NEW PRODUCT *****************//

    //Input nama product
    @FindBy(xpath = "//input[@placeholder='Product Name']")
    WebElement FieldProductName;
    public void InputProductName(String nameproduct){
        FieldProductName.clear();
        FieldProductName.sendKeys(nameproduct);
    }

    //Input detail product
    @FindBy(xpath = "//textarea[@placeholder='Detail Product']")
    WebElement FieldDetailProduct;
    public void InputDetailPoduct(String detailproduct){
        //FieldDetailProduct.sendKeys(Keys.PAGE_DOWN);
        FieldDetailProduct.clear();
        FieldDetailProduct.sendKeys(detailproduct);
    }

    //Input limit orang bergabung
    @FindBy(xpath = "//input[@placeholder='Capacity']")
    WebElement FieldCapacity;
    public void InputCapacity(int capacity){
        FieldCapacity.sendKeys(Keys.PAGE_DOWN);
        FieldCapacity.sendKeys(String.valueOf(capacity));
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

    //button scroll atas mentok
    @FindBy(xpath = "//button[@id='myBtn']//*[name()='svg']")
    WebElement scrollatas;
    public void scrollatas(){
        scrollatas.click();
    }

    //validate field product name cannot be empty
    @FindBy(xpath = "//body/div[@id='root']/div[@class='BaseContainer']/div[@class='newProduct mt-5']/div[1]/div[1]/div[1]")
    WebElement AlertFieldProductNameEmpty;
    public void validateAlertFieldProductNameEmpty(String message){
        element(AlertFieldProductNameEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldProductNameEmpty.getText());
    }

    //validate field product details cannot be empty
    @FindBy(xpath = "//div[@class='newProduct mt-5']//div[2]//div[1]//div[1]")
    WebElement AlertFieldProductDetailEmpty;
    public void validateAlertFieldProductDetailEmpty(String message){
        element(AlertFieldProductDetailEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldProductDetailEmpty.getText());
    }

    //validate field limit cannot be empty
    @FindBy(xpath = "//div[3]//div[1]//div[1]")
    WebElement AlertFieldLimitEmpty;
    public void validateAlertFieldLimitEmpty(String message){
        element(AlertFieldLimitEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldLimitEmpty.getText());
    }

    //validate field price cannot be empty
    @FindBy(xpath = "//div[@class='input-group has-validation']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
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

}
