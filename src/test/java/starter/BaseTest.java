package starter;

import starter.pages.LoginPage;
import starter.pages.ProductPage;
import starter.pages.RegistrationPage;

public class BaseTest {
    public RegistrationPage registration = new RegistrationPage();
    public LoginPage login = new LoginPage();
    public ProductPage product = new ProductPage();
}
