package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;
import utiles.DriverMange.DriverManager;

public class ProductsPage {
    WebDriver driver ;

    By Search_textBox = By.xpath("//input[@id='search_product']");
    By Search_icon = By.xpath("//button[@id='submit_search']");
    By productTitles = By.cssSelector(".product-overlay .overlay-content p");
    By productCards = By.cssSelector(".product-image-wrapper");
    By titleTextCenter = By.cssSelector(".title.text-center");
    By viewProductOfFirstProductButton = By.cssSelector("a[href='/product_details/1']");
    public ProductsPage(){
        this.driver= DriverManager.getDriver();

    }

    public ProductsPage enterSearchKeyword(String keyword){
        ElementHelper.sendText(driver,Search_textBox,keyword);
        return this;
    }

    public ProductsPage clickOnSubmitSearch(){
        ElementHelper.click(driver,Search_icon);
        return this;
    }

    public ProductsPage viewSpecificProductDetails(String productName){
        By viewProductDetails = RelativeLocator.with(By.linkText("View Product")).below(By.xpath("//*[text()='"+ productName + "']"));
        ElementHelper.scrollToElement(driver,viewProductDetails);
        ElementHelper.click(driver,viewProductDetails);
        return this;
    }
    public ProductsPage assertSearchResultsContain(String keyword) {
        AssertionHelper.assertAllElementsContainKeyword(driver,productCards, productTitles, keyword);
        return this;
    }
    public ProductsPage assertPageTitle(){
        AssertionHelper.assertElementPresent(driver,titleTextCenter);
        return this;
    }
    public ProductsPage assertProductsIsVisible(){
        AssertionHelper.assertElementPresent(driver,viewProductOfFirstProductButton);
        return this;
    }


}
