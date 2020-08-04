package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public abstract class CreditRepairAbstract extends BasePage {
    @FindBy(how=How.CSS, using="a[href='/signup']")
    private List<WebElement> signupButtons;

    @FindBy(how=How.CSS, using="a[href*='credit-snapshot']")
    private List<WebElement> creditSnapshotButtons;

    @FindBy(how=How.CSS, using="button.close")
    private WebElement modalCloseButton;

    public CreditRepairAbstract(WebDriver driver) {
        super(driver);
    }

    public void clickSignupButton1() {
        signupButtons.get(0).click();
    }

    public void clickSignupButton2() {
        signupButtons.get(1).click();
    }

    public void clickSignupButton3() {
        signupButtons.get(2).click();
    }

    public void clickSignupButton4() {
        signupButtons.get(3).click();
    }

    public void clickSignupButton5() {
        signupButtons.get(4).click();
    }

    public void clickCreditSnapshotButton1() {
        creditSnapshotButtons.get(0).click();
    }

    public void clickCreditSnapshotButton2() {
        creditSnapshotButtons.get(1).click();
    }

    public void clickCreditSnapshotButton3() { creditSnapshotButtons.get(2).click(); }

    public void clickCreditSnapshotButton4() { creditSnapshotButtons.get(3).click(); }

    public void clickCreditSnapshotButton5() { creditSnapshotButtons.get(4).click(); }

    public void clickCreditSnapshotButton6() { creditSnapshotButtons.get(5).click(); }


    public boolean isAtSignupPage(WebDriver driver) {
        return driver.getCurrentUrl() == "https://www.lexingtonlaw.com/signup";
    }

    public boolean isAtCreditSnapshot(WebDriver driver) {
        return driver.getCurrentUrl() == "https://www.lexingtonlaw.com/credit-snapshot/pi";
    }

    public void closeModal() {
        modalCloseButton.click();
    }

    public boolean isModalOpen() {
        return modalCloseButton.isDisplayed() && modalCloseButton.isEnabled();
    }

}

