package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

public class RegistrationPage extends PageObject {

    //Click Icon Account
    @FindBy(id = "collasible-nav-dropdown")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Button SignUp
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    WebElement TextButtonSignUp;
    public void clickTextButtonSignUp() {
        TextButtonSignUp.click();
    }

    //Input field name
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement FieldName;
    public void InputFieldName(String name){
        FieldName.sendKeys(name);
    }

    //Input field email
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement FieldEmail;
    public void InputFieldEmail(String email){
        FieldEmail.sendKeys(email);
    }

    //Input field password
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement FieldPassword;
    public void InputFieldPassword(String password){
        FieldPassword.sendKeys(password);
    }

    //Input field phone
    @FindBy(xpath = "//input[@placeholder='Phone Number ex: 62XXXXXXXXX']")
    WebElement FieldPhone;
    public void InputFieldPhone(String phone){
        FieldPhone.sendKeys(phone);
    }

    //Click Button SignUp
    @FindBy(xpath = "//button[normalize-space()='SignUp']")
    WebElement ButtonSignUp;
    public void clickButtonSignUp(){
        ButtonSignUp.click();
    }

    //Click Button Cancel
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement ButtonCancel;
    public void clickButtonCancel(){
        ButtonCancel.click();
    }

    @FindBy(xpath = "//p[@class='toSignIn']")
    WebElement TextButtonSignIn;
    public void clickTextButtonSignIn (){
        TextButtonSignIn.click();
    }

    //Validate Register Success
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageRegister;
    //validate message register success
    public void validateRegisterSuccess(String message){
        element(PopUpMessageRegister).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageRegister.getText());
    }
    public void validateRegisterFailed(String message){
        element(PopUpMessageRegister).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageRegister.getText());
    }

    //validate error message in field email ( invalid email )
    @FindBy(xpath = "//div[normalize-space()='email is not valid!']")
    WebElement AlertFieldEmailInvalid;
    public void validateAlertInvalidEmail(String message){
        element(AlertFieldEmailInvalid).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldEmailInvalid.getText());
    }

    //validate error message in field password ( invalid password )
    @FindBy(xpath = "//div[normalize-space()='password is too short!']")
    WebElement AlertFieldPasswordInvalid;
    public void validateAlertInvalidPassword(String message){
        element(AlertFieldPasswordInvalid).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPasswordInvalid.getText());
    }

    //validate error message in field name ( empty name )
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='modal-dialog col-8 modal-dialog-centered']/div[@class='modal-content']/div[@class='modal-register p-5 modal-body']/div/div[1]/div[1]")
    WebElement AlertFieldNameEmpty;
    public void validateAlertEmptyName(String message){
        element(AlertFieldNameEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldNameEmpty.getText());
    }

    //validate error message in field email ( empty email )
    @FindBy(xpath = "//div[@role='dialog']//div[2]//div[1]")
    WebElement AlertFieldEmailEmpty;
    public void validateAlertEmptyEmail(String message){
        element(AlertFieldEmailEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldEmailEmpty.getText());
    }

    //validate error message in field password ( empty password )
    @FindBy(xpath = "//div[@class='input-group']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldPasswordEmpty;
    public void validateAlertEmptyPassword(String message){
        element(AlertFieldPasswordEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPasswordEmpty.getText());
    }

    //validate error message in field password ( empty password )
    @FindBy(xpath = "//div[@class='mb-3']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement AlertFieldPhoneEmpty;
    public void validateAlertEmptyPhone(String message){
        element(AlertFieldPhoneEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPhoneEmpty.getText());
    }

    @FindBy(xpath = "//button[normalize-space()='SignIn']")
    WebElementFacade LoginPage;
    public void validateLoginPage(){
        element(LoginPage).waitUntilVisible();
        LoginPage.isDisplayed();
    }

}
