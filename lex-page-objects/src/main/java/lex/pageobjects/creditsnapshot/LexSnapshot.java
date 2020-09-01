package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LexSnapshot extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com/l/credit-snapshot";

    /* Locators */
    @FindBy(how= How.CSS, using = "button.close")
    private WebElement modalCloseButton;

    @FindBy(how= How.CSS, using = "div.modal-content a.call-now-cta")
    private WebElement checkYourCreditNowModalButton;

    @FindBy(how= How.CSS, using = "div.modal-content a.lex-online-signup")
    private WebElement signupModalLink;

    @FindBy(how= How.XPATH, using = "//span[text() = 'Login']")
    private WebElement loginButton;

    @FindBy(how= How.CSS, using = "div.header-cta a.button")
    private WebElement startNowHeaderButton;

    @FindBy(how= How.CSS, using = "div.hero-wrapper a.call-now-cta")
    private WebElement startNowHeroButton;

    @FindBy(how= How.CSS, using = "div.hero-wrapper a.lex-online-signup")
    private WebElement signupHeroLink;

    @FindBy(how= How.ID, using = "FirstName")
    private WebElement firstName;

    @FindBy(how= How.ID, using = "LastName")
    private WebElement lastName;

    @FindBy(how= How.ID, using = "Email")
    private WebElement email;

    @FindBy(how= How.ID, using = "Phone")
    private WebElement phone;

    @FindBy(how= How.ID, using = "Address")
    private WebElement streetAddress;

    @FindBy(how= How.ID, using = "Zip")
    private WebElement zipCode;

    @FindBy(how= How.CSS, using = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(how= How.CSS, using = ".how-credit-repair-works a.call-now-cta")
    private WebElement startNowHowCreditRepairWorksButton;

    @FindBy(how= How.CSS, using = ".how-credit-repair-works a.lex-online-signup")
    private WebElement signupHowCreditRepairWorksLink;

    @FindBy(how= How.CSS, using = "#faqs a.call-now-cta")
    private WebElement seeYourCreditNowFaqButton;

    @FindBy(how= How.CSS, using = "#faqs a.lex-online-signup")
    private WebElement signupFaqLink;

    @FindBy(how= How.CSS, using = "#know-score a.call-now-cta")
    private WebElement checkCreditNowKnowScoreButton;

    @FindBy(how= How.CSS, using = "#know-score a.lex-online-signup")
    private WebElement signupKnowScoreLink;

    @FindBy(how= How.CSS, using = ".lex-cta-box a.call-now-cta")
    private WebElement checkCreditNowLexCtaButton;

    @FindBy(how= How.CSS, using = ".lex-cta-box a.lex-online-signup")
    private WebElement signupLexCtaLink;

    public LexSnapshot(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        Thread.sleep(3000);
    }

    public void clickModalCloseButton() {
        modalCloseButton.click();
    }

    public void clickCheckYourCreditNowModalButton() {
        checkYourCreditNowModalButton.click();
    }

    public void clickSignupModalLink() {
        signupModalLink.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickStartNowHeaderButton() {
        startNowHeaderButton.click();
    }

    public void clickStartNowHeroButton() {
        startNowHeroButton.click();
    }

    public void clickSignupHeroLink() {
        signupHeroLink.click();
    }

    public void sendFirstName(String input) {
        firstName.clear();
        firstName.sendKeys(input);
    }

    public void sendLastName(String input) {
        lastName.clear();
        lastName.sendKeys(input);
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

    public void clickStartNowHowCreditRepairWorksButton() {
        startNowHowCreditRepairWorksButton.click();
    }

    public void clickSignupHowCreditRepairWorksLink() {
        signupHowCreditRepairWorksLink.click();
    }

    public void clickSeeYourCreditNowFaqButton() {
        seeYourCreditNowFaqButton.click();
    }

    public void clickSignupFaqLink() {
        signupFaqLink.click();
    }

    public void clickCheckCreditNowKnowScoreButton() {
        checkCreditNowKnowScoreButton.click();
    }

    public void clickSignupKnowScoreLink() {
        signupKnowScoreLink.click();
    }

    public void clickCheckCreditNowLexCtaButton() {
        checkCreditNowLexCtaButton.click();
    }

    public void clickSignupLexCtaLink() {
        signupLexCtaLink.click();
    }

    public boolean isAtSnapshot() {
        return driver.getCurrentUrl().startsWith("https://www.lexingtonlaw.com/credit-snapshot/pi");
    }

    public boolean isAtSignup() {
        return driver.getCurrentUrl().startsWith("https://www.lexingtonlaw.com/signup");
    }

    public boolean isAtLogin() {
        return driver.getCurrentUrl().startsWith("https://clients.lexingtonlaw.com/login");
    }

    public boolean isAtReportPull() {
        return driver.getCurrentUrl().startsWith("https://www.lexingtonlaw.com/credit-snapshot/rp");
    }

    public void goHome() {
        driver.get(URL);
    }
}
