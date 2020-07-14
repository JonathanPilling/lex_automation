package lex.tests.homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.LexHomepage;

public class LexHomepageTests extends BaseTest {

    @Test
    public void isAtHomepage() {
        LexHomepage myPage = new LexHomepage(getDriver());
        Assert.assertTrue(myPage.getPageTitle().getAttribute("text").contains("Lexington Law Firm " +
                "| Trusted Attorneys Helping to Fix Your Credit"));
    }

    @Test
    public void canClickSignUp() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickSignUp();
        // Instatiate signup page object
        Assert.assertTrue(myPage.getPageTitle().getAttribute("text").contains("Sign Up"));
    }

    @Test
    public void canNavigateToCreditRepair() {
        LexHomepage myPage = new LexHomepage(getDriver());
    }
}

