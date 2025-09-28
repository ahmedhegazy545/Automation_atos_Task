import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CheckOutPage;

public class CheckOutTest {

    CheckOutPage check;

    @BeforeTest
    public void setup() {
        check = new CheckOutPage();
    }
    @Test
    public void CheckAddress() {
        check.navigateToCheckOut();
        check.assertName()
                .assertAddress()
                .assertCity()
                .assertCountry()
                .assertMobile()
                .AddComment("This is my first order")
                .clickPlaceOrder();
    }

}
