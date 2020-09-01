package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRSnapshot extends BasePage {

    private static String URL = "https://www.creditrepair.com/b/credit-snapshot";

    /* locators */
    @FindBy(how= How.CSS, using="button.close")
    private WebElement closeModalButton;

    @FindBy(how= How.CSS, using="div.modal-cta a.btn-new")
    private WebElement getStartedModalButton;

    @FindBy(how= How.CSS, using="div.modal-cta a.text-link")
    private WebElement signupModalLink;

    @FindBy(how= How.CSS, using="a.login")
    private WebElement loginButton;

    @FindBy(how= How.CSS, using="div.header-cta a.call_btn")
    private WebElement startNowHeaderButton;

    @FindBy(how= How.CSS, using="div.hero-wrapper a.btn-new")
    private WebElement checkYourCreditNowHeroButton;

    @FindBy(how= How.CSS, using="div.hero-wrapper a.text-link")
    private WebElement signupHeroLink;

    @FindBy(how= How.ID, using="FirstName")
    private WebElement firstName;

    @FindBy(how= How.ID, using="LastName")
    private WebElement lastName;

    @FindBy(how= How.ID, using="Email")
    private WebElement email;

    @FindBy(how= How.ID, using="Phone")
    private WebElement phone;

    @FindBy(how= How.ID, using="Address")
    private WebElement streetAddress;

    @FindBy(how= How.ID, using="Zip")
    private WebElement zipCode;

    @FindBy(how= How.CSS, using="button.submit-info")
    private WebElement submitButton;

    @FindBy(how= How.CSS, using=".client-reviews a.btn-new")
    private WebElement getStartedClientReviewsButton;

    @FindBy(how= How.CSS, using=".client-reviews a.text-link")
    private WebElement signupClientReviewsLink;

    @FindBy(how= How.CSS, using="#know-score a.btn-new")
    private WebElement getStartedKnowScoreButton;

    @FindBy(how= How.CSS, using="#know-score a.text-link")
    private WebElement signupKnowScoreLink;

    @FindBy(how= How.CSS, using=".cta-section a.btn-new")
    private WebElement getStartedCtaButton;

    @FindBy(how= How.CSS, using=".cta-section a.text-link")
    private WebElement signupCtaLink;

    public CRSnapshot(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        Thread.sleep(3000);
    }

    public void clickCloseModalButton() {
        closeModalButton.click();
    }

    public void clickGetStartedModalButton() {
        getStartedModalButton.click();
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

    public void clickCheckYourCreditNowHeroButton() {
        checkYourCreditNowHeroButton.click();
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

    public void clickGetStartedClientReviewsButton() {
        getStartedClientReviewsButton.click();
    }

    public void clickSignupClientReviewsLink() {
        signupClientReviewsLink.click();
    }

    public void clickGetStartedKnowScoreButton() {
        getStartedKnowScoreButton.click();
    }

    public void clickSignupKnowScoreLink() {
        signupKnowScoreLink.click();
    }

    public void clickGetStartedCtaButton() {
        getStartedCtaButton.click();
    }

    public void clickSignupCtaLink() {
        signupCtaLink.click();
    }

    public boolean isAtSnapshot() {
        return driver.getCurrentUrl().startsWith("https://www.creditrepair.com/credit-snapshots/pi");
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

    public void goHome() {
        driver.get(URL);
    }

}
