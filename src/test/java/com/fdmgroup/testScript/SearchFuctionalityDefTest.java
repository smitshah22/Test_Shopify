package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFuctionalityDefTest {

	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Given("User opens the shopify store application")
	public void user_opens_the_shopify_store_application() {
		driver.manage().window().maximize();
		driver.get(DataFile.homePageURL);
		driver.switchTo().frame("PreviewFrame");
	}

	@Given("User clicks the search button")
	public void user_clicks_the_search_button() {
		IndexPage.selectSearchIcon(driver).click();
		IndexPage.selectSearchBar(driver).click();
	}

	@When("User enters bags to in search bar")
	public void user_enters_bags_to_in_search_bar() {
		IndexPage.selectSearchBar(driver).sendKeys("Bags");

	}

	@When("User presses enter to search for the item")
	public void user_presses_enter_to_search_for_the_item() {
		IndexPage.selectSearchBar(driver).sendKeys(Keys.ENTER);
	}

	@Then("User is able to see different types of bags")
	public void user_is_able_to_see_different_types_of_bags() {
		assertEquals(DataFile.bagName, SearchPage.checkText(driver).getText());
	}

	@Given("User is on homepage")
	public void user_is_on_homepage() {
		IndexPage.navigateBackToHomepage(driver).click();
	}

	@When("User enters shoes to in search bar")
	public void user_enters_shoes_to_in_search_bar() {
		IndexPage.selectSearchBar(driver).sendKeys("shoes");
	}

	@Then("User is able to see different types of shoes")
	public void user_is_able_to_see_different_types_of_shoes() {
		assertEquals(DataFile.shoeName, SearchPage.checkTextWhenShoes(driver).getText());
	}

	@When("User enters a random string in search bar")
	public void user_enters_a_random_string_in_search_bar() {
		IndexPage.selectSearchBar(driver).sendKeys("asdffgsd");
	}

	@Then("User is able to see no results found for the entered string")
	public void user_is_able_to_see_no_results_found_for_the_entered_string() {
		assertEquals(DataFile.noResults, SearchPage.checkTextWhenNoResult(driver));
	}

	@When("User clicks search button from dropdown list")
	public void user_clicks_search_button_from_dropdown_list() {
		IndexPage.selectSearchOptionAtTheEndOfList(driver).click();
	}

	@Given("User clicks the bags option available on homepage")
	public void user_clicks_the_bags_option_available_on_homepage() {
		IndexPage.selectBagOptionFromHomepage(driver).click();
	}

	@When("User clicks a type of bag from dropdown list to search")
	public void user_clicks_a_type_of_bag_from_dropdown_list_to_search() {
		IndexPage.selectWhichBagOptionFromDropdownList(driver).click();
	}

	@Then("User is able to see particular type of bag")
	public void user_is_able_to_see_particular_type_of_bag() {
		assertEquals(DataFile.bagName, SearchPage.checkTextWhenBagsSelectedFromList(driver).getText());
	}

	@Given("User clicks the shoes option available on homepage")
	public void user_clicks_the_shoes_option_available_on_homepage() {
		IndexPage.selectShoesOptionFromHomepage(driver).click();
	}

	@When("User clicks a type of shoe from dropdown list to search")
	public void user_clicks_a_type_of_shoe_from_dropdown_list_to_search() {
		IndexPage.selectWhichShoesOptionFromDropdownList(driver).click();
	}

	@Then("User is able to see particular type of shoe")
	public void user_is_able_to_see_particular_type_of_shoe() {
		assertEquals(DataFile.shoeName, SearchPage.checkTextWhenShoesSelectedFromList(driver).getText());
	}
}