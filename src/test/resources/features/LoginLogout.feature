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
    And User clear the box "(//div//input)[1]"
    And User enter username "helpdesk1@cybertekschool.com"
    And User enter password "UserUser"
    And User click with the "Log in"
    And User click "Logout"
    And User clear the box "(//div//input)[1]"
    And User enter username "marketing1@cybertekschool.com"
    And User enter password "UserUser"
    And User click with the "Log in"
    And User click "Logout"
    Then User close browser





