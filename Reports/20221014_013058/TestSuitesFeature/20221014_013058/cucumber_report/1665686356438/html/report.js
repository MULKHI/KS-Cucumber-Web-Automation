$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/My Project Katalon/BDD Cucumber Project/Include/features/Search Product.feature");
formatter.feature({
  "name": "Search Product Feature",
  "description": "  As an Users\n  Users want to searching product in the application\n  and get the desired result of product existing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test searching product existing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users enters \u003cProductName\u003e into the search bar",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027search\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users will get \u003cProductName\u003e result are shown on the results page",
  "keyword": "Then "
});
formatter.examples({
  "name": "existing Product",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProductName"
      ]
    },
    {
      "cells": [
        "Winter Top"
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
  "name": "Test searching product existing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Users enters Winter Top into the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "SearchProductSteps.enters_ProductName_into_the_search_bar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027search\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProductSteps.Click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users will get Winter Top result are shown on the results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.result_are_shown_on_the_results_page(String)"
});
formatter.result({
  "status": "passed"
});
});