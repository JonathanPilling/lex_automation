package lex.pageobjects.homepage;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LexHomepage extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com";
    private String snapshotURL = "https://www.lexingtonlaw.com/credit-snapshot/pi";
    private String signupURL = "https://www.lexingtonlaw.com/signup";
    private String creditRepairURL = "https://www.lexingtonlaw.com/credit-repair-services";
    private String creditHelpURL = "https://www.lexingtonlaw.com/credit-help";
    private String ourFirmURL = "https://www.lexingtonlaw.com/our-firm";

    /* Locators */
    @FindBy(css = "title")
    private WebElement pageTitle;

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement loginButton;

    @FindBy(css = "a[class='site_nav_sign_up_desktop']")
    private WebElement signupButton;

    @FindBy(css = ".desktop_site_nav_left a[href='/credit-repair-services']")
    private WebElement creditRepairButton;

    @FindBy(css = ".desktop_site_nav_left a[href='/credit-help']")
    private WebElement creditHelpButton;

    @FindBy(css = ".desktop_site_nav_left a[href='/our-firm']")
    private WebElement ourFirmButton;

    @FindBy(css = "div.hero-content a.lex-cta-number")
    private WebElement getStartedHeroButton;

    @FindBy(css = "div.hero-content a.lex-online-signup")
    private WebElement signupHeroLink;

    @FindBy(css = ".hero-cta a")
    private WebElement getStartedHeroLink;

    @FindBy(css = "#credit-costing-you a.lex-cta-number")
    private WebElement seeMyCreditButton;

    @FindBy(css = "#credit-costing-you a.sign-up-cta")
    private WebElement signupCostLink;

    @FindBy(css = "div.image-reveal-cta a.call-now-cta")
    private WebElement getStartedImageRevealButton;

    @FindBy(css = "div.image-reveal-cta a.sign-up-cta")
    private WebElement signupImageRevealLink;

    @FindBy(css = "#client-reviews a.call-now-cta")
    private WebElement getStartedClientReviewsButton;

    @FindBy(css = "#client-reviews a.sign-up-cta")
    private WebElement signupClientReviewsLink;

    public LexHomepage(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void goHome() { this.driver.get(URL); }

    public void clickSignUp() {
        signupButton.click();
    }

    public void clickCreditRepair() { creditRepairButton.click(); }

    public void clickCreditHelp() { creditHelpButton.click(); }

    public void clickOurFirm() { ourFirmButton.click(); }

    public boolean isHome() {
        return getPageTitle().getAttribute("text").contains("Lexington Law Firm " +
                "| Trusted Attorneys Helping to Fix Your Credit");
    }

    public boolean isAtCreditSnapshot() {
        return driver.getCurrentUrl().startsWith(snapshotURL);
    }

    public boolean isAtSignup() {
        return driver.getCurrentUrl().startsWith(signupURL);
    }

    public boolean isAtCreditRepair() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl().startsWith(creditRepairURL); }

    public boolean isAtCreditHelp() { return driver.getCurrentUrl().startsWith(creditHelpURL); }

    public boolean isAtOurFirm() { return driver.getCurrentUrl().startsWith(ourFirmURL); }

    public void clickGetStartedHeroButton() {
        getStartedHeroButton.click();
    }

    public void clickSignupHeroLink() {
        signupHeroLink.click();
    }

    public void clickGetStartedHeroLink() {
        getStartedHeroLink.click();
    }

    public void clickSeeMyCreditButton() {
        seeMyCreditButton.click();
    }

    public void clickSignupCostLink() {
        signupCostLink.click();
    }

    public void clickGetStartedImageRevealButton() {
        getStartedImageRevealButton.click();
    }

    public void clickSignupImageRevealLink() {
        signupImageRevealLink.click();
    }

    public void clickGetStartedClientReviewsButton() {
        getStartedClientReviewsButton.click();
    }

    public void clickSignupClientReviewsLink() {
        signupClientReviewsLink.click();
    }

    public String getCreditRepairURL() {
        return creditRepairURL;
    }

    public String getCreditHelpURL() {
        return creditHelpURL;
    }

    public String getOurFirmURL() {
        return ourFirmURL;
    }


}
