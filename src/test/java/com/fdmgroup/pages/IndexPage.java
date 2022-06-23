package com.fdmgroup.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage {

	public static WebElement navigateBackToHomepage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/a"));
	}

	public static WebElement selectSearchIcon(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/details-modal/details/summary"));
	}

	public static WebElement selectSearchBar(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Search-In-Modal\"]"));
	}

	public static WebElement selectSearchOptionAtTheEndOfList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"predictive-search-option-search-keywords\"]/button")));
	}

	public static WebElement selectBagOptionFromHomepage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Details-HeaderMenu-1\"]//*[text()='Bags']"));
	}

	public static WebElement selectShoesOptionFromHomepage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id,'Details-HeaderMenu-2')]//*[text()='Shoes']"));
	}

	public static WebElement selectWhichBagOptionFromDropdownList(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"HeaderMenu-MenuList-1\"]/li[4]/a"));
	}

	public static WebElement selectWhichShoesOptionFromDropdownList(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"HeaderMenu-MenuList-2\"]/li[3]/a"));
	}

}
