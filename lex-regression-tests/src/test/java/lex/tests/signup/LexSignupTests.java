package lex.tests.signup;

import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.signup.LexSignup;

public class LexSignupTests extends BaseTest {

    @Test
    public void constructorLoadsSignupPage() {
        LexSignup myObj = new LexSignup(getDriver());
        Assert.assertTrue(myObj.isHome());
    }

    @Test
    public void canNotContinueWithNoFirstName() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithNoLastName() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithNoEmail() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithInvalidEmail() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithNoPhone() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithInvalidPhone() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016218");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithNoAddress() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setZip("84103");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithNoZip() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithInvalidZip() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("8411");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    @Test
    public void canNotContinueWithInvalidZip2() throws InterruptedException {
        // arrange
        LexSignup signupObj = new LexSignup(getDriver());

        // act
        Thread.sleep(2000);
        signupObj.setFirstName("Jonathan");
        signupObj.setLastName("SeleniumWiz");
        signupObj.setEmail("jonathanpilling77+ll@gmail.com");
        signupObj.setPhone("8016211928");
        signupObj.setAddress("123 Sesame Street");
        signupObj.setZip("aqwert");
        signupObj.submitStepOne();
        Thread.sleep(2000);

        // assert
        Assert.assertTrue(signupObj.atStepOne());

        // cleanup
        signupObj.goHome();
    }

    /*
    Can signup for Premier Plus singleUser
    Can Signup for concord premier singleUser
    Can signup for concord standard single
    ^ 3 Family Users
    Can enter one payment method for single user
    Can enter one payment method for +1 user
    Can enter two payment methods
    Can edit 1 billing address
    Can edit 2 billing address
    
     */

}


