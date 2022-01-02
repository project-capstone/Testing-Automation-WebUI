package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

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
    public void InputEmail(String email) {
        FieldEmail.sendKeys(email);
    }

    //Input Password in Field Password
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement FieldPassword;
    public void InputPassword(String password){
        FieldPassword.sendKeys(password);
    }

    //Click Button SignIn
    @FindBy(xpath = "//button[normalize-space()='SignIn']")
    WebElementFacade ButtonSignIn;
    public void clickButtonSignIn(){
        ButtonSignIn.click();
    }

    //Click Button Cancel
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement ButtonCancel;
    public void clickButtonCancel(){
        ButtonCancel.click();
    }

    //validate field email
    @FindBy(xpath ="//div[normalize-space()='cannot be blank!']")
    WebElement AlertFieldEmailEmpty;
    @FindBy(xpath = "//div[normalize-space()='email is not valid!']")
    WebElement AlertFieldEmailInvalid;
    public void validateAlertFieldEmailEmpty(String message){
        element(AlertFieldEmailEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldEmailEmpty.getText());
    }
    public void validateAlertFieldEmailInvalid(String message){
        element(AlertFieldEmailInvalid).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldEmailInvalid.getText());
    }

    //validate field password
    @FindBy(xpath ="//div[@role='dialog']//div[2]//div[1]//div[1]")
    WebElement AlertFieldPasswordEmpty;
    public void validateAlertFieldPasswordEmpty(String message){
        element(AlertFieldPasswordEmpty).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPasswordEmpty.getText());
    }

    //Validate Login
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageLogin;
    //validate message login success
    public void validateLoginSuccess(String message){
        element(PopUpMessageLogin).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageLogin.getText());
    }
    //validate message login failed
    public void validateLoginFailed(String message){
        element(PopUpMessageLogin).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageLogin.getText());
    }

    //click button OK
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ButtonOK;
    public void clickButtonOK(){
        element(ButtonOK).waitUntilVisible();
        ButtonOK.click();
    }


}
