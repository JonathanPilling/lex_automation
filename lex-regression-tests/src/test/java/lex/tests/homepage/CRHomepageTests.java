package lex.tests.homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.CRHomepage;

public class CRHomepageTests extends BaseTest {
    @Test
    public void canClickGetStartedInModal() {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalGetStartedButton();

        // assert
        Assert.assertTrue(myPage.isAtCreditSnapshot());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSignupInModal() {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalSignupButton();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickLoginButton() {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickLoginButton();

        // assert
        Assert.assertTrue(myPage.isAtLogin());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickSignupInTopNav() {
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

    @Test
    public void canClickStimulusSignupButon() {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.clickStimulusSignupButton();

        // assert
        Assert.assertTrue(myPage.isAtSignup());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickGetStartedHero() {
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

    @Test
    public void canClickSignupHero() {
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

    @Test
    public void canSubmitForm() {
        // arrange
        CRHomepage myPage = new CRHomepage(getDriver());

        // act
        myPage.clickModalCloseButton();
        myPage.sendFirstName("asdf");
        myPage.sendLastName("asdf");
        myPage.sendEmail("jonathanpilling77+selenium@gmail.com");
        myPage.sendPhone("1234567899");
        myPage.sendStreetAddress("123 R");
        myPage.sendZipCode("84103");
        myPage.clickSubmitButton();

        // assert
        Assert.assertTrue(myPage.isAtReportPull());

        // clean up
        myPage.goHome();
    }

    @Test
    public void canClickGetStartedInHardWorkSection() {
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

    @Test
    public void canClickSignupInHardWorkSection() {
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

    @Test
    public void canClickGetStartedInHowCreditRepairWorksSection() {
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

    @Test
    public void canClickSignupInHowCreditRepairWorksSection() {
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

    @Test
    public void canClickGetStartedInCostSection() {
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

    @Test
    public void canClickSignupInCostSection() {
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

}
