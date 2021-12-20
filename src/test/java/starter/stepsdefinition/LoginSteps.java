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

    @And("I am enter valid password {string}")
    public void iAmEnterValidPassword(String password) {
        login.InputPassword(password);
    }

    @And("I am enter invalid password {string}")
    public void iAmEnterInvalidPassword(String password) {
        login.InputPassword(password);
    }

    @And("I am click button SignIn")
    public void iAmClickButtonSignIn() {
        login.clickButtonSignIn();
    }

    @Then("I am success login")
    public void iAmSuccessLogin() {
        login.validateAlertFieldEmailEmpty();
    }

    @Then("I am failed login")
    public void iAmFailedLogin() {
    }


}
