Feature: Navigate on EnterPages


  Scenario: Navigate on enterOnline
    Given User is on homepage
    When Press on electrocasnice category
    Then Specific category is displayed

#  Scenario Outline: Navigate on enterOnline
#    Given User is on homepage
#    When Press on 'electrocasnice' category
#    When Press on '<test>' category
#    Then Specific category is displayed
#    Examples:
#    | test |
#    | electrocasnice|
#    |w              |
#    |r              |