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
    public void canNavigateToSignUp() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexSignup signUpObj = new LexSignup(getDriver());

        // act
        myPage.clickSignUp();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signUpObj.getPageTitle().getAttribute("text").contains("Sign Up"));

        // cleanup
        myPage.goHome();
    }

    @Test
    public void canNavigateToCreditRepair() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexCreditRepair creditRepairObj = new LexCreditRepair(getDriver());

        // act
        myPage.clickCreditRepair();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(creditRepairObj.getPageTitle().getAttribute("text").contains("Credit Repair Services"));

        // cleanup
        myPage.goHome();
    }

    @Test
    public void canNavigateToCreditHelp() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexCreditHelp creditHelpObj = new LexCreditHelp(getDriver());

        // act
        myPage.clickCreditHelp();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(creditHelpObj.getPageTitle().getAttribute("text").contains("Credit Help"));

        // cleanup
        myPage.goHome();
    }

    @Test
    public void canNavigateToOurFirm() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexOurFirm ourFirmObj = new LexOurFirm(getDriver());

        // act
        myPage.clickOurFirm();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(ourFirmObj.getPageTitle().getAttribute("text").contains("Our Firm"));

        // cleanup
        myPage.goHome();
    }

}

