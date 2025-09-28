import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import utiles.datareaders.DataProviderUtils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ContactUsTest {
    HomePage Home;
    ContactUsPage contact;
    File uplodeFile;
    @BeforeTest
    public void setup() {
        Home = new HomePage();
        contact = new ContactUsPage();
        uplodeFile = new File("src/test/resources/ContactUsMessage.txt");

    }

    @DataProvider
    public Iterator<Object[]> getData() throws IOException {
        return DataProviderUtils.getData("src/test/resources/ContactUsData.json");
    }
    @Test(testName = "ContactUs", groups = "regression",dataProvider = "getData")
    public void ContactUs(String name, String email, String subject, String message){
        String filePath = uplodeFile.getAbsolutePath();
       // System.out.println("File path: " + uplodeFile.getAbsolutePath());
        contact.navigateToContactUsPage()
                .enterContactName(name)
                .enterContactEmail(email)
                .enterContactSubject(subject)
                .enterContactMessage(message)
                .uploadFile(filePath)
                .clickOnSubmitButton()
                .acceptAlert()
                .assertContactSuccessMessage("Success! Your details have been submitted successfully.")
                .clickOnHomeButton();

    }

}
