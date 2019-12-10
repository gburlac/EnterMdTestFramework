#Feature: Login via facebook profile with valid credentials

#  @RunnerVCrisac
#  Scenario: Login on Enter.Online and logout
#    Given User is on homepage
#    When user logs in
#    Then home page is displayed and user is logged in
#    When user click on logout option
#    Then user is logged out and main page is displayed

Feature: Login with invalid credentials
  @RunnerVCrisac
  Scenario: Attempt to login on Enter.online with invalid credentials
    Given User is on homepage
    When user tries to log in with invalid credentials
    Then warning message appears and user is login fails


###############################################################
#    When user clicks on 'categoryList'
#    Then list of all categories is displayed
#    When user clicks on 'telefoane' category
#    Then list of 'telefoane' is displayed
#    When user clicks on 'smartphones' category
#    Then 'smartphones' category is displayed
#    When user clicks on product
#    Then phone details are displayed
#    When user add product to cart
#    Then a confirmation module pops up
#    When user clicks on cart icon
#    Then a cart module pops up
#    When user clicks on 'visualize cart' button
#    Then cart page is opened



#
#
#    When user choose 'samsung' brand
#    Then all 'samsung' phones are displayed

