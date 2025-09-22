package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.commonHelper.ElementHelper;

public class HomePage {
    WebDriver driver;
    By SignInUp = By.linkText("Signup / Login");

public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignInUpLink() {
        ElementHelper.click(driver,SignInUp);
    }
}
