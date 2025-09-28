import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ProductsPage;
import pages.SigninPage;

public class ProductsTest {
    SigninPage signinPage;
    ProductsPage productsPage;

    @BeforeTest
    public void setUp() {
        signinPage = new SigninPage();
        productsPage = new ProductsPage();
    }

    @Test
    public void Products() {
        signinPage.clickOnProductsLink();
        productsPage
                .assertProductsIsVisible()
                .assertPageTitle();
    }
}
