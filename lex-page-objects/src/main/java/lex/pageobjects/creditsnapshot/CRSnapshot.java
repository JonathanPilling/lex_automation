package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;

public class CRSnapshot extends BasePage {

    private static String URL = "www.creditrepair.com/b/credit-snapshot";
    public CRSnapshot(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
}
