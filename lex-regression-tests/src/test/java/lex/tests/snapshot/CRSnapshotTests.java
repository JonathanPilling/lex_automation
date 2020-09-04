package lex.tests.snapshot;

import lex.framework.core.BaseTest;
import lex.pageobjects.creditsnapshot.CRSnapshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRSnapshotTests extends BaseTest {
    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInModal() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickGetStartedModalButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInModal() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

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
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickLoginButton();

        // assert
        Assert.assertTrue(myPage.isAtLogin());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickStartNowInHeader() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickStartNowHeaderButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickCheckYourCreditNowInHeroImage() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickCheckYourCreditNowHeroButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInHeroImage() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickSignupHeroLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedNowInClientReviews() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickGetStartedClientReviewsButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInClientReviews() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickSignupClientReviewsLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInKnowYourCreditScore() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickGetStartedKnowScoreButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInKnowYourCreditScore() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickSignupKnowScoreLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedCTA() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickGetStartedCtaButton();

        // assert
        Assert.assertTrue(myPage.isAtSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupCTA() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
        myPage.clickSignupCtaLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSubmitForm() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
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
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act/assert
        Assert.assertTrue(myPage.goDaddyIsVisible());

        // clean up
        myPage.goHome();
    }

}
