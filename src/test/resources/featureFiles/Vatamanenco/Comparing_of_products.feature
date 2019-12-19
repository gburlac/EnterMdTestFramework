# new feature
# Tags: optional

Feature: Comparing functionality

  Scenario:  User enter on enter.online, adds two products in cart and clicks "Compare"
    Given User is on homepage
    When User selects Smartphones category
    And clicks [Compare] button on 2 any products
    And User clicks on [List of comparing] button
    Then appears page with comparing of selected products