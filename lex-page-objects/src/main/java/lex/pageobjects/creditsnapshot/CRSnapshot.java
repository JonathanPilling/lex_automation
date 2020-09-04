package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRSnapshot extends BasePage {

    private static String URL = "https://www.creditrepair.com/b/credit-snapshot";
    private String snapshotURL = "https://www.creditrepair.com/credit-snapshot/pi";
    private String signupURL = "https://www.creditrepair.com/signup";
    private String loginURL = "https://members.creditrepair.com/login";
    private String reportPullURL = "https://www.creditrepair.com/credit-snapshot/rp";

    /* locators */
    @FindBy(css = "button.close")
    private WebElement closeModalButton;

    @FindBy(css = "div.modal-cta a.btn-new")
    private WebElement getStartedModalButton;

    @FindBy(css = "div.modal-cta a.text-link")
    private WebElement signupModalLink;

    @FindBy(css = "a.login")
    private WebElement loginButton;

    @FindBy(css = "div.header-cta a.call_btn")
    private WebElement startNowHeaderButton;

    @FindBy(css = "div.hero-wrapper a.btn-new")
    private WebElement checkYourCreditNowHeroButton;

    @FindBy(css = "div.hero-wrapper a.text-link")
    private WebElement signupHeroLink;

    @FindBy(css = "button.submit-info")
    private WebElement submitButton;

    @FindBy(css = ".client-reviews a.btn-new")
    private WebElement getStartedClientReviewsButton;

    @FindBy(css = ".client-reviews a.text-link")
    private WebElement signupClientReviewsLink;

    @FindBy(css = "#know-score a.btn-new")
    private WebElement getStartedKnowScoreButton;

    @FindBy(css = "#know-score a.text-link")
    private WebElement signupKnowScoreLink;

    @FindBy(css = ".cta-section a.btn-new")
    private WebElement getStartedCtaButton;

    @FindBy(css = ".cta-section a.text-link")
    private WebElement signupCtaLink;

    public CRSnapshot(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        waitForElementToBeClickable(closeModalButton);
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
