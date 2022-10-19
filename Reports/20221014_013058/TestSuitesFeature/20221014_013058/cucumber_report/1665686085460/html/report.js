$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/My Project Katalon/BDD Cucumber Project/Include/features/Register.feature");
formatter.feature({
  "name": "Register Feature",
  "description": "  As an Users\n  Users want to Register in the application \n  and navigate to home page with the newly registered account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test Register Users completing all the fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an name \u003cName\u003e and email address \u003cEmail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Choose Title Mr.",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cName\u003e in field Name",
  "keyword": "And "
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cPassword\u003e in field Password",
  "keyword": "And "
});
formatter.step({
  "name": "Choose random Date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "Select checkbox : Sign up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "name": "Select checkbox : Receive special offers from our partners",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cFirstName\u003e in field First Name",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cLastName\u003e in field Last Name",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cCompany\u003e in field Company",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cAddress\u003e in field Address",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cAddress2\u003e in field Address 2",
  "keyword": "And "
});
formatter.step({
  "name": "Choose Country Canada",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cState\u003e in field State",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cCity\u003e in field City",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cZipcode\u003e in field Zipcode",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cMobileNumber\u003e in field Mobile Number",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users is navigated to page ACCOUNT CREATED and click \u0027Continue\u0027 button",
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
  "name": "ACCOUNT INFORMATION AND ADDRESS INFORMATION",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Password",
        "FirstName",
        "LastName",
        "Company",
        "Address",
        "Address2",
        "State",
        "City",
        "Zipcode",
        "MobileNumber"
      ]
    },
    {
      "cells": [
        "test1",
        "telopd@gmail.com",
        "JLfwvezS/NRqKh2zfFaESQ\u003d\u003d",
        "test1",
        "everload",
        "Name Company",
        "sadadd",
        "sasdada",
        "sdadadad",
        "Paris",
        "04432",
        "0868746777"
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
  "name": "Test Register Users completing all the fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an name test1 and email address telopd@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.Users_enters_name_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Title Mr.",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_Title_Mr()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input test1 in field Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Name_in_field_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Check_Email_field_cannot_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input JLfwvezS/NRqKh2zfFaESQ\u003d\u003d in field Password",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Password_in_field_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose random Date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_random_Date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select checkbox : Sign up for our newsletter",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Checkbox_Signup_for_our_newsletter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select checkbox : Receive special offers from our partners",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Checkbox_Receive_special_offers_from_our_partners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input test1 in field First Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_FirstName_in_field_First_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input everload in field Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_LastName_in_field_Last_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Name Company in field Company",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Company_in_field_Company(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sadadd in field Address",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Address_in_field_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sasdada in field Address 2",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Address2_in_field_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Country Canada",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_Country_Canada()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sdadadad in field State",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_State_in_field_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Paris in field City",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_City_in_field_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input 04432 in field Zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Zipcode_in_field_Zipcode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input 0868746777 in field Mobile Number",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_MobileNumber_in_field_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_Create_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users is navigated to page ACCOUNT CREATED and click \u0027Continue\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Users_is_navigated_to_page_ACCOUNT_CREATED()"
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
  "name": "Test Register only input in mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an name \u003cName\u003e and email address \u003cEmail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cName\u003e in field Name",
  "keyword": "And "
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cPassword\u003e in field Password",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cFirstName\u003e in field First Name",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cLastName\u003e in field Last Name",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cAddress\u003e in field Address",
  "keyword": "And "
});
formatter.step({
  "name": "Choose Country Canada",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cState\u003e in field State",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cCity\u003e in field City",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cZipcode\u003e in field Zipcode",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cMobileNumber\u003e in field Mobile Number",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users is navigated to page ACCOUNT CREATED and click \u0027Continue\u0027 button",
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
  "name": "ACCOUNT INFORMATION AND ADDRESS INFORMATION",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Password",
        "FirstName",
        "LastName",
        "Address",
        "State",
        "City",
        "Zipcode",
        "MobileNumber"
      ]
    },
    {
      "cells": [
        "test2",
        "tejouyuis@gmail.com",
        "o4HjxlJLVB5Fa64+Hon+OOTdR5Uf8246",
        "testkedua",
        "deep",
        "sadadd",
        "sdadadad",
        "Paris",
        "04432",
        "0868746777"
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
  "name": "Test Register only input in mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "Enters an name test2 and email address tejouyuis@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.Users_enters_name_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input test2 in field Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Name_in_field_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Check_Email_field_cannot_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input o4HjxlJLVB5Fa64+Hon+OOTdR5Uf8246 in field Password",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Password_in_field_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input testkedua in field First Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_FirstName_in_field_First_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input deep in field Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_LastName_in_field_Last_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sadadd in field Address",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Address_in_field_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Country Canada",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_Country_Canada()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sdadadad in field State",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_State_in_field_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Paris in field City",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_City_in_field_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input 04432 in field Zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Zipcode_in_field_Zipcode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input 0868746777 in field Mobile Number",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_MobileNumber_in_field_Mobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_Create_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users is navigated to page ACCOUNT CREATED and click \u0027Continue\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Users_is_navigated_to_page_ACCOUNT_CREATED()"
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
  "name": "Test Register an existing Name/Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an name \u003cName\u003e and email address \u003cEmail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users cannot register using existing email address",
  "keyword": "Then "
});
formatter.examples({
  "name": "ACCOUNT INFORMATION AND ADDRESS INFORMATION",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email"
      ]
    },
    {
      "cells": [
        "Peater",
        "NotEmail@gmail.com"
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
  "name": "Test Register an existing Name/Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an name Peater and email address NotEmail@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.Users_enters_name_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users cannot register using existing email address",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.Users_cannot_register_using_existing_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test Register without completing mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an name \u003cName\u003e and email address \u003cEmail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Choose Title Mr.",
  "keyword": "And "
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.step({
  "name": "Choose random Date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "Select checkbox : Sign up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "name": "Select checkbox : Receive special offers from our partners",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cCompany\u003e in field Company",
  "keyword": "And "
});
formatter.step({
  "name": "Input \u003cAddress2\u003e in field Address 2",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Users cannot register and will navigated to fields Name",
  "keyword": "Then "
});
formatter.examples({
  "name": "ACCOUNT INFORMATION AND ADDRESS INFORMATION",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Company",
        "Address2"
      ]
    },
    {
      "cells": [
        "test4",
        "teslkjhjdr@gmail.com",
        "Name Company",
        "sasdada"
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
  "name": "Test Register without completing mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "Enters an name test4 and email address teslkjhjdr@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.Users_enters_name_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027signup\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Title Mr.",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_Title_Mr()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Email field cannot click",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Check_Email_field_cannot_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose random Date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Choose_random_Date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select checkbox : Sign up for our newsletter",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Checkbox_Signup_for_our_newsletter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select checkbox : Receive special offers from our partners",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Checkbox_Receive_special_offers_from_our_partners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Name Company in field Company",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Company_in_field_Company(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input sasdada in field Address 2",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Input_Address2_in_field_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Create Account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.Click_Create_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users cannot register and will navigated to fields Name",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.Users_cannot_register_will_navigated_to_fields_Name()"
});
formatter.result({
  "status": "passed"
});
});