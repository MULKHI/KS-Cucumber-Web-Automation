# KS-Cucumber-Web-Automation
Katalon Studio Automation test using BDD Cucumber

- [x] Feature File in the folder /Include/features

- [x] Step Definitions in the folder /Include/scripts/groovy


## Why using BDD Cucumber
Cucumber use Feature Files to write User Stories, because Cucumber uses a language that is easy to understand by anyone (Gherkin), each team can add or edit User Stories

#### Feature file "Login.feature" in folder Features
```gherkin
Feature: Login Feature
  As an Users
  Users want to login in the application 
  and navigate to home page with the account

  Background: Users open login page
    Given Users navigates to home page
    And Click on 'Signup / Login' button

  @TC_LOGIN.001 @Positive
  Scenario Outline: Test login Successful
    When Enters an email <email> and password <password>
    And Click on 'login' button
    Then Users is navigated to home page with account
    And Click on 'Logout' button then users back to login page

    Examples: valid credentials
      | email                | password                 |
      | testing123@gmail.com | fzqqY0qJjYTuJiVJRZh4ag== |

  @TC_LOGIN.001 @Negative
  Scenario Outline: Test Failed login using wrong credentials
    When Enters an email <email> and password <password>
    And Click on 'login' button
    Then Users should NOT be able to login successfully

    Examples: invalid email and valid password
      | email                | password                 |
      | testing123@gmail.com | 7RhQGkXe/2i++keEqyAarA== |
      | invalid@gmail.com    | fzqqY0qJjYTuJiVJRZh4ag== |
```

#### Feature file "Register.feature" in folder Features
```gherkin
Feature: Register Feature
  As an Users
  Users want to Register in the application 
  and navigate to home page with the newly registered account

  Background: Users open login page
    Given Users navigates to home page
    And Click on 'Signup / Login' button

  @TC_REGISTER.001 @Positive
  Scenario Outline: Test Register Users completing all the fields
    When Enters an name <Name> and email address <Email>
    And Click on 'signup' button
    And Choose Title Mr.
    And Input <Name> in field Name
    And Check Email field cannot click
    And Input <Password> in field Password
    And Choose random Date of birth
    And Select checkbox : Sign up for our newsletter
    And Select checkbox : Receive special offers from our partners
    And Input <FirstName> in field First Name
    And Input <LastName> in field Last Name
    And Input <Company> in field Company
    And Input <Address> in field Address
    And Input <Address2> in field Address 2
    And Choose Country Canada
    And Input <State> in field State
    And Input <City> in field City
    And Input <Zipcode> in field Zipcode
    And Input <MobileNumber> in field Mobile Number
    And Click 'Create Account' button
    And Users is navigated to page ACCOUNT CREATED and click 'Continue' button
    Then Users is navigated to home page with account
    And Click on 'Logout' button then users back to login page

    Examples: ACCOUNT INFORMATION AND ADDRESS INFORMATION
      | Name  | Email             | Password                 | FirstName  | LastName | Company      | Address   | Address2    | State   | City  | Zipcode | MobileNumber |
      | test1 | myemail@gmail.com | JLfwvezS/NRqKh2zfFaESQ== | michel     | john     | Name Company | myaddess  | myaddress2  | mystate | Paris |   04432 |   0868746777   |

  @TC_REGISTER.002 @Positive
  Scenario Outline: Test Register only input in mandatory fields
    When Enters an name <Name> and email address <Email>
    And Click on 'signup' button
    And Input <Name> in field Name
    And Check Email field cannot click
    And Input <Password> in field Password
    And Input <FirstName> in field First Name
    And Input <LastName> in field Last Name
    And Input <Address> in field Address
    And Choose Country Canada
    And Input <State> in field State
    And Input <City> in field City
    And Input <Zipcode> in field Zipcode
    And Input <MobileNumber> in field Mobile Number
    And Click 'Create Account' button
    And Users is navigated to page ACCOUNT CREATED and click 'Continue' button
    Then Users is navigated to home page with account
    And Click on 'Logout' button then users back to login page

    Examples: ACCOUNT INFORMATION AND ADDRESS INFORMATION
      | Name  | Email          | Password                         | FirstName | LastName | Address    | State   | City  | Zipcode | MobileNumber |
      | test2 | your@gmail.com | o4HjxlJLVB5Fa64+Hon+OOTdR5Uf8246 | kanzaki   | shinpei  | myaddress  | mystate | tokyo |   04432 |   0868746997 |

  @TC_REGISTER.003 @Negative
  Scenario Outline: Test Register an existing Name/Email
    When Enters an name <Name> and email address <Email>
    And Click on 'signup' button
    Then Users cannot register using existing email address

    Examples: ACCOUNT INFORMATION AND ADDRESS INFORMATION
      | Name   | Email              |
      | Peater | NotEmail@gmail.com |

  @TC_REGISTER.004 @Negative
  Scenario Outline: Test Register without completing mandatory fields
    When Enters an name <Name> and email address <Email>
    And Click on 'signup' button
    And Choose Title Mr.
    And Check Email field cannot click
    And Choose random Date of birth
    And Select checkbox : Sign up for our newsletter
    And Select checkbox : Receive special offers from our partners
    And Input <Company> in field Company
    And Input <Address2> in field Address 2
    And Click 'Create Account' button
    Then Users cannot register and will navigated to fields Name

    Examples: ACCOUNT INFORMATION AND ADDRESS INFORMATION
      | Name    | Email             | Company      | Address2    |
      | mariana | myemail@gmail.com | Name Company | myaddress2  |

```

#### Feature file "Search Product.feature" in folder Features
```gherkin
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

```

#### Feature file "Add Product in Cart.feature" in folder Features
```gherkin
Feature: Add Product Feature
  As an Users
  Users want to add product in the application
  and get the add result of product existing in cart page

  Background: Users open product page
    Given Users navigates to home page
    And Click on 'products' button

  @TC_ADD_PRODUCT.001 @Positive
  Scenario: Test Add Product in Cart
    When Users click 'Add to cart' in product 'Blue Top'
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    Then Users will get the result products are added to Cart

  @TC_ADD_PRODUCT.002 @Positive
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

  @TC_ADD_PRODUCT.003 @Positive
  Scenario: Test Remove Product From Cart
    When Users click 'Add to cart' in product 'Blue Top'
    And Click 'Continue Shopping' button
    And Click on 'Cart' button
    And Click 'X' button corresponding to particular product
    Then Product is removed from the cart


```

### 📄Test Reports
Test Report will appear in the 'Reports' folder in the form of HTML

![Screenshot (370)](https://user-images.githubusercontent.com/80143004/196775164-3e5a9241-5945-4b6c-ac85-9adc4042a17f.png)

If you are still confused and have problems, you can contact me via the link below 👇

<p>
    <a href="mailto: mulkhiputral@gmail.com" target="blank"><img src="https://img.shields.io/badge/-gmail-181717?style=for-the-badge&logo=gmail" /></a>
</p>
