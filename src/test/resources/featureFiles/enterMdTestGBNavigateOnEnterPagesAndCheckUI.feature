@GeoUiTest
Feature: Navigate on EnterPages and check UI

  Background:
    Given User is on homepage


  Scenario: Navigate on enterOnline and check UI
    When  press on electrocasnice category
    Then electrocasnice category is displayed
    And tehnica de bucatarie part is displayed
    And aparate de uz casnice part is displaed
    And ingrijire personala part is displayed


  Scenario: Search for a product
    When input in search bar a OnePlus
    And select OnePlus 7 Pro device
    And add to wishlist
    And go to wishlist
    Then verify is in wishlist





