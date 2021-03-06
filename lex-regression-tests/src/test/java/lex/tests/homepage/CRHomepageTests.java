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

    /*@Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSubmitForm() throws InterruptedException, IOException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());
        String firstName = "asdf";
        String lastName = "asdf";
        String email = myPage.generateUniqueEmail();
        String phone = "1234567899";
        String address = "123 R";
        String zip = "84010";

        // act
        myPage.clickModalCloseButton();
        myPage.sendFirstName(firstName);
        myPage.sendLastName(lastName);
        myPage.sendEmail(email);
        myPage.sendPhone(phone);
        myPage.sendStreetAddress(address);
        myPage.sendZipCode(zip);
        //myPage.waitForURLToContain(myPage.getReportPullURL());

        // assert
        Assert.assertEquals(firstName, myPage.getFirstName());
        Assert.assertEquals(lastName, myPage.getLastName());
        Assert.assertEquals(email, myPage.getEmail());
        //Assert.assertEquals(phone, myPage.getPhone());
        Assert.assertEquals(address, myPage.getAddress());
        Assert.assertEquals(zip, myPage.getZipCode());
        myPage.clickSubmitButton();
        myPage.waitForURLToContain(myPage.getReportPullURL());
        Assert.assertTrue(myPage.isAtReportPull()); // Sometimes we won't go to report pull? Probably target

        // clean up
        myPage.goHome();
    }*/

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

    /*@Test(retryAnalyzer = lex.tests.RetryAnalyzer.class)
    public void canSeeGoDaddySeal() throws InterruptedException {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act/assert
        Assert.assertTrue(myPage.goDaddyIsVisible());

        // clean up
        myPage.goHome();
    }*/
}        
