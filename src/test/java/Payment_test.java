import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PaymentPage;

public class Payment_test {
    PaymentPage pay;
    @BeforeTest
    public void setup() {
        pay = new PaymentPage();
    }

    @Test
    private void Payment() {
        pay.enterNameOnCard("Ahmed Hegazy")
           .enterCardNumber("4111111111111111")
           .enterCVC("123")
           .enterExpirationMonth("12")
           .enterExpirationYear("2026")
           .clickOnPayAndConfirmOrderButton()
           .AssertPaymentMessage()
           .ClickOnContinueButton();

    }
}
