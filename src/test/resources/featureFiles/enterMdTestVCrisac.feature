@RunVCrisac
Feature: Login via facebook profile with valid credentials
  Background:
  Given Home page is displayed
  Scenario: Login on Enter.Online and logout
    When user is logged in via Facebook as FACEBOOK_USER
    Then home page is displayed and user is logged in as FACEBOOK_USER
    When user click on logout option
    Then user is logged out and main page is displayed

  Scenario Outline: Attempt to login on Enter.online with invalid credentials
    When user tries to log in with invalid <email> and <password>
    Then <warning_message> appears and user is login fails
    Examples:
      | email          | password | warning_message          |
      |                |          | PASSWORD_ERROR           |
      | @testemail     |          | EMAIL_ERROR              |
      |                | password | EMAIL_ERROR              |
      | testemail@     | x        | EMAIL_ERROR              |
      | test.com       | тестпасс | EMAIL_ERROR              |

  Scenario: as logged user add product to the cart and validate it
    Given user is logged in via Facebook as FACEBOOK_USER
    When user select TV category and add productId 3 product to cart
    And user goes to cart
    Then product is added to cart

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


  Scenario: as logged user edit user details
    Given user logs in as REGISTERED_USER
    When user goes to user account details
    And edit user details
      | Parola          | 11122223333NRTM456 |
      | Confirma_parola | 11122223333NRTM456 |
      | Phone           | 068800900          |
      | City            | Chisinau           |
    When user click on logout option
    Then user is logged out and main page is displayed
    When user logs in with new password as REGISTERED_USER
    Then home page is displayed and user is logged in as REGISTERED_USER
    When user goes to user account details
    And edit user details
      | Parola          | 123NRTM456 |
      | Confirma_parola | 123NRTM456 |
    When user click on logout option
    Then user is logged out and main page is displayed
    When user logs in with new password as REGISTERED_USER
