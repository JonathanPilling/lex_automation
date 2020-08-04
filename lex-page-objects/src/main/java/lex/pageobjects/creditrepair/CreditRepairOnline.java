package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;


public class CreditRepairOnline extends CreditRepairAbstract {
    private final String url = "https://www.lexingtonlaw.com/a/credit-repair-online";

    public CreditRepairOnline(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    public void goHome() {
        driver.get(url);
    }

}
