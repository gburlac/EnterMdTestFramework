@GBurlacAll
@GBurlacUiTest
Feature: Search for a product on EnterPages and check UI

  Background:
    Given User is on homepage

  Scenario: Navigate on enterOnline and check UI
    When  press on electrocasnice category
    Then electrocasnice category is displayed
    And tehnica de bucatarie part is displayed
    And aparate de uz casnice part is displaed
    And ingrijire personala part is displayed


  Scenario Outline: Search for a product
    When input in search bar a '<test>'
    And select '<test>' device
    And buy product in credit
    Then verify credit page is displayed
    Examples:
      | test           |
      | OnePlus 7 Pro  |
      | Iphone 11      |






