package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class LogoutSteps extends BaseTest {

    @When("I am click menu dropdown account")
    public void iAmClickMenuDropdownAccount() {
        logout.clickIconAccount();
    }
    @And("I am click button logout")
    public void iAmClickButtonLogout() {
        logout.clickButtonLogout();
    }

    @Then("I am success logout")
    public void iAmSuccessLogout() {
    }
}
