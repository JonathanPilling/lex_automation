package lex.pageobjects.creditsnapshot;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;

public class LexSnapshot extends BasePage {

    private static String URL = "www.lexingtonlaw.com/l/credit-snapshot";
    public LexSnapshot(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
}
