package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
    WebDriver driver;
    By Name = By.name("name");
    By Email = By.xpath("//input[@data-qa='signup-email']");
    By SignupBtn = By.xpath("//button[text()='Signup']");
     By MrsGender= By.id("uniform-id_gender2");
    By Password = By.id("password");
    By DaysDropdown = By.id("days");
    By MonthDropdown = By.id("months");
    By YearsDropdown = By.id("years");
    By Newsletter = By.xpath("//label[text()='Sign up for our newsletter!']");
    By SpecialOffer = By.xpath("//label[text()='Receive special offers from our partners!']");
    By First_name = By.id("first_name");
    By Last_name = By.id("last_name");
    By Address = By.id("address1");
    By CountryDropdown = By.id("country");
    By State = By.id("state");
    By City = By.id("city");
    By Zipcode = By.id("zipcode");
    By Mobile_number = By.id("mobile_number");
    By Create_Account = By.xpath("//button[text()='Create Account']");
    By AccountCreatedMessage = By.xpath("//h2[@data-qa='account-created']");
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    public SignupPage enterName(String name){
        driver.findElement(Name).sendKeys(name);
        return  this;
    }
    public  SignupPage EnterEmail(String email){
        driver.findElement(Email).sendKeys( email);
        return  this;
    }
    public  SignupPage  clickOnSignupBtn (){
        driver.findElement(SignupBtn).click();
        return this;
    }
    public  SignupPage  chooseGender(){
        driver.findElement(MrsGender).click();
        return this;
    }
    public  SignupPage enterPassword(String pass){
        driver.findElement(Password).sendKeys(pass);
        return this;
    }
    public  SignupPage chooseDay(String day){
        WebElement days = driver.findElement(DaysDropdown);
        Select Days = new Select(days);
        Days.selectByVisibleText(day);
        return this;
    }
    public  SignupPage chooseMonth(String month){
        WebElement Month = driver.findElement(MonthDropdown);
        Select Months = new Select(Month);
        Months.selectByVisibleText(month);
        return this;
    }
    public  SignupPage chooseYear (String year){
        WebElement Year = driver.findElement(YearsDropdown);
        Select Years = new Select(Year);
        Years.selectByValue(year);
        return this;
    }
    public  SignupPage checkOnNewsletter (){
        driver.findElement(Newsletter).click();
        return this;
    }
    public  SignupPage enterFirstName  (String name){
        driver.findElement(First_name).sendKeys(name);
        return this;
    }
    public  SignupPage enterLastName  (String name){
        driver.findElement(Last_name).sendKeys(name);
        return this;
    }
    public  SignupPage  enterAddress (String address){
        driver.findElement(Address).sendKeys(address);
        return this;
    }
    public  SignupPage  chooseCountry ( String country){
        WebElement Country = driver.findElement(CountryDropdown);
        Select Countries = new Select(Country);
        Countries.selectByVisibleText(country);
        return this;
    }
    public  SignupPage enterCity  ( String city){
        driver.findElement(City).sendKeys(city);
        return this;
    }
    public  SignupPage enterState  (String state){
        driver.findElement(State).sendKeys(state);
        return this;
    }
    public  SignupPage enterZipCode (String code){
        driver.findElement(Zipcode).sendKeys(code);
        return this;
    }
    public  SignupPage  enterMobileNumber( String number){
        driver.findElement(Mobile_number).sendKeys(number);
        return this;
    }
    public  SignupPage   clickOnCreateAccountBtn(){
        driver.findElement(Create_Account).click();
        return this;
    }

}
