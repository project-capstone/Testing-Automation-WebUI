package starter;

import starter.pages.GroupProduct.CreateGroupProduct;
import starter.pages.GroupProduct.DeleteGroupProduct;
import starter.pages.GroupProduct.UpdateGroupProduct;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.Product.CreateProduct;
import starter.pages.Product.DeleteProduct;
import starter.pages.Product.UpdateProduct;
import starter.pages.RegistrationPage;

public class BaseTest {
    public RegistrationPage registration = new RegistrationPage();
    public LoginPage login = new LoginPage();
    public LogoutPage logout = new LogoutPage();
    public CreateProduct products = new CreateProduct();
    public UpdateProduct updateproduct = new UpdateProduct();
    public DeleteProduct deleteProduct = new DeleteProduct();
    public CreateGroupProduct creategroupproduct = new CreateGroupProduct();
    public DeleteGroupProduct deletegroupproduct = new DeleteGroupProduct();
    public UpdateGroupProduct updategroupproduct = new UpdateGroupProduct();
}
