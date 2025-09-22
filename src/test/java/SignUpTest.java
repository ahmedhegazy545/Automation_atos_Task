import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;
import pages.SignupPage;

public class SignUpTest extends  BaseTest {
    HomePage Home ;
    SignupPage signupPage ;

    @BeforeTest
    public void setup(){
        Home= new HomePage(DriverManager.getDriver());
        signupPage=new SignupPage(DriverManager.getDriver());
    }
    @Test(testName = "Signup", groups = "regression",priority =1)
    public  void signupHappyPathFlow (){
        Home.clickOnSignInUpLink();
        signupPage.enterName("Ahmed").EnterEmail("Atos11@gmail").clickOnSignupBtn()
                .chooseGender("Mrs")
                .enterPassword("P@ssw0rd")
                .chooseDay("6").chooseMonth("March").chooseYear("2003")
                .checkOnNewsletter()
                .enterFirstName("Mo").enterLastName("Mo")
                .enterAddress("Address").chooseCountry("India").enterState("state").enterCity("city")
                .enterZipCode("+20").enterMobileNumber("0100")
                .clickOnCreateAccountBtn();
    }

}
