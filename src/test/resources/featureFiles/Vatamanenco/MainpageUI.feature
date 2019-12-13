Feature: Main page UI check
  Scenario: User goes on enter.online and check UI elements.
    Given User is on homepage
    Then All non-changeable elements is present
    When User changes language
    Then Then all non-changeable elements with text are displayed on selected language