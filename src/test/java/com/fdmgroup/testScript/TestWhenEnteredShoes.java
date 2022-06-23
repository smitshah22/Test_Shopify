package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class TestWhenEnteredShoes {

	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testSearchButton() throws InterruptedException {

		IndexPage.selectSearchIcon(driver).click();
		IndexPage.selectSearchBar(driver).click();
		IndexPage.selectSearchBar(driver).sendKeys("shoes");
		IndexPage.selectSearchBar(driver).sendKeys(Keys.ENTER);
		assertEquals(DataFile.shoeName, SearchPage.checkTextWhenShoes(driver).getText());
		Thread.sleep(3000);
		IndexPage.navigateBackToHomepage(driver).click();
		
	}
}
