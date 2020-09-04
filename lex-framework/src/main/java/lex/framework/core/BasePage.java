package lex.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementToBeClickable(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
    }

    public void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

    public void waitForURLToContain(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }

    public String generateUniqueEmail() {
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_HHmm");
        Date date = new Date();
        String returnString = "jonathanpilling77+" + formatter.format(date) + "@gmail.com";
        return returnString;
    }
}
