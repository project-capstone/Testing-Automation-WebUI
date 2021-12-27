package starter.pages.GroupProduct;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UpdateGroupProduct extends PageObject {

    // pilih product yang ingin diupdate kirim data account
    @FindBy(xpath = "//div[3]//div[1]//div[1]//button[1]")
    WebElementFacade buttonMoreInfoUpdateGroupProduct;
    public void clickButtonMoreInfoUpdateGroupProduct(){
        buttonMoreInfoUpdateGroupProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoUpdateGroupProduct).waitUntilVisible();
        buttonMoreInfoUpdateGroupProduct.click();
    }

    // pilih product yang ingin diupdate kirim data account (failed)
    @FindBy(xpath = "//div[4]//div[1]//div[1]//button[1]")
    WebElementFacade buttonMoreInfoUpdateGroupProductFailed;
    public void clickButtonMoreInfoUpdateGroupProductFailed(){
        buttonMoreInfoUpdateGroupProductFailed.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoUpdateGroupProductFailed).waitUntilVisible();
        buttonMoreInfoUpdateGroupProductFailed.click();
    }

    // click button info di group yang mau diupdate kirim data account
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]")
    WebElementFacade buttonInfoGroupProduct;
    public void clickButtonInfoGroupProduct(){
        buttonInfoGroupProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonInfoGroupProduct).waitUntilVisible();
        buttonInfoGroupProduct.click();
    }

    // click button info di group yang mau diupdate kirim data account (failed)
    @FindBy(xpath = "//div[contains(@class,'contentDetails d-flex flex-wrap')]//div[1]//div[2]//button[1]")
    WebElementFacade buttonInfoGroupProductFailed;
    public void clickButtonInfoGroupProductFailed(){
        buttonInfoGroupProductFailed.sendKeys(Keys.PAGE_DOWN);
        element(buttonInfoGroupProductFailed).waitUntilVisible();
        buttonInfoGroupProductFailed.click();
    }

    //click icon button update untuk kirim data account
    @FindBy(xpath = "//div[6]//div[1]//div[1]//div[2]//div[3]//*[name()='svg']")
    WebElementFacade iconButtonUpdate;
    public void clickIconButtonUpdate(){
        iconButtonUpdate.click();
    }

    //****** isi form data account product *******//

    // input email
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElementFacade FieldEmailAccount;
    public void InputFieldEmailAccount(String email){
        FieldEmailAccount.waitUntilVisible();
        FieldEmailAccount.sendKeys(email);
    }

    //input password
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElementFacade FieldPasswordAccount;
    public void InputFieldPasswordAccount(String email){
        FieldPasswordAccount.waitUntilVisible();
        FieldPasswordAccount.sendKeys(email);
    }

    //click button update
    @FindBy(xpath = "//button[normalize-space()='Update']")
    WebElementFacade buttonUpdate;
    public void clickButtonUpdate(){
        buttonUpdate.waitUntilVisible();
        buttonUpdate.click();
    }

    //Validate Update group product
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageUpdateGroupProduct;
    //validate message update group product success
    public void validateUpdateSuccess(String message){
        element(PopUpMessageUpdateGroupProduct).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageUpdateGroupProduct.getText());
    }

    //validate Update group failed
    @FindBy(css = "h3:nth-child(2)")
    WebElementFacade PopUpMessageUpdateGroupProductFailed;
    //validate message update group product failed
    public void validateUpdateFailed(String message){
        element(PopUpMessageUpdateGroupProductFailed).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageUpdateGroupProductFailed.getText());
    }

    //click buttonOK
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement buttonOKDeleteGroupProduct;
    public void clickButtonOkUpdateGroupProduct(){
        buttonOKDeleteGroupProduct.click();
    }






}
