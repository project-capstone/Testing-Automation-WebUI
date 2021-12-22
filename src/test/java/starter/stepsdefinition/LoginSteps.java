package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class LoginSteps extends BaseTest {
    @Given("I am open login page in barengin")
    public void iAmOpenLoginPageInBarengin() {
        login.open();
        login.clickIconAccount();
        login.clickTextButtonSignIn();
    }

    @When("I am enter valid email {string}")
    public void iAmEnterValidEmail(String email) {
        login.InputEmail(email);
    }

    @When("I am enter invalid email {string}")
    public void iAmEnterInvalidEmail(String email) {
        login.InputEmail(email);
    }

    @When("I am left email field blank")
    public void iAmLeftEmailFieldBlank() {

    }

    @And("I am enter valid password {string}")
    public void iAmEnterValidPassword(String password) {
        login.InputPassword(password);
    }

    @And("I am enter invalid password {string}")
    public void iAmEnterInvalidPassword(String password) {
        login.InputPassword(password);
    }

    @And("I am left password field blank")
    public void iAmLeftPasswordFieldBlank() {
    }

    @And("I am click button SignIn")
    public void iAmClickButtonSignIn() {
        login.clickButtonSignIn();
    }

    @Then("I am success login")
    public void iAmSuccessLogin() {

    }

    @And("Show success message {string}")
    public void showSuccessMessage(String message) {
        login.validateLoginSuccess(message);
    }

    @Then("I am failed login")
    public void iAmFailedLogin() {
    }

    @When("I am click button cancel in login page")
    public void iAmClickButtonCancelInLoginPage() {
        login.clickButtonCancel();
    }

    @Then("I am success cancel")
    public void iAmSuccessCancel() {
    }

    @And("Show failed message {string}")
    public void showFailedMessage(String message) {
        login.validateLoginFailed(message);
    }

    @And("Show error message in field email {string}")
    public void showErrorMessageInFieldEmail(String message) {
        login.validateAlertFieldEmailEmpty(message);

    }

    @And("Show error message in field password {string}")
    public void showErrorMessageInFieldPassword(String message) {
        login.validateAlertFieldPasswordEmpty(message);
    }



}
