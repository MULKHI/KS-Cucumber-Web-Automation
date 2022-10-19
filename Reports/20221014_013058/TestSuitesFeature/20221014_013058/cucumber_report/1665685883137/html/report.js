$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/My Project Katalon/BDD Cucumber Project/Include/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  As an Users\n  Users want to login in the application \n  and navigate to home page with the account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an valid email \u003cemail\u003e and valid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users is navigated to home page with account",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on \u0027Logout\u0027 button then users back to login page",
  "keyword": "And "
});
formatter.examples({
  "name": "valid credentials",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "testing123@gmail.com",
        "fzqqY0qJjYTuJiVJRZh4ag\u003d\u003d"
      ]
    }
  ]
});
formatter.background({
  "name": "Users open login page",
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
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_Signup_Login_Buutton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an valid email testing123@gmail.com and valid password fzqqY0qJjYTuJiVJRZh4ag\u003d\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.Users_enters_valid_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users is navigated to home page with account",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Users_is_navigated_to_homepage_with_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Logout\u0027 button then users back to login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test login with invalid email and valid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an invalid email \u003cemail\u003e and valid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users should NOT be able to login successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "invalid email and valid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "invalid@gmail.com",
        "fzqqY0qJjYTuJiVJRZh4ag\u003d\u003d"
      ]
    }
  ]
});
formatter.background({
  "name": "Users open login page",
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
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_Signup_Login_Buutton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with invalid email and valid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an invalid email invalid@gmail.com and valid password fzqqY0qJjYTuJiVJRZh4ag\u003d\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.Users_enters_an_invalid_username(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users should NOT be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Users_login_unsuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test login with valid email and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an valid email \u003cemail\u003e and invalid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users should NOT be able to login successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "valid email and invalid password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "testing123@gmail.com",
        "JLfwvezS/NRqKh2zfFaESQ\u003d\u003d"
      ]
    }
  ]
});
formatter.background({
  "name": "Users open login page",
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
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_Signup_Login_Buutton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test login with valid email and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an valid email testing123@gmail.com and invalid password JLfwvezS/NRqKh2zfFaESQ\u003d\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.Users_enters_an_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users should NOT be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Users_login_unsuccessfully()"
});
formatter.result({
  "status": "passed"
});
});