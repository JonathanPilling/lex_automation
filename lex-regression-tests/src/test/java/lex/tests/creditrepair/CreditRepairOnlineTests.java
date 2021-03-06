package lex.tests.creditrepair;

import lex.pageobjects.creditrepair.CreditRepairOnline;
import org.testng.annotations.Test;
import lex.framework.core.BaseTest;

public class CreditRepairOnlineTests extends BaseTest{

    @Test
    public void canNavigateToSignup1() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton1();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup2() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton2();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup3() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton3();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup4() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton4();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup5() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton5();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot1() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton1();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot2() throws InterruptedException {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton2();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // clean up
        repair.goHome();
    }

}
