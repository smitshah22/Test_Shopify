package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class TestSearchBagFromOptions {

	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testSearchFromListOnHomepage() throws InterruptedException {

		IndexPage.selectBagOptionFromHomepage(driver).click();
		IndexPage.selectWhichBagOptionFromDropdownList(driver).click();
		assertEquals(DataFile.bagName, SearchPage.checkTextWhenBagsSelectedFromList(driver).getText());
		Thread.sleep(3000);
		IndexPage.navigateBackToHomepage(driver).click();
		
	}
}
