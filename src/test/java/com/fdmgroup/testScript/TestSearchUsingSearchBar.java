package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class TestSearchUsingSearchBar {

	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testSearchForEnteredProductInTheSearchBar() throws InterruptedException {

		IndexPage.selectSearchIcon(driver).click();
		IndexPage.selectSearchBar(driver).click();
		IndexPage.selectSearchBar(driver).sendKeys("Bags");
		IndexPage.selectSearchOptionAtTheEndOfList(driver).click();
		assertEquals(DataFile.bagName, SearchPage.checkText(driver).getText());
		Thread.sleep(3000);
		IndexPage.navigateBackToHomepage(driver).click();
		
	}
}
