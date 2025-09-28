package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.DriverMange.DriverManager;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;

public class PaymentPage {
    WebDriver driver;
    By NameOnCard = By.xpath("//input[@name='name_on_card']");
    By CardNumber = By.xpath("//input[@name='card_number']");
    By CVC = By.xpath("//input[@name='cvc']");
    By ExpiryMonth = By.xpath("//input[@name='expiry_month']");
    By ExpiryYear = By.xpath("//input[@name='expiry_year']");
    By PayAndConfirmOrderButton = By.xpath("//button[@class='form-control btn btn-primary submit-button']");
    By PaymentMessageSuccess = By.xpath("//b[normalize-space()='Order Placed!']");
    By ContinueButton = By.xpath("//a[@class='btn btn-primary']");
    public PaymentPage() {
        this.driver = DriverManager.getDriver();
    }
    public PaymentPage enterNameOnCard(String name){

        ElementHelper.sendText(driver,NameOnCard,name);
        return this;
    }
    public PaymentPage enterCardNumber(String number) {

        ElementHelper.sendText(driver,CardNumber,number);
        return this;
    }
    public PaymentPage enterCVC(String cvc) {

        ElementHelper.sendText(driver,CVC,cvc);
        return this;
    }
    public PaymentPage enterExpirationMonth(String month) {

        ElementHelper.sendText(driver,ExpiryMonth,month);
        return this;
    }
    public PaymentPage enterExpirationYear(String year) {

        ElementHelper.sendText(driver,ExpiryYear,year);
        return this;
    }
    public PaymentPage clickOnPayAndConfirmOrderButton() {

        ElementHelper.scrollToElement(driver,PayAndConfirmOrderButton);
        ElementHelper.click(driver,PayAndConfirmOrderButton);
        return this;
    }
    // Assert Payment Confirmation
    public PaymentPage AssertPaymentMessage() {
        AssertionHelper.assertElementText(driver,PaymentMessageSuccess,"ORDER PLACED!");
        return this;
    }
    public PaymentPage ClickOnContinueButton(){
        ElementHelper.click(driver,ContinueButton);
        return this;
    }

}
