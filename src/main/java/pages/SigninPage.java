package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.commonHelper.ElementHelper;

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
        ElementHelper.sendText(driver,LoginEmail,Email);
        return this ;
    }
    public SigninPage enterLoginPassword(String pass){
        ElementHelper.sendText(driver,LoginPassword,pass);
        return this ;
    }
    public SigninPage  clickOnLoginBtn() {
        ElementHelper.click(driver,LoginButton);
        return this ;
    }
}
