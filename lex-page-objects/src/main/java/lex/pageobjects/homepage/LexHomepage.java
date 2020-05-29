package lex.pageobjects.homepage;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LexHomepage extends BasePage {

    private static String URL = "https://www.lexingtonlaw.com";

    /*Locators*/
    @FindBy(how = How.CSS, using = "title")
    private WebElement pageTitle;

    @FindBy(how = How.CSS, using = "a[class='site_nav_sign_up_desktop']")
    private WebElement navSignUpButton;

    public LexHomepage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void clickSignUp() {
        navSignUpButton.click();
    }


}
