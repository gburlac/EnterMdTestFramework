Feature: Product filtering functionality

  Scenario Outline: User goes on enter.online, select any category and use filter for products changing.
    Given User is on homepage
    When User selects Smartphones category
    And change value in Manufacturer field to '<manufacturer>'
    Then dislpays only products of manufacturer '<manufacturer>'
    Examples:
      | manufacturer |
      | Apple        |
      | Xiaomi       |

#Feature: Product sorting functionality
#  Scenario: User goes on enter.online, select any category and use sorting dropdowns for products sorting.
#    Given User is on homepage
#    When User selects any category
#    And change values in sorting dropdowns
#    Then products displays in selected orde| manufacturer |r
#
#Feature: Product review functionality
#  Scenario: User goes on enter.online, select any product, write review and click [Send] button
#    Given User is on homepage
#    When User selects any product
#    And clicks on [Write review] button
#    Then Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and [Send] button
#    When User fill in all fields valid data and click [Send] button
#    Then "Success" message pops up
#
#Feature: Comparing functionality
#  Scenario:  User enter on enter.online, adds two products in cart and clicks "Compare"
#    Given User is on homepage
#    When User clicks [Compare] button on 2 any products
#    And User clicks on [List of comparing] button
#    Then appears page with comparing of selected products