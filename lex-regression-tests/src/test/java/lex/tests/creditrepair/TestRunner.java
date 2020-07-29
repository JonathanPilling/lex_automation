package lex.tests.creditrepair;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class TestRunner {

    static TestNG testNg;

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        testNg = new TestNG();
        testNg.setTestClasses(new Class[] {CreditRepairOnlineTests.class});
        testNg.addListener(tla);
        testNg.run();
    }
}
