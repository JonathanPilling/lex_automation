package lex.tests.homepage;

import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.CRHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRHomepageTests extends BaseTest {
    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInModal() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInModal() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalSignupButton();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickLoginButton() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickLoginButton();

        // assert
        Assert.assertTrue(myPage.isAtLogin());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInTopNav() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickTopNavSignupButton();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedHero() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHeroGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupHero() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHeroSignupLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSubmitForm() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.sendFirstName("asdf");
        myPage.sendLastName("asdf");
        myPage.sendEmail(myPage.generateUniqueEmail());
        myPage.sendPhone("1234567899");
        myPage.sendStreetAddress("123 R");
        myPage.sendZipCode("84103");
        myPage.clickSubmitButton();
        myPage.waitForURLToContain(myPage.getReportPullURL());

        // assert
        Assert.assertTrue(myPage.isAtReportPull()); // Sometimes we won't go to report pull? Probably target

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInHardWorkSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHardWorkGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInHardWorkSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHardWorkSignupLink();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInHowCreditRepairWorksSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHowWorksGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInHowCreditRepairWorksSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickHowWorksSignupText();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickGetStartedInCostSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickCostGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canClickSignupInCostSection() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickCostSignupText();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSeeGoDaddySeal() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act/assert
        Assert.assertTrue(myPage.goDaddyIsVisible());

        // clean up
        myPage.goHome();
    }
}        
