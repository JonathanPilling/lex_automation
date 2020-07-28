package lex.tests.creditrepair;

import lex.pageobjects.creditrepair.CreditRepairOnline;
import org.testng.annotations.Test;
import lex.framework.core.BaseTest;

public class CreditRepairOnlineTests extends BaseTest{

    @Test
    public void canNavigateToSignup1() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButtonInHeader();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup2() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButtonInHeroImage();

        // assert
        repair.isAtSignupPage(getDriver());

        // cleanup
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup3() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButtonReviewsCarousel();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup4() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButtonNegativeSection();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToSignup5() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickSignupButtonServiceLevels();

        // assert
        repair.isAtSignupPage(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot1() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButton();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // clean up
        repair.goHome();
    }

    @Test
    public void canNavigateToCreditSnapshot2() {
        // arrange
        CreditRepairOnline repair = new CreditRepairOnline(getDriver());

        // act
        if (repair.isModalOpen()) {
            repair.closeModal();
        }
        repair.clickCreditSnapshotButtonFreeItems();

        // assert
        repair.isAtCreditSnapshot(getDriver());

        // clean up
        repair.goHome();
    }

}
