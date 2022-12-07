Feature: Checkout Feature
  As an Users
  Users want to checkout product in the application

  Background: Users open product page
    Given Users navigates to home page
    And Click on 'Signup / Login' button
    When Enters an email <email> and password <password>
      | email                | password                 |
      | testing123@gmail.com | fzqqY0qJjYTuJiVJRZh4ag== |
    And Click on 'login' button
    And Click on 'products' button
    When Users click 'Add to cart' in product 'Blue Top'
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    Then Users will get the result products are added to Cart

  @TC_CHECKOUT.001 @Positive
  Scenario Outline: Test Login before checkout
    When Users click 'Proceed To Checkout' button
    And Check Address Details
    And Check Review Your Order
    And Fill <comment> in 'add comment' field
    And Click 'Place Order' button
    Then Users will navigated to payment feature

    Examples: 
      | comment           |
      | type commant test |
