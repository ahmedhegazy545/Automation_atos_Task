import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;
import utiles.DriverMange.DriverManager;

public class SignInTest  extends  BaseTest{
    HomePage Home;
    SigninPage SigninPage;

    @BeforeTest
    public  void setUp(){
        Home =new HomePage();
        SigninPage=new SigninPage();
    }
    @Test
    public  void SignIn(){
        Home.clickOnSignInUpLink();
        SigninPage.EnterLoginEmail().enterLoginPassword().clickOnLoginBtn();
    }
}
