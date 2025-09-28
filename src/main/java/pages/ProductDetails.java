package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;
import utiles.DriverMange.DriverManager;

public class ProductDetails {
    WebDriver driver;
    By addToCartButton = By.xpath("//button[@type='button']");
    By quantity = By.id("quantity");
    By Added_Message = By.xpath("//*[text()='Your product has been added to cart.']");
    By continueShopping_btn = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    By ProductName = By.xpath("//div[@class='product-information']//h2");
    By Category = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]/a/span");
    By Price = By.cssSelector("div[class='product-information'] span span");
    By Availability = By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[2]");
    By Condition = By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[3]");
    By Brand = By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[4]");
    public ProductDetails() {
        this.driver = DriverManager.getDriver();
    }

    public ProductDetails assertProductName(String productName) {

        ElementHelper.scrollToElement(driver, ProductName);
        String ActualName = ElementHelper.getText(driver, ProductName).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualName, productName);
        return this;
    }

    public ProductDetails enterQuantity(String productQuantity) {
        ElementHelper.sendText(driver, quantity, productQuantity);
        return this;
    }

    public ProductDetails verifySearchCategory(String keyword) {
        boolean allMatch = ElementHelper.verifyElementsContainNormalizedText(driver, Category, keyword);
        assert allMatch : "One or more search results do not match: " + keyword;
        return this;
    }



    public ProductDetails assertAddedMessage() {
        String Actual = ElementHelper.getText(driver, Added_Message);
        AssertionHelper.assertEqual(Actual, "Your product has been added to cart.");
        return this;
    }

    public ProductDetails clickContinueShopping() {
        ElementHelper.click(driver, continueShopping_btn);
        return this;
    }

    public ProductDetails checkPriceInDetailsPage() {
    AssertionHelper.assertElementPresent(driver, Price);
    return this;
    }
    public ProductDetails checkAvailabilityInDetailsPage() {
        AssertionHelper.assertElementPresent(driver, Availability);
        return this;
    }
    public ProductDetails checkConditionInDetailsPage() {
        AssertionHelper.assertElementPresent(driver, Condition);
        return this;
    }
    public ProductDetails checkBrandInDetailsPage() {
        AssertionHelper.assertElementPresent(driver, Brand);
        return this;
    }
    public ProductDetails clickOnAddToCart() {
        ElementHelper.click(driver, addToCartButton);
        return this;
    }



}
