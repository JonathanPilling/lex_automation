package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CreditRepairOnline extends CreditRepairOnlineAbstract {
    private final String url = "https://www.lexingtonlaw.com/a/credit-repair-online";

    public CreditRepairOnline(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    public void goHome() {
        driver.get(url);
    }

}
