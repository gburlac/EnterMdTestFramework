# new feature
# Tags: optional

Feature: Product sorting functionality
  Scenario: User goes on enter.online, select any category and use sorting dropdowns for products sorting.
    Given User is on homepage
    When User selects Smartphones category
    And change values in sorting dropdowns
    Then products displays in selected order
