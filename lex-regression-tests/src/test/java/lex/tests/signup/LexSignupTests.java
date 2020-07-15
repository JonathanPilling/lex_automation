package lex.tests.signup;

import org.testng.annotations.Test;
import org.testng.Assert;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.LexHomepage;
import lex.pageobjects.signup.LexSignup;
import lex.pageobjects.credithelp.LexCreditHelp;
import lex.pageobjects.creditrepair.LexCreditRepair;
import lex.pageobjects.ourfirm.LexOurFirm;

public class LexSignupTests extends BaseTest {

    @Test
    public void canSeeServices() {
        LexSignup myObj = new LexSignup(getDriver());
    }

}


