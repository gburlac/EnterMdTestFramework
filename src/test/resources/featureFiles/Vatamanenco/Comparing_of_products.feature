# new feature
@Vatamanenco

Feature: Comparing functionality

  Scenario:  User enter on enter.online, adds two products in cart and clicks "Compare"
    Given User is on homepage
    When User selects Smartphones category
    And User selects product
    And clicks [Compare] button
    And User selects Smartphones category
    And User selects product
    And clicks [Compare] button
    And User clicks on [List of comparing] button
    Then appears page with comparing of selected products