package lex.pageobjects.signup;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LexSignup extends BasePage {

    private final String url = "https://www.lexingtonlaw.com/signup";

    /* Locators */
    @FindBy(how = How.CSS, using = "title")
    private WebElement pageTitle;

    @FindBy(how = How.ID, using = "FirstName")
    private WebElement firstName;

    @FindBy(how = How.ID, using = "LastName")
    private WebElement lastName;

    @FindBy(how = How.ID, using = "Email")
    private WebElement email;

    @FindBy(how = How.ID, using = "Phone")
    private WebElement phone;

    @FindBy(how = How.ID, using = "Address")
    private WebElement address;

    @FindBy(how = How.ID, using = "Zip")
    private WebElement zip;

    @FindBy(how = How.ID, using = "yes-ffd")
    private WebElement familyCheckbox;

    @FindBy(how = How.ID, using = "FirstName-ffhd")
    private WebElement familyMemberFirstName;

    @FindBy(how = How.ID, using = "LastName-ffhd")
    private WebElement familyMemberLastName;

    @FindBy(how = How.ID, using = "Email-ffhd")
    private WebElement familyMemberEmail;

    @FindBy(how = How.ID, using = "Phone-ffhd")
    private WebElement familyMemberPhone;

    @FindBy(how = How.ID, using = "Address-ffhd")
    private WebElement familyMemberAddress;

    @FindBy(how = How.ID, using = "Zip-ffhd")
    private WebElement familyMemberZip;

    @FindBy(how = How.CSS, using = "#signup-v2 > div.submit_button_wrap > button")
    private WebElement submit;

    @FindBy(how = How.CSS, using = "div.step1.active")
    private List<WebElement> stepOne;

    @FindBy(how = How.CSS, using = "div.step2.active")
    private List<WebElement> stepTwo;

    @FindBy(how = How.CSS, using = "div.step3.active")
    private List<WebElement> stepThree;

    public LexSignup(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    //Constructor for checking if links navigate to /signup, doesn't load url
    public LexSignup(WebDriver driver, Boolean x) {
        super(driver);
    }

    /* Methods */
    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void setFirstName(String fname) {
        firstName.clear();
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void setEmail(String emale) {
        email.clear();
        email.sendKeys(emale);
    }

    public void setPhone(String ph) {
        phone.clear();
        phone.sendKeys(ph);
    }

    public void setAddress(String addr) {
        address.clear();
        address.sendKeys(addr);
    }

    public void setZip(String zp) {
        zip.clear();
        zip.sendKeys(zp);
    }

    public void submit() {
        submit.click();
    }

    public boolean atStepOne() {
        return stepOne.size() != 0;
    }

    public boolean atStepTwo() {
        return stepTwo.size() != 0;
    }

    public boolean atStepThree() {
        return stepThree.size() != 0;
    }

    public void goHome() {
        driver.get(url);
    }

    public boolean isHome() {
        return getPageTitle().getAttribute("text").contains("Sign Up");
    }

}

