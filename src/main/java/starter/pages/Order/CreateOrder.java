package starter.pages.Order;

import io.cucumber.java.an.E;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreateOrder extends PageObject {

    // click button more info for order success
    @FindBy(xpath = "//div[contains(@class,'d-flex flex-wrap justify-content-beetwen')]//div[2]//div[1]//div[1]//button[1]")
    WebElementFacade ButtonMoreInfoOrder;
    public void clickButtonMoreInfoOrder(){
        ButtonMoreInfoOrder.sendKeys(Keys.PAGE_DOWN);
        element(ButtonMoreInfoOrder).waitUntilVisible();
        ButtonMoreInfoOrder.click();
    }

    // click button order untuk ke halaman details order
    @FindBy(xpath = "//button[normalize-space()='Order']")
    WebElementFacade ButtonOrderDetails;
    public void clickButtonOrderDetails(){
        ButtonOrderDetails.sendKeys(Keys.PAGE_UP);
        element(ButtonOrderDetails).waitUntilVisible();
        ButtonOrderDetails.click();
    }

    //INPUT PHONE NUMBER OVO SUCCESS/VALID
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    WebElementFacade FieldPhoneNumberOVO;
    public void InputFieldPhoneNumberOVO(String phone){
        FieldPhoneNumberOVO.sendKeys(phone);
    }

    //CLICK BUTTON ORDER PAYMENT
    @FindBy(xpath = "//button[normalize-space()='Order']")
    WebElementFacade buttonOrderPayment;
    public void clickButtonOrderPayment(){
        buttonOrderPayment.click();
    }

    //******** VALIDATE POP UP MESSAGE *********//

    //Validate Pop Up Order

    //validate message order success
    @FindBy(xpath = "//div[@class='swal-title']")
    WebElementFacade PopUpMessageSuccessPayment;
    public void validateOrderSuccess(String message){
        element(PopUpMessageSuccessPayment).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageSuccessPayment.getText());
    }

    //validate field phone number ovo invalid format
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement AlertFieldPhoneNumberOVO;
    public void validateAlertPhoneNumberOVO(String message){
        element(AlertFieldPhoneNumberOVO).waitUntilVisible();
        Assert.assertEquals(message,AlertFieldPhoneNumberOVO.getText());
    }

    //click buttonOK
    @FindBy(xpath = "//button[normalize-space()='Check My Order']")
    WebElement buttonOKDeleteProduct;
    public void clickButtonOKOrderProduct(){
        buttonOKDeleteProduct.click();
    }




}
