package lex.tests.homepage;

import lex.framework.core.BaseTest;
import lex.pageobjects.credithelp.LexCreditHelp;
import lex.pageobjects.creditrepair.LexCreditRepair;
import lex.pageobjects.homepage.LexHomepage;
import lex.pageobjects.ourfirm.LexOurFirm;
import lex.pageobjects.signup.LexSignup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LexHomepageTests extends BaseTest {

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void isAtHomepage() throws InterruptedException {
        LexHomepage myPage = new LexHomepage(getDriver());
        Assert.assertTrue(myPage.isHome());
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canNavigateToSignUp() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexSignup signUpObj = new LexSignup(getDriver(), true);

        // act
        myPage.clickSignUp();

        // assert
        Assert.assertTrue(signUpObj.isHome());

        // cleanup
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canNavigateToCreditRepair() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexCreditRepair creditRepairObj = new LexCreditRepair(getDriver());

        // act
        myPage.clickCreditRepair();

        // assert
        Assert.assertTrue(creditRepairObj.isHome());

        // cleanup
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canNavigateToCreditHelp() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexCreditHelp creditHelpObj = new LexCreditHelp(getDriver());

        // act
        myPage.clickCreditHelp();

        // assert
        Assert.assertTrue(creditHelpObj.isHome());

        // cleanup
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canNavigateToOurFirm() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());
        LexOurFirm ourFirmObj = new LexOurFirm(getDriver());

        // act
        myPage.clickOurFirm();

        // assert
        Assert.assertTrue(ourFirmObj.isHome());

        // cleanup
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupLinkInImageRevealSection() throws InterruptedException {
        // arrange
        LexHomepage myPage = new LexHomepage(getDriver());

        // act

        myPage.clickSignupImageRevealLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
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

