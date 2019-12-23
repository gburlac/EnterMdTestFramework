@GBurlacAll
@GBurlacMakeOrders
Feature: Make orders on enter.online

  Background:
    Given User is on homepage
  @Run
  Scenario: Add to cart from category cadou pentru ea
    When go to cadou pentru ea category
    And select product from the page
    And go to cart from popup
    Then verify is in cart


  Scenario: Add to cart from toate categoriile
    When go to periferice
    And select PC si periferice
    And select tastaturi
    And select option from filter
    And select a product and add to cart
    Then verify selected product is in cart

  Scenario:Order product and checkout
    When go to casti category
    And select a product
    And place a order
    And fill out the delivery info
      | Bondari | James | bond007@mi5.uk | 070000997 | Chisinau | Dacia 8 |
    Then verify the success message