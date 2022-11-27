Feature: Nopcommerce Login

 # Simple hard coded Scenario
  @Login
  Scenario: Nopcommerce Valid Login Test
    Given User on login page and  verify login page title
    Then User enter username and password and click on login button
    Then User is on Home page of user