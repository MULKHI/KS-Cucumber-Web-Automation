# KS-Cucumber-Web-Automation
Katalon Studio Automation test using BDD Cucumber

- [x] Feature File in the folder /Include/features

- [x] Step Definitions in the folder /Include/scripts/groovy


## Why using BDD Cucumber
Cucumber use Feature Files to write User Stories, because Cucumber uses a language that is easy to understand by anyone (Gherkin), each team can add or edit User Stories

## Feature file "Login.feature" in folder Features
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

### 📄Test Reports
Test Report will appear in the 'Reports' folder in the form of HTML

![Screenshot (370)](https://user-images.githubusercontent.com/80143004/196775164-3e5a9241-5945-4b6c-ac85-9adc4042a17f.png)

If you are still confused and have problems, you can contact me via the link below 👇

<p>
    <a href="mailto: mulkhiputral@gmail.com" target="blank"><img src="https://img.shields.io/badge/-gmail-181717?style=for-the-badge&logo=gmail" /></a>
</p>
