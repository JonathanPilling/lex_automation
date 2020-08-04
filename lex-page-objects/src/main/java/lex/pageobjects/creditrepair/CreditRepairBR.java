package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;

public class CreditRepairBR extends CreditRepairAbstract {

    private final String url = "https://www.lexingtonlaw.com/l/credit-repair-br";

    public CreditRepairBR(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    public void goHome() {
        driver.get(url);
    }
}
