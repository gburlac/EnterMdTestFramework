Feature: Login via facebook profile with valid credentials

  Scenario: Login on Enter.Online and logout
    Given User is on homepage
    When user logs in
    Then home page is displayed and user is logged in
    When user click on logout option
    Then user is logged out and main page is displayed
######################   pass   ##############################

  Scenario Outline: Attempt to login on Enter.online with invalid credentials
    Given User is on homepage
    When user tries to log in with invalid <email> and <password>
    Then <warning_message> appears and user is login fails
    Examples:
      | email          | password | warning_message          |
      | тест@емэйл.ком | "№;%:?   | EMAIL_AND_PASSWORD_ERROR |
      | a$%^&@xx.com   | password | EMAIL_AND_PASSWORD_ERROR |
      |                |          | PASSWORD_ERROR           |
      | testemail@     | x        | EMAIL_ERROR              |
      | @testemail     |          | EMAIL_ERROR              |
      | test.com       | тестпасс | EMAIL_ERROR              |
      |                | password | EMAIL_ERROR              |
######################   pass   ##############################

  @Run
  Scenario: as logged user add product to the cart and validate it
    Given user is logged in via facebook
    When user select category and add product to cart
    Then product is added to cart
######### works --> to rerun ################################


  Scenario: as logged user edit user details
    Given user is logged in as REGISTERED_USER
    When user go to user profile page and edit the details
      | Prenume         | Abramov    |
      | Nume            | Stas       |
      | Parola          | 123NRTM456 |
      | Confirma_parola | 123NRTM456 |
      | Phone           | 068800900  |
      | City            | Chisinau   |

  ################ add logout function #################













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

