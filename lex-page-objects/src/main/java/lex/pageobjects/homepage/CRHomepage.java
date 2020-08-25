package lex.pageobjects.homepage;

import lex.framework.core.BasePage;
import org.openqa.selenium.WebDriver;

public class CRHomepage extends BasePage {
    private static String URL = "www.creditrepair.com";

    public CRHomepage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
}
