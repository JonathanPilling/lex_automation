package lex.pageobjects.homepage;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRHomepage extends BasePage {

    private static String URL = "https://www.creditrepair.com";
    private String snapshotURL = "https://www.creditrepair.com/credit-snapshot/pi";
    private String signupURL = "https://www.creditrepair.com/signup";
    private String loginURL = "https://members.creditrepair.com/login";
    private String reportPullURL = "https://www.creditrepair.com/credit-snapshot/rp";

    /* locators */
    @FindBy(className = "closeBtn")
    private WebElement modalCloseButton;

    @FindBy(css = "a.call-now-btn")
    private WebElement modalGetStartedButton;

    @FindBy(css = "a.sign-up")
    private WebElement modalSignupButton;

    @FindBy(css = "a.top_nav_member_login")
    private WebElement loginButton;

    @FindBy(css = "a.top_nav_sign_up")
    private WebElement topNavSignupButton;

    @FindBy(css = "a.stimulus-cta-button")
    private WebElement stimulusSignupButton;

    @FindBy(css = "div.hero-container a.call_btn")
    private WebElement heroGetStartedButton;

    @FindBy(css = "div.hero-container a.signup-online")
    private WebElement heroSignupLink;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(css = "div.hard-work a.btn-new")
    private WebElement hardWorkGetStartedButton;

    @FindBy(css = "div.hard-work a.text-link")
    private WebElement hardWorkSignupLink;

    @FindBy(css = "div.how-works-new-container a.btn-new")
    private WebElement howWorksGetStartedButton;

    @FindBy(css = "div.how-works-new-container a.text-link")
    private WebElement howWorksSignupText;

    @FindBy(css = "div.cost-new-container a.btn-new")
    private WebElement costGetStartedButton;

    @FindBy(css = "div.cost-new-container a.text-link")
    private WebElement costSignupText;

    @FindBy(css = "div.slider-app-wrapper")
    private WebElement sliderApp;

    public CRHomepage(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        waitForElementToBeClickable(modalCloseButton);
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

    public boolean sliderAppOpened() {
        return sliderApp.getAttribute("style") == "display: block;";
    }

    public void goHome() {
        driver.get(URL);
    }

    public String getReportPullURL() {
        return reportPullURL;
    }

}
