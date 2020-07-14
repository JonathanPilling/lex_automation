package lex.tests.homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.LexHomepage;
import lex.pageobjects.signup.LexSignup;
import lex.pageobjects.credithelp.LexCreditHelp;
import lex.pageobjects.creditrepair.LexCreditRepair;
import lex.pageobjects.ourfirm.LexOurFirm;

public class LexHomepageTests extends BaseTest {

    @Test
    public void isAtHomepage() {
        LexHomepage myPage = new LexHomepage(getDriver());
        Assert.assertTrue(myPage.getPageTitle().getAttribute("text").contains("Lexington Law Firm " +
                "| Trusted Attorneys Helping to Fix Your Credit"));
    }

    @Test
    public void canNavigateToSignUp() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickSignUp();
        LexSignup signUpObj = new LexSignup(getDriver());
        Assert.assertTrue(signUpObj.getPageTitle().getAttribute("text").contains("Sign Up"));
    }

    @Test
    public void canNavigateToCreditRepair() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickCreditRepair();
        LexCreditRepair creditRepairObj = new LexCreditRepair(getDriver());
        Assert.assertTrue(creditRepairObj.getPageTitle().getAttribute("text").contains("Credit Repair Services"));
    }

    @Test
    public void canNavigateToCreditHelp() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickCreditHelp();
        LexCreditHelp creditHelpObj = new LexCreditHelp(getDriver());
        Assert.assertTrue(creditHelpObj.getPageTitle().getAttribute("text").contains("Credit Help"));
    }

    @Test
    public void canNavigateToOurFirm() {
        LexHomepage myPage = new LexHomepage(getDriver());
        myPage.clickOurFirm();
        LexOurFirm ourFirmObj = new LexOurFirm(getDriver());
        Assert.assertTrue(ourFirmObj.getPageTitle().getAttribute("text").contains("Our Firm"));
    }

}

