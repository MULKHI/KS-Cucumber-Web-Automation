# KS-Cucumber-Web-Automation
Katalon Studio Automation test using BDD Cucumber

- [x] Feature File in the folder /Include/features

- [x] Step Definitions in the folder /Include/scripts/groovy


## Why using BDD Cucumber
Cucumber use Feature Files to write User Stories, because Cucumber uses a language that is easy to understand by anyone (Gherkin), each team can add or edit User Stories

6. Buat Feature file "SearchGoogle.feature" pada directory Features
```gherkin
Feature: Search Google
  Scenario: I want to using feature search on google
    Given I Open browser
    And Open website Google
    And Located on google website
    When I search "Wisnu Munawar"
    Then Showing result related with "Wisnu Munawar"
```

### 📄Test Reports
Test Report will appear in the 'Reports' folder in the form of HTML

![Screenshot (370)](https://user-images.githubusercontent.com/80143004/196775164-3e5a9241-5945-4b6c-ac85-9adc4042a17f.png)

If you are still confused and have problems, you can contact me via the link below 👇

<p>
    <a href="mailto: mulkhiputral@gmail.com" target="blank"><img src="https://img.shields.io/badge/-gmail-181717?style=for-the-badge&logo=gmail" /></a>
</p>
