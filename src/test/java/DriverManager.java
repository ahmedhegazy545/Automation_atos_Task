import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    static  WebDriver driver;
    // Get Browser url and name fom Load properties file
    static String BrowserName = "chrome";
    static String URLEnvironment = "https://www.automationexercise.com/";

     static public void driverSetup() {
         if (driver==null) {
        switch (BrowserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        //implicitWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URLEnvironment);
    }}
     static public WebDriver getDriver() {
        if (driver == null) {
            driverSetup();
        }
        return driver;
    }
     static public void closeDriver() {
        driver.quit();
    }
}
