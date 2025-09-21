package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    WebDriver driver;
    By SignInUp = By.linkText("Signup / Login");

public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignInUpLink() {
        driver.findElement(SignInUp).click();
    }
}
