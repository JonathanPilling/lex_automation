package lex.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*Base locators for stuff available on most pages*/

public class BasePage {

    // Common form locators
    @FindBy(id = "FirstName")
    private WebElement firstName;
    @FindBy(id = "LastName")
    private WebElement lastName;
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Phone")
    private WebElement phone;
    @FindBy(id = "Address")
    private WebElement streetAddress;
    @FindBy(id = "Zip")
    private WebElement zipCode;

    // go daddy seal
    @FindBy(css = "img[src='https://seal.godaddy.com/images/3/en/siteseal_gd_3_h_l_m.gif']")
    private List<WebElement> goDaddySeal;

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

    // Form methods
    public void sendFirstName(String input) {
        firstName.clear();
        firstName.sendKeys(input);
    }

    public void sendLastName(String input) {
        lastName.clear();
        lastName.sendKeys(input);
    }

    public void sendEmail(String input) {
        email.clear();
        email.sendKeys(input);
    }

    public void sendPhone(String input) {
        phone.clear();
        phone.sendKeys(input);
    }

    public void sendStreetAddress(String input) {
        streetAddress.clear();
        streetAddress.sendKeys(input);
    }

    public void sendZipCode(String input) {
        zipCode.clear();
        zipCode.sendKeys(input);
    }

    // check go daddy seal
    public boolean goDaddyIsVisible() {
        return goDaddySeal.size() != 0;
    }
}
