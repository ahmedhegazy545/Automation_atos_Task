package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.DriverMange.DriverManager;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;

public class ContactUsPage {
    WebDriver driver;
    By ContactUsButton = By.xpath("//a[normalize-space()='Contact us']");
    By Name = By.xpath("//input[@placeholder='Name']");
    By Email = By.xpath("//input[@placeholder='Email']");
    By Subject = By.xpath("//input[@placeholder='Subject']");
    By Message = By.xpath("//textarea[@id='message']");
    By UploadFile = By.cssSelector("input[name='upload_file']");
    By SubmitButton = By.xpath("//input[@name='submit']");
    By SuccessMessage = By.xpath("//div[@class='status alert alert-success']");
    By HomeButton = By.xpath("//a[@class='btn btn-success']");
    public ContactUsPage() {
        this.driver = DriverManager.getDriver();
    }
    public ContactUsPage navigateToContactUsPage(){
        ElementHelper.click(driver,ContactUsButton);
        return this;
    }
    public ContactUsPage enterContactName(String name){
        ElementHelper.sendText(driver,Name,name);
        return this;
    }
    public ContactUsPage enterContactEmail(String email){
        ElementHelper.sendText(driver,Email,email);
        return this;
    }
    public ContactUsPage enterContactSubject(String subject){
        ElementHelper.sendText(driver,Subject,subject);
        return this;
    }
    public ContactUsPage enterContactMessage(String message){
        ElementHelper.sendText(driver,Message,message);
        return this;
    }
    public ContactUsPage uploadFile(String filePath){
       // ElementHelper.click(driver,UploadFile);
        ElementHelper.sendText(driver,UploadFile,filePath);
        return this;
    }
    public ContactUsPage clickOnSubmitButton() {
        ElementHelper.click(driver, SubmitButton);
        return this;
    }
    public ContactUsPage acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }
    public ContactUsPage assertContactSuccessMessage(String expectedMessage){
        ElementHelper.scrollToElement(driver,SuccessMessage);
        AssertionHelper.assertElementText(driver,SuccessMessage,expectedMessage);
        return this;
    }
    public ContactUsPage clickOnHomeButton() {
        ElementHelper.click(driver, HomeButton);
        return this;
    }

}
