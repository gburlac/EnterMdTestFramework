# new feature
@Vatamanenco

Feature: Product filtering functionality

  Scenario Outline: User goes on enter.online, select any category and use filter for products changing.
    Given User is on homepage
    When User selects Smartphones category
    And change value in Manufacturer field to '<manufacturer>'
    Then dislpays only products of manufacturer '<manufacturer>'
    Examples:
      | manufacturer |
      | 3            |
#      | 5            |
#      | 10           |
