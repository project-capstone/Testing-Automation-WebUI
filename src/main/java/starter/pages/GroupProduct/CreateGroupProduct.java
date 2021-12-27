package starter.pages.GroupProduct;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreateGroupProduct extends PageObject {

    //button scroll atas mentok
    @FindBy(xpath = "//button[@id='myBtn']//*[name()='svg']")
    WebElement scrollatas;
    public void scrollatas(){
        scrollatas.click();
    }

    //*************** MENUJU KE PAGE GROUP PRODUCT *****************//

    //click more info product yang dipilih
    @FindBy(xpath = "//div[contains(@class,'cardProduct')]//div[1]//div[1]//div[1]//button[1]")
    WebElement buttonMoreInfoGroupProduct;
    public void clickButtonMoreInfoGroupProduct(){
        buttonMoreInfoGroupProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoGroupProduct).waitUntilVisible();
        buttonMoreInfoGroupProduct.click();
    }
    //validate redirect ke halaman group product
    @FindBy(xpath = "//div[7]")
    WebElementFacade GroupProduct;
    public void validateGroupProduct(){
        element(GroupProduct).waitUntilVisible();
        GroupProduct.isPresent();
    }

    //************* CREATE NEW GROUP PRODUCT *****************//

    //pilih product yang ingin ditambahkan group product
    @FindBy(xpath = "//div[3]//div[1]//div[1]//button[1]")
    WebElementFacade buttonMoreInfoCreateGroupProduct;
    public void clickButtonMoreInfoCreateGroupProduct(){
        buttonMoreInfoCreateGroupProduct.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoCreateGroupProduct).waitUntilVisible();
        buttonMoreInfoCreateGroupProduct.click();
    }
    //pilih product yang ingin ditambahkan group product
    @FindBy(xpath = "//div[4]//div[1]//div[1]//button[1]")
    WebElementFacade buttonMoreInfoCreateGroupProductFailed;
    public void clickButtonMoreInfoCreateGroupProductFailed(){
        buttonMoreInfoCreateGroupProductFailed.sendKeys(Keys.PAGE_DOWN);
        element(buttonMoreInfoCreateGroupProductFailed).waitUntilVisible();
        buttonMoreInfoCreateGroupProductFailed.click();
    }

    //click button create new group
    @FindBy(xpath = "//button[normalize-space()='Create New Group']")
    WebElementFacade buttonCreateNewGroup;
    public void clickButtonCreateNewGroup(){
        element(buttonCreateNewGroup).waitUntilVisible();
        buttonCreateNewGroup.click();
    }
    //click button create new group is disable
    public void clickButtonCreateNewGroupDisable(){
        element(buttonCreateNewGroup).waitUntilVisible();
        buttonCreateNewGroup.isDisabled();
    }

    //Validate create new group Success
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement PopUpMessageCreateNewGroup;
    //validate message create new group success
    public void validateCreateNewGroupSuccess(String message){
        element(PopUpMessageCreateNewGroup).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageCreateNewGroup.getText());
    }

    //click button OK SETELAH POP UP add new product SUCCESS MUNCUL
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ButtonOKCreateNewGroup;
    public void clickButtonOKCreateNewGroup(){
        ButtonOKCreateNewGroup.click();
    }

}
