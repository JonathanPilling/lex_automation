package lex.framework.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
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

            DesiredCapabilities crcapabilities = DesiredCapabilities.chrome();
            crcapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            crcapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--window-size=1920,1080");
            crcapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
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
