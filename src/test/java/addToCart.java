
import org.testng.annotations.DataProvider;
import pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utiles.datareaders.DataProviderUtils;
import java.io.IOException;
import java.util.Iterator;


public class addToCart extends BaseTest{
    //WebDriver driver;
    HomePage Home;
    ProductDetails productDetails;
    CartPage cartPage;
    ProductsPage productsPage;
    SigninPage SigninPage;


    @BeforeTest
    public void setup(){
        Home = new HomePage();
        productDetails = new ProductDetails();
        cartPage = new CartPage();
        productsPage = new ProductsPage();
        SigninPage = new SigninPage();
    }
    @DataProvider
    public Iterator<Object[]> getData() throws IOException {
        return DataProviderUtils.getData("src/test/resources/Product_Data.json");
    }
    //Search with Keyword and Add two different products to cart
    @Test(testName = "AddToCart", groups = "regression",dataProvider = "getData")
    public void AddToCart(String Keyword,String FirstProductName,String FirstProductQuantity,String SecondProductName,String SecondProductQuantity) {


        //Search and Validate
        SigninPage.clickOnProductsLink();
        productsPage.enterSearchKeyword(Keyword)
        .clickOnSubmitSearch()
        .assertSearchResultsContain(Keyword)
        .viewSpecificProductDetails(FirstProductName);

        // Add Product A
        productDetails.assertProductName(FirstProductName)
        .enterQuantity(FirstProductQuantity)
        .clickOnAddToCart()
        .assertAddedMessage()
        .clickContinueShopping()

                //Assert Name, Category, Price, and Description (Product 1).
                .verifySearchCategory(Keyword)
                .assertProductName(FirstProductName)
                .checkPriceInDetailsPage()
                .checkAvailabilityInDetailsPage()
                .checkConditionInDetailsPage()
                .checkBrandInDetailsPage();
        // Add Product B
        SigninPage.clickOnProductsLink();
        productsPage.viewSpecificProductDetails(SecondProductName);
        productDetails.assertProductName(SecondProductName)
        .clickOnAddToCart()
        .assertAddedMessage()
        .clickContinueShopping()

        //Assert Name, Category, Price, and Description (Product 2).
                .verifySearchCategory(Keyword)
                .assertProductName(SecondProductName)
                .checkPriceInDetailsPage()
                .checkAvailabilityInDetailsPage()
                .checkConditionInDetailsPage()
                .checkBrandInDetailsPage();


        // Navigate to cartPage and verify product names, quantities, prices, and total amount
        cartPage.navigateToCartPage()
                .AssertFirstProductNameAdded(FirstProductName)
                .AssertSecondProductNameAdded(SecondProductName)
                .AssertProductQuantityFirstProduct(FirstProductQuantity)
                .AssertProductQuantitySecondProduct(SecondProductQuantity)
                .AssertProductTotalPrice1("2")
                .AssertProductTotalPrice2("1");
    }


}
