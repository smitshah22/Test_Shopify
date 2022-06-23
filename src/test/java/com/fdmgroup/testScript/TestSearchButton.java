package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class TestSearchButton {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testSearchButton() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(DataFile.homePageURL);
		driver.switchTo().frame("PreviewFrame");
		IndexPage.selectSearchIcon(driver).click();
		IndexPage.selectSearchBar(driver).click();
		IndexPage.selectSearchBar(driver).sendKeys("Bags");
		IndexPage.selectSearchBar(driver).sendKeys(Keys.ENTER);
		assertEquals(DataFile.bagName, SearchPage.checkText(driver).getText());
		Thread.sleep(3000);
		IndexPage.navigateBackToHomepage(driver).click();
		
	}
}
