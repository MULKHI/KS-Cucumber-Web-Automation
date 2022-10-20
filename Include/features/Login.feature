Feature: Login Feature
  As an Users
  Users want to login in the application 
  and navigate to home page with the account

  Background: Users open login page
    Given Users navigates to home page
    And Click on 'Signup / Login' button

  @Valid
  Scenario Outline: Test login Successful
    When Enters an email <email> and password <password>
    And Click on 'login' button
    Then Users is navigated to home page with account
    And Click on 'Logout' button then users back to login page

    Examples: valid credentials
      | email                | password                 |
      | testing123@gmail.com | fzqqY0qJjYTuJiVJRZh4ag== |

  @Invalid
  Scenario Outline: Test Failed login using wrong credentials
    When Enters an email <email> and password <password>
    And Click on 'login' button
    Then Users should NOT be able to login successfully

    Examples: wrong credentials
      | email                | password                 |
      | testing123@gmail.com | 7RhQGkXe/2i++keEqyAarA== |
      | invalid@gmail.com    | fzqqY0qJjYTuJiVJRZh4ag== |
