package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LexCreditRepair extends BasePage {

    /* Locators */
    @FindBy(how = How.CSS, using = "title")
    private WebElement pageTitle;

    public LexCreditRepair(WebDriver driver) {
        super(driver);
    }

    /* Methods */
    public WebElement getPageTitle() {
        return pageTitle;
    }

}

