import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;
import utiles.DriverMange.DriverManager;

public class SignUpTest extends  BaseTest {
    HomePage Home ;
    SignupPage signupPage ;

    @BeforeTest
    public void setup(){
        Home= new HomePage();
        signupPage=new SignupPage();
    }
    @Test(testName = "Signup", groups = "regression")
    public  void signupHappyPathFlow (){
        Home.clickOnSignInUpLink();
        signupPage.enterName("Ahmed").EnterEmail().clickOnSignupBtn()
                .chooseGender("Mrs")
                .enterPassword()
                .chooseDay("6").chooseMonth("March").chooseYear("2003")
                .checkOnNewsletter()
                .enterFirstName("Mo").enterLastName("Mo")
                .enterAddress("Address").chooseCountry("India").enterState("state").enterCity("city")
                .enterZipCode("+20").enterMobileNumber("0100")
                .clickOnCreateAccountBtn();
        Home.clickOnSignInUpLink();
        signupPage.clickOnLogOnBtn();
    }

}
