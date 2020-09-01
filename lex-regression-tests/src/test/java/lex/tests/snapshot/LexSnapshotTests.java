package lex.tests.snapshot;

import lex.framework.core.BaseTest;
import lex.pageobjects.creditsnapshot.LexSnapshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LexSnapshotTests extends BaseTest {
    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
    public void canSubmitForm() throws InterruptedException {
        // arrange
        LexSnapshot myPage = new LexSnapshot(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.sendFirstName("JBones");
        myPage.sendLastName("JBones");
        myPage.sendEmail("jonathanpilling77+selenium2@gmail.com");
        myPage.sendPhone("8016576293");
        myPage.sendStreetAddress("50 R");
        myPage.sendZipCode("84103");
        myPage.clickSubmitButton();
        Thread.sleep(3000);

        // assert
        Assert.assertTrue(myPage.isAtReportPull());

        // clean up
        myPage.goHome();
    }

}
