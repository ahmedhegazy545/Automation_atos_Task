package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.DriverMange.DriverManager;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;

public class CheckOutPage {
    WebDriver driver;
    By PlaceOrder = By.xpath("//a[@class='btn btn-default check_out']");
    By Comment = By.xpath("//textarea[@name='message']");
    By CheckoutPage = By.xpath("//a[@class='btn btn-default check_out']");
    By Name = By.xpath("//ul[@id='address_invoice']//li[@class='address_firstname address_lastname']");
    By CheckName = By.xpath("//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']");

    By Address = By.xpath("//ul[@class='address item box']/li[4]");
    By CheckAddress = By.xpath("//ul[@class='address alternate_item box']/li[4]");

    By CheckCity = By.xpath("//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']");
    By City = By.xpath("//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']");
    By CheckCountry = By.xpath("//ul[@id='address_delivery']//li[@class='address_country_name']");
    By Country = By.xpath("//ul[@id='address_invoice']//li[@class='address_country_name']");
    By Mobile = By.xpath("//ul[@id='address_invoice']//li[@class='address_phone']");
    By CheckMobile = By.xpath("//ul[@id='address_delivery']//li[@class='address_phone']");

    public CheckOutPage() {
        this.driver= DriverManager.getDriver();
    }
    public void navigateToCheckOut(){
        ElementHelper.click(driver,CheckoutPage);
    }
    public CheckOutPage assertName(){
        String ActualName = ElementHelper.getText(driver,CheckName).replaceAll("\\s+", " ").trim();
        String ExpectedName = ElementHelper.getText(driver,Name).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualName,ExpectedName);
        return this;
    }

    public CheckOutPage assertAddress(){
        String ActualAddress1 = ElementHelper.getText(driver,CheckAddress).replaceAll("\\s+", " ").trim();
        String ExpectedAddress1 = ElementHelper.getText(driver,Address).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualAddress1,ExpectedAddress1);
        return this;
    }

    public CheckOutPage assertCity() {
        String ActualCity = ElementHelper.getText(driver, CheckCity).replaceAll("\\s+", " ").trim();
        String ExpectedCity = ElementHelper.getText(driver, City).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualCity, ExpectedCity);
        return this;
    }
    public CheckOutPage assertCountry() {
        String ActualCountry = ElementHelper.getText(driver, CheckCountry).replaceAll("\\s+", " ").trim();
        String ExpectedCountry = ElementHelper.getText(driver, Country).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualCountry, ExpectedCountry);
        return this;
    }
    public CheckOutPage assertMobile() {
        String ActualMobile = ElementHelper.getText(driver, CheckMobile).replaceAll("\\s+", " ").trim();
        String ExpectedMobile = ElementHelper.getText(driver, Mobile).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualMobile, ExpectedMobile);
        return this;
    }
    public CheckOutPage AddComment(String comment){

        ElementHelper.sendText(driver,Comment,comment);
        return this;
    }
    public CheckOutPage clickPlaceOrder(){
        ElementHelper.click(driver,PlaceOrder);
        return this;
    }


}
