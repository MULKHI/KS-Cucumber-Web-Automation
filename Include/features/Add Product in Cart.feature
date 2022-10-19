Feature: Add Product Feature
  As an Users
  Users want to add product in the application
  and get the add result of product existing in cart page

  Background: Users open product page
    Given Users navigates to home page
    And Click on 'products' button

  @Valid
  Scenario: Test Add Product in Cart
    When Users click 'Add to cart' in product 'Blue Top'
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    Then Users will get the result products are added to Cart

  @Valid
  Scenario Outline: Test Verify Product Quantity in Cart
    When Users Click 'View Product' for any product
    And Users add Increase quantity to <amount>
    And Click 'Add to cart' button
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    Then Product is displayed in cart page with exact quantity <amount>

    Examples: 
      | amount |
      |      5 |

  @Valid
  Scenario: Test Remove Product From Cart
    When Users click 'Add to cart' in product 'Blue Top'
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    And Click 'X' button corresponding to particular product
    Then Product is removed from the cart
