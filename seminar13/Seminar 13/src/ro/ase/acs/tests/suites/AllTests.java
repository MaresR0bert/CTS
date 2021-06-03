package ro.ase.acs.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.BankAccountAtmTests;
import ro.ase.acs.tests.BankAccountTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({BankAccountTests.class, BankAccountAtmTests.class})
public class AllTests {
}
