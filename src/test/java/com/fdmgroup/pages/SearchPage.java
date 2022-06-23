package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public static WebElement checkText(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"product-grid\"]/ul/li[1]/div/div/div[2]/div[1]/h3"));
	}

	public static WebElement checkTextWhenBagsSelectedFromList(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"product-grid\"]/li[1]/div/div/div[2]/div[1]/h3/a"));
	}
	
	public static WebElement checkTextWhenShoes(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"product-grid\"]/ul/li[2]/div/div/div[2]/div[1]/h3/a"));
	}
	
	public static WebElement checkTextWhenShoesSelectedFromList(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"product-grid\"]/li[3]/div/div/div[2]/div[1]/h3/a"));
	}
	
	public static String checkTextWhenNoResult(WebDriver driver) {
		WebElement text = driver
				.findElement(By.xpath("//*[@id=\"shopify-section-template--14238874632281__main\"]/div/div[1]/p"));
		String[] checkText = text.getText().split(" ");
		String toBeChecked = checkText[0] + ' ' + checkText[1];
		return toBeChecked;
	}
}
