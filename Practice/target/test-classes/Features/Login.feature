Feature: Nopcommerce Login

 # Simple Hard coded Scenario
  @Login
  Scenario: Nopcommerce Login Test
    Given User is on login page and verify the Login page Title
    When User Enter Username and Password and click on Login
    Then User is on Homepage of User