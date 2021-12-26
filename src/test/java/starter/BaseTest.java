package starter;

import starter.pages.LoginPage;
import starter.pages.Product.CreateProduct;
import starter.pages.Product.UpdateProduct;
import starter.pages.ProductPage;
import starter.pages.RegistrationPage;

public class BaseTest {
    public RegistrationPage registration = new RegistrationPage();
    public LoginPage login = new LoginPage();
    public ProductPage product = new ProductPage();
    public CreateProduct products = new CreateProduct();
    public UpdateProduct updateproduct = new UpdateProduct();
}
