package lex.pageobjects.homepage;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LexHomepage extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com";

    public LexHomepage(WebDriver driver) {
        super(driver);
        driver.get(URL);
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
}
