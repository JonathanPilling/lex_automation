package lex.tests.snapshot;

import lex.framework.core.BaseTest;
import lex.pageobjects.creditsnapshot.CRSnapshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRSnapshotTests extends BaseTest {
    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
    public void canSubmitForm() throws InterruptedException {
        // arrange
        CRSnapshot myPage = new CRSnapshot(getDriver());

        // act
        myPage.clickCloseModalButton();
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
