import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LogOutPage;

public class LogOutTest {
    LogOutPage logout;

    @BeforeTest
    public void setup() {
        logout = new LogOutPage();
    }
@Test
    public void logout() {
        logout.clickOnLogOutButton()
                .AssertRedirectionToLoginPage();

    }
}
