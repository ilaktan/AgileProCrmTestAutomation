
@regression
@smoke
@wip
Feature:Logout test

  Scenario:1-Open browser
    Given User open browser
    When User on the website homepage

  Scenario:2-Login test with valid username and password for Hr
    Given User enter username
    And User enter password
    And User click with the "Log in"
    And User click "Logout"
    When User click the step back button

  Scenario:2-Login test with valid username and password for Hr
    Given User enter username
    And User enter password
    And User click with the "Log in"
    Then User close browser

  Scenario:1-Open browser
    Given User open browser
    When User on the website homepage