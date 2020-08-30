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
    public void isAtHomepage() throws InterruptedException {
        LexHomepage myPage = new LexHomepage(getDriver());
        Assert.assertTrue(myPage.isHome());
    }

    @Test
    public void canNavigateToSignUp() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexSignup signUpObj = new LexSignup(getDriver(), true);

        // act
        myPage.clickSignUp();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signUpObj.isHome());

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
        Assert.assertTrue(creditRepairObj.isHome());

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
        Assert.assertTrue(creditHelpObj.isHome());

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
        Assert.assertTrue(ourFirmObj.isHome());

        // cleanup
        myPage.goHome();
    }

    @Test
    public void canClickGetStartedButtonInHeroSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickGetStartedHeroButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSignupLinkInHeroSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickSignupHeroLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickGetStartedLinkInHeroSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickGetStartedHeroLink();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSeeMyCreditButton() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickSeeMyCreditButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSignupCreditCostLink() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickSignupCostLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickGetStartedButtonInImageRevealSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickGetStartedImageRevealButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    /* WIP TEST @Test
    public void canClickSignupLinkInImageRevealSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act

        myPage.clickSignupImageRevealLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }*/

    @Test
    public void canClickGetStartedButtonInClientReviewsSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickGetStartedClientReviewsButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSignupLinkInClientReviewsSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act
        myPage.clickSignupClientReviewsLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }



}

