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


#Feature: Comparing functionality
#  Scenario:  User enter on enter.online, adds two products in cart and clicks "Compare"
#    Given User is on homepage
#    When User clicks [Compare] button on 2 any products
#    And User clicks on [List of comparing] button
#    Then appears page with comparing of selected products