package starter.pages.Product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DeleteProduct extends PageObject {

    //delete product yang ingin dipilih ( tidak ada group product )
    @FindBy(xpath = "//div[10]//div[1]//div[1]//button[1]")
    WebElement buttonMoreInfoProduct;
    public void clickButtonMoreInfoProduct(){
        buttonMoreInfoProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoProduct).waitUntilVisible();
        buttonMoreInfoProduct.click();
    }

    //delete product yang ingin dipilih ( ada group product )
    @FindBy(xpath = "//div[3]//div[1]//div[1]//button[1]") //sesuaikan dengan product yang ingin dihapus
    WebElementFacade buttonMoreInfo;
    public void clickButtonMoreInfo(){
        buttonMoreInfo.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfo).waitUntilVisible();
        buttonMoreInfo.click();

    }

    //click button delete
    @FindBy(xpath = "//div[contains(@class,'col-2 d-flex justify-content-start align-items-center')]//button[contains(@type,'button')][normalize-space()='Delete']")
    WebElement buttonDelete;
    public void clickButtonDelete(){
        element(buttonDelete).waitUntilVisible();
        buttonDelete.click();
    }

    //konfirmasi delete product
    @FindBy(xpath = "//button[contains(@class,'col-3 btEdit btn btn-danger')]")
    WebElement buttonDeleteProduct;
    public void clickButtonDeleteProduct(){
        buttonDeleteProduct.click();
    }

    //Validate Delete Success
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageDelete;
    //validate message delete success
    public void validateDeleteSuccess(String message){
        element(PopUpMessageDelete).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageDelete.getText());
    }
    public void validateDeleteFailed(String message){
        element(PopUpMessageDelete).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageDelete.getText());
    }

    //click buttonOK
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement buttonOKDeleteProduct;
    public void clickButtonOkDeleteProduct(){
        buttonOKDeleteProduct.click();
    }




}
