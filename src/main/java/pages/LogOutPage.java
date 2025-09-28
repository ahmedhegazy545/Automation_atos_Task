package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.DriverMange.DriverManager;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;

public class LogOutPage {
    WebDriver driver;
    By LogOutButton = By.xpath("//a[normalize-space()='Logout']");
    public LogOutPage(){
        this.driver = DriverManager.getDriver();
    }
    public LogOutPage clickOnLogOutButton(){
        ElementHelper.click(driver,LogOutButton);
        return this;
    }
    public LogOutPage AssertRedirectionToLoginPage(){
        AssertionHelper.assertUrl(driver, "https://www.automationexercise.com/login");
        return this;
    }
}
