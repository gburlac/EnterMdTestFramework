Feature: Navigate on EnterPages

  Background:
    Given User is on homepage

  @Geo
  Scenario: Navigate on enterOnline and check UI
    When  press on electrocasnice category
    Then electrocasnice category is displayed
    And tehnica de bucatarie part is displayed
    And aparate de uz casnice part is displaed
    And ingrijire personala part is displayed

  @Geo
  Scenario: Search for a product
    When input in search bar a OnePlus
    And select OnePlus 7 Pro device
    And add to wishlist
    And go to wishlist
    Then verify is in wishlist

  @Geo
  Scenario: Add to cart from category cadou pentru ea
    When go to cadou pentru ea category
    And select Bobby Compact anti-theft product
    And select color to blue
    And add to cart
    And go to cart
    Then verify is in cart

  @Geo
  Scenario: Add to cart from toate categoriile
    When go to periferice
    And select PC si periferice
    And select tastaturi
    And select two option from filter
    And select and add to cart
    And go to see the cart
    Then verify selected product is in cart

#    Scenario:Order products from home page
#      When go to casti category
#      And select a product
#      And add to cart
#      And fill the delivery info
#      And place a order
#      Then verify the success message


