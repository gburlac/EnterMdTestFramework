Feature: Product filtering functionality

  Scenario: User enter on enter.online, select any category and use filter for products changing.
    Given User is on homepage
    When User selects any category
    And change values in filters
    Then only products that match the specified filters are displayed

Feature: Product sorting functionality
  Scenario: User enter on enter.online, select any category and use sorting dropdowns for products sorting.
    Given User is on homepage
    When User selects any category
    And change values in sorting dropdowns
    Then products displays in selected order

Feature: Main page UI check
  Scenario: User enter on enter.online and check UI elements.
    Given User is on homepage
    Then All non-changeable elements is present
    When User changes language
    Then Then all non-changeable elements with text are displayed on selected language

Feature: Product review functionality
  Scenario: User enter on enter.online, select any product, write review and click [Send] button
    Given User is on homepage
    When User selects any product
    And clicks on [Write review] button
    Then Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and [Send] button
    When User fill in all fields valid data and click [Send] button
    Then

Feature: