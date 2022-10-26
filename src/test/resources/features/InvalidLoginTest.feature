@regression
@smoke
@wip
Feature:Login test

  Scenario:1-Open browser
    Given User open browser
    When User on the website homepage


  Scenario:3-Login test with invalid username and password

    Given User enter username "helpdesk1@cybertekschool.com"
    And User enter password "invalidPassword"
    And User click with the "Log in"
    Then User verify message "Incorrect login or password"

  Scenario:4-Login test with invalid username and password
    And User clear the box "(//div//input)[1]"
    Given User enter username "invalid@cybertekschool.com"
    And User enter password "UserUser"
    And User click with the "Log in"
    Then User verify message "Incorrect login or password"

  Scenario:5-Login test with invalid username and password
    Then User clean the username password box
    Given User enter username "invalid@cybertekschool.com"
    And User enter password "invalidPassword"
    And User click with the "Log in"
    Then User verify message "Incorrect login or password"

  Scenario:6-Login test with invalid username and password
    Then User clean the username password box
    Given User enter username "invalid"
    And User enter password "invalidPassword"
    And User click with the "Log in"
    Then User verify message "Incorrect login or password"

  Scenario:7-Login test with invalid username and password
    Then User clean the username password box
    Given User enter username "invalid"
    And User enter password "gffghgh"
    And User click with the "Log in"
    Then User verify message "Incorrect login or password"

  Scenario:8-Login test with valid username and password
    Then User clean the username password box
    Given User enter username "helpdesk1@cybertekschool.com"
    And User enter password "UserUser"
    And User click with the "Log in"
    Then User close browser