package lex.tests.creditrepair;

import lex.pageobjects.creditrepair.CreditRepair;
import org.testng.annotations.Test;
import lex.framework.core.BaseTest;

public class CreditRepairTests extends BaseTest {
    @Test
    public void canNavigateToSignup1() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

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
        CreditRepair repair = new CreditRepair(getDriver());

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
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton3();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup4() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton4();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup5() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButton5();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot1() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton1();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot2() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton2();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot3() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton3();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot4() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton4();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot5() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton5();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot6() throws InterruptedException {
        // arrange
        CreditRepair repair = new CreditRepair(getDriver());

        // act
        Thread.sleep(1000);
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton6();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // cleanup
        repair.goHome();
    }

}

