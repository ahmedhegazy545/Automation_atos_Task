package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utiles.commonHelper.AssertionHelper;
import utiles.commonHelper.ElementHelper;
import utiles.DriverMange.DriverManager;

public class CartPage {

    WebDriver driver;
    By cart_page = By.xpath("//a[normalize-space()='Cart']");
    By FirstProduct_Name =   By.xpath("//table[@id='cart_info_table']//tr[1]//td[@class='cart_description']/h4/a");
    By SecondProduct_Name =   By.xpath("//table[@id='cart_info_table']//tr[2]//td[@class='cart_description']/h4/a");
    By ProductQuantity1 = By.xpath("//button[normalize-space()='2']");
    By ProductQuantity2 = By.xpath("//button[normalize-space()='1']");
    By FirstProductPrice = By.xpath("//table[@id='cart_info_table']//tr[1]//td[@class='cart_price']/p");
    By SecondProductPrice = By.xpath("//table[@id='cart_info_table']//tr[2]//td[@class='cart_price']/p");
    By productTotalPrice = By.xpath("//table[@id='cart_info_table']//tr[1]//td[@class='cart_total']/p");
    By productTotalPrice2 = By.xpath("//table[@id='cart_info_table']//tr[2]//td[@class='cart_total']/p");


    public CartPage(){
        this.driver= DriverManager.getDriver();
    }

    public CartPage navigateToCartPage(){
        ElementHelper.click(driver,cart_page);
        return this;
    }

    public CartPage AssertFirstProductNameAdded(String FirstProductName){
        ElementHelper.scrollToElement(driver,FirstProduct_Name);
        String ActualName = ElementHelper.getText(driver,FirstProduct_Name).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualName,FirstProductName);
        return this;
    }
    public CartPage AssertSecondProductNameAdded(String SecondProductName){
        ElementHelper.scrollToElement(driver,SecondProduct_Name);
        String ActualName = ElementHelper.getText(driver,SecondProduct_Name).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualName,SecondProductName);
        return this;
    }
    public CartPage AssertProductQuantityFirstProduct(String quantity){
        ElementHelper.scrollToElement(driver, ProductQuantity1);
        String ActualQuantity = ElementHelper.getText(driver, ProductQuantity1).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualQuantity,quantity);
        return this;
    }

    public CartPage AssertProductQuantitySecondProduct(String quantity){
        ElementHelper.scrollToElement(driver, ProductQuantity2);
        String ActualQuantity = ElementHelper.getText(driver, ProductQuantity2).replaceAll("\\s+", " ").trim();
        AssertionHelper.assertEqual(ActualQuantity,quantity);
        return this;
    }
    public CartPage AssertProductTotalPrice1(String quantity) {
        ElementHelper.scrollToElement(driver, FirstProductPrice);
        String prodPrice = ElementHelper.getText(driver, FirstProductPrice).replaceAll("[^0-9]", "");
        int expected = Integer.parseInt(prodPrice) * Integer.parseInt(quantity);
        String actual = ElementHelper.getText(driver, productTotalPrice).replaceAll("[^0-9]", "");
        AssertionHelper.assertEqual(Integer.parseInt(actual), expected);
        return this;
    }

    public CartPage AssertProductTotalPrice2(String quantity) {
        ElementHelper.scrollToElement(driver, SecondProductPrice);
        String prodPrice = ElementHelper.getText(driver, SecondProductPrice).replaceAll("[^0-9]", "");
        int expected = Integer.parseInt(prodPrice) * Integer.parseInt(quantity);
        String actual = ElementHelper.getText(driver, productTotalPrice2).replaceAll("[^0-9]", "");
        AssertionHelper.assertEqual(Integer.parseInt(actual), expected);
        return this;
    }




}
