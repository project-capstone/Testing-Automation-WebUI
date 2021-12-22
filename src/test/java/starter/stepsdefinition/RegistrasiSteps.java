package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class RegistrasiSteps extends BaseTest {

    @Given("I am open registration page in barengin")
    public void iAmOpenRegistrationPageInBarengin() {
        registration.open();
        registration.clickIconAccount();
        registration.clickTextButtonSignUp();
    }

    @When("I am enter valid name {string} in signup page")
    public void iAmEnterValidNameInSignupPage(String name) {
        registration.InputFieldName(name);
    }

    @When("I am enter invalid name {string} in signup page")
    public void iAmEnterInvalidNameInSignupPage(String name) {
        registration.InputFieldName(name);
    }

    @When("I am left name field blank in signup page")
    public void iAmLeftNameFieldBlankInSignupPage() {
    }

    @And("I am enter valid email {string} in signup page")
    public void iAmEnterValidEmailInSignupPage(String email) {
        registration.InputFieldEmail(email);
    }

    @And("I am enter invalid email {string} in signup page")
    public void iAmEnterInvalidEmailInSignupPage(String email) {
        registration.InputFieldEmail(email);
    }

    @And("I am left email field blank in signup page")
    public void iAmLeftEmailFieldBlankInSignupPage() {
    }

    @And("I am enter valid password {string} in signup page")
    public void iAmEnterValidPasswordInSignupPage(String password) {
        registration.InputFieldPassword(password);
    }

    @And("I am enter invalid password {string} in signup page")
    public void iAmEnterInvalidPasswordInSignupPage(String password) {
        registration.InputFieldPassword(password);
    }

    @And("I am left password field blank in signup page")
    public void iAmLeftPasswordFieldBlankInSignupPage() {
    }

    @And("I am enter valid phone {string} in signup page")
    public void iAmEnterValidPhoneInSignupPage(String phone) {
        registration.InputFieldPhone(phone);
    }

    @And("I am left phone field blank in signup page")
    public void iAmLeftPhoneFieldBlankInSignupPage() {
    }

    @And("I am click button SignUp in signup page")
    public void iAmClickButtonSignUpInSignupPage() {
        registration.clickButtonSignUp();
    }

    @Then("I am success registration")
    public void iAmSuccessRegistration() {
    }

    @And("Show success registration message {string}")
    public void showSuccessRegistrationMessage(String message) {
        registration.validateRegisterSuccess(message);
    }

    @Then("I am failed registration")
    public void iAmFailedRegistration() {
    }

    @And("Show error registration message {string}")
    public void showErrorRegistrationMessage(String message) {
        registration.validateRegisterFailed(message);
    }

    @And("Show error registration message in field email {string}")
    public void showErrorRegistrationMessageInFieldEmail(String message) {
        registration.validateAlertInvalidEmail(message);
    }


    @And("Show error registration message in field password {string}")
    public void showErrorRegistrationMessageInFieldPassword(String message) {
        registration.validateAlertInvalidPassword(message);
    }

    @And("Show error registration message empty name {string}")
    public void showErrorRegistrationMessageEmptyName(String message) {
        registration.validateAlertEmptyName(message);
    }

    @And("Show error registration message empty email {string}")
    public void showErrorRegistrationMessageEmptyEmail(String message) {
        registration.validateAlertEmptyEmail(message);
    }

    @And("Show error registration message empty password {string}")
    public void showErrorRegistrationMessageEmptyPassword(String message) {
        registration.validateAlertEmptyPassword(message);
    }

    @And("Show error registration message empty phone {string}")
    public void showErrorRegistrationMessageEmptyPhone(String message) {
        registration.validateAlertEmptyPhone(message);
    }

    @When("I am click button cancel in registration page")
    public void iAmClickButtonCancelInRegistrationPage() {
        registration.clickButtonCancel();
    }

    @When("I am click text button Sign In")
    public void iAmClickTextButtonSignIn() {
        registration.clickTextButtonSignIn();
    }

    @Then("I am redirected to login page")
    public void iAmRedirectedToLoginPage() {
        registration.validateLoginPage();
    }
}
