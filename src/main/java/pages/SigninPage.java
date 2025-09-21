package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// WE use fluent pattern (Method chainning )
public class SigninPage {
    WebDriver driver;
    By LoginEmail =By.xpath("//input[@data-qa='login-email']");
    By  LoginPassword=By.xpath("//input[@data-qa='login-password']");
    By LoginButton =By.xpath("//button[@data-qa='login-button']");
    public  SigninPage( WebDriver driver){
        this.driver=driver;
    }
    public  SigninPage EnterLoginEmail(String Email){
        driver.findElement(LoginEmail).sendKeys(Email);
        return this ;
    }
    public SigninPage enterLoginPassword(String pass){
        driver.findElement(LoginPassword).sendKeys(pass);
        return this ;
    }
    public SigninPage  clickOnLoginBtn() {
        driver.findElement(LoginButton).click();
        return this ;
    }
}
