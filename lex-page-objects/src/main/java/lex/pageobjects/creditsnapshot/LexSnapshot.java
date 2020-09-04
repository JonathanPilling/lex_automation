package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LexSnapshot extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com/l/credit-snapshot";
    private String snapshotURL = "https://www.lexingtonlaw.com/credit-snapshot/pi";
    private String signupURL = "https://www.lexingtonlaw.com/signup";
    private String loginURL = "https://clients.lexingtonlaw.com/login";
    private String reportPullURL = "https://www.lexingtonlaw.com/credit-snapshot/rp";

    /* Locators */
    @FindBy(css = "button.close")
    private WebElement modalCloseButton;

    @FindBy(css = "div.modal-content a.call-now-cta")
    private WebElement checkYourCreditNowModalButton;

    @FindBy(css = "div.modal-content a.lex-online-signup")
    private WebElement signupModalLink;

    @FindBy(xpath = "//span[text() = 'Login']")
    private WebElement loginButton;

    @FindBy(css = "div.header-cta a.button")
    private WebElement startNowHeaderButton;

    @FindBy(css = "div.hero-wrapper a.call-now-cta")
    private WebElement startNowHeroButton;

    @FindBy(css = "div.hero-wrapper a.lex-online-signup")
    private WebElement signupHeroLink;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(css = ".how-credit-repair-works a.call-now-cta")
    private WebElement startNowHowCreditRepairWorksButton;

    @FindBy(css = ".how-credit-repair-works a.lex-online-signup")
    private WebElement signupHowCreditRepairWorksLink;

    @FindBy(css = "#faqs a.call-now-cta")
    private WebElement seeYourCreditNowFaqButton;

    @FindBy(css = "#faqs a.lex-online-signup")
    private WebElement signupFaqLink;

    @FindBy(css = "#know-score a.call-now-cta")
    private WebElement checkCreditNowKnowScoreButton;

    @FindBy(css = "#know-score a.lex-online-signup")
    private WebElement signupKnowScoreLink;

    @FindBy(css = ".lex-cta-box a.call-now-cta")
    private WebElement checkCreditNowLexCtaButton;

    @FindBy(css = ".lex-cta-box a.lex-online-signup")
    private WebElement signupLexCtaLink;

    public LexSnapshot(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        waitForElementToBeClickable(modalCloseButton);
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
        return driver.getCurrentUrl().startsWith(snapshotURL);
    }

    public boolean isAtSignup() {
        return driver.getCurrentUrl().startsWith(signupURL);
    }

    public boolean isAtLogin() {
        return driver.getCurrentUrl().startsWith(loginURL);
    }

    public boolean isAtReportPull() {
        return driver.getCurrentUrl().startsWith(reportPullURL);
    }

    public void goHome() {
        driver.get(URL);
    }

    public String getReportPullURL() {
        return reportPullURL;
    }
}
