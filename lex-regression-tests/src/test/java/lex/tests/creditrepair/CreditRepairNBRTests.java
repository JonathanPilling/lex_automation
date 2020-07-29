package lex.tests.creditrepair;

import lex.pageobjects.creditrepair.CreditRepairNBR;
import lex.pageobjects.creditrepair.CreditRepairOnline;
import org.testng.annotations.Test;
import lex.framework.core.BaseTest;

public class CreditRepairNBRTests extends BaseTest {
    @Test
    public void canNavigateToSignup1() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToSignup2() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToSignup3() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToSignup4() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToSignup5() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot1() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot2() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot3() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot4() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot5() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
    public void canNavigateToCreditSnapshot6() {
        // arrange
        CreditRepairNBR repair = new CreditRepairNBR(getDriver());

        // act
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
