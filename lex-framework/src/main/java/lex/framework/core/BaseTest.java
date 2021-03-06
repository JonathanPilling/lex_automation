package lex.framework.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public void beforeSuite() {
        boolean headless = true; // change for headless vs normal browser
        if (System.getProperty("os.name").contains("Mac OS X")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac");
        }
        else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_linux");
        }
        ChromeDriverManager.chromedriver();
        if(headless) {

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    @AfterClass
    public void afterSuite() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }


}
