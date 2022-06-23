package com.fdmgroup.testScript;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestSearchButton.class,
	TestNoResultsFound.class,
	TestSearchBagFromOptions.class,
	TestSearchShoesFromOptions.class,
	TestSearchUsingSearchBar.class,
	TestWhenEnteredShoes.class
})
public class TestRunner {

}
