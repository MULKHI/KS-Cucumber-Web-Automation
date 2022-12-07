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
      | Name  | Email            | Password                 | FirstName | LastName | Company      | Address | Address2 | State    | City  | Zipcode | MobileNumber |
      | test1 | telopd@gmail.com | JLfwvezS/NRqKh2zfFaESQ== | test1     | everload | Name Company | sadadd  | sasdada  | sdadadad | Paris |   04432 |   0868746777 |

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
      | Name  | Email               | Password                         | FirstName | LastName | Address | State    | City  | Zipcode | MobileNumber |
      | test2 | tejouyuis@gmail.com | o4HjxlJLVB5Fa64+Hon+OOTdR5Uf8246 | testkedua | deep     | sadadd  | sdadadad | Paris |   04432 |   0868746777 |

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
      | Name  | Email                | Company      | Address2 |
      | test4 | teslkjhjdr@gmail.com | Name Company | sasdada  |

