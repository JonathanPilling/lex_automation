package lex.tests.homepage;

import org.testng.annotations.Test;
import lex.framework.core.BaseTest;
import lex.pageobjects.homepage.LexHomepage;

public class LexHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        LexHomepage googleHomepage = new LexHomepage(getDriver());
    }55
}

