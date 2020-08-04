package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreditRepairNBR extends CreditRepairAbstract {

    private final String url = "https://www.lexingtonlaw.com/l/credit-repair-nbr";

    public CreditRepairNBR(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    public void goHome() {
        driver.get(url);
    }
}