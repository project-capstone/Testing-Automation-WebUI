package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
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
    WebElement ButtonSignIn;
    public void clickButtonSignIn(){
        ButtonSignIn.click();
    }

    //validate field email empty
    @FindBy(xpath ="//div[@class='modal-signin p-5 modal-body']//div//div[1]//div[1]//div[1]")
    WebElement AlertFieldEmailEmpty;
    public void validateAlertFieldEmailEmpty(){
        element(AlertFieldEmailEmpty).waitUntilVisible();
        Assert.assertEquals("cannot be blank!",AlertFieldEmailEmpty.getText());
    }

    //validate field password empty
    @FindBy(xpath ="//div[@role='dialog']//div[2]//div[1]//div[1]")
    WebElement AlertFieldPasswordEmpty;
    public void validateAlertFieldPasswordEmpty(){
        element(AlertFieldPasswordEmpty).waitUntilVisible();
        Assert.assertEquals("cannot be blank",AlertFieldPasswordEmpty.getText());
    }

    //Validate Login Success
    @FindBy(id = "//div[@class='swal-text']")
    WebElement PopUpLoginSuccess;
    public void validateLoginSuccess(){
        waitFor(PopUpLoginSuccess);
        Assert.assertEquals("Login Success",PopUpLoginSuccess.getText());
    }


}
