package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.BankAccountTests;
import ro.ase.acs.tests.categories.CorrectCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({BankAccountTests.class})
@Categories.IncludeCategory(CorrectCategory.class)
public class CorrectTests {
}
