import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;

public class SignInTest  extends  BaseTest{
    HomePage Home;
    SigninPage SigninPage;

    @BeforeTest
    public  void setUp(){
        Home =new HomePage(DriverManager.getDriver());
        SigninPage=new SigninPage(DriverManager.getDriver());
    }
    @Test
    public  void SignIn(){
        Home.clickOnSignInUpLink();
        SigninPage.EnterLoginEmail("rofida").enterLoginPassword("rofida@gmail.com").clickOnLoginBtn();
    }
}
