package starter.pages.GroupProduct;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DeleteGroupProduct extends PageObject {

    // pilih product yang ingin group product nya dihapus
    @FindBy(xpath = "//div[3]//div[1]//div[1]//button[1]")
    WebElementFacade buttonMoreInfoDeleteGroupProduct;
    public void clickButtonMoreInfoDeleteGroupProduct(){
        buttonMoreInfoDeleteGroupProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoDeleteGroupProduct).waitUntilVisible();
        buttonMoreInfoDeleteGroupProduct.click();
    }

    // click button delete di group yang belum ada member
    @FindBy(xpath = "//div[contains(@class,'contentDetails d-flex flex-wrap')]//div[1]//div[2]//button[2]")
    WebElementFacade buttonDeleteGroupProduct;
    public void clickButtonDeleteGroupProduct(){
        element(buttonDeleteGroupProduct).waitUntilVisible();
        buttonDeleteGroupProduct.click();
    }
    //click button delete di group yang ada member
    @FindBy(xpath = "//div[2]//div[2]//button[2]")
    WebElementFacade buttonDeleteGroupProductFailed;
    public void clickButtonDeleteGroupProductFailed(){
        buttonDeleteGroupProductFailed.sendKeys(Keys.PAGE_DOWN);
        element(buttonDeleteGroupProductFailed).waitUntilVisible();
        buttonDeleteGroupProductFailed.click();
    }

    //click confirm delete
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
    WebElementFacade buttonConfirmDelete;
    public void clickButtonConfirmDelete(){
        element(buttonConfirmDelete).waitUntilClickable();
        buttonConfirmDelete.click();
    }

    //Validate Delete group product
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageDelete;
    //validate message delete group product success
    public void validateDeleteSuccess(String message){
        element(PopUpMessageDelete).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageDelete.getText());
    }
    //validate message group product failed
    public void validateDeleteFailed(String message){
        element(PopUpMessageDelete).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageDelete.getText());
    }

    //click buttonOK
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement buttonOKDeleteGroupProduct;
    public void clickButtonOkDeleteGroupProduct(){
        buttonOKDeleteGroupProduct.click();
    }



}
