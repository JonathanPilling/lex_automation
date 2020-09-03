package lex.pageobjects.homepage;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRHomepage extends BasePage {

    private static String URL = "https://www.creditrepair.com";

    /* locators */
    @FindBy(how=How.CLASS_NAME, using="closeBtn")
    private WebElement modalCloseButton;

    @FindBy(how=How.CSS, using="a.call-now-btn")
    private WebElement modalGetStartedButton;

    @FindBy(how=How.CSS, using="a.sign-up")
    private WebElement modalSignupButton;

    @FindBy(how=How.CSS, using="a.top_nav_member_login")
    private WebElement loginButton;

    @FindBy(how=How.CSS, using="a.top_nav_sign_up")
    private WebElement topNavSignupButton;

    @FindBy(how=How.CSS, using="a.stimulus-cta-button")
    private WebElement stimulusSignupButton;

    @FindBy(how=How.CSS, using="div.hero-container a.call_btn")
    private WebElement heroGetStartedButton;

    @FindBy(how=How.CSS, using="div.hero-container a.signup-online")
    private WebElement heroSignupLink;

    @FindBy(how=How.ID, using="FirstName")
    private WebElement firstName;

    @FindBy(how=How.ID, using="LastName")
    private WebElement lastName;

    @FindBy(how=How.ID, using="Email")
    private WebElement email;

    @FindBy(how=How.ID, using="Phone")
    private WebElement phone;

    @FindBy(how=How.ID, using="Address")
    private WebElement streetAddress;

    @FindBy(how=How.ID, using="Zip")
    private WebElement zipCode;

    @FindBy(how=How.CSS, using="button[type='submit']")
    private WebElement submitButton;

    @FindBy(how=How.CSS, using="div.hard-work a.btn-new")
    private WebElement hardWorkGetStartedButton;

    @FindBy(how=How.CSS, using="div.hard-work a.text-link")
    private WebElement hardWorkSignupLink;

    @FindBy(how=How.CSS, using="div.how-works-new-container a.btn-new")
    private WebElement howWorksGetStartedButton;

    @FindBy(how=How.CSS, using="div.how-works-new-container a.text-link")
    private WebElement howWorksSignupText;

    @FindBy(how=How.CSS, using="div.cost-new-container a.btn-new")
    private WebElement costGetStartedButton;

    @FindBy(how=How.CSS, using="div.cost-new-container a.text-link")
    private WebElement costSignupText;

    @FindBy(how=How.CSS, using="div.slider-app-wrapper")
    private WebElement sliderApp;

    public CRHomepage(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        Thread.sleep(3000);
    }

    public void clickModalCloseButton() {
        modalCloseButton.click();
    }

    public void clickModalGetStartedButton() {
        modalGetStartedButton.click();
    }

    public void clickModalSignupButton() {
        modalSignupButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickTopNavSignupButton() {
        topNavSignupButton.click();
    }

    public void clickStimulusSignupButton() {
        stimulusSignupButton.click();
    }

    public void clickHeroGetStartedButton() {
        heroGetStartedButton.click();
    }

    public void clickHeroSignupLink() {
        heroSignupLink.click();
    }

    public void sendFirstName(String fname) {
        firstName.clear();
        firstName.sendKeys(fname);
    }

    public void sendLastName(String lname) {
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void sendEmail(String input) {
        email.clear();
        email.sendKeys(input);
    }

    public void sendPhone(String input) {
        phone.clear();
        phone.sendKeys(input);
    }

    public void sendStreetAddress(String input) {
        streetAddress.clear();
        streetAddress.sendKeys(input);
    }

    public void sendZipCode(String input) {
        zipCode.clear();
        zipCode.sendKeys(input);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickHardWorkGetStartedButton() {
        hardWorkGetStartedButton.click();
    }

    public void clickHardWorkSignupLink() {
        hardWorkSignupLink.click();
    }

    public void clickHowWorksGetStartedButton() {
        howWorksGetStartedButton.click();
    }

    public void clickHowWorksSignupText() {
        howWorksSignupText.click();
    }

    public void clickCostGetStartedButton() {
        costGetStartedButton.click();
    }

    public void clickCostSignupText() {
        costSignupText.click();
    }

    public boolean isAtCreditSnapshot() {
        return driver.getCurrentUrl().startsWith("https://www.creditrepair.com/credit-snapshot/pi");
    }

    public boolean isAtSignup() {
        return driver.getCurrentUrl().startsWith("https://www.creditrepair.com/signup");
    }

    public boolean isAtLogin() {
        return driver.getCurrentUrl().startsWith("https://members.creditrepair.com/login");
    }

    public boolean isAtReportPull() {
        return driver.getCurrentUrl().startsWith("https://www.creditrepair.com/credit-snapshot/rp");
    }

    public boolean sliderAppOpened() {
        return sliderApp.getAttribute("style") == "display: block;";
    }


    public void goHome() {
        driver.get(URL);
    }

}
