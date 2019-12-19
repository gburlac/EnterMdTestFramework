Feature: Login via facebook profile with valid credentials

  Scenario: Login on Enter.Online and logout
    Given Home page is displayed
    When user is logged in via Facebook as FACEBOOK_USER
    Then home page is displayed and user is logged in as FACEBOOK_USER
    When user click on logout option
    Then user is logged out and main page is displayed
###################### +++++ works +++++ ##############################

  Scenario Outline: Attempt to login on Enter.online with invalid credentials
    Given User is on homepage
    When user tries to log in with invalid <email> and <password>
    Then <warning_message> appears and user is login fails
    Examples:
      | email          | password | warning_message          |
      |                |          | PASSWORD_ERROR           |
      | @testemail     |          | EMAIL_ERROR              |
      |                | password | EMAIL_ERROR              |
      | testemail@     | x        | EMAIL_ERROR              |
      | test.com       | тестпасс | EMAIL_ERROR              |
######################   !!!!happy pass!!!!   ##############################

  Scenario: as logged user add product to the cart and validate it
    Given user is logged in via Facebook as FACEBOOK_USER
    When user select TV category and add productId 3 product to cart
    And user goes to cart
    Then product is added to cart
#########  +++ happy pass +++ ################################
  @RunVCrisac
  Scenario: as logged user edit user details
    Given user logs in as REGISTERED_USER
    When user goes to user account details
    And edit user details
      | Prenume         | Abramov   |
      | Nume            | Stas      |
      | Parola          | 123NEW456 |
      | Confirma_parola | 123NEW456 |
      | Phone           | 068800900 |
      | City            | Chisinau  |
    When user click on logout option
    Then user is logged out and main page is displayed
#    When user logs in with new password
#    Then home page is displayed and user is logged in as REGISTERED_USER
#    When user goes to user account details
#    And edit user details
#      | Parola          | 123NRTM456 |
#      | Confirma_parola | 123NRTM456 |
#    When user click on logout option
#    Then user is logged out and main page is displayed
#    When user logs in with new password
#  ################ +++++ works +++++ #################

  Scenario: As logged user add several products in the cart, remove one, check if removed
    Given user logs in as REGISTERED_USER
    When user select Transport category and add productId 4 product to cart
    And user goes to cart
    Then product is added to cart
    When user select TV category and add productId 9 product to cart
    And user goes to cart
    Then product is added to cart
    When user select Phones category and add productId 2 product to cart
    And user goes to cart
    Then product is added to cart
    When user delete Phones product
    Then product is deleted
######### works ##############


  # TODO: add screenshots in gitignore
#  TODO: add user data for different social websites
# DONE ## TODO: in DeleteProductFromCart step: user deletes X from cart try to include the stuff in while loop in a method
#  TODO: separate functionalities from steps
# DONE ## TODO: in ModifyUserDetailsFunctionality place the web element in a page object
#  TODO: add screenshot switch system parameter (EX. -Dscreenshot=off) where you also exclude the border drawing --???
#  Why do you have MainPage and MainPageAsLogged? It should be the same page
#  TODO: keep the same naming convention (EX: all folders to be lowercase only; all page objects to end with Page word(or not), etc)
# DONE ## TODO: add tags with your name to differentiate the feature files created by one or another