package lex.pageobjects.homepage;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LexHomepage extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com";

    public LexHomepage(WebDriver driver) throws InterruptedException {
        super(driver);
        driver.get(URL);
        Thread.sleep(1000);
    }

    /* Locators */
    @FindBy(how = How.CSS, using = "title")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    private WebElement loginButton;

    @FindBy(how = How.CSS, using = "a[class='site_nav_sign_up_desktop']")
    private WebElement signupButton;

    @FindBy(how = How.CSS, using = ".desktop_site_nav_left a[href='/credit-repair-services']")
    private WebElement creditRepairButton;

    @FindBy(how = How.CSS, using = ".desktop_site_nav_left a[href='/credit-help']")
    private WebElement creditHelpButton;

    @FindBy(how = How.CSS, using = ".desktop_site_nav_left a[href='/our-firm']")
    private WebElement ourFirmButton;

    @FindBy(how = How.CSS, using = "div.hero-content a.lex-cta-number")
    private WebElement getStartedHeroButton;

    @FindBy(how=How.CSS, using = "div.hero-content a.lex-online-signup")
    private WebElement signupHeroLink;

    @FindBy(how=How.CSS, using = ".hero-cta a")
    private WebElement getStartedHeroLink;

    @FindBy(how=How.CSS, using = "#credit-costing-you a.lex-cta-number")
    private WebElement seeMyCreditButton;

    @FindBy(how=How.CSS, using = "#credit-costing-you a.sign-up-cta")
    private WebElement signupCostLink;

    @FindBy(how=How.CSS, using = "div.image-reveal-cta a.call-now-cta")
    private WebElement getStartedImageRevealButton;

    @FindBy(how=How.CSS, using = "div.image-reveal-cta a.sign-up-cta")
    private WebElement signupImageRevealLink;

    @FindBy(how=How.CSS, using = "#client-reviews a.call-now-cta")
    private WebElement getStartedClientReviewsButton;

    @FindBy(how=How.CSS, using = "#client-reviews a.sign-up-cta")
    private WebElement signupClientReviewsLink;

    /* Methods */
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
        return driver.getCurrentUrl().startsWith("https://www.lexingtonlaw.com/credit-snapshot/pi");
    }

    public boolean isAtSignup() {
        return driver.getCurrentUrl().startsWith("https://www.lexingtonlaw.com/signup");
    }

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
}
