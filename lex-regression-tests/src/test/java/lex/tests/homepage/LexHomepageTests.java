package lex.tests.homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.LexHomepage;

public class LexHomepageTests extends BaseTest {

    @Test
    public void IsAtHomepage() {
        LexHomepage myPage = new LexHomepage(getDriver());
        System.out.println("Page Title: " + myPage.getPageTitle().getText());
        Assert.assertTrue(myPage.getPageTitle().getText() == "Lexington Law Firm " +
                "| Trusted Attorneys Helping to Fix Your Credit");
    }
    @Test
    public void canClickSignUp() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickSignUp();
        System.out.println("Page Title: " + myPage.getPageTitle().getText());
        Assert.assertTrue(myPage.getPageTitle().getText() == "Sign Up");
    }
}

