package lex.tests.snapshot;

import lex.framework.core.BaseTest;
import lex.pageobjects.creditsnapshot.LexSnapshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LexSnapshotTests extends BaseTest {
    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickCheckYourCreditNowInModal() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickCheckYourCreditNowModalButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInModal() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickSignupModalLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickLoginButton() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickLoginButton();

        // assert
        Assert.assertTrue(myPage.isAtLogin());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickStartNowInHeader() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickStartNowHeaderButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickStartNowInHeroImage() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickStartNowHeroButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInHeroImage() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSignupHeroLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedNowInHowItWorks() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickStartNowHowCreditRepairWorksButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInHowItWorks() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSignupHowCreditRepairWorksLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInKnowYourCreditScore() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickCheckCreditNowKnowScoreButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInKnowYourCreditScore() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSignupKnowScoreLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSeeYourCreditNowInFAQ() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSeeYourCreditNowFaqButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInFAQ() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSignupFaqLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickCheckYourCreditNowCTA() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickCheckCreditNowLexCtaButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupCTA() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickSignupLexCtaLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

/*    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSubmitForm() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.sendFirstName("JBones");
        myPage.sendLastName("JBones");
        myPage.sendEmail(myPage.generateUniqueEmail());
        myPage.sendPhone("8016576293");
        myPage.sendStreetAddress("50 R");
        myPage.sendZipCode("84103");
        myPage.clickSubmitButton();
        myPage.waitForURLToContain(myPage.getReportPullURL());

        // assert
        Assert.assertTrue(myPage.isAtReportPull());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSeeGoDaddySeal() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act/assert
        Assert.assertTrue(myPage.goDaddyIsVisible());

        // clean up
        myPage.goHome();
    }*/

}
