Feature: Facebook login
Background:
  Given User able to open browser
  And Enter url

 # With Example Keyword
  @Login
  Scenario Outline: : Facebook valid login test
    Then User is on login page and verify login page title
    When User enter "<username>" and "<password>" and click on login button
    Then User is on home page
    Then User close the browser
    Examples:
      |username|password|
      |abcd11@gmail.com|Test111|
      |abcd12@gmail.com|Test112|
      |abcd13@gmail.com|Test113|

