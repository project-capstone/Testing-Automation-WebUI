package starter.pages.Product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UpdateProduct extends PageObject {

    //button scroll atas mentok
    @FindBy(xpath = "//button[@id='myBtn']//*[name()='svg']")
    WebElement scrollatas;
    public void scrollatas(){
        scrollatas.click();
    }

    //button more info sesuai dengan product yang dipilih
    @FindBy(xpath = "//div[3]//div[1]//div[1]//button[1]") //bisa berubah-ubah sesuai dengan product yang ingin diupdate
    WebElementFacade buttonMoreInfo;
    public void clickButtonMoreInfo(){
        buttonMoreInfo.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfo).waitUntilVisible();
        buttonMoreInfo.click();
    }

    //click icon button edit product
    @FindBy(xpath = "//h3[normalize-space()='Netflix']//*[name()='svg']") //link berubah-ubah sesuai name product
    WebElement buttonIconUpdateProduct;
    public void clickButtonIconUpdateProduct(){
        //buttonIconUpdateProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonIconUpdateProduct).waitUntilVisible();
        buttonIconUpdateProduct.click();
    }

    //************* FORM DATA UPDATE PRODUCT *****************//

    //Input nama product
    @FindBy(xpath = "//input[@id='floatingProductName']")
    WebElement FieldProductName;
    public void InputProductName(String nameproduct){
        //element(FieldProductName).waitUntilVisible();
        FieldProductName.clear();
        FieldProductName.sendKeys(nameproduct);
    }

    //Input detail product
    @FindBy(xpath = "//textarea[@id='floatingInput']")
    WebElement FieldDetailProduct;
    public void InputDetailPoduct(String detailproduct){
        //FieldDetailProduct.sendKeys(Keys.PAGE_DOWN);
        //element(FieldDetailProduct).waitUntilVisible();
        FieldDetailProduct.clear();
        FieldDetailProduct.sendKeys(detailproduct);
    }

    //Input limit orang bergabung
    @FindBy(id = "floatingLimit")
    WebElement FieldCapacity;
    public void InputCapacity(int capacity){
        FieldCapacity.sendKeys(Keys.PAGE_DOWN);
        element(FieldCapacity).waitUntilVisible();
        FieldCapacity.clear();
        FieldCapacity.sendKeys(String.valueOf(capacity));
    }

    //Input harga product
    @FindBy(xpath = "//input[@placeholder='Price']")
    WebElement FieldPrice;
    public void InputPrice(int priceproduct){
        element(FieldPrice).waitUntilVisible();
        FieldPrice.clear();
        FieldPrice.sendKeys(String.valueOf(priceproduct));
    }

    //upload file
    @FindBy(id = "photo")
    WebElement FieldFoto;
    public void uploadFoto(String filename){
        upload(filename).to(FieldFoto);
    }

    //click button add product
    @FindBy(xpath = "//button[normalize-space()='Save Change']")
    WebElement buttonSaveChanges;
    public void clickButtonSaveChanges(){
        buttonSaveChanges.sendKeys(Keys.PAGE_DOWN);
        element(buttonSaveChanges).waitUntilVisible();
        buttonSaveChanges.click();
    }

    //click button YES
    @FindBy(xpath = "//button[normalize-space()='Yes']")
    WebElement buttonYES;
    public void clickButtonYES(){
        buttonYES.click();
    }

    //Validate update Success
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageUpdate;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement buttonOK;
    //validate message update success
    public void validateUpdateSuccess(String message){
        element(PopUpMessageUpdate).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageUpdate.getText());
        buttonOK.click();
    }
}
