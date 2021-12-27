package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LogoutPage extends PageObject {

    //Click Icon Account
    @FindBy(id = "collasible-nav-dropdown")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Button Log Out
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement buttonLogout;
    public void clickButtonLogout(){
        buttonLogout.click();
    }
}
