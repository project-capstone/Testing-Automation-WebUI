package starter.stepsdefinition;

import io.cucumber.java.en.Given;
import starter.BaseTest;

public class RegistrasiSteps extends BaseTest {
    @Given("I am open registration page in barengin")
    public void iAmOpenRegistrationPageInBarengin() {
        registration.open();
    }
}
