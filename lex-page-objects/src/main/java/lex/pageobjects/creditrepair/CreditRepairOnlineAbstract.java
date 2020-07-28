package lex.pageobjects.creditrepair;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public abstract class CreditRepairOnlineAbstract extends BasePage {
    @FindBy(how=How.CSS, using="a")
    private List<WebElement> buttonArray;

    @FindBy(how=How.CSS, using="button.close")
    private WebElement modalCloseButton;

    public CreditRepairOnlineAbstract(WebDriver driver) {
        super(driver);
    }

    public void clickSignupButtonInHeader() {
        buttonArray.get(1).click();
    }

    public void clickSignupButtonInHeroImage() {
        buttonArray.get(4).click();
    }

    public void clickCreditSnapshotButton() {
        buttonArray.get(5).click();
    }

    public void clickSignupButtonReviewsCarousel() {
        buttonArray.get(13).click();
    }

    public void clickSignupButtonNegativeSection() {
        buttonArray.get(14).click();
    }

    public void clickCreditSnapshotButtonFreeItems() {
        buttonArray.get(19).click();
    }

    public void clickSignupButtonServiceLevels() {
        buttonArray.get(20).click();
    }

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

