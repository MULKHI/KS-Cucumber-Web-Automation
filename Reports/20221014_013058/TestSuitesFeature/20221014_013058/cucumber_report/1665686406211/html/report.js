$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/My Project Katalon/BDD Cucumber Project/Include/features/Add Product in Cart.feature");
formatter.feature({
  "name": "Add Product Feature",
  "description": "  As an Users\n  Users want to add product in the application\n  and get the add result of product existing in cart page",
  "keyword": "Feature"
});
formatter.background({
  "name": "Users open product page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Users navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.Users_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027products\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProductSteps.Click_on_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Add Product in Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users click \u0027Add to cart\u0027 in product \u0027Blue Top\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "AddProductSteps.click_Add_to_cart_in_product_Blue_Top()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Continue Shopping\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_Continue_Shopping_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Cart\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_on_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users will get the result products are added to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductSteps.products_are_added_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test Verify Product Quantity in Cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users Click \u0027View Product\u0027 for any product",
  "keyword": "When "
});
formatter.step({
  "name": "Users add Increase quantity to \u003camount\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Add to cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Continue Shopping\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Click on \u0027Cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Product is displayed in cart page with exact quantity \u003camount\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "amount"
      ]
    },
    {
      "cells": [
        "6"
      ]
    }
  ]
});
formatter.background({
  "name": "Users open product page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Users navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.Users_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027products\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProductSteps.Click_on_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Verify Product Quantity in Cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users Click \u0027View Product\u0027 for any product",
  "keyword": "When "
});
formatter.match({
  "location": "AddProductSteps.Click_View_Product_for_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users add Increase quantity to 6",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Users_add_Increase_quantity_to_amount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Add to cart\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_Add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Continue Shopping\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_Continue_Shopping_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Cart\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_on_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product is displayed in cart page with exact quantity 6",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductSteps.Product_is_displayed_with_exact_quantity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Users open product page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Users navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.Users_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027products\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProductSteps.Click_on_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Remove Product From Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users click \u0027Add to cart\u0027 in product \u0027Blue Top\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "AddProductSteps.click_Add_to_cart_in_product_Blue_Top()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Continue Shopping\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_Continue_Shopping_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Cart\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_on_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027X\u0027 button corresponding to particular product",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductSteps.Click_button_delete_product_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product is removed from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductSteps.Product_is_removed_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
});