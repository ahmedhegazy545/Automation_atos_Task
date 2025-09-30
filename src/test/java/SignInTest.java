import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;
import utiles.ExtentReports.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class SignInTest  extends  BaseTest{
    HomePage Home;
    SigninPage SigninPage;
    private static final Logger log = LogManager.getLogger(SigninPage.class);
    @BeforeTest
    public  void setUp(){
        Home =new HomePage();
        SigninPage=new SigninPage();
    }
    @Test
    public  void SignIn(){
        log.info("Logs for SignIn");
        Home.clickOnSignInUpLink();
        log.warn("Error for Enter Email");
        SigninPage.EnterLoginEmail();
        log.warn("Error for Enter password");
        SigninPage.enterLoginPassword();
        log.error("Error for SignIn");
        SigninPage.clickOnLoginBtn();

    }
}
