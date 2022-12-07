Feature: Search Product Feature
  As an Users
  Users want to searching product in the application
  and get the desired result of product existing

  Background: Users open product page
    Given Users navigates to home page
    And Click on 'products' button

   @TC_SEARCH.001 @Positive
  Scenario Outline: Test searching product existing
    When Users enters <ProductName> into the search bar
    And Click on 'search' button
    Then Users will get <ProductName> result are shown on the results page

    Examples: existing Product
      | ProductName |
      | Winter Top  |
