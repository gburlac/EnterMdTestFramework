Feature: A description

  @RunnerVCrisac
  Scenario: Login on Enter.Online
    Given User is on homepage
    When user clicks on login menu
    Then login menu popup is displayed
    When user clicks on 'facebook' icon
    Then login window pops up
    When user enters credentials
    Then email and password fiels are filled in
    When user press login button
    Then user is logged in via facebook profile and home page is displayed
    When user clicks on 'categoryList'
    Then list of all categories is displayed
    When user clicks on 'telefoane' category
    Then list of 'telefoane' is displayed
    When user clicks on 'smartphones' category
    Then 'smartphones' category is displayed
    When user clicks on product
    Then phone details are displayed
    When user add product to cart
    Then a confirmation module pops up
    When user clicks on cart icon
    Then a cart module pops up
    When user clicks on 'visualize cart' button
    Then cart page is opened



#
#
#    When user choose 'samsung' brand
#    Then all 'samsung' phones are displayed

