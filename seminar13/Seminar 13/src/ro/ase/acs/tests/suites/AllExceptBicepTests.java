package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.BankAccountTests;
import ro.ase.acs.tests.categories.RightBicepCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({BankAccountTests.class})
@Categories.ExcludeCategory(RightBicepCategory.class)
public class AllExceptBicepTests {
}
