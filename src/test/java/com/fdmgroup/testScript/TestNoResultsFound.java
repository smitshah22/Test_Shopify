package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class TestNoResultsFound {

	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testNoResultsFound() throws InterruptedException {

		IndexPage.selectSearchIcon(driver).click();
		IndexPage.selectSearchBar(driver).click();
		IndexPage.selectSearchBar(driver).sendKeys("asdffgsd");
		IndexPage.selectSearchBar(driver).sendKeys(Keys.ENTER);
		assertEquals(DataFile.noResults, SearchPage.checkTextWhenNoResult(driver));
		Thread.sleep(3000);
		IndexPage.navigateBackToHomepage(driver).click();
		
	}
}
