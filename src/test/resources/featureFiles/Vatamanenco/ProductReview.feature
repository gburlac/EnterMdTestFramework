# new feature
# Tags: optional

Feature: Product review functionality
  Scenario: User goes on enter.online, select any product, write review and click [Send] button
    Given User is on homepage
    When User selects Smartphones category
    And User selects product
    And clicks on [Write review] button
    Then Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and [Send] button
    When User fill in all fields valid data and click [Send] button
    Then Success message appears
