package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CreditRepairNBR extends CreditRepairOnlineAbstract {

    private final String url = "https://www.lexingtonlaw.com/l/credit-repair-nbr";

    @FindBy(how=How.CSS, using="a[/href*='credit-snapshot']")
    private List<WebElement> creditSnapshotButtons;

    public CreditRepairNBR(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

    public void clickCreditSnapshotButton6() { creditSnapshotButtons.get(5).click(); }

    public void goHome() {
        driver.get(url);
    }
}