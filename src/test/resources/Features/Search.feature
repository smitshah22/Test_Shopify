Feature: Feature to test the search functionality

  Scenario: Search for bags from the search bar using search button
    Given User launch the browser
    And User opens the shopify store application
    And User clicks the search button
    When User enters bags to in search bar
    And User presses enter to search for the item
    Then User is able to see different types of bags

  Scenario: Search for shoes from the search bar using search button
    Given User launch the browser
    And User is on homepage
    And User clicks the search button
    When User enters shoes to in search bar
    And User presses enter to search for the item
    Then User is able to see different types of shoes

  Scenario: No results found for a product when a random string is entered
    Given User launch the browser
    And User is on homepage
    And User clicks the search button
    When User enters a random string in search bar
    And User presses enter to search for the item
    Then User is able to see no results found for the entered string

  Scenario: Search for bags from homepage
    Given User launch the browser
    And User is on homepage
    And User clicks the bags option available on homepage
    When User clicks a type of bag from dropdown list to search
    Then User is able to see particular type of bag

  Scenario: Search for shoes from homepage
    Given User launch the browser
    And User is on homepage
    And User clicks the shoes option available on homepage
    When User clicks a type of shoe from dropdown list to search
    Then User is able to see particular type of shoe

  Scenario: Search for product from the search bar using search button from dropdown list
    Given User launch the browser
    And User is on homepage
    And User clicks the search button
    When User enters bags to in search bar
    And User clicks search button from dropdown list
    Then User is able to see different types of bags
